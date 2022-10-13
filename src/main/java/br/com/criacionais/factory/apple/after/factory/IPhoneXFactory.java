package br.com.criacionais.factory.apple.after.factory;

import br.com.criacionais.factory.apple.after.model.IPhone;
import br.com.criacionais.factory.apple.after.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

    @Override
    public IPhone createIPhone() {
        return new IPhoneX();
    }

}
