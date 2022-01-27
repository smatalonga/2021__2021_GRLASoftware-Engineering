package com.uws.week10.commandImprovements;
/**
 * Created by robbert on 14/10/2015.
 */
/*
    RECEIVER
 */
public class Light{
    private boolean on;
    
    public Light() {
    	this.on = false;
    }
    public void switchOn(){
        on = true;
    }
    public void switchOff(){
        on = false;
    }
    
    public boolean lightStatus() {
    	return on;
    }
}
