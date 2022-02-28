package logicalprograms;

import java.util.Scanner;

public class Remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		int a , b , result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter test cases");
		t = sc.nextInt();
		for(int i = 0; i<t; i++)
		{
			System.out.println("Enter the values of a ");
			a = sc.nextInt();
			System.out.println("Enter the values of b ");
			b = sc.nextInt();
			result = a%b;
			System.out.println("Result is : " + result);
		}
		
		
	}

}
