package ExceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		try {
			int divByZero = 5/0;
		}
		catch(ArithmeticException AE) {
			System.out.println("ArithmeticException => " + AE.getMessage());
		}

	}

}
