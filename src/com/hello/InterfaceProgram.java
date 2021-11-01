package com.hello;//com.hello

public interface InterfaceProgram {// InterfaceProgram
	public void glad();
}
class Raj implements InterfaceProgram//InterfaceProgram
{

	public void glad() {
	System.out.println("this is interface program");	
		
	}
	
}
class Mymain
{
	public static void main(String[] args)
	{
		Raj obj=new Raj();
		obj.glad();
				
	}
}
