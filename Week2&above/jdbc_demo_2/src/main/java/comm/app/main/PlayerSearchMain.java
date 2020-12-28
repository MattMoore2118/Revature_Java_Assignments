package comm.app.main;

import java.util.List;

import comm.app.dao.PlayerSearchDAO;
import comm.app.exception.BusinessException;
import comm.app.impl.PlayerSearchDAOImpl;
import comm.app.model.Player;

public class PlayerSearchMain {

	public static void main(String[] args) {
		
		PlayerSearchDAO dao=new PlayerSearchDAOImpl();
		try {
			Player player=dao.getPlayerByEarnings(28000000L);
			if(player !=null) {
				System.out.println("Player info with earnings of :"+player.getEarnings());
				System.out.println(player);
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String team_name="Man City";
			List<Player> playersList=dao.getPlayersByTeamName(team_name);
			if(playersList!=null && playersList.size()!=0) {
				System.out.println("\n\nFound "+playersList.size()+" number of players in database playing for "+team_name);
				for(Player p:playersList) {
					System.out.println(p);
				}
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		}

	

}
