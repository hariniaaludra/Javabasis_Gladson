package mapinterface;//package should be in com.mapinterface

import java.util.HashMap;
import java.util.Map;

public class Hashmapdemo {

	public static void main(String[] args) {
	
		HashMap<Integer,String> map=new HashMap<Integer,String>();// it does not maintain any order  
			   map.put(1,"Mango");   
			   map.put(2,"Apple");    
			   map.put(3,"Banana");   //it does not allow the duplicate values
			   map.put(4,"Banana");   
			   map.remove(3);
			    System.out.println(map);   
			   System.out.println("Hashmap values....");  
			   for(Map.Entry m : map.entrySet()){    
			    System.out.println(m.getKey()+" "+m.getValue());    
			   }  
			}  
	
		 

	}


