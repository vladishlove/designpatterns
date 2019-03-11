package com.designpatterns.command.command;

import com.designpatterns.command.domain.CeilingFan;
import com.designpatterns.command.domain.Stereo;

public class StereoOffCommand implements Command {
	Stereo stereo;

	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.off();
	}

	@Override
	public void rollBack() {
		stereo.on();
	}
}
