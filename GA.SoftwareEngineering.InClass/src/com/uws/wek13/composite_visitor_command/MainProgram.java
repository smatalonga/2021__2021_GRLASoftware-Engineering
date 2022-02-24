package com.uws.wek13.composite_visitor_command;

public class MainProgram {

	public static void main(String[] args) {
		Manager Pep = new Manager("Pep", 1, 1000);
		Developer Kun = new Developer("Kun", 2, 500);
		Developer Kevin = new Developer("Kevin", 3, 500);
		
		Pep.add(Kun);
		Pep.add(Kevin);
		
		ProgressReport pr = new ProgressReport();
		Pep.action(pr);

		System.out.println(pr.toString());
	}

}
