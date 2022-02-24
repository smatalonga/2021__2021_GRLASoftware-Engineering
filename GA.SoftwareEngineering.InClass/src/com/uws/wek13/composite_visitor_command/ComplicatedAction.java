package com.uws.wek13.composite_visitor_command;

import java.util.ArrayList;

public class ComplicatedAction extends ActionManager {

	ArrayList<ActionManager> list = new ArrayList<ActionManager>();
	
	public void addAction(ActionManager newAction) {
		list.add(newAction);
	}
	@Override
	public void action(Employee e, int num) {
		for (ActionManager action : list){
			action.action(e, num);
		}
		
	} 
	
	
}
