package Creational;

import java.util.HashMap;
import java.util.Map;

/* Private constructor to restrict the instantiation of the class from other class\
 * private static variable for the same class that is the only instance of the class
 * make instance variable volatile to fetch singleton instance from primary memory than cached memory
 * double check the lock to avoid extra overhead
 * clone method to avaoid creating object by clone method 
 * */


public class Singleton {
	
	private static volatile Singleton INSTANCE;

	private Singleton(){
	
	}
	
	public static Singleton getInstance(){
		if(INSTANCE == null){
			synchronized (Singleton.class) {
				//double checking singleton class
				if(INSTANCE == null){
					INSTANCE = new Singleton();
				}
			}
		}
		return INSTANCE;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
	
	public static void main(String[] args) {
	Singleton singleton = new Singleton();
		
	}
	
}
