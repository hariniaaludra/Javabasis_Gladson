package comhello;//package should be in com.Hello

public class WrapperClass {

	public static void main(String[] args) {
		byte a=23;
		short b=2436;
		int c=23_56_77;
		long d=123_45_678;//mention L
		float e=12.43F;
		double f=13.435D;
		char g='g';
		boolean h=true;
		
		System.out.println("Autoboxing:Changing primitive to object");
		
		Byte byteobj=a;
		Short shortobj=b;
		Integer intobj=c;
		Long longobj=d;
		Float floatobj=e;
		Double doubleobj=f;
		Character charobj=g;
		Boolean booleanobj=h;
		
		System.out.println(byteobj);
		System.out.println(shortobj);
		System.out.println(intobj);
		System.out.println(longobj);
		System.out.println(floatobj);
		System.out.println(doubleobj);
		System.out.println(charobj);
		System.out.println(booleanobj);
		
		System.out.println("Unboxing:Changing object to primitive");
		
		byte bytvalue=byteobj;
		short shortvalue=shortobj;
		int intvalue=intobj;
		long longvalue=longobj;
		float floatvalue=floatobj;
		double doublevalue=doubleobj;
		char charvalue=charobj;
		boolean booleanvalue=booleanobj;
		
		System.out.println(bytvalue);
		System.out.println(shortvalue);
		System.out.println(intvalue);
		System.out.println(longvalue);
		System.out.println(floatvalue);
		System.out.println(doublevalue);
		System.out.println(charvalue);
		System.out.println(booleanvalue);
		

	}

}
