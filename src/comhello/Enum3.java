package comhello;//package should be in com.hello

public class Enum3 {
	enum SampleEnum1 {   
		INR("#","India"),
		DOL("$","usa"),
		EUR("@","europe");      
		
		//private static final SampleEnum1[] copyOfValues = values();
		private static String name;
		private String string2;   
		
		SampleEnum1(String name, String string2) {
			//this.name=name;
			this.string2=string2;
		}
		
public static void main(String[] args)
{
	String b="@";

		 //static SampleEnum1 forName(String name) {       
			for ( SampleEnum1 value : SampleEnum1.values()) {           
				if (b.equals(name)) { 
					System.out.println("this is exist in the enum");
					return;
					          
					} 
				
				}      
			return;
			}
		
		}

	//public static void main(String [] args)     
	//throws Exception {      
	//System.out.println(SampleEnum.forName("@"));     
	//System.out.println(SampleEnum.forName(""));     
	//System.out.println(SampleEnum.forName(""));  
	
	

}




