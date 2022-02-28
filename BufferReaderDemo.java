import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReaderDemo {

	public static void main(String[] args)  throws Exception{
		
		// TODO Auto-generated method stub
	
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader brr = new BufferedReader(r);
		System.out.println("Enter your name   :  ");
		String name = brr .readLine();
		System.out.println("Enter your age  :  "  );
		int x = Integer.parseInt(brr.readLine());
		
	
		System.out.println("Welcome"+ name);
		System.out.println("Your lucky age is : "+ x);
	}

}
