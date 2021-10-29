package comhello;

<<<<<<< HEAD
import comhello.Enumcondition.SampleEnum;

public class Enumexist {
	

	public static void main(String args[])
	{
	//	Enumcondition obj=new Enumcondition();
		
		
		System.out.println(SampleEnum.findenum("@"));
		
		System.out.println(SampleEnum.findenum1("@"));
	}
}

		
=======
enum SampleEnum {   
	INR("#","India"),
	DOL("$","usa"),
	EUR("@","europe");      
	
	private static final SampleEnum[] copyOfValues = values();   
	
	SampleEnum(String string, String string2) {
	}

	public static SampleEnum forName(String name, String name1) {       
		for (SampleEnum value : copyOfValues) {           
			if (value.name().equals(name)) { 
				System.out.println("this is exist in the enum");
				return value;
				          
				} 
			
			}      
		return null;
		}
	
	}

public class Enumexist
{   
	public static void main(String [] args)     
	throws Exception {      
	System.out.println(SampleEnum.forName("",""));     
	System.out.println(SampleEnum.forName("A003",""));     
	System.out.println(SampleEnum.forName("A000",""));  
	}
	

}
>>>>>>> 242262565e3936c942f8fd44eabbf23f4bd07a6e

