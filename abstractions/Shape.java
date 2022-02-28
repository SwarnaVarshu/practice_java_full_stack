package abstractions;

public abstract class Shape{
	
	abstract void area(int x, int y);
	abstract void volume(int a , int y , int z);
	
	
	void show() {
		
		System.out.println(" Print the area and volume of the shape :" );
	}
	

}
