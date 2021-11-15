package collections;//package should be in com.collections

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashsetdemo {

	public static void main(String[] args) { 
			LinkedHashSet set=new LinkedHashSet();  //add type arguments to the LinkedHashSet<String>
			set.add("Ravi");  
			set.add("Vijay");  
			set.add("Ravi");  
			set.add("Ajay");  
			Iterator itr=set.iterator();  
			while(itr.hasNext()){  
			System.out.println(itr.next());  
			}  
			}  
			}  

	


