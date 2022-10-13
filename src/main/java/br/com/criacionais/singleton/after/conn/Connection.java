package br.com.criacionais.singleton.after.conn;

import static java.lang.System.*;

public class Connection {
    private boolean inUse;

    public Connection() {
        inUse = false;
    }

    public Object query(String sql) {
        out.println("Running '" + sql + "' in Connection " + this);
        return null;
    }

    boolean isInUse() {
        return inUse;
    }

    void setInUse(boolean status) {
        inUse = status;
    }
}
