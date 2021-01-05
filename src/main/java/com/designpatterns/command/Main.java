package com.designpatterns.command;

import com.designpatterns.command.command.*;
import com.designpatterns.command.domain.CeilingFan;
import com.designpatterns.command.domain.GarageDoor;
import com.designpatterns.command.domain.Light;

public class Main {
	public static void main(String[] args) throws Exception {
		int g = 1;
		System.out.println(g);
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		CeilingFan ceilingFan = new CeilingFan();

		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
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

		remoteControl.clearSlot(0);
		remoteControl.clearSlot(1);

		remoteControl.addCommandToFirstEmptySlot(ceilingFanOnCommand);
		remoteControl.addCommandToFirstEmptySlot(ceilingFanOffCommand);

		remoteControl.pressTheButton(1);
		remoteControl.pressTheButton(1);
		remoteControl.pressTheButton(1);
		remoteControl.pressTheButton(1);
		remoteControl.rollBack();

		remoteControl.pressTheButton(2);





	}
}
