package exceptionhandling;//package should be in com.exceptionhandling

public class Throwkeyword {

	
	public void checkage(int age) {
		if(age<18) {
			throw new ArithmeticException("Access is denied ,the age is below 18");
		}
		else {
			System.out.println("Access is permitted");
		}
	}
		public static void main(String[] args) {
			Throwkeyword obj=new Throwkeyword();
			obj.checkage(10);
		
	}

	}


