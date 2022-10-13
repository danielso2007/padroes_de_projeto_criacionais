package br.com.criacionais.builder.meal.before;

import static java.lang.System.*;
import br.com.criacionais.builder.meal.before.model.FastFoodMeal;

public class Client {

    public static void main(String[] args) {
        FastFoodMeal burguerCombo = new FastFoodMeal("Coke", "CheeseBurguer", "Fries");
        out.println(burguerCombo);

        FastFoodMeal justFries = new FastFoodMeal(null, null, "Fries");
        out.println(justFries);

        FastFoodMeal heartAtackCombo = new FastFoodMeal("Milk Shake", "Monster Burguer", "Large Fries", "Fudge Cake", "2 Kilograms");
        out.println(heartAtackCombo);
    }
}
