package hackerrank;//package should be in com.hackerrank

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	private static boolean isanagram(String a, String b) {
	String c=a;
	String d=b;
	boolean status=true;
	if(a.length()!=b.length())
	{
		status=false;
	}
	else 
	{
		char[] ArrayC=c.toLowerCase().toCharArray();
		char[] ArrayD=d.toLowerCase().toCharArray();
		Arrays.sort(ArrayC);
		Arrays.sort(ArrayD);
		status=Arrays.equals(ArrayC, ArrayD);
	}
	return status;
	
	
	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		sc.close();
		boolean ret=isanagram(a,b);
		System.out.println((ret)? "anagram":"not anagram");

	}

	


}

