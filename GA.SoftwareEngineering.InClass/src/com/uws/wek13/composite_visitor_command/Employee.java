package com.uws.wek13.composite_visitor_command;

public abstract class Employee {
	private String name;
    private int empId;
    private int salary;

    public Employee(String name, int empId, int salary)
    {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    

    //public abstract void add(Employee employee) throws NotImplementedException;

    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public int GetHashCode()
    {
        return super.hashCode();
    }

   // public abstract void remove(Employee employee) throws NotImplementedException;

    public String ToString()
    {
        return super.toString();
    }



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	protected abstract void action(ActionManager pr);
}
