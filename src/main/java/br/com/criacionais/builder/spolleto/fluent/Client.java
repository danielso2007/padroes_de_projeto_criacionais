package br.com.criacionais.builder.spolleto.fluent;

import static java.lang.System.*;
import br.com.criacionais.builder.spolleto.fluent.model.Pasta;
import br.com.criacionais.builder.spolleto.fluent.model.Size;
import br.com.criacionais.builder.spolleto.fluent.model.builder.PastaBuilder;

public class Client {

    public static void main(String[] args) {
        Pasta p1 = new PastaBuilder(Size.LARGE).now();
        out.println(p1);

        Pasta p2 = new PastaBuilder(Size.SMALL)
            .withToppings("Bacon", "Broccoli")
            .withSauces("Tomato")
            .withCheese()
            .now();
        out.println(p2);

        Pasta p3 = new PastaBuilder(Size.STANDARD)
            .withToppings("Garlic")
            .withSauces("Funghi", "Cheese")
            .withCheese()
            .withPepper()
            .now();
        out.println(p3);
    }
}
