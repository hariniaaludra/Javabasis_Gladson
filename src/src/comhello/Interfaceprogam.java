package comhello;
 interface Interfaceprogam {
	 public void glad();
 }
 class Raj implements Multipleinterface
 {
	public void glad()
	{
		System.out.println("this is interface program");
	}
 }
class Mymain
{

	public static void main(String[] args) {
		Raj obj=new Raj();
		obj.glad();

	}

}
