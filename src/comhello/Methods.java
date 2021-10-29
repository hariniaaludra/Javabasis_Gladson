package comhello;

public class Methods {
static void myMethods()
{
	System.out.println("this is a static method no need to declare object");
}
public void myMethods1()
{
	System.out.println("this is a public method  need to declare object");
}
public void mymethod2(String name,int age)
{
<<<<<<< HEAD
	System.out.println("the name is:"+name+" "+"the age is "+age);
	
}
public void mymethod2(double a, String name1)
{
	System.out.println("the height is:"+a+ "name is: "+name1);
=======
	System.out.println("the name is:"+name+"the age is "+age);
>>>>>>> 242262565e3936c942f8fd44eabbf23f4bd07a6e
}
	public static void main(String[] args) {
	Methods myobj=new Methods();
	myMethods();
	myobj.myMethods1();
	myobj.mymethod2("glad", 20);
<<<<<<< HEAD
	myobj.mymethod2(5.5, "suresh");
=======
>>>>>>> 242262565e3936c942f8fd44eabbf23f4bd07a6e

	}

}
