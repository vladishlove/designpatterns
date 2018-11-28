package com.designpatterns.observer.observer;

import com.designpatterns.observer.Subject.WeatherDataObject;

import java.util.Observable;
import java.util.Observer;

public class CurrentCondition implements Observer, Displayable {
	private int temperature;
	private int humidity;
	private int pressure;

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherDataObject) {
			WeatherDataObject weatherDataObject = (WeatherDataObject) o;
			this.temperature = weatherDataObject.getTemperature();
			this.pressure = weatherDataObject.getPressure();
			this.humidity = weatherDataObject.getHumidity();
			display();
		}

	}

	public void display() {
		System.out.println("---Current Conditions---");
		System.out.println("temp is " + temperature);
		System.out.println("hum is " + humidity);
		System.out.println("pressure is " + pressure);
	}
}
