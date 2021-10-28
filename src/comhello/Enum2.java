package comhello;
import java.util.Scanner;
public class Enum2 {
	enum Country
	{
		INR("&","INDIA"),
		USA("$","USA"),
		EURO("@","EUROPE");
		private String val,val2;
		
		private Country(String val,String val2)
		{
			this.val=val;
			this.val2=val2;
		}
		public static void main(String[] args)
		{
			String val3="$";
			int count=0;
			for(Country c:Country.values())
			{
				if(val3==c.val)
				{
					count++;
				}
			}
			if(count>0)
			{
				boolean a=true;
				System.out.println(a);
			}
			else
			{
				System.out.println("false");
			}
		}
		
	}

}
