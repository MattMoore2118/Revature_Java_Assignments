package comm.app.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import comm.app.dao.PlayerCrudDAO;
import comm.app.dao.dbutil.PostgreSQLConnection;
import comm.app.exception.BusinessException;
import comm.app.model.Player;

public class PlayerCrudDAOImpl implements PlayerCrudDAO{

	@Override
	public int createPlayer(Player player) throws BusinessException {
		int c = 0;
		try(Connection connection=PostgreSQLConnection.getConnection()){
			String sql ="insert into \"Test\".player(id,player_name,team_id,goals,dob,earnings) values(?,?,?,?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, player.getId());
			preparedStatement.setString(2, player.getPlayer_name());
			preparedStatement.setInt(3, player.getTeam_id());
			preparedStatement.setInt(4, player.getGoals());
			preparedStatement.setDate(5, new java.sql.Date(player.getDob().getTime()));
			preparedStatement.setLong(6, player.getEarnings());
			
			c = preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal error occured contact admin");
		}
		return c;
	}

	@Override
	public void deletePlayer(int id) throws BusinessException {
		try(Connection connection=PostgreSQLConnection.getConnection()){
			String sql = "delete from \"Test\".player where id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
	
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal error occured contact admin");
		}
		
		
	}

	@Override
	public int updatePlayerEarnings(int id, long earnings) throws BusinessException {
		int c=0;
		try(Connection connection=PostgreSQLConnection.getConnection()){
			String sql = "update \"Test\".player set earnings=? where id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setInt(2, id);
			preparedStatement.setLong(1, earnings);
			c=preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal error occured contact admin");
		}
		return c;
	}

	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player = null;
		try(Connection connection=PostgreSQLConnection.getConnection()){
			String sql = "select player_name,team_id,goals,dob,earnings from \"Test\".player where id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				player =new Player();
				player.setId(id);
				player.setPlayer_name(resultSet.getString("player_name"));
				player.setTeam_id(resultSet.getInt("team_id"));
				player.setGoals(resultSet.getInt("goals"));
				player.setDob(resultSet.getDate("dob"));
				player.setEarnings(resultSet.getLong("earnings"));
			}else {
				throw new BusinessException("No player found with ID: "+id);
			}
		}catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal error occured contact admin");
		}
		return player;
	}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		List<Player> playersList=new ArrayList<>();
		try(Connection connection=PostgreSQLConnection.getConnection()){
			String sql = "select id,player_name,team_id,goals,dob,earnings from \"Test\".player";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player =new Player();
				player.setId(resultSet.getInt("id"));
				player.setPlayer_name(resultSet.getString("player_name"));
				player.setTeam_id(resultSet.getInt("team_id"));
				player.setGoals(resultSet.getInt("goals"));
				player.setDob(resultSet.getDate("dob"));
				player.setEarnings(resultSet.getLong("earnings"));
				playersList.add(player);
			}
			if(playersList.size() == 0) {
				throw new BusinessException("No players in database");
			}
		}catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal error occured contact admin");
		}
		return playersList;
	}

}
