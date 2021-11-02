package com.hello;//com.hello

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
		System.out.println("This is integer arraylist");//
		ArrayList <Integer> obj=new ArrayList<Integer>();
		obj.add(55);
		obj.add(266);
		obj.add(34);
		
		obj.remove(0);
		Collections.sort(obj);
		System.out.println(obj);
		System.out.println(obj.size());
		
		
		

	}

}
