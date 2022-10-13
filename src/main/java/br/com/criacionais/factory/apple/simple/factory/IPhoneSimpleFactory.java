package br.com.criacionais.factory.apple.simple.factory;

import br.com.criacionais.factory.apple.simple.enums.GenerationIPhone;
import br.com.criacionais.factory.apple.simple.enums.LevelIPhone;
import br.com.criacionais.factory.apple.simple.model.IPhone;
import br.com.criacionais.factory.apple.simple.model.IPhone11;
import br.com.criacionais.factory.apple.simple.model.IPhone11Pro;
import br.com.criacionais.factory.apple.simple.model.IPhoneX;
import br.com.criacionais.factory.apple.simple.model.IPhoneXSMax;

public class IPhoneSimpleFactory {

    public static IPhone orderIPhone(GenerationIPhone generation, LevelIPhone level) {
        IPhone device = null;

        if (GenerationIPhone.X.equals(generation)) {
            if (LevelIPhone.STANDARD.equals(level)) {
                device = new IPhoneX();
            } else if (LevelIPhone.HIGHEND.equals(level)) {
                device = new IPhoneXSMax();
            }
        } else if (GenerationIPhone._11.equals(generation)) {
            if (LevelIPhone.STANDARD.equals(level)) {
                device = new IPhone11();
            } else if (LevelIPhone.HIGHEND.equals(level)) {
                device = new IPhone11Pro();
            }
        }

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }
}
