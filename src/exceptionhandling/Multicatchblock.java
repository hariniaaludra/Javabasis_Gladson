package exceptionhandling;

public class Multicatchblock {

	public static void main(String[] args) {
	try {
		//int a[]=new int[5];
		//a[10]=30/0;
		String d=null;
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
