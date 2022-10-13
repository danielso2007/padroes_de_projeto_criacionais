package br.com.criacionais.singleton.before.conn;

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private static final int POOL_SIZE = 2;

    private List<Connection> connectionsPool;

    public ConnectionPool() {
        out.println("Creating Connection Pool");
        connectionsPool = new ArrayList<>();
        for (int i = 0; i < POOL_SIZE; i++) {
            connectionsPool.add(new Connection());
        }
    }

    public Connection getConnection() {
        Connection avaiable = null;
        for (Connection conn : connectionsPool) {
            if (!conn.isInUse()) {
                avaiable = conn;
                break;
            }
        }
        if (avaiable == null) {
            out.println("No Connections avaiable");
            return null;
        }
        avaiable.setInUse(true);
        return avaiable;
    }

    public void leaveConnection(Connection conn) {
        conn.setInUse(false);
    }
}
