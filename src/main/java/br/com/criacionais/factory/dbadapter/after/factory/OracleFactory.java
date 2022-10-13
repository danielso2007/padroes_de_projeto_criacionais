package br.com.criacionais.factory.dbadapter.after.factory;

import br.com.criacionais.factory.dbadapter.after.db.DB;
import br.com.criacionais.factory.dbadapter.after.db.OracleDB;

public class OracleFactory implements DBFactory {

    @Override
    public DB getDatabase() {
        return new OracleDB();
    }

}
