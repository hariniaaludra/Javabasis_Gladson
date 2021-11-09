package comhello;

abstract class Abstraction {
public	Abstraction()
	{
		System.out.println("constructor");
	}
	abstract void run();
	void machine()
	{
		System.out.println("this is machine");
	}

}
class  Honda extends Abstraction
{
	void run()
	{
		System.out.println("running sucessfull");
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
