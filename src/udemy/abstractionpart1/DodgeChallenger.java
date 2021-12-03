package udemy.abstractionpart1;

public class DodgeChallenger extends Car implements ElectricMode{
	 public DodgeChallenger(String color, byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity,
             int price, int mileage, boolean isDamaged){
super("Dodge Challenger", color, numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamaged);
}



public void startTheElectricEngine() {
System.out.println("Dodge Challenger starts its electric engine.");
}

@Override
public void startTheEngine() {
	System.out.println("A Dodge Challenger engine is started.");


	
}
}
