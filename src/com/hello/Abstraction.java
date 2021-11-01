package com.hello; //package name should be "com.hello"

abstract class Abstraction {
	public Abstraction() {
		System.out.println("Constructor");
	}

	abstract void run();

	public void machine() {
		System.out.println("This is machine");
	}

}

class Abstract1 extends Abstraction // Class name "Honda" -->"Abstract1"
{
	public void run() {
		System.out.println("Running sucessfull");
	}

	public class Test {

	}

	public static void main(String[] args) {
		Abstract1 obj = new Abstract1();
		obj.run();
		obj.machine();

	}
}
