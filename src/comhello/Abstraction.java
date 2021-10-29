package comhello;

abstract class Abstraction {
<<<<<<< HEAD
	Abstraction()
	{
		System.out.println("constructor");
	}
	abstract void run();
	void machine()
	{
		System.out.println("this is machine");
	}
=======
	abstract void run();
>>>>>>> 242262565e3936c942f8fd44eabbf23f4bd07a6e

}
class  Honda extends Abstraction
{
	void run()
	{
		System.out.println("running sucessfull");
	}
<<<<<<< HEAD
=======
public class Test
{
	
}
>>>>>>> 242262565e3936c942f8fd44eabbf23f4bd07a6e
  public static void main(String[] args)
{
	Honda obj=new Honda();
	obj.run();
<<<<<<< HEAD
	obj.machine();
=======
>>>>>>> 242262565e3936c942f8fd44eabbf23f4bd07a6e
}
}
