package HomeAutomationRemoteControl;

//concrete classes for command interface
public class LightOnCommand implements Command{

	private Light light;
	
	public LightOnCommand(Light l) {
		this.light = l;
	}
	
	@Override
	public void execute() {
		
		light.turnOn();
	}

	
}


class GarageDoorOpenCommand implements Command{

	private GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		garageDoor.open();
	}
	
}


class HomeTheaterStartCommand implements Command{

	private HomeTheater homeTheater;
	
	public HomeTheaterStartCommand(HomeTheater homeTheater) {
		super();
		this.homeTheater = homeTheater;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		homeTheater.start();
	}
	
}
