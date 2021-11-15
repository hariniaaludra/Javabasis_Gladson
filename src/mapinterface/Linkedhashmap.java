package mapinterface;//package should be in com.mapinterface

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashmap {

	public static void main(String[] args) { // it maintain the insertion order
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();//replace with<>
		lhm.put(2, "Mango");
		lhm.put(1, "Orange");
		lhm.put(3, "Orange"); //it does not allow the duplicate key
		for(Map.Entry m:lhm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
