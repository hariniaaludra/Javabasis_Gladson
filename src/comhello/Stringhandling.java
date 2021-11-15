package comhello;

public class Stringhandling {

	public static void main(java.lang.String[] args) {
		String username="     gladson",username1="glad";
		System.out.println(username+" "+username1); // concatenation using '+' or concat() method
		String name=new String("glad"); //using new keyword
		System.out.println(name);
		System.out.println(name.compareTo(username1)); //compareTo method
		System.out.println(username.equals(username1));// using equals methods or '==' symbol
		System.out.println(name.charAt(2)); //position of the character charAt
		System.out.println(name.codePointAt(1)); //it return the unicode codePointAt
		System.out.println(name.contains("ba")); //to check the string sequence of character
		System.out.println(name.endsWith("d"));  //to check the string ends with the specific word
		System.out.println(name.equals(username)); //to check the string is equal
		System.out.println(name.toLowerCase()); // change to lower case
		System.out.println(name.toUpperCase()); //change to upper case
		System.out.println(username.trim()); //delete the blankspaces
		System.out.println(username.replaceAll("",""));
		String[] names= {"naresh","suresh","rajesh"};
		String sentence="";
		for (String s:names)
		{
			 sentence=sentence+s;
			//System.out.println(s);
		}
		System.out.println(sentence);
		

	}

	
	}


