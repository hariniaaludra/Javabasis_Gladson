package udemy.enumpart1;

public class PizzaApp {
	public static void main(String[] args) {
		
	System.out.println("Available Pizza sizes:");
	for(PizzaSize pizzaSizes: PizzaSize.values()){
	System.out.println("-" +pizzaSizes.getPizzaSize());
	}
	System.out.println();
	
	Pizza pizzaOrder = new Pizza("Dominoze",PizzaSize.MEDIUM);
	System.out.println("The Ordered Pizza:");
	System.out.println("Name       :"+"  "+pizzaOrder.getName());
	System.out.println("pizzaSize  :"+"  "+pizzaOrder.getPizzaSize());
	System.out.println("Price      :"+"  "+pizzaOrder.getPrice());
	
	}

}
