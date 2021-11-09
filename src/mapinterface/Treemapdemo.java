package mapinterface;

import java.util.Map;
import java.util.TreeMap;

public class Treemapdemo {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>(); // it maintain ascending order
		tm.put(2, "Chennai");
		tm.put(1, "Delhi");
		tm.put(4, "Bangalore");
		tm.put(3, "Bangalore"); //it does not allow the duplicate key
		System.out.println(tm);
		for(Map.Entry m:tm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
