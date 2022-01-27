package com.uws.week10.commandImprovements;
/**
 * Created by robbert on 14/10/2015.
 */
/*
    INVOKER
 */
public class RemoteControl{
    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void pressButton(Light someLight){
        command.execute(someLight);
    }
}
