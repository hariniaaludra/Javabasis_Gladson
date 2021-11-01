package comhello;//com.hello

enum Level {
	  LOW(),
	  MEDIUM,
	  HIGH
	  
	}

	public class Enumprogram { 
	  public static void main(String[] args) { 
	   Level myVar = Level.MEDIUM; 
	   System.out.println(myVar);
	   if(myVar==Level.HIGH)
	   {
		   System.out.println("it is high");
	   }
	   else if(myVar==Level.LOW)
	   {
		   System.out.println("it is low");
	   }
	   else if(myVar==Level.MEDIUM)
	   {
		   System.out.println("it is medium");
	   }
	   switch(myVar)
	   {
	   case LOW:
		   System.out.println("very low");
		   break;
	   case MEDIUM:
		   System.out.println("its ok");
		   break; 
	   }
	    for(Level a:Level.values())
	    {
	    	 System.out.println(a);
	    }
	    	 System.out.println("the value of low:"+Level.valueOf("LOW"));
	    	 System.out.println("the index of low:"+Level.valueOf("LOW").ordinal());
	    	 
	    }
	   
	  } 
	
