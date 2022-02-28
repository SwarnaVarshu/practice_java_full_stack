package demo_loops;

import java.util.Scanner;

public class While_loop_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int i = 1;
		
		 while(i<=8)
		 {
			 System.out.print(i);
			 i++;
			 
		 }*/
		
		int i = 1;
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println(" How many numbers do you want to print");
		n = sc.nextInt();
		
		while(i<=n)
		
		
		{
			System.out.print(i);
			i++;
		}
	}

}
