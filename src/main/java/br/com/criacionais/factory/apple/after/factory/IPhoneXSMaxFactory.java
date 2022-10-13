package br.com.criacionais.factory.apple.after.factory;

import br.com.criacionais.factory.apple.after.model.IPhone;
import br.com.criacionais.factory.apple.after.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

    @Override
    public IPhone createIPhone() {
        return new IPhoneXSMax();
    }

}
