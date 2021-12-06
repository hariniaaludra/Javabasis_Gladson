package udemy.innerclasspart2;

import udemy.enumpart1.PizzaSize;

public class PizzaBuilderApp {

	public static void main(String[] args) {
		Pizza pizza = new Pizza.Builder("PizzaCake", PizzaSize.LARGE)
				.withExtraTomatoSause(true)
		        .withSalad(true)
				.build();
		System.out.println("Name :"+ pizza.getNmae());
		System.out.println("PizzaSize :"+ pizza.getPizzaSize());
		System.out.println("ExtraTomato sauce :"+ pizza.getIsExtraTomatoSause());
		System.out.println("Salad :"+ pizza.getIsSalad());
		



	}

}
