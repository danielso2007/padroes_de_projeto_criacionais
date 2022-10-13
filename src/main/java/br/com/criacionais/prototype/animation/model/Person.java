package br.com.criacionais.prototype.animation.model;

import static java.lang.System.*;

public class Person implements Cloneable {
    String line1;
    String line2;
    String line3;
    String line4;

    public Person(String line1, String line2, String line3, String line4) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.line4 = line4;
    }

    public void draw() {
        out.println("");
        out.println(line1);
        out.println(line2);
        out.println(line3);
        out.println(line4);
    }

    public void left() {
        line1 = line1.substring(1);
        line2 = line2.substring(1);
        line3 = line3.substring(1);
        line4 = line4.substring(1);
    }

    public void right() {
        line1 = " " + line1;
        line2 = " " + line2;
        line3 = " " + line3;
        line4 = "_" + line4;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
