package PlayerProfileManager;

public class Game {

	public static void main(String[] args) {
		
		PlayerProfileManager profileManager = PlayerProfileManager.getInstance();
		
		profileManager.addPlayerProfile("player1", new PlayerProfile("TheWock", 31, 69));
		System.out.println(profileManager.getPlayerProfile("player1"));

	}

}
