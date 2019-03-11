package com.designpatterns.command.command;

import com.designpatterns.command.domain.CeilingFan;
import com.designpatterns.command.domain.Light;

public class CeilingFanOnCommand implements Command {
	CeilingFan fan;

	public CeilingFanOnCommand(CeilingFan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.on();
	}

	@Override
	public void rollBack() {
		fan.off();
	}
}
