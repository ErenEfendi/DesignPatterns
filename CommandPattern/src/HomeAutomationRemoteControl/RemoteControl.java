package HomeAutomationRemoteControl;

//invoker class
public class RemoteControl {

	private Command[] buttons;

	public RemoteControl(Command[] buttons) {
		super();
		this.buttons = new Command[3];
	}
	
	public void setCommand(int slot, Command command) {
		
		buttons[slot] = command;
	}
	
	public void pressButton(int slot) {
		buttons[slot].execute();
	}
	
	
}
