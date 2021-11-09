package comhello;

public class WrapperClass1 {

	public static void main(String[] args) {
		Byte byteobj=123;
		Short shortobj=1234;
		Integer intobj=123_456;
		Long longobj=123_456_789L;
		Character charobj='g';
		Float floatobj=123.456F;
		Double doubleobj=1234.5678D;
		Boolean boleanobj=true;
		System.out.println("Wrapper class:To print the object using method");
		
		System.out.println(byteobj.byteValue());
		System.out.println(shortobj.shortValue());
		System.out.println(intobj.intValue());
		System.out.println(longobj.longValue());
		System.out.println(charobj.charValue());
		System.out.println(floatobj.floatValue());
		System.out.println(doubleobj.doubleValue());
		System.out.println(boleanobj.booleanValue());
		
		
		

	}

}
