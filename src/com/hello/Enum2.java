package com.hello;// com.hello

public class Enum2 {
	enum Country
	{
		INR("&","India"),
		USA("$","USA"),
		EURO("@","Europe");
		private String val,val2;
		
		private Country(String val,String val2)
		{
			this.val=val;
			this.val2=val2;
		}
	}// run configuration
		public static void main(String[] args)
		{
			String value3="!";//value3
			int count=0;
			for(Country c:Country.values())
			{
				if(value3==c.val)
				{
					count++;
				}
			}
			if(count>0)
			{
					System.out.println("true");
			}
			else
			{	
				System.out.println("invalid");
			}
		}		
	
}