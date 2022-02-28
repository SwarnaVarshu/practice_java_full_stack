package conditionalstatement;

import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/**
		 *  Write a java program to find the given number is positive or negative,
		 *  if the number is positive then verify that number is even or odd. 				
		 */
		
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number(except zero(0)) :");
		
		number = sc.nextInt();
		
		
		//outer if-else
		
		if(number>0) {
			
			//inner if-else
			
			if(number%2==0) {
				
				System.out.println("The number is an even.");
			}
			else
			{
				System.out.println("The number is an odd.");
			}
		}
		else
		{
		System.out.println("The number is negative.");
		}
		
		sc.close();
	}

}
