package com.hello;//com.hello

public class OddChar {//OddChar
	public static void main(String[] args) {
		String s1 = "Team work makes the dream work"; //StringName
		System.out.println(s1.length());

		for(int i = 0; i<s1.length(); i++) {
			if(i%2==1) {
				System.out.print(s1.charAt(i));//System.out.print
				
			}
			
		}
		//System.out.println();

}
}

