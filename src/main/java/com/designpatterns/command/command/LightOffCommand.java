package com.designpatterns.command.command;

import com.designpatterns.command.domain.Light;

public class LightOffCommand implements Command {
	Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void rollBack() {
		light.on();
	}
}
