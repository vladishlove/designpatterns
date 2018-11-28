package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class StatisticData implements Observer, Displayable {
	private List<Integer> temperatureData = new ArrayList<>();
	private List<Integer> humidityData = new ArrayList<>();
	private List<Integer> pressureData = new ArrayList<>();

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherDataObject) {
			WeatherDataObject weatherDataObject = (WeatherDataObject) o;
			temperatureData.add(weatherDataObject.getTemperature());
			humidityData.add(weatherDataObject.getHumidity());
			pressureData.add(weatherDataObject.getPressure());
			display();
		}
	}

	public void display() {
		int tmpSum = getIntArrSum(temperatureData);
		int humSum = getIntArrSum(humidityData);
		int pressSum = getIntArrSum(pressureData);

		System.out.println("---Statistic data---");
		System.out.println("avg temp = " + tmpSum / temperatureData.size());
		System.out.println("avg hum = " + humSum / humidityData.size());
		System.out.println("avg press = " + pressSum / pressureData.size());
	}

	private int getIntArrSum(List<Integer> temperatureData) {
		int rez = 0;
		for (Integer temperatureDataItem : temperatureData) {
			rez += temperatureDataItem;
		}

		return rez;
	}
}
