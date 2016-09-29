package Behavioral.Strategy;

public class EmergencyRoomProcess {

	public static void main(String[] args) {
	
		
		HospitalManagement management = new HospitalManagement();
		Employee peggy = new Nurse(1, "peggy", "emergency", true);
		
		management.callUpon(peggy);
		
		Employee john = new Doctor(1, "John", "emergency", true);
		
		management.callUpon(john);
		
	}
	
}
