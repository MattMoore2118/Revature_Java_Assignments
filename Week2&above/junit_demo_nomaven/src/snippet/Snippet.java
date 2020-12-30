package snippet;

public class Snippet {
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
}

