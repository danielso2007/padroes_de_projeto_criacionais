package br.com.criacionais.factory.apple.halfSimple.factory;

import br.com.criacionais.factory.apple.halfSimple.enums.LevelIPhone;
import br.com.criacionais.factory.apple.halfSimple.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIPhone(LevelIPhone level) {
        IPhone device = null;

        device = createIPhone(level);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract IPhone createIPhone(LevelIPhone level);
}
