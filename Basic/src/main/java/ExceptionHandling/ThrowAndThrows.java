package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

class Throw{
	public static void Eligibality(int age) {
		if(age<18) {
			throw new ArithmeticException("Person is not eligible to vote.");
		}else {
			System.out.println("Person is eligible to vote.");
		}
	}
}
//In the above example, we are explicitly throwing the ArithmeticException using the throw keyword.
//
//Similarly, the throws keyword is used to declare the type of exceptions that might occur within the method. It is used in the method declaration.
class Throws{
	 static void findFile() throws IOException{
		File newFile = new File("test.txt");
		FileInputStream stream = new FileInputStream(newFile);
	}
}

//The try...catch block in Java is used to handle exceptions and prevents the abnormal termination of the program.

public class ThrowAndThrows {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println();
		Throw.Eligibality(input);
		sc.close();
		try {
		Throws.findFile();
		} catch(IOException i){
			System.out.println(i.getMessage());
		}
	}

}
