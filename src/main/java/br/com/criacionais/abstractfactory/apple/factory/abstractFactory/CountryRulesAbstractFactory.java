package br.com.criacionais.abstractfactory.apple.factory.abstractFactory;

import br.com.criacionais.abstractfactory.apple.model.certificate.Certificate;
import br.com.criacionais.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
    Certificate getCertificates();

    Packing getPacking();
}
