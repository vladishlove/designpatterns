package com.designpatterns.observer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

@Data
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
