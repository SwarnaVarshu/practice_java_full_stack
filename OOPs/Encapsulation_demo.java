package OOPs;

public class Encapsulation_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Getter_Setter obj = new Getter_Setter();   //loose coupling  ,  using getter setter method
		
		obj.setI(25);
		obj.setN("Birth date  :  ");
		obj.setD(86.45);
		
		Getter_Setter obj1 = new Getter_Setter(800, "number", 45.88);   //tight coupling  ,  using constructor method
		
		System.out.println(obj.getN());
		System.out.println(obj.getI());
		System.out.println(obj.getD());
		System.out.println("\n");
		
		System.out.println(obj1.getI());
		System.out.println(obj1.getN());
		System.out.println(obj1.getD());
	}

}
