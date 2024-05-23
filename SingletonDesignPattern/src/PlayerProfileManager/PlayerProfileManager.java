package PlayerProfileManager;

import java.util.HashMap;
import java.util.Map;

public class PlayerProfileManager {

	private static PlayerProfileManager instance;
	private Map<String, PlayerProfile> profiles; //playerprofile class that includes username, level, score
	
	private PlayerProfileManager() {
		profiles = new HashMap<>();
	}
	
	public static PlayerProfileManager getInstance() {
		if(instance == null) {
			instance = new PlayerProfileManager();
		}
		return instance;
	}
	
	public void addPlayerProfile(String userName, PlayerProfile profile) {
		
		profiles.put(userName, profile);
	}
	
	public void removePlayerProfile(String userName) {
		
		profiles.remove(userName);
	}
	
	public PlayerProfile getPlayerProfile(String userName) {
		
		return profiles.get(userName);
	}
	
	public void updatePlayerProfile(String userName, PlayerProfile newProfile) {
		
		profiles.put(userName, newProfile);
	}
	
}


class PlayerProfile {
	
	private String userName;
	private int level,achievements;
	
	public PlayerProfile(String userName, int level, int achievements) {
		super();
		this.userName = userName;
		this.level = level;
		this.achievements = achievements;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getAchievements() {
		return achievements;
	}

	public void setAchievements(int achievements) {
		this.achievements = achievements;
	}

	@Override
	public String toString() {
		return "PlayerProfile [userName=" + userName + ", level=" + level + ", achievements=" + achievements + "]";
	}
	
	
}