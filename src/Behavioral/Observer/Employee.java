package Behavioral.Observer;

import java.util.Date;

public class Employee {

	private String name;
	private Date hireDate;
	private int salary;
	private int empID;
	private boolean working = false;
	
	private static int COUNTER;
	
	public Employee(String name, Date date, int salary, boolean working) {
		super();
		this.name = name;
		this.hireDate = date;
		this.salary = salary;
		this.working = working;
		
		empID =++COUNTER;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpID() {
		return empID;
	}
	
	
	
	
	
	
}
