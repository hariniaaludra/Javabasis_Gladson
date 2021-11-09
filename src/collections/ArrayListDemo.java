package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(80);
		al.add("glad");
		al.add('g');
		al.add(true);
		System.out.println(al);
		al.add(2, "raj");  //this is for adding the element where the user think

		System.out.println(al); 
		System.out.println(al.contains("glad")); //this is for check the value in the arraylist
		System.out.println(al.contains("son"));
		System.out.println(al.get(0)); // this is for print the value in the represent position
		System.out.println(al.get(4));  
		System.out.println(al.remove(4));  //this is for remove the value before that its shows the value and remove
		System.out.println(al); 
		System.out.println(al.set(2, "son")); // this is used for replace the value from the given value
		System.out.println(al); 
		System.out.println(al.indexOf("glad")); //this is used for check the position for the given values
       
		
		ArrayList al2=new ArrayList();
        al2.addAll(al);
    	System.out.println("al2 list is:"+al2); 
    	
    	ArrayList al3=new ArrayList();
    	al3.add("chennai");
    	al3.add("new delhi");
    	al3.add("mumbai");
    	al3.add("kolkata");
    	System.out.println("al3 list is:"+al3); 
    	al3.addAll(2, al); //the al2 is copy to al3 which is convenient to the user
    	System.out.println("al3 after alteration:"+al3); 
    	al3.removeAll(al);
    	System.out.println("al3 in removeall is:"+al3); 
    	List al4=al3.subList(0, 3); // sublist is used to list the required list of the user
    	System.out.println("al4 list is:"+al4); 
    	
    	
    	
	}

}
