package Behavioral.Observer;

public class HRDepartment implements IObserver {

	@Override
	public void callMe(Employee emp, String msg) {
		// TODO Auto-generated method stub
		System.out.println("HR dept notified");
		System.out.println(msg+" "+emp.getName());
	}

}
