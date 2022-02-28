package conditionalstatement;

import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your marks(*out of 100) :");
		marks = sc.nextInt();
		
	
		if(marks <= 100 && marks >=70) {
			System.out.println("Distinction");
			
		}
		else if(marks < 70 && marks >=60)
		{
			System.out.println("First Class");
		}
		
		else if( marks < 60 && marks >=50)
		{
			System.out.println("Second Class");
		}
		else if(marks < 50 && marks >= 41)
		{
			System.out.println(" Third Class");
		}
		else if(marks == 40)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		sc.close();
	}

}
