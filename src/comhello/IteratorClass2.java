package comhello;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorClass2 {
	public static void main(String[] args) {
		ArrayList <Integer> num=new ArrayList<Integer>();
		num.add(9);
		num.add(431);
		num.add(6);
		num.add(8);
		System.out.println(num);
		Iterator<Integer> it=num.iterator();
		while(it.hasNext()) {
			Integer a=it.next();
			if(a<10) {
				it.remove();
				
			}   
		}
			System.out.println(num);
		
		


}
}