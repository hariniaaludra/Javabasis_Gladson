package comhello;//package should be in com.hello

 interface Multipleinterface {
public void method1();
}
 interface Secondinterface
 {
	 public void method2(); }
class Glad implements Multipleinterface, Secondinterface
{
	public void method1()
	{
		System.out.println("welcome");
	}
	public void method2()
	{
		System.out.println("this is multipleinterface");
	}
}

class Myclass
{

	public static void main(String[] args)
	{
Glad obj=new Glad();

Glad obj1=new Glad();
obj.method1();
obj1.method2();


			
	}
}