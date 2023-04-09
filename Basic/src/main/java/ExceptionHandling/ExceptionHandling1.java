package ExceptionHandling;
//An exception is an unexpected event that occurs during program execution. It affects the flow of the program instructions which can cause the program to terminate abnormally.

//The try-catch block is used to handle exceptions in Java. 

//Here, we have placed the code that might generate an exception inside the try block. Every try block is followed by a catch block.
//
//When an exception occurs, it is caught by the catch block. The catch block cannot be used without the try block.

//In Java, the finally block is always executed no matter whether there is an exception or not.
//
//The finally block is optional. And, for each try block, there can be only one finally block.
//
//The basic syntax of finally block is:


class DivideByZero {
	public void divByZero() {
	try {
	 int divideByZero = 5/0;
	} catch(ArithmeticException e){
		System.out.println("ArithmeticException: " + e.getMessage());
	}
	finally {
		System.out.println("Finally Block Executed");
	}
}
}

public class ExceptionHandling1 {

	public static void main(String[] args) {
		
		DivideByZero D = new DivideByZero();
		D.divByZero();
		
	}

}
