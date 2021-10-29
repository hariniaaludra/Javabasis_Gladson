package comhello;

enum Level {
	  LOW,
	  MEDIUM,
	  HIGH
	}

	public class Enumprogram { 
	  public static void main(String[] args) { 
	   Level myVar = Level.MEDIUM; 
	   System.out.println(myVar);
	    for(Level a:Level.values())
	    {
	    	 System.out.println(a);
	    }
	    	 System.out.println("the value of low:"+Level.valueOf("LOW"));
	    	 System.out.println("the index of low:"+Level.valueOf("LOW").ordinal());
	    	 
	    }
	   // System.out.println(Level.values());
	  } 
	
