package comm.app.main;

import java.util.Scanner;

import comm.app.exception.BusinessException;
import comm.app.model.Player;
import comm.app.service.PlayerSearchService;
import comm.app.service.impl.PlayerSearchServiceImpl;

public class PlayerSearchMain {

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
			case 1:
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

			case 2:
				System.out.println("Thank you for your interest this option is still under construction");
	
				break;
			case 3:
				System.out.println("Thank you for your interest this option is still under construction");
				
				break;
			case 4:
				System.out.println("Thank you for your interest this option is still under construction");
				
				break;
			case 5:
				System.out.println("Thank you for your interest this option is still under construction");
				
				break;
			case 6:
				System.out.println("Thank you for your interest this option is still under construction");
				
				break;
			case 7:
				System.out.println("Thank you for your interest this option is still under construction");
				
				break;
			case 8:
				System.out.println("Thanks for using our Player Search App V1.0");
				
				break;

			default:System.out.println("Invalid Menu Option ... Please Retry");
				break;
			}
			
		}while(ch!=8);

	}

}
