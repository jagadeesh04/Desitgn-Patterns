package Behavioral.Observer;

public class PayrollDepartment implements IObserver {

	@Override
	public void callMe(Employee emp, String msg) {
		System.out.println("payroll dept notified");
		System.out.println(msg+" "+emp.getName());
	}

}
