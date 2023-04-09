package ExceptionHandling;

public class Finally {
public static void main(String[] arg) {
	try {
		int divByZero = 10/0;
	}
	finally {
		System.out.println("Finally Block Executed");
	}
}
}
