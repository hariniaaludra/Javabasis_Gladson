package comhello;//package should be in com.hello

public class Constructor {
int x;
public Constructor(int y)
{
	x=y;
}
	public static void main(String[] args) {
		Constructor myobj=new Constructor(5);
		System.out.println(myobj.x);
		

	}

}
