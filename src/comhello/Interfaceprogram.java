package comhello;//package should be in com.hello

public interface Interfaceprogram {
	public void glad();
}
class Raj implements Interfaceprogram
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
