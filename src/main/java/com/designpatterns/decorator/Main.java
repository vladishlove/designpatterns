package com.designpatterns.decorator;

public class Main {
	public static void main(String[] args) {
		Component order = new Capuchino();
		order = new Milk(order);
		order = new Cinnamon(order);

		System.out.println(order.getDescription());
		System.out.println(order.getCost());
	}
}
