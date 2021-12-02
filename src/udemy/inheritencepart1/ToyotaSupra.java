package udemy.inheritencepart1;

public class ToyotaSupra extends Car {
	 public ToyotaSupra(String color, byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity,
             int price, int mileage, boolean isDamaged){
super("ToyotaSupra", color, numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamaged);
}

@Override
public void startTheEngine() {
System.out.println("A ToyotaSupra engine is started.");
}

}
