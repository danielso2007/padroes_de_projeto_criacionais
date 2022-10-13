package br.com.criacionais.factory.dbadapter.after;

import br.com.criacionais.factory.dbadapter.after.db.DB;
import br.com.criacionais.factory.dbadapter.after.factory.OracleFactory;

public class Client {

    public static void main(String[] args) {
        // DB db = new PostgresFactory().getDatabase();
        DB db = new OracleFactory().getDatabase();
        db.query("SELECT * FROM users");
        db.update("INSERT INTO users VALUES ('User', 25)");
    }
}