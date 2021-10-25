package comhello;

public class Constructor {
int x;
public Constructor(int y)
/*
 *(int y) parameter to the constructor
 * inside the constructor, we set x to y (x=y)
 */
{
	x=y;
	/*
	 * x=y;  you can use this keyword
	 * using this keyword, this.x=y;
	 * the constructor must use this keyword
	 */
	
}
	public static void main(String[] args) {
		Constructor myobj=new Constructor(5);
		/*pass parameter to constructor(5),set the value of xto5
		 * create an object of class constructor
		 * (this will call the constructor)
		 */
		System.out.println(myobj.x);
		

	}

}
