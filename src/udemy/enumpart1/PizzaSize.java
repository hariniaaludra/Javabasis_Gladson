package udemy.enumpart1;

public enum PizzaSize {
	SMALL("Small size"),MEDIUM("Medium size"),LARGE("Large size");
	
	private String pizzaSize;
	
	PizzaSize(String pizzaSize){
		this.pizzaSize = pizzaSize;
	}

	public String getPizzaSize() {
		return pizzaSize;
	}

	
	

}
