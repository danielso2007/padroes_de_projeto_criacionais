package br.com.criacionais.factory.apple.halfSimple.factory;

import br.com.criacionais.factory.apple.halfSimple.enums.LevelIPhone;
import br.com.criacionais.factory.apple.halfSimple.model.IPhone;
import br.com.criacionais.factory.apple.halfSimple.model.IPhoneX;
import br.com.criacionais.factory.apple.halfSimple.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

    @Override
    public IPhone createIPhone(LevelIPhone level) {
        if (LevelIPhone.STANDARD.equals(level)) {
            return new IPhoneX();
        }
        if (LevelIPhone.HIGHEND.equals(level)) {
            return new IPhoneXSMax();
        } else {
            return null;
        }
    }

}
