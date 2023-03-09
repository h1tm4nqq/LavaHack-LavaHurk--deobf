/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public class Class23
extends Exception {
    private static final long Field7913 = 3731842424390998726L;
    private final int Field7914;
    private String Field7915 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class23(int n) {
        this.Field7914 = n;
    }

    public Class23(int n, String string) {
        super(string);
        this.Field7914 = n;
    }

    public Class23(int n, Throwable throwable) {
        super(throwable);
        this.Field7914 = n;
    }

    public Class23(int n, String string, Throwable throwable) {
        super(string, throwable);
        this.Field7914 = n;
    }

    public int Method192() {
        return this.Field7914;
    }
}

