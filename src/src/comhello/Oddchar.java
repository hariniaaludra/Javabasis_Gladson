package comhello;

public class Oddchar {
	public static void main(String[] args) {
		String s1 = "Team work makes the dream work";
		System.out.println(s1.length());

		for(int i = 0; i<s1.length(); i++) {
			if(i%2==1) {
				System.out.println(s1.charAt(i));
				
			}
			
		}
		//System.out.println();

}
}


