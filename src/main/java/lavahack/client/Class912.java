/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.UnsupportedEncodingException;

public class Class912
extends RuntimeException {
    private final UnsupportedEncodingException Field11870;
    private String Field11871 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class912(UnsupportedEncodingException unsupportedEncodingException) {
        if (unsupportedEncodingException == null) {
            throw new IllegalArgumentException();
        }
        this.Field11870 = unsupportedEncodingException;
    }

    public UnsupportedEncodingException Method3824() {
        return this.Field11870;
    }
}

