package com.designpatterns.command.command;

import com.designpatterns.command.domain.GarageDoor;
import com.designpatterns.command.domain.Light;

public class GarageDoorOpenCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.open();
	}

	@Override
	public void rollBack() {
		garageDoor.close();
	}
}
