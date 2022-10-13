package br.com.criacionais.builder.meal.fluent;

import static java.lang.System.*;
import br.com.criacionais.builder.meal.fluent.model.FastFoodMeal;
import br.com.criacionais.builder.meal.fluent.model.builder.FastFoodMealBuilder;

public class Client {

	public static void main(String[] args) {
		FastFoodMeal burguerCombo = new FastFoodMealBuilder("Fries")
				.andMain("CheeseBurger")
				.forDrink("Code")
				.thatsAll();
		out.println(burguerCombo);
		
		FastFoodMeal justFries = new FastFoodMealBuilder("Fries").thatsAll();
		out.println(justFries);
		
		FastFoodMeal heartAtackCombo = new FastFoodMealBuilder("Large Fries")
				.andMain("Monster Burguer")
				.forDrink("Milk Shake")
				.andDessert("Fudge Cake")
				.andGift("2 Kilograms")
				.thatsAll();
		out.println(heartAtackCombo);
	}
}
