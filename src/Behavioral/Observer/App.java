package Behavioral.Observer;

import java.util.Date;

public class App {

	public static void main(String[] args) {
		IObserver payroll = new PayrollDepartment();
		IObserver hrSystem = new HRDepartment();
		
		EmployeeManagementSystem ems = new EmployeeManagementSystem();
		ems.registerObserver(payroll);
		ems.registerObserver(hrSystem);
		
		
		Employee bob = new Employee("Bob", new Date(), 7000, true);
		
		ems.hireNewEmployee(bob);
		
		ems.modifyEmployeeName(5, "Jagadeesh");
	}
	
}
