package TheWeatherMonitoringApp;

public class CurrentConditionsDisplay implements Observer{

	private float t;
	private float p;
	private float h;
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.t = temperature;
		this.p = pressure;
		this.h = humidity;
		display();
	}
	
	public void display() {
		System.out.println("Current Conditions: "+ t +" C degrees and "+ h +"% humidity "+ p +" pressure");
	}

}
