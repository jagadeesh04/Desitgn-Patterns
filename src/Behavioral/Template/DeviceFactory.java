package Behavioral.Template;

public class DeviceFactory {

	public static void main(String[] args) {
		GeneralManufacturingProcess manufacturer = new SmartPhoneManufacturingProcess("Iphone");
		manufacturer.launchProcess();
	}
	
}
