package mapinterface;

import java.util.HashMap;
import java.util.Map;

public class Hashmapdemo2 {

	static String checkkey(String str) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("INDIA", "@_INR");
		hm.put("USA", "$_DOL");
		hm.put("EUROPE", "%_EUR");
		hm.put("CHINA", "*_CHI");
		for (Map.Entry m : hm.entrySet()) {
			if (m.getKey().equals(str)) {
				String g = (String) m.getValue();
				System.out.println(g.charAt(0));
                
			}
		}
		return "";

	}

	public static void main(String[] args) {
		Hashmapdemo2 ob = new Hashmapdemo2();
		System.out.print(ob.checkkey("INDIA"));
		System.out.print(ob.checkkey("USA"));
		System.out.print(ob.checkkey("EUROPE"));
		System.out.print(ob.checkkey("CHINA"));
		
		
		
	}

}
