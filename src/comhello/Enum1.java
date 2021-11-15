package comhello;//package should be in com.hello
enum choices
{
	APPLE,SAMSUNG,OPPO;
int price;
choices()
{
	price=100;
	System.out.println("this is constructor");
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
		System.out.println(choices.APPLE.getPrice());		
	}
	
}
