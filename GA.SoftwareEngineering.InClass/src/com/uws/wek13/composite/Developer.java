package com.uws.wek13.composite;

public class Developer extends Employee{
	public Developer(String name, int empId, int salary)
    {
		super(name, empId, salary);
    }

     
    public void add(Employee employee) throws NotImplementedException
    {
        throw new NotImplementedException();
    }

    public  boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public int hashCode()
    {
        return super.hashCode();
    }

    public void remove(Employee employee) throws NotImplementedException
    {
        throw new NotImplementedException();
    }

    public String toString()
    {
        return super.toString();
    }
    
    public void develop() {
    	System.out.println("Developing");
    }
    
    public void reportProgress(ProgressReport pr) {
    	pr.addProgress(this, 50);
    }
}
