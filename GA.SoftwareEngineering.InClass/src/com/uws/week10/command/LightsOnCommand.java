package com.uws.week10.command;
/**
 * Created by robbert on 14/10/2015.
 */
public class LightsOnCommand implements Command{
    //reference to the light
    Light light;
    public LightsOnCommand(Light light){
        this.light = light;
    }
    public void execute(){
        light.switchOn();
    }
}
