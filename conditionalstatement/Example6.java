package conditionalstatement;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter age:");
		age = scanner.nextInt();
		
		System.out.println("=====================");
		
		if(age >= 18)//condition
		
			System.out.println("the person is major");
		
		else
		
			System.out.println("the person is minor");
		
		
		scanner.close();
	}

}
