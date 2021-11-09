package comhello;
import java.util.StringTokenizer;
public class Stringtokenizer1 {

	public static void main(String[] args) {
		StringTokenizer str=new StringTokenizer("This is StringTokenizer1");
		//System.out.println(str.nextElement());
		//System.out.println(str.nextElement());
		//System.out.println(str.nextElement());
		System.out.println(str.hasMoreElements());
		System.out.println(str.hasMoreTokens());
		System.out.println(str.nextToken());
		
		StringTokenizer str1=new StringTokenizer("This is. second. StringTokenizer"," ");
		System.out.println(str1.nextToken(" "));
		System.out.println(str1.nextElement());
		

	}

}
