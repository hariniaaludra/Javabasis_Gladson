package comhello;//package should be in com.hello

public class Index {
	String s1;
	char s2;
	public  Index() {
		s1 = "hello";
	 s2=s1.charAt(2);
	//System.out.println(s2);
	}
	public static void main(String[] args) {
		
		Index a = new Index();
		System.out.println(a.s1);
		System.out.println(a.s2);
		
	}

}



