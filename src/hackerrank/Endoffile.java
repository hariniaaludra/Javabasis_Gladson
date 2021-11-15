package hackerrank;//package should be in com.hackerrank

import java.util.Scanner;

public class Endoffile {

	public static void main(String[] args) {
		
	        Scanner scanner = new Scanner(System.in);
	        int a=0;
	        while(scanner.hasNext())
	        {
	        	System.out.println(++a+" "+scanner.nextLine());
	        }

	       

	}
}


