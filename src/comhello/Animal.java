package comhello;// com.hello

public class Animal {
	
	public void animalSound() { 
		System.out.println("The animal makes a sound");
	}
}

class Pig extends Animal {
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
}

class Dog extends Animal {
	public void animalSound() {
		System.out.println("The dog says: bow wow");
	}
}

class Main {
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Pig myPig = new Pig();
		Dog myDog = new Dog();

		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
	}
}

/*
 * public void family() { System.out.println("generation"); } class Father
 * extends Polymorphism {
 * 
 * public void family() { System.out.println("father"); } } class Son extends
 * Polymorphism { public void family() { System.out.println("son"); } } public
 * class Main { public void main(String[] args) { Polymorphism myobj=new
 * Polymorphism(); Polymorphism myobj1=new Father(); Polymorphism myobj2=new
 * Son(); myobj.family(); myobj1.family(); myobj2.family(); } } }
 */
