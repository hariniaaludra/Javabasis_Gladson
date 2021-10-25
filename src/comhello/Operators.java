package comhello;

public class Operators {

	public static void main(String[] args) {
		int x=1,y=5;
		System.out.println("arithemetic Operators");
		System.out.println(x+y); //addition
		System.out.println(x-y); //subtraction
		System.out.println(x*y); //multiplication
		System.out.println(x/y); //division
		System.out.println(x%y); //modulo
		
		System.out.println("assignment Operators");
		System.out.println(x); //1
		System.out.println(x+=y);
		/*
		 * (x=x+y=1+5=6)
		 */
		System.out.println(x-=y); 
		System.out.println(x*=y); 
		System.out.println(x%=y); 
		
		System.out.println("comparision Operators");
		System.out.println(x==y);
		System.out.println(x<y); 
		System.out.println(x>y); 
		System.out.println(x<=y);
		System.out.println(x>=y); 
		/*
		 *Using Increment operator (x++>=y);//Increment operator
		 * its increment the value by 1
		 *Using Decrement operator (x--<=y);//Decrement operator
		 * its decrement the value by 1
		 */
		
		System.out.println("logical Operators");
		System.out.println(x<5&&y<5); 
		System.out.println(!(x>y));
		
		/*
		 *Using || OR System.out.println(!(x>y)||(x<y));
		 *Using Bitwise operator & | !(AND,OR,NOT)
		 *System.out.println(x<5 & y<5)
		 *System.out.println(x<5 | y<5)
		 *System.out.println(!(x<5 & y<5)
		 *System.out.println(!(x<5 | y<5)
		 */
		
		

	}

}
