package comhello;//com.hello

public interface Interfaceprogram {// InterfaceProgram
	public void glad();
}
class Raj implements Interfaceprogram//InterfaceProgram
{

	public void glad() {
	System.out.println("this is interface program");	
		
	}
	
}
class Mymain
{
	public static void main(String[] args)
	{
		Raj obj=new Raj();
		obj.glad();
				
	}
}
