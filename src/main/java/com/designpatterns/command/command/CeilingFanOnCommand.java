package com.designpatterns.command.command;

import com.designpatterns.command.domain.CeilingFan;
import com.designpatterns.command.domain.Light;

public class CeilingFanOnCommand implements Command {
	CeilingFan fan;
	CeilingFan.Speed previousSpeed;

	public CeilingFanOnCommand(CeilingFan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		previousSpeed = fan.getSpeed();
		switch (previousSpeed) {
			case OFF:
				fan.setSpeed(CeilingFan.Speed.SLOW);
				break;
			case SLOW:
				fan.setSpeed(CeilingFan.Speed.MEDIUM);
				break;
			case MEDIUM:
				fan.setSpeed(CeilingFan.Speed.FAST);
				break;
			case FAST:
				fan.setSpeed(CeilingFan.Speed.SLOW);
				break;
		}

		fan.on();
	}

	@Override
	public void rollBack() {
		if (previousSpeed == CeilingFan.Speed.OFF) {
			fan.off();
		} else {
			fan.setSpeed(previousSpeed);
			fan.on();
		}
	}
}