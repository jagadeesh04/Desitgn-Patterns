package Behavioral.Template;

public class LaptopManufacturingProcess extends GeneralManufacturingProcess{

	public LaptopManufacturingProcess(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void assembleDevice() {
		System.out.println("Assembled laptop");
		
	}

	@Override
	protected void testDevice() {
		System.out.println("tested laptop");		
	}

	@Override
	protected void packageDevice() {
		System.out.println("packaged laptop");
		
	}

	@Override
	protected void storeDevice() {
		System.out.println("stored laptop");
	}

}
