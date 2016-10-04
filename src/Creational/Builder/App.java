package Creational.Builder;

public class App {

	public static void main(String[] args) {
		User websiteUser = new User.Builder("Jag", "jag@jag.com").firstName("jagadeesh").build();
	
		System.out.println(websiteUser.toString());
	
	}
	
	
}
