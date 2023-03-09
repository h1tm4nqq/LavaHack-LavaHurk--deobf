/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1876;

public abstract class Class1514 {
    protected int Field15082;
    protected int Field15083;
    protected int Field15084;
    protected int Field15085;
    protected Class1876 Field15086;
    private int Field15087;
    private int Field15088;
    private boolean Field15089;
    private int Field15090;

    public Class1514(Class1876 class1876) {
        this.Field15086 = class1876;
    }

    public abstract void Method668();

    public abstract void Method669();

    public int Method670() {
        return 0;
    }

    public int Method671() {
        return this.Field15082;
    }

    public void Method672(int n) {
        if (this.Field15082 != n) {
            this.Method680(true);
        }
        this.Field15082 = n;
    }

    public int Method673() {
        return this.Field15083;
    }

    public void Method674(int n) {
        if (this.Field15083 != n) {
            this.Method680(true);
        }
        this.Field15083 = n;
    }

    public int Method675() {
        return this.Field15087;
    }

    public void Method676(int n) {
        if (this.Field15087 != n) {
            this.Method680(true);
        }
        this.Field15087 = n;
    }

    public int Method677() {
        return this.Field15088;
    }

    public void Method678(int n) {
        if (this.Field15088 != n) {
            this.Method680(true);
        }
        this.Field15088 = n;
    }

    public boolean Method679() {
        return this.Field15089;
    }

    public void Method680(boolean bl) {
        this.Field15089 = bl;
    }

    public boolean Method681(int n, char c) {
        return false;
    }

    public boolean Method682(int n, int n2, int n3, boolean bl) {
        return false;
    }

    public boolean Method683(int n, int n2, boolean bl) {
        return false;
    }

    public boolean Method684(int n, int n2, int n3, boolean bl) {
        return false;
    }

    public boolean Method685(int n) {
        return false;
    }
}

