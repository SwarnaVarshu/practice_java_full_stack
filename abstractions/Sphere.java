package abstractions;

public class Sphere extends Shape{

	@Override
	void area(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void volume(int a, int y, int z) 
	{
		// TODO Auto-generated method stub
		int b = a*y*z;
	System.out.println("Volume of the sphere : " + b);
	}


}