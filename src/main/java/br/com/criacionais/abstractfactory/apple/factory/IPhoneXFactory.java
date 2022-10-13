package br.com.criacionais.abstractfactory.apple.factory;

import br.com.criacionais.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.criacionais.abstractfactory.apple.model.iphone.IPhone;
import br.com.criacionais.abstractfactory.apple.model.iphone.IPhoneX;
import br.com.criacionais.abstractfactory.apple.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

    public IPhoneXFactory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public IPhone createIPhone(String level) {
        if ("standard".equals(level)) {
            return new IPhoneX(rules);
        }
        if ("highEnd".equals(level)) {
            return new IPhoneXSMax(rules);
        } else {
            return null;
        }
    }

}
