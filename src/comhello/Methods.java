package comhello;

public class Methods {
static void myMethods()
/*
 * static void myMethods(){
 * System.out.println("this is a static method"):
 * }
 * public static void main(String[]args){
 * myMethod();
 * myMethod();
 * myMethod();
 * }
*/
{
	System.out.println("this is a static method no need to declare object");
}
public void myMethods1()
{
	System.out.println("this is a public method  need to declare object");
}
	public static void main(String[] args) {
	Methods myobj=new Methods();
	myMethods();
    myobj.myMethods1();

	}

}
