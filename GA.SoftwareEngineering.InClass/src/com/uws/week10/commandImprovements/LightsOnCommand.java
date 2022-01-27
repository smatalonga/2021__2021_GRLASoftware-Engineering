package com.uws.week10.commandImprovements;
/**
 * Created by robbert on 14/10/2015.
 */
public class LightsOnCommand implements Command{
    //reference to the light
    
    
    public void execute(Light someLight){
        someLight.switchOn();
    }
}
