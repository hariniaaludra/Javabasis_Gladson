package com.hello;//com.hello
enum Choice //enum name should be start  "Choice"
{
	APPLE,SAMSUNG,OPPO;
	 int price;
	 Choice()
	{
	price=100;
	System.out.println("This is constructor");
}
public int getPrice()
{
	return price;
}
}
public class Enum1
{
	public static void main(String[] args)
	{
		System.out.println(Choice.APPLE.getPrice());		
	}
	
}
