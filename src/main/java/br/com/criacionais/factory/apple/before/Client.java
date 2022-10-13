package br.com.criacionais.factory.apple.before;

import br.com.criacionais.factory.apple.before.enums.GenerationIPhone;
import br.com.criacionais.factory.apple.before.enums.LevelIPhone;
import br.com.criacionais.factory.apple.before.model.IPhone;
import br.com.criacionais.factory.apple.before.service.ServiceOrder;

public class Client {

    public static void main(String[] args) {
        ServiceOrder service = new ServiceOrder();

        System.out.println("### Ordering an IPhone X");
        IPhone iphone = service.orderIPhone(GenerationIPhone.X, LevelIPhone.STANDARD);
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an IPhone 11 HighEnd");
        IPhone iphone2 = service.orderIPhone(GenerationIPhone._11, LevelIPhone.HIGHEND);
        System.out.println(iphone2);
    }
}
