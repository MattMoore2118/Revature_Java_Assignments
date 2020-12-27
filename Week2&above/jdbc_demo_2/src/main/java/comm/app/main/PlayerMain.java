package comm.app.main;

import java.util.Date;
import java.util.List;

import comm.app.dao.PlayerCrudDAO;
import comm.app.exception.BusinessException;
import comm.app.impl.PlayerCrudDAOImpl;
import comm.app.model.Player;

public class PlayerMain {

	public static void main(String[] args) {
		
		PlayerCrudDAO dao=new PlayerCrudDAOImpl();
//		
//		Player p=new Player(105, "Virgil van Dijk", 1, 2, new java.sql.Date(19910708), 25000000L);
//		//Wrong dob added to table otherwise worked
//		
//		try {
//			if(dao.createPlayer(p) != 0) {
//				System.out.println("Player added successfully");
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
		
		// Delete player task
//		try {
//			dao.deletePlayer(105);
//			System.out.println("Player deleted successfully");
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
		
		// Update player task
//		try {
//			dao.updatePlayerEarnings(105, 28000000);
//			System.out.println("Earnings Updated");
//		}catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}

		try {
			Player player=dao.getPlayerById(105);
			if(player !=null) {
				System.out.println("Player info with id no. :"+player.getId());
				System.out.println(player);
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			List<Player> playersList=dao.getAllPlayers();
			if(playersList!=null && playersList.size()!=0) {
				System.out.println("\n\nFound "+playersList.size()+" number of players in database, printing all");
				for(Player p:playersList) {
					System.out.println(p);
				}
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
