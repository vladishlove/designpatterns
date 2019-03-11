package com.designpatterns.command.domain;

public class CeilingFan {
	private Speed speed;

	public CeilingFan() {
		this.speed = Speed.SLOW;
	}

	public void on() {
		System.out.println("Ceiling fan is on");
	}
	public void off() {
		System.out.println("Ceiling fan is off");
	}

	enum Speed {
		FAST, MEDIUM, SLOW;
	}
}