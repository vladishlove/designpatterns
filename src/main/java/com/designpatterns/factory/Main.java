package com.designpatterns.factory;

import com.designpatterns.factory.product.Pizza;

public class Main {
	public static void main(String[] args) {
		PizzaFactory pizzaFactory = new PizzaFactory();
		Pizza pizza = pizzaFactory.createPizza(PType.CHEESE);
		Pizza pizza2 = pizzaFactory.createPizza(PType.PEPERONI);
		Pizza pizza3 = pizzaFactory.createPizza(PType.SALAMI);

		System.out.println(pizza.getName());
		System.out.println(pizza2.getName());
		System.out.println(pizza3.getName());
	}
}
