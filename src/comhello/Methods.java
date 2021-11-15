package comhello;//package should be in com.hello

public class Methods {
	
	static void myMethods() {
		System.out.println("this is a static method no need to declare object");
	}

	public void myMethods1() {
		System.out.println("this is a public method  need to declare object");
	}

	public void mymethod2(String name, int age) {

		System.out.println("the name is:" + name + " " + "the age is " + age);

	}

	public void mymethod2(double a, String name1) {
		System.out.println("the height is:" + a + "name is: " + name1);

	}
	public static  String addition(int a,int b)
	{
		 return "result= "+ (a+b);
	
		
	}

	public static void main(String[] args) {
		Methods myobj = new Methods();
		myMethods();
 		myobj.myMethods1();
		myobj.mymethod2("glad", 20);
		//myobj.addition(5, 6);
		
		
		String g=myobj.addition(5, 4);//declaring static using Methods
		
		System.out.println(g);
		myobj.mymethod2(5.5, "suresh");

	}

}
