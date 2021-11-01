package comhello;//com.hello

//import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		//Scanner Operators1 = new Scanner(System.in);
		int x=1,y=5;
		System.out.println("arithemetic Operators");
		System.out.println(x+y); //addition
		System.out.println(x-y); //subtraction
		System.out.println(x*y); //multiplication
		System.out.println(x/y); //division
		System.out.println(x%y); //modulo
		
		System.out.println("assignment Operators");
		System.out.println(x); 
		System.out.println(x+=y); 
		System.out.println(x-=y); 
		System.out.println(x*=y); 
		System.out.println(x%=y); 
		
		System.out.println("comparision Operators");
		System.out.println(x==y);
		System.out.println(x<y); 
		System.out.println(x>y); 
		System.out.println(x<=y);
		System.out.println(x>=y); 
		
		System.out.println("logical Operators");
		System.out.println(x<5&&y<5); 
		System.out.println(!(x>y));
		
		

	}

}
