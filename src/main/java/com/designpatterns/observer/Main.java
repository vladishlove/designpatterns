package com.designpatterns.observer;

import com.designpatterns.observer.Subject.WeatherDataObject;
import com.designpatterns.observer.observer.CurrentCondition;
import com.designpatterns.observer.observer.Forecast;
import com.designpatterns.observer.observer.StatisticData;

public class Main {
	public static void main(String[] args) {
		WeatherDataObject weatherDataObject = new WeatherDataObject();

		CurrentCondition currentCondition = new CurrentCondition();
		Forecast forecast = new Forecast();
		StatisticData statisticData = new StatisticData();

		weatherDataObject.addObserver(currentCondition);
		weatherDataObject.addObserver(forecast);
		weatherDataObject.addObserver(statisticData);

		weatherDataObject.measurementsChanged(50, 70, 745);
		System.out.println("===Values changed===");
		weatherDataObject.measurementsChanged(70, 90, 760);

	}
}
