package com.blanksky.designpattern.builder;

public class BuilderDemo {

	public static void main(String[] args) {
		
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total cost: "+vegMeal.getCost());
		
		Meal chickenMeal = mealBuilder.prepareChickenMeal();
		System.out.println("Chicken Meal");
		chickenMeal.showItems();
		System.out.println("Total cost: "+chickenMeal.getCost());

	}

}
