package com.uws.week10.command;
/**
 * Created by robbert on 14/10/2015.
 */
public class LightsOffCommand implements Command{
    //reference to the light
    Light light;
    public LightsOffCommand(Light light){
        this.light = light;
    }
    public void execute(){
        light.switchOff();
    }
}
