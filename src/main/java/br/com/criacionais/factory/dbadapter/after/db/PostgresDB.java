package br.com.criacionais.factory.dbadapter.after.db;

public class PostgresDB implements DB {

    @Override
    public void query(String sql) {
        System.out.println("Querying " + sql + " in Postgres database");
    }

    @Override
    public void update(String sql) {
        System.out.println("Uptade querry " + sql + " in Postgres database");
    }
}
