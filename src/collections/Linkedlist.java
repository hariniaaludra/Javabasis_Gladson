package collections;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(33);
		ll.add(44);
		ll.add("glad");
		ll.add('g');
		System.out.println(ll);
		ll.addLast("raj"); // this is used to add the element in the last
		System.out.println(ll); 
		System.out.println( ll.pollLast()); // this is used to remove the first element 
		System.out.println(ll); 
		System.out.println(ll.pollFirst()); // this is used to remove the last element
		System.out.println(ll);
		System.out.println(ll.offerFirst(30)); // this is also add the element in the first
		System.out.println(ll); 
		System.out.println(ll.offerLast(30));  // this is also add the element in the last
		System.out.println(ll); 
		
		
		

	}

}
