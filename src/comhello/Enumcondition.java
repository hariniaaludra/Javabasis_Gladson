package comhello;//com.hello

public class Enumcondition {

	enum SampleEnum {
		INR("#", "India"), DOL("$", "usa"), EUR("@", "europe");

		String symbol, country;

		SampleEnum(String country, String symbol) {
			this.symbol = symbol;
			this.country = country;
		}

		/*
		 * public static String findenum1(String name1){ for(SampleEnum
		 * value:SampleEnum.values()) if(value.name.equals(name1)) { return
		 * value.string2; }
		 * 
		 * return null; }
		 */

		public static SampleEnum findenum(String name) {
			for (SampleEnum value1 : SampleEnum.values()) {
				if (value1.country.equals(name)) {

					return value1;
				}
				//if (value1.country.equals(name)) {
					//return value1;
				//}

			// return null;
			}
			return null;

		}

	}
}
