package comhello; //package name should be "com.hello"

abstract class Abstraction {
public	Abstraction()
	{
		System.out.println("Constructor");
	}
	abstract void run();
	void machine()
	{
		System.out.println("This is machine");
	}

}
class  Honda extends Abstraction //Class name "Honda" -->"Abstract1"
{
	void run()
	{
		System.out.println("Running sucessfull");
	}

public class Test
{
	
}

  public static void main(String[] args)
{
	Honda obj=new Honda();
	obj.run();
	obj.machine();

}
}
