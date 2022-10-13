package br.com.criacionais.factory.apple.halfSimple.factory;

import br.com.criacionais.factory.apple.halfSimple.enums.LevelIPhone;
import br.com.criacionais.factory.apple.halfSimple.model.IPhone;
import br.com.criacionais.factory.apple.halfSimple.model.IPhone11;
import br.com.criacionais.factory.apple.halfSimple.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

    @Override
    public IPhone createIPhone(LevelIPhone level) {
        if (LevelIPhone.STANDARD.equals(level)) {
            return new IPhone11();
        }
        if (LevelIPhone.HIGHEND.equals(level)) {
            return new IPhone11Pro();
        } else {
            return null;
        }
    }

}
