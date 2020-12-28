package comm.app.dao;

import java.util.List;

import comm.app.exception.BusinessException;
import comm.app.model.Player;

public interface PlayerSearchDAO {
	
	public Player getPlayerByEarnings(long earnings) throws BusinessException;
	public List<Player> getPlayersByTeamName(String team_name) throws BusinessException;

}
