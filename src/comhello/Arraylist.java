package comhello;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList <String> cars=new ArrayList<String>();
		cars.add("BMW");
		cars.add("benz");
		cars.set(1, "audi");
		Collections.sort(cars);
		
		for(String a:cars)
		{
			System.out.println(a);
		}
		
		System.out.println(cars.get(0));
		System.out.println("this is integer arraylist");
		ArrayList  a=new ArrayList();
		a.add(55);
		a.add(266);
		a.add(34);
		a.add(7);
		a.add("glad");
		a.remove(0);
		//Collections.sort(a);
		System.out.println(a);
		System.out.println(a.size());
		
		
		

	}

}
