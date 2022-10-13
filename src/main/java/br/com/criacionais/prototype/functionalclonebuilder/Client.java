package br.com.criacionais.prototype.functionalclonebuilder;

import static java.lang.System.*;
import br.com.criacionais.prototype.functionalclonebuilder.model.Address;
import br.com.criacionais.prototype.functionalclonebuilder.model.User;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("ToClone", 25, new Address("ABC Street", 1000));
        out.println(user);

        User cloneUser = user.cloneBuilder().withName("Cloned++").now();
        out.println(cloneUser);

        User anotherUser = cloneUser.cloneBuilder()
            .withAge(100)
            .withAddress(new Address("A Street", 500))
            .now();
        out.println(anotherUser);
    }
}