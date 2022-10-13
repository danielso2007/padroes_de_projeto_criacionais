package br.com.criacionais.builder.meal.functional;

import static java.lang.System.*;
import br.com.criacionais.builder.meal.functional.model.FastFoodMeal;

public class Client {

	public static void main(String[] args) {
		FastFoodMeal burguerCombo = new FastFoodMeal.Builder("Fries")
				.andMain("CheeseBurger")
				.forDrink("Code")
				.build();
		out.println(burguerCombo);
		
		FastFoodMeal justFries = new FastFoodMeal.Builder("Fries").build();
		out.println(justFries);
		
		FastFoodMeal heartAtackCombo = new FastFoodMeal.Builder("Large Fries")
				.andMain("Monster Burguer")
				.forDrink("Milk Shake")
				.andDessert("Fudge Cake")
				.andGift("2 Kilograms")
				.build();
		out.println(heartAtackCombo);
	}
}
