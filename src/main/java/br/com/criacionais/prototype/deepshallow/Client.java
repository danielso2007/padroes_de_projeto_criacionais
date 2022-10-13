package br.com.criacionais.prototype.deepshallow;

import static java.lang.System.*;
import br.com.criacionais.prototype.deepshallow.model.Address;
import br.com.criacionais.prototype.deepshallow.model.User;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("Clone", 25, new Address("ABC Street", 1000));
        out.println(user);

        User cloneUser = user.clone();
        cloneUser.name = "Clone x2";
        cloneUser.address.street = "Double Street";
        out.println(user);
        out.println(cloneUser);
    }
}