package exceptionhandling;//package should be in com.exceptionhandling

public class Multicatchblock {

	private static String d;

	public static void main(String[] args) {
	try {
	
		System.out.println(d.length());
	}catch(ArithmeticException e) {
		System.out.println("ArithemticException");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBoundsException");
	}catch(Exception e) {
		System.out.println(e);
	}
	finally {
		System.out.println("this is multicatch exception");
	}
	

	}
	

}
