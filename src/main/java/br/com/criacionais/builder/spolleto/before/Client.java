package br.com.criacionais.builder.spolleto.before;

import static java.lang.System.*;
import java.util.Arrays;
import br.com.criacionais.builder.spolleto.before.model.Pasta;
import br.com.criacionais.builder.spolleto.before.model.Size;

public class Client {

    public static void main(String[] args) {
        Pasta p1 = new Pasta(Size.LARGE);
        out.println(p1);

        Pasta p2 = new Pasta(Arrays.asList("Bacon", "Broccoli"), Arrays.asList("Tomato"), Size.SMALL, true);
        out.println(p2);

        Pasta p3 = new Pasta(Arrays.asList("Garlic"), Arrays.asList("Funghi", "Cheese"), Size.STANDARD, false, true);
        out.println(p3);

    }
}
