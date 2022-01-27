package com.uws.week10.command;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLightCommand {

	@Test
	void test() {
		Light mylight = new Light();
		
		Command lightOn = new LightsOnCommand(mylight);
		RemoteControl swithcOnRemote = new RemoteControl();
		swithcOnRemote.setCommand(lightOn);
		Command lightOff = new LightsOffCommand(mylight);
		RemoteControl swithcOffRemote = new RemoteControl();
		swithcOffRemote.setCommand(lightOff);
		
		assertFalse(mylight.lightStatus());
		swithcOnRemote.pressButton();
		assertTrue(mylight.lightStatus());
		swithcOffRemote.pressButton();
		assertFalse(mylight.lightStatus());
		
	}

}
