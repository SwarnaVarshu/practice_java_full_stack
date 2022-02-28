package conditionalstatement;
import java.util.Scanner;
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age:");
		
		age = sc.nextInt();
		
		System.out.println("-------------------");
		
		if(age>=18) {
			
			System.out.println("The person is major.");
		
		}
		else
		{
			System.out.println("The person is minor.");
		}
		
	}

}
