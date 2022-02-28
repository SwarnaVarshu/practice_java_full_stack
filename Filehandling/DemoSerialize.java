package Filehandling;

import java.io.*;

public class DemoSerialize {

	public static void main(String[] args) {
		
		Employee e = new Employee(21,"Varshini");
		
		try
		{
			FileOutputStream fileOut = new FileOutputStream("D:/MyEmployee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in /tmp/employee.ser");
			
			
		}catch(IOException i)
		{
			i.printStackTrace();
		}

	}

}
