package comhello;//com.hello

public class Inheritence {
	  String name="Gladson";
	 public void method()
	 {
		 System.out.println("Raju");
	 }
    static class Subclass extends Inheritence
  {
  String lname="raj"; 
 public static void main(String[] args)
 {
	Subclass myobj=new Subclass();
	myobj.method();
	System.out.println(myobj.lname+" "+myobj.name);
 }
 }
 
}
		  


