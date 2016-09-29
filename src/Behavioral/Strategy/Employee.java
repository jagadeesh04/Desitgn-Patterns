package Behavioral.Strategy;

public abstract class Employee {

	private int id;
	private String name;
	private String department;
	private boolean working;
	
	public Employee(int id, String name, String department, boolean working) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.working = working;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee [id=" +id+", name= "+name+", department= "+department+ ", working= "+working+ "]";
	}
	
	abstract void performDuties();
	
}
