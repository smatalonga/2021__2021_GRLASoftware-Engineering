package com.uws.week10.commandImprovements;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLightCommand {

	@Test
	void test() {
		Light mylight = new Light();
		
		Command lightOn = new LightsOnCommand();
		RemoteControl swithcOnRemote = new RemoteControl();
		swithcOnRemote.setCommand(lightOn);
		Command lightOff = new LightsOffCommand();
		RemoteControl swithcOffRemote = new RemoteControl();
		swithcOffRemote.setCommand(lightOff);
		
		assertFalse(mylight.lightStatus());
		swithcOnRemote.pressButton(mylight);
		assertTrue(mylight.lightStatus());
		swithcOffRemote.pressButton(mylight);
		assertFalse(mylight.lightStatus());
		
	}

}
