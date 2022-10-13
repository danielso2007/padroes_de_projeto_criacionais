package br.com.criacionais.factory.dbadapter.after.db;

public class OracleDB implements DB {

    @Override
    public void query(String sql) {
        System.out.println("Querying " + sql + " in Oracle database");
    }

    @Override
    public void update(String sql) {
        System.out.println("Uptade querry " + sql + " in Oracle database");
    }
}
