package comm.app.dao;

import java.util.List;

import comm.app.exception.BusinessException;
import comm.app.model.Player;

public interface PlayerCrudDAO {
	
	public int createPlayer(Player player) throws BusinessException;
	public void deletePlayer(int id) throws BusinessException;
	public int updatePlayerEarnings(int id, long earnings) throws BusinessException;
	public Player getPlayerById(int id) throws BusinessException;
	public List<Player> getAllPlayers() throws BusinessException;
}
