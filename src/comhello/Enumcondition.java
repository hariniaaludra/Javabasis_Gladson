package comhello;

public class Enumcondition {
	enum SampleEnum {
		INR("#", "India"), DOL("$", "usa"), EUR("@", "europe");

		String name, string2;

		SampleEnum(String name, String string2) {
			this.name = name;
			this.string2 = string2;
		}

		public static boolean findenum(String name) {
			for (SampleEnum value : SampleEnum.values()) {
				if (value.name.equals(name)) {

					return true;
				}

			}

			return false;
		}

		public static String findenum1(String name) {
			for (SampleEnum value1 : SampleEnum.values()) {
				if (value1.name.equals(name)) {
					return value1.string2;
				}

			}
			return null;
		}
	}

}
