package comhello;

public class Inheritence {
	protected String name="Gladson";
	/*
	 * protected String name1="Hello";
	 */
	public void method()
	/*
	 *using void display()
	 */
	{
		 System.out.println("Raju");
	}
	static class Subclass extends Inheritence
	{
	private String lname="raj";
	public static void main(String[] args)
	{
	Subclass myobj=new Subclass();
	myobj.method();
	/*
	 * myobj.display()
	 */
	System.out.println(myobj.lname+" "+myobj.name);
	/*
	 * System.out.println(myobj.iname+" "+myobj.name+" "+myobj.name1);
	 */
	}
	}
		
	}
 


		  


