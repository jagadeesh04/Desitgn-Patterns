package Behavioral.Strategy;


//call employees to perform the responsible duties
//voilates OCP(Open Closed Principle) rule
public class HospitalManagement {

	public void callUpon(Employee employee){
		employee.performDuties();
	}
	
	
}
