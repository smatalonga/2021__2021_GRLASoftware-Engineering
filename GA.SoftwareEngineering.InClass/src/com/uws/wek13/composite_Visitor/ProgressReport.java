package com.uws.wek13.composite_Visitor;

public class ProgressReport {

	StringBuffer sb = new StringBuffer();
	
	public void addProgress(Developer developer, int i) {
		sb.append(developer.toString() + "->"+50);
		
	}

	public String toString() {
		return sb.toString();
	}
}
