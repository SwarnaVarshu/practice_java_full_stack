package OOPs;

public class ThisKeyword {
	String name ="varshini";
	String email =" abc@gmail.com";
	
	public ThisKeyword(String name,String email ) {
		this.name=name;
		this.email = email;
		
	}
	
	public ThisKeyword()
	{
		System.out.println("Default contructor");
		
	}
	
	public void show()
	{
		System.out.println(name );
		System.out.println(email );
		
	}
	
	public static void main(String[]args) {
		
			ThisKeyword obj = new ThisKeyword();
					obj.show();
					
					
			}
	

}
