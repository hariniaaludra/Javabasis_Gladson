package udemy;
import java.util.*;
public class StringFunction {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String inputText = keyboard.nextLine();
		
		
		if(inputText.equals("paris")) {
			System.out.println("This is the typed text for equals case:"+inputText);
			}
		else {
			System.out.println("This is not a typed text ");
		}
		
		if(inputText.equalsIgnoreCase("paris")) {
			System.out.println("This is the typed text for equalingore case:"+inputText);
		}else {
			System.out.println("This is not a typed text");
		}
		
		if(inputText.contains("is")) {
			System.out.println("The text is contained");
		}
		
		  if (inputText.isEmpty()) {
	            System.out.println("The input text is empty.");
	        }

	        System.out.println("The input text's length is: " + inputText.length());
	        System.out.println("The input text with uppercase: " + inputText.toUpperCase());
	        System.out.println("The input text with lowercase: " + inputText.toLowerCase());

	        if (inputText.startsWith("P") || inputText.endsWith("P")) {
	            System.out.println("The input text starts or ends with a P letter.");
	        }

	        System.out.println("The replaced text: " + inputText.replace("N", "D"));
	    }
		
		
		
	}


