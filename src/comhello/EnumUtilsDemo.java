package comhello;

public class EnumUtilsDemo {
	public static void main(String[] args) {
		// Is PY("Python") a part of the enum?
		System.out.println(EnumUtils.isValidEnum(MathCodes.class, "PY"));

		// Is CA("Calculus") a part of the enum?
		System.out.println(EnumUtils.isValidEnum(MathCodes.class, "CA"));
	}
}

enum MathCodes {
	LA("Linear Algebra"), CA("Calculus"), PB("Probability");

	private String mathSubject;

	MathCodes(String mathSubject) {
		this.setMathSubject(mathSubject);
	}

	public String getMathSubject() {
		return mathSubject;
	}

	public void setMathSubject(String mathSubject) {
		this.mathSubject = mathSubject;
	}
}
