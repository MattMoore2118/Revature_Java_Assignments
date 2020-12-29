package comm.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import comm.app.dao.PlayerSearchDAO;
import comm.app.dao.dbutil.PostgreSQLConnection;
import comm.app.exception.BusinessException;
import comm.app.model.Player;

public class PlayerSearchDAOImpl implements PlayerSearchDAO {

	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player = null;
		try(Connection connection=PostgreSQLConnection.getConnection()){
			String sql = "select player_name,team_id,goals,dob,earnings,team_name from \"Test\".player where id=?";
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
				player.setTeam_name(resultSet.getString("team_name"));
			}else {
				throw new BusinessException("No player found with ID: "+id);
			}
		}catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal error occured contact admin");
		}
		return player;
	}


	@Override
	public Player getPlayerByEarnings(long earnings) throws BusinessException {
		Player player=null;
		try(Connection connection=PostgreSQLConnection.getConnection()){
			String sql = "select id,player_name,team_id,goals,dob,team_name from \"Test\".player where earnings=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setLong(1, earnings);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				player =new Player();
				player.setId(resultSet.getInt("id"));
				player.setPlayer_name(resultSet.getString("player_name"));
				player.setTeam_id(resultSet.getInt("team_id"));
				player.setGoals(resultSet.getInt("goals"));
				player.setDob(resultSet.getDate("dob"));
				player.setEarnings(earnings);
				player.setTeam_name(resultSet.getString("team_name"));
			}else {
				throw new BusinessException("No player found with earnings = "+earnings);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal error occured contact admin");
		}
		return player;
	}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByGoals(int goals) throws BusinessException {
		List<Player> goalsplayersList=new ArrayList<>();
		try(Connection connection=PostgreSQLConnection.getConnection()){
			String sql = "select id,player_name,team_id,dob,earnings,team_name from \"Test\".player where goals=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, goals);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player =new Player();
				player.setId(resultSet.getInt("id"));
				player.setPlayer_name(resultSet.getString("player_name"));
				player.setTeam_id(resultSet.getInt("team_id"));
				player.setDob(resultSet.getDate("dob"));
				player.setEarnings(resultSet.getLong("earnings"));
				player.setTeam_name(resultSet.getString("team_name"));
				goalsplayersList.add(player);
			}
			if(goalsplayersList.size() == 0) {
				throw new BusinessException("No players with "+goals+" goals in database");
			}
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal error occured contact admin");
		}
		return goalsplayersList;
	}

	@Override
	public List<Player> getPlayersByTeamName(String team_name) throws BusinessException {
		List<Player> teamplayersList=new ArrayList<>();
		try(Connection connection=PostgreSQLConnection.getConnection()){
			String sql = "select id,player_name,team_id,goals,dob,earnings from \"Test\".player where team_name=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, team_name);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player =new Player();
				player.setId(resultSet.getInt("id"));
				player.setPlayer_name(resultSet.getString("player_name"));
				player.setTeam_id(resultSet.getInt("team_id"));
				player.setGoals(resultSet.getInt("goals"));
				player.setDob(resultSet.getDate("dob"));
				player.setEarnings(resultSet.getLong("earnings"));
				teamplayersList.add(player);
			}
			if(teamplayersList.size() == 0) {
				throw new BusinessException("No players from "+team_name+" in the database");
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact admin");
		}
		return teamplayersList;
	}

	@Override
	public List<Player> getPlayersByName(String name) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByDob(String dob) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
