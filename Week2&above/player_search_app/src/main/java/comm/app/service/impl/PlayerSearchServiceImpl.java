package comm.app.service.impl;

import java.util.List;

import comm.app.dao.PlayerSearchDAO;
import comm.app.dao.impl.PlayerSearchDAOImpl;
import comm.app.exception.BusinessException;
import comm.app.model.Player;
import comm.app.service.PlayerSearchService;

public class PlayerSearchServiceImpl implements PlayerSearchService {
	
	private PlayerSearchDAO playerSearchDAO=new PlayerSearchDAOImpl();
	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player=null;
		if(id>100 && id<200) {
			//code here for DAO
			player=playerSearchDAO.getPlayerById(id);
		}else {
			throw new BusinessException("Entered Player ID "+id+" is invalid");
		}
		return player;
	}

	@Override
	public Player getPlayerByEarnings(long earnings) throws BusinessException {
		Player player=null;
		if(earnings > 0L && earnings < 1000000000L) {
			player=playerSearchDAO.getPlayerByEarnings(earnings);
		}else {
			throw new BusinessException("Entered Earnings of "+earnings+" is invalid");
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
		List<Player> goalsplayersList=null;
		if(goals >= 0) {
			goalsplayersList = playerSearchDAO.getPlayersByGoals(goals);
		}else {
			throw new BusinessException("Entered goals "+goals+" is invalid");
		}
		return goalsplayersList;
	}

	@Override
	public List<Player> getPlayersByTeamName(String team_name) throws BusinessException {
		List<Player> teamplayersList=null;
		if(team_name != null && team_name.matches("[ A-Za-z]{3,20}")) {
			teamplayersList = playerSearchDAO.getPlayersByTeamName(team_name);
		}else {
			throw new BusinessException("Entered team name "+team_name+" is invalid");
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
