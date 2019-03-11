package com.designpatterns.command;

import com.designpatterns.command.command.GarageDoorOpenCommand;
import com.designpatterns.command.command.LightOffCommand;
import com.designpatterns.command.command.LightOnCommand;
import com.designpatterns.command.domain.GarageDoor;
import com.designpatterns.command.domain.Light;

public class Main {
	public static void main(String[] args) throws Exception {
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

		RemoteControl remoteControl = new RemoteControl(2);

		remoteControl.addCommandToFirstEmptySlot(lightOnCommand);
		remoteControl.addCommandToFirstEmptySlot(lightOffCommand);

		remoteControl.pressTheButton(1);
		remoteControl.rollBack();
		remoteControl.pressTheButton(2);

		remoteControl.clearSlot(1);
		remoteControl.setCommand(garageDoorOpenCommand, 1);

		remoteControl.pressTheButton(2);
		remoteControl.rollBack();



	}
}
