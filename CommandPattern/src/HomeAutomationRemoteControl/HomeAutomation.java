package HomeAutomationRemoteControl;

public class HomeAutomation {

	public static void main(String[] args) {
		
		RemoteControl remote = new RemoteControl(null);
		Light l = new Light();
		GarageDoor gd = new GarageDoor();
		HomeTheater ht = new HomeTheater();
		
		Command lightOn = new LightOnCommand(l);
		Command garageOn = new GarageDoorOpenCommand(gd);
		Command theaterStart = new HomeTheaterStartCommand(ht);
		
		remote.setCommand(0, lightOn);
		remote.setCommand(1, theaterStart);
		remote.setCommand(2, garageOn);
		
		remote.pressButton(0);
		remote.pressButton(1);
		remote.pressButton(2);

	}

}
