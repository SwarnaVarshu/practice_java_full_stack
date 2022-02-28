package Interfaces;

public class InterDemo implements I1 , I2{
	
	
	public InterDemo() {
		
		this.defmethod();
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	static void staticdemo() {
		
		I2.display();
	}
}