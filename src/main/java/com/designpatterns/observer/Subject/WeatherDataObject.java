package com.designpatterns.observer.Subject;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Observable;

@Data
@EqualsAndHashCode(callSuper=false)
public class WeatherDataObject extends Observable {
	private int temperature;
	private int humidity;
	private int pressure;

	public void measurementsChanged(int temperature, int humidity, int pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		// This is to make notify in Observable work. If changed if false, then we will not get our Observers notified
		setChanged();
		notifyObservers();
	}
}
