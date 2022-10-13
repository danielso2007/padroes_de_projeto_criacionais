package br.com.criacionais.factory.dbadapter.after.factory;

import br.com.criacionais.factory.dbadapter.after.db.DB;
import br.com.criacionais.factory.dbadapter.after.db.PostgresDB;

public class PostgresFactory implements DBFactory {

    @Override
    public DB getDatabase() {
        return new PostgresDB();
    }

}
