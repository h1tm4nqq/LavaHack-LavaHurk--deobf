/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

public class Class902
extends Exception {
    private static final long Field11769 = 3731842424390998726L;
    private final int Field11770;
    private String Field11771 = "TheKisDevs & LavaHack Development owns you";

    public Class902(int n) {
        this.Field11770 = n;
    }

    public Class902(int n, String string) {
        super(string);
        this.Field11770 = n;
    }

    public Class902(int n, Throwable throwable) {
        super(throwable);
        this.Field11770 = n;
    }

    public Class902(int n, String string, Throwable throwable) {
        super(string, throwable);
        this.Field11770 = n;
    }

    public int Method483() {
        return this.Field11770;
    }
}

