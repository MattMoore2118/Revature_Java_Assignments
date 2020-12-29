package comm.app.dao;

import java.util.List;

import comm.app.exception.BusinessException;
import comm.app.model.Player;

public interface PlayerSearchDAO {
	
	public Player getPlayerById(int id) throws BusinessException;
	public Player getPlayerByEarnings(long earnings) throws BusinessException;
	public List<Player> getAllPlayers() throws BusinessException;
	public List<Player> getPlayersByGoals(int goals) throws BusinessException;
	public List<Player> getPlayersByTeamName(String team_name) throws BusinessException;
	public List<Player> getPlayersByName(String name) throws BusinessException;
	public List<Player> getPlayersByDob(String dob) throws BusinessException;

}
