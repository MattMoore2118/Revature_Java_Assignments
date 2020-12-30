package comm.app.main;

import java.util.List;
import java.util.Scanner;

import comm.app.exception.BusinessException;
import comm.app.model.Player;
import comm.app.service.PlayerSearchService;
import comm.app.service.impl.PlayerSearchServiceImpl;

public class PlayerSearchMain {

	private static final String player_name = null;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Player Search app V1.0");
		System.out.println("___________________________________");
		int ch=0;
		PlayerSearchService playerSearchService = new PlayerSearchServiceImpl();
		do {
			System.out.println("Player Search Menu");
			System.out.println("___________________");
			System.out.println("1. By ID Number");
			System.out.println("2. By Earnings");
			System.out.println("3. By Number of goals");
			System.out.println("4. By Team Name");
			System.out.println("5. By Name");
			System.out.println("6. By Date of Birth (Dob)");
			System.out.println("7. Show All Players");
			System.out.println("8. EXIT");
			System.out.println("Please enter appropriate choice between 1-8");
			try {
			ch=Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e) {
			}
			
			switch (ch) {
			case 1:// By player ID
				System.out.println("Enter Player ID to get Player Details");
				try {
					int id=Integer.parseInt(sc.nextLine());
					//code to service
					Player player=playerSearchService.getPlayerById(id);
					if(player!=null) {
						System.out.println("Player found with ID: "+id+" details of player :");
						System.out.println(player);
					}
					}catch(NumberFormatException e) {
						System.out.println("Player ID Number cannot be special characters, symbols, or white spaces. Must be numeric");
					} catch (BusinessException e) {
						System.out.println(e.getMessage());
					}
				break;

			case 2: //By player earnings (long/contact from Dr. Vinay examples)
				System.out.println("Enter Player Earnings to get Player details");
				try {
					long earnings=Long.parseLong(sc.nextLine());
					//code to service
					Player player=playerSearchService.getPlayerByEarnings(earnings);
					if(player!=null) {
						System.out.println("Player found with earnings: "+earnings+" details of player :");
						System.out.println(player);
					}
					}catch(NumberFormatException e) {
						System.out.println("Player earnings cannot be special characters, symbols, or white spaces. Must be numeric");
					} catch (BusinessException e) {
						System.out.println(e.getMessage());
					}
				break;
				
			case 3: //All players with certain number of goals
				System.out.println("Enter number of goals to retrieve the Players detials");
				try {
					int goals=Integer.parseInt(sc.nextLine());
					//code to service
					List<Player> goalsplayersList=playerSearchService.getPlayersByGoals(goals);
					if(goalsplayersList!=null) {
						System.out.println(goalsplayersList.size()+" player(s) found with "+goals+" goals"+" \ndetails of player(s) :");
						for(Player p:goalsplayersList) {
							System.out.println(p);
						}
					}
					}catch(NumberFormatException e) {
						System.out.println("Number of Goals cannot be special characters, symbols, or white spaces. Must be numeric");
					} catch (BusinessException e) {
						System.out.println(e.getMessage());
					}
				break;
				
			case 4: //All players from certain team
				System.out.println("Enter Team name to get all players from that team");
				try {
					String team_name=sc.nextLine();
					List<Player> teamplayersList=playerSearchService.getPlayersByTeamName(team_name);
					if(teamplayersList!=null) {
						System.out.println(teamplayersList.size()+" player(s) found who play for "+team_name+" \ndetails of player(s) :");
						for(Player p:teamplayersList) {
							System.out.println(p);
						}
					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				
				break;
				
			case 5: //Players by name
				System.out.println("Enter Player name to get player detials");
				try {
					String name=sc.nextLine();
					List<Player> PlayerNameList=playerSearchService.getPlayersByName(name);
					if(PlayerNameList!=null) {
						System.out.println(PlayerNameList.size()+" player(s) named "+name+" \ndetails of player(s) :");
						for(Player p:PlayerNameList) {
							System.out.println(p);
						}
					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 6: //Players by dob
				System.out.println("Enter Player DOB to get player details");
				try {
					String dob=sc.nextLine();
					List<Player> DOBplayerList=playerSearchService.getPlayersByDob(dob);
					if(DOBplayerList!=null) {
						System.out.println(DOBplayerList.size()+" player(s) born on "+dob+" \ndetails of player(s) :");
						for(Player p:DOBplayerList) {
							System.out.println(p);
						}
					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 7: //All players in db
				System.out.println("All Players in Database");
				try {
					List<Player> AllplayersList=playerSearchService.getAllPlayers();
					if(AllplayersList != null) {
						System.out.println(AllplayersList.size()+" found in database... printing details");
						for(Player p:AllplayersList) {
							System.out.println(p);
						}
					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				
				break;
			case 8: //Exit
				System.out.println("Thanks for using our Player Search App V1.0");
				
				break;

			default:System.out.println("Invalid Menu Option ... Please Retry");
				break;
			}
			
		}while(ch!=8);

	}

}
