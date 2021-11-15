package hackerrank;

import java.util.HashSet;
import java.util.Scanner;

public class Hashsethackerrank {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int i=sc.nextInt();
	   String[] left=new String[i];
	   String[] right=new String[i];
	    
	   for(int j = 0;j<i;j++) {
		  left[j]=sc.next();
		  right[j]=sc.next();
	   }
	   HashSet hs=new HashSet();
	   for(int z = 0; z < i; z++)
	    {
	        hs.add(left[z] + " " +right[z]  );
	        System.out.println(hs.size());        
	    }

	}

}
