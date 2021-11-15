package comhello;//package should be in com.hello
import java.util.StringTokenizer;
public class Stringtokenizer {

	public static void main(String[] args) {
		StringTokenizer str= new StringTokenizer("this_ is stringtokenizer","_");
		System.out.println(str.countTokens());
		while(str.hasMoreTokens())
		{
			System.out.println(str.nextToken());
		}

	}

}
