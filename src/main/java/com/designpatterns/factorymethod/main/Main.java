package com.designpatterns.factorymethod.main;

import com.designpatterns.factory.PType;
import com.designpatterns.factory.product.Pizza;
import com.designpatterns.factorymethod.CAPizzaStore;
import com.designpatterns.factorymethod.NYPizzaStore;
import com.designpatterns.factorymethod.PizzaStore;

public class Main {
	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		PizzaStore caPizzaStore = new CAPizzaStore();

		Pizza pizza = nyPizzaStore.orderPizza(PType.CHEESE);
		Pizza pizza1 = caPizzaStore.orderPizza(PType.CHEESE);
		Pizza pizza2 = nyPizzaStore.orderPizza(PType.PEPERONI);
		Pizza pizza3 = caPizzaStore.orderPizza(PType.PEPERONI);

		System.out.println(pizza.getName());
		System.out.println(pizza1.getName());
		System.out.println(pizza2.getName());
		System.out.println(pizza3.getName());
	}
}
