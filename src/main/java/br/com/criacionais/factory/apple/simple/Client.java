package br.com.criacionais.factory.apple.simple;

import br.com.criacionais.factory.apple.simple.enums.GenerationIPhone;
import br.com.criacionais.factory.apple.simple.enums.LevelIPhone;
import br.com.criacionais.factory.apple.simple.factory.IPhoneSimpleFactory;
import br.com.criacionais.factory.apple.simple.model.IPhone;

public class Client {

    public static void main(String[] args) {
        System.out.println("### Ordering an iPhone X");
        IPhone iphone = IPhoneSimpleFactory.orderIPhone(GenerationIPhone.X, LevelIPhone.STANDARD);
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone2 = IPhoneSimpleFactory.orderIPhone(GenerationIPhone._11, LevelIPhone.HIGHEND);
        System.out.println(iphone2);
    }
}
