package com.uws.wek13.composite_visitor_command;

public class Developer extends Employee{
	public Developer(String name, int empId, int salary)
    {
		super(name, empId, salary);
    }

     
   

    public  boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public int hashCode()
    {
        return super.hashCode();
    }

   

    public String toString()
    {
        return this.getName();
    }
    
    public void develop() {
    	System.out.println("Developing");
    }
    
    protected void action(ActionManager pr) {
    	pr.action(this, 50);
    }
}
