package com.designpatterns.command.domain;

public class CeilingFan {
	private Speed speed;

	public CeilingFan() {
		this.speed = Speed.OFF;
	}

	public void on() {
		System.out.println("Ceiling fan is on " + speed);
	}
	public void off() {
		System.out.println("Ceiling fan is off");
	}

	public Speed getSpeed() {
		return speed;
	}

	public void setSpeed(Speed speed) {
		this.speed = speed;
	}

	public enum Speed {
		FAST, MEDIUM, SLOW, OFF;
	}
}