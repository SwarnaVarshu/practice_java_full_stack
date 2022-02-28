package strings;

import java.util.Scanner;

public class Vowels_Consanants {
	
	public static void performanceCounting(String str) {
		char ch;
		int vowelsCount = 0;
		int consanantsCount = 0;
		int othersCount = 0;
		
		str = str.toLowerCase();
		
		for(int i = 0; i < str.length(); i++) 
		{
			ch = str.charAt(i);
			
			if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u') 
				
			vowelsCount ++;
			
			else if(ch >= 'a' && ch <= 'z')
			
			consanantsCount ++;
			
			else
				othersCount++;
				
		}
		
		System.out.println("Vowels : " + vowelsCount +  "\n "  + "Consanants : " + consanantsCount +  "\n"  + "Others : " + othersCount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string :  ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		performanceCounting(str);
	}

}
