package udemy.innerclasspart2;

import udemy.enumpart1.PizzaSize;

public class Pizza {
	private String name;
	private PizzaSize pizzaSize;
	private boolean isExtraTomatoSause;
	private boolean issalad;
	
	public Pizza(Builder builder) {
		this.name = builder.name;
		this.pizzaSize = builder.pizzaSize;
		this.isExtraTomatoSause = builder.isExtraTomatoSause;
		this.issalad = builder.issalad;
		
		
	}
	public String getNmae() {
		return name;
	}
	public PizzaSize getPizzaSize() {
		return pizzaSize;
	}
	public boolean getIsExtraTomatoSause() {
		return isExtraTomatoSause;
	}
	public boolean getIsSalad() {
		return issalad;
	}

	public static class Builder{
		private String name;
		private PizzaSize pizzaSize;
		private boolean isExtraTomatoSause;
		private boolean issalad;
		
		Builder(String name,PizzaSize pizzaSize){
			this.name = name;
			this.pizzaSize = pizzaSize;
			
		}
		
		public Builder withExtraTomatoSause(boolean isExtraTomatoSause) {
			this.isExtraTomatoSause = isExtraTomatoSause;
			return this;
			
		}
		public Builder withSalad(boolean issalad) {
			this.issalad = issalad;
			return this;
			
		}
		public Pizza build() {
			return new Pizza(this);
		}
		
	}
}