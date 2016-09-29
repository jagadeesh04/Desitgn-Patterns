package Behavioral.Strategy;


//call employees to perform the responsible duties
//voilates OCP(Open Closed Principle) rule
public class HospitalManagement {

	public void callUpon(Employee employee){
		if(employee instanceof Nurse){
			checkVitalSigns();
			drawBlood();
			cleanPatientArea();
		}
		else if(employee instanceof Doctor){
			prescribeMedicine();
			diagnosePatients();
		}
	}
	
	
	//nurses
	private void checkVitalSigns(){
		System.out.println("checking vitals");
	}
	
	private void drawBlood(){
		System.out.println("drawing blood");
	}
	
	private void cleanPatientArea(){
		System.out.println("cleaning Patient Area");
	}
	
	//doctor
	private void prescribeMedicine(){
		System.out.println("Prescribe Medicine");
	}
	
	private void diagnosePatients(){
		System.out.println("Diagnosing Patient");
	}
	
}
