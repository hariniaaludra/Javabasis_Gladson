package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetdemo {

	public static void main(String[] args) {
			//Creating HashSet and adding elements  
			HashSet set=new HashSet();  
			set.add("Ravi");  
			set.add("Vijay");  
			set.add("Ravi");  
			set.add("Ajay");  
			//Traversing elements  
			Iterator itr=set.iterator();  
			while(itr.hasNext()){  
			System.out.println(itr.next());  
			}  
			}  
			}  



