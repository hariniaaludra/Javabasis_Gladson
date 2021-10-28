package comhello;

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

