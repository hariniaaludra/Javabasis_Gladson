package comhello;
import java.util.StringTokenizer;
public class Stringtokenizer {

	public static void main(String[] args) {
		StringTokenizer str= new StringTokenizer("this. is stringtokenizer",".");
		System.out.println(str.countTokens());
		while(str.hasMoreTokens())
		{
			System.out.println(str.nextToken("."));
		}

	}

}
