package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Forecast implements Observer, Displayable {
	private int humidity;

	public void display() {
		System.out.println("---Forecast---");
		String res;
		int humidity = this.humidity;
		if (humidity == 0) {
			res = "we are on fire or have no data";
		} else if (humidity > 80) {
			res = "the rain is quite possible";
		} else {
			res = "Who knows";
		}

		System.out.println(res);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherDataObject) {
			WeatherDataObject weatherDataObject = (WeatherDataObject) o;
			this.humidity = weatherDataObject.getHumidity();
			display();
		}
	}
}
