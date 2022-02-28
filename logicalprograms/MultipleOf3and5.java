package logicalprograms;

public class MultipleOf3and5 {

	public static void main(String[] args) {
		int n = 10, sum =0;
		
		while (n<=100) {
			if(n%3==0 && n%5==0) {
				sum = sum +n;
				System.out.println(n + " ");
			}
			n++;
		}
		System.out.println("\nSum : " + sum);
	}

}
