package Interfaces;

public interface I1 {
	
	int x = 100;  //public static final
	
	void show ();  //public abstract
	
	//static method
	
	public static void staticdemo() {
		
		System.out.println("Method from I1");
	}
	
	//default method
	default void defmethod() {
		System.out.println("My default Method from I1");
	}
}
