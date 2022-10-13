package br.com.criacionais.factory.apple.before.service;

import br.com.criacionais.factory.apple.before.enums.GenerationIPhone;
import br.com.criacionais.factory.apple.before.enums.LevelIPhone;
import br.com.criacionais.factory.apple.before.model.IPhone;
import br.com.criacionais.factory.apple.before.model.IPhone11;
import br.com.criacionais.factory.apple.before.model.IPhone11Pro;
import br.com.criacionais.factory.apple.before.model.IPhoneX;
import br.com.criacionais.factory.apple.before.model.IPhoneXSMax;

public class ServiceOrder {

    public IPhone orderIPhone(GenerationIPhone generation, LevelIPhone level) {
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
