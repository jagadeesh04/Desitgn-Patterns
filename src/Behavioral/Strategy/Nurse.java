package Behavioral.Strategy;

public class Nurse extends Employee{

	public Nurse(int id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("Nurse in Aciton...");
	}
 
	
		private void checkVitalSigns(){
			System.out.println("checking vitals");
		}
		
		private void drawBlood(){
			System.out.println("drawing blood");
		}
		
		private void cleanPatientArea(){
			System.out.println("cleaning Patient Area");
		}


		@Override
		void performDuties() {
			checkVitalSigns();
			drawBlood();
			cleanPatientArea();
		}
	
	
}
