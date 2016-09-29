package Behavioral.Observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeDAO {
	
	Employee emp1 = new Employee("Mike", new Date(), 3500, false);
	Employee emp2 = new Employee("Steve", new Date(), 5000, false);
	Employee emp3 = new Employee("Ram", new Date(), 7500, false);
	Employee emp4 = new Employee("Jag", new Date(), 2000, false);
	Employee emp5 = new Employee("Tim", new Date(), 6200, false);
	Employee emp6 = new Employee("Jim", new Date(), 1450, false);
	Employee emp7 = new Employee("Bill", new Date(), 8500, false);

	List<Employee> employees;
	
	public List<Employee> generateEmployees(){
		employees = new ArrayList<>();
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		employees.add(emp6);
		employees.add(emp7);
		
		return employees;
		
	}
	
	public void addEmployee(Employee emp){
		employees.add(emp);
	}
	
}
