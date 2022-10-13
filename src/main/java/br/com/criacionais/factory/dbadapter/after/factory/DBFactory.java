package br.com.criacionais.factory.dbadapter.after.factory;

import br.com.criacionais.factory.dbadapter.after.db.DB;

public interface DBFactory {
    DB getDatabase();
}
