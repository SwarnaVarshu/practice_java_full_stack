package strings;

import java.util.Scanner;

public class Find_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " The comeback is always stronger than the setback ! ";
		Scanner sc = new Scanner(System.in);
		System.out.println( " Which string do you want to find ? " );
		String find = sc.nextLine();
		String [ ] str2=str.split(" ");
		int count = 0 ;
		
		for ( int i =0 ; i < str2.length; i++) {
			
			if(str2[i].equals(find)) {
				
				count++;
				break;
				
			}
		}
		
		if(count>0) {
			
			System.out.println(find + " , "  + " Your string is found. ");
			
		}
		else {
			System.out.println( " Your string is not found. ");
		}
	}

}
