package br.com.criacionais.singleton.after;

import static java.lang.System.*;
import br.com.criacionais.singleton.after.conn.Connection;
import br.com.criacionais.singleton.after.conn.ConnectionPool;

public class Client {
    public static void doQuery1() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        if (conn != null) {
            conn.query("SELECT * FROM A1");
        }
    }

    public static void doQuery2() {
        Connection conn = ConnectionPool.getInstance().getConnection();
        if (conn != null) {
            conn.query("SELECT * FROM A2");
            out.println("leaveConnection...");
            ConnectionPool.getInstance().leaveConnection(conn);
        }
    }

    public static void doQuery3() {
        Connection conn = ConnectionPool.getInstance().getConnection();
        if (conn != null) {
            conn.query("SELECT * FROM A3");
        }
    }

    public static void doQuery4() {
        Connection conn = ConnectionPool.getInstance().getConnection();
        if (conn != null) {
            conn.query("SELECT * FROM A4");
        }
    }

    public static void main(String[] args) {
        out.println("Connection Pool Size: " + ConnectionPool.POOL_SIZE);
        int pool = ConnectionPool.POOL_SIZE;
        out.println(pool);
        doQuery1();
        doQuery2();
        doQuery3();
        doQuery4();
    }
}
