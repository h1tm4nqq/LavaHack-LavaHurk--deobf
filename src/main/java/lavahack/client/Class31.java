/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public class Class31 {
    private final Object Field7943;
    private final boolean Field7944;
    private String Field7945 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    Class31(Object object, boolean bl) {
        this.Field7943 = object;
        this.Field7944 = bl;
    }

    public Object Method249() {
        if (!this.Field7944) return this.Field7943;
        throw new IllegalStateException();
    }

    public Object Method250(Object object) {
        if (!this.Field7944) return this.Field7943;
        return object;
    }

    public Object Method251() {
        if (!this.Field7944) return this.Field7943;
        return null;
    }
}

