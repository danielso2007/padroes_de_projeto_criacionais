package br.com.criacionais.abstractfactory.apple.factory;

import br.com.criacionais.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.criacionais.abstractfactory.apple.model.iphone.IPhone;
import br.com.criacionais.abstractfactory.apple.model.iphone.IPhone11;
import br.com.criacionais.abstractfactory.apple.model.iphone.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

    public IPhone11Factory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public IPhone createIPhone(String level) {
        if ("standard".equals(level)) {
            return new IPhone11(rules);
        }
        if ("highEnd".equals(level)) {
            return new IPhone11Pro(rules);
        } else {
            return null;
        }
    }

}
