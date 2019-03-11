package com.designpatterns.command.command;

import com.designpatterns.command.domain.GarageDoor;

public class GarageDoorCloseCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorCloseCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.close();
	}

	@Override
	public void rollBack() {
		garageDoor.open();
	}
}
