package mapinterface;

import java.util.HashMap;

public class Hashmapdemo1 {

	

			
			static boolean checkForKey(String str)
			{

				
				HashMap<String, String> hashMap = new HashMap<>();

				
				hashMap.put("INDIA", "@_INR");
				hashMap.put("USA", "#_DOL");
				hashMap.put("EUROPE", "%_EUR");
				hashMap.put("CHINA", "&_CHI");

			
				boolean result= hashMap.containsKey(str);

				
				 return result;
			}


			public static void main(String[] args) {
		
			Hashmapdemo1 ob = new Hashmapdemo1();


				System.out.println(Hashmapdemo1.checkForKey("INDIA"));
			
			}
		


	}


