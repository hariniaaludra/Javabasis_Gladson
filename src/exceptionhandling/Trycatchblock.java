package exceptionhandling;

public class Trycatchblock {

	public static void main(String[] args) {
	int n1=30;
	int n2=0;
	try {
		int n3=n1/n2;
		
		System.out.println(n3);
		
	}catch(ArithmeticException e) {
		System.out.println(e);
	}
	System.out.println("next block of code");
	try {
		int a[]= {1,2,3,4};
		System.out.println(a[10]);
		
	}catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("next block of code");

	}

}
