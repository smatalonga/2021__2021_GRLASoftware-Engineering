package com.uws.wek13.composite_Visitor;

import java.util.*;

public class Manager extends Employee {
	private ArrayList<Employee> employees;

    public Manager(String name, int empId, int salary) 
    {
    	super(name, empId, salary);
        employees = new ArrayList<Employee>();

    }

    public void add(Employee employee)
    {
        employees.add(employee);
    }

    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public int GetHashCode()
    {
        return super.GetHashCode();
    }

    public void remove(Employee employee)
    {
        employees.remove(employee);
    }

    public String toString()
    {
        return super.toString();
    }
    
    public void manage(Employee employee) {
    	if (this.employees.contains(employee)) {
    		System.out.println("Managing "+employee);
    	}
    }
    
    //Visit
    public ProgressReport GatherReportProgressInfo() {
    	ProgressReport pr = new ProgressReport();
    	for (Employee e : this.employees){
    		e.reportProgress(pr);
    	}
    	return pr;
    }
    
    public void reportProgress(ProgressReport pr) {
    	for (Employee e : this.employees){
    		e.reportProgress(pr);
    	}
    }
}
