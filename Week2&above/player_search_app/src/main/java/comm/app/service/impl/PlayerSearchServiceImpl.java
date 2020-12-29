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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByGoals(int goals) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByTeamName(String team_name) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
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
