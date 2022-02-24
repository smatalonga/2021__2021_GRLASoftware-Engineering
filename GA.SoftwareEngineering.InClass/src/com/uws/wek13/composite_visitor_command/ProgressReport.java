package com.uws.wek13.composite_visitor_command;

public class ProgressReport extends ActionManager {

	StringBuffer sb = new StringBuffer();
	
	private void addProgress(Employee developer, int i) {
		sb.append(developer.toString() + "->"+50); //TOdo Abstract metod to accept  emloyee
		
	}

	public String toString() {
		return sb.toString();
	}

	@Override
	public void action(Employee e, int num) {
		this.addProgress(e, num);
		
	}
}
