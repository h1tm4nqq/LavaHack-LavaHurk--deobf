/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

public class rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC
extends Exception {
    private static final long Field11769 = 0x33CA2AE9BFDEDEDFL & 0x33CA2AE9AFAEFAE6L;
    private final int Field11770;
    private String Field11771 = "TheKisDevs & LavaHack Development owns you";

    public rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC(int n) {
        this.Field11770 = n;
    }

    public rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC(int n, String string) {
        super(string);
        this.Field11770 = n;
    }

    public rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC(int n, Throwable throwable) {
        super(throwable);
        this.Field11770 = n;
    }

    public rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC(int n, String string, Throwable throwable) {
        super(string, throwable);
        this.Field11770 = n;
    }

    public int Method483() {
        return this.Field11770;
    }
}

