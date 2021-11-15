package hackerrank;

import java.util.LinkedList;
import java.util.Scanner;

public class Listprogram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		sc.nextLine();
		LinkedList ll=new LinkedList();
		for(int i=0;i<x;i++) {
			int y=sc.nextInt();
			ll.add(y);
		}
		int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            String action = sc.next();
            if (action.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                ll.add(index, value);
            } else { // "Delete"
                int index = sc.nextInt();
                ll.remove(index);
            }
        }
        
        
        /* Print our updated Linked List */
       // for( num:ll) {
        	System.out.println(ll);
        }

	}


