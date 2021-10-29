package comhello;

abstract class Abstraction {
	abstract void run();

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
}
}
