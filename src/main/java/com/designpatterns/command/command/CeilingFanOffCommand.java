package com.designpatterns.command.command;

import com.designpatterns.command.domain.CeilingFan;

public class CeilingFanOffCommand implements Command {
	CeilingFan fan;

	public CeilingFanOffCommand(CeilingFan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.off();
	}

	@Override
	public void rollBack() {
		fan.on();
	}
}
