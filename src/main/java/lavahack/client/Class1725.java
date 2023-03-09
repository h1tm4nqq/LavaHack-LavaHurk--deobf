/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.UUID;

public final class Class1725 {
    private final String Field15925;
    private final UUID Field15926;
    private String Field15927 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1725(String string, UUID uUID) {
        this.Field15925 = string;
        this.Field15926 = uUID;
    }

    public Class1725(String string, String string2) {
        this(string, UUID.fromString(string2));
    }

    public String Method6594() {
        return this.Field15925;
    }

    public UUID Method6595() {
        return this.Field15926;
    }

    public String Method6596() {
        return this.Field15926.toString();
    }
}

