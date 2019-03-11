package com.designpatterns.command.command;

import com.designpatterns.command.domain.Stereo;

public class StereoOnCommand implements Command {
	Stereo stereo;

	public StereoOnCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
	}

	@Override
	public void rollBack() {
		stereo.off();
	}
}
