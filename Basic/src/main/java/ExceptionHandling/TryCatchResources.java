
//The try-with-resources statement automatically closes all the resources at the end of the statement. A resource is an object to be closed at the end of the program.

//@author Junayed Rahaman

package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Program{
	public static void test() {
		String line;
	try(BufferedReader br = new BufferedReader(new FileReader("C://My Files/test.txt"))){
		while((line = br.readLine()) != null) {
			System.out.println("Line = " + line);
		}
	}
	catch(IOException e) {
		System.out.println("IOException in try Block = " + e.getMessage());
	}
	}
	
}


public class TryCatchResources {

	public static void main(String[] args) {
		Program.test();
	}

}
