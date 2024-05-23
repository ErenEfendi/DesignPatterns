package TheWeatherMonitoringApp;

public class WeatherStation {

	public static void main(String[] args) {
		
		WeatherData w = new WeatherData();
		CurrentConditionsDisplay c = new CurrentConditionsDisplay();
		StatisticsDisplay s = new StatisticsDisplay();
		w.registerObserver(c);
		w.registerObserver(s);
		w.setMeasurements(30, 65, 30.4f);
		w.setMeasurements(28, 70, 29.2f);
		

	}

}
