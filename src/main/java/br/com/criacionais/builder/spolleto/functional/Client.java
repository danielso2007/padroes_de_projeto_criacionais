package br.com.criacionais.builder.spolleto.functional;

import static java.lang.System.*;
import br.com.criacionais.builder.spolleto.functional.model.Pasta;
import br.com.criacionais.builder.spolleto.functional.model.Size;

public class Client {

    public static void main(String[] args) {
        Pasta p1 = Pasta.builder(Size.LARGE).now();
        out.println(p1);

        Pasta p2 = Pasta.builder(Size.SMALL)
            .withToppings("Bacon", "Broccoli")
            .withSauces("Tomato")
            .withCheese()
            .now();
        out.println(p2);

        Pasta p3 = new Pasta.Builder(Size.STANDARD)
            .withToppings("Garlic")
            .withSauces("Funghi", "Cheese")
            .withCheese()
            .withPepper()
            .now();
        out.println(p3);
    }
}
