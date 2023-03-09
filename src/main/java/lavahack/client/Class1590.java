/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1763;

public abstract class Class1590 {
    private final String Field15437;
    private final Class1763 Field15438;
    private int Field15439;

    public Class1590(String string, Class1763 class1763) {
        this.Field15437 = string;
        this.Field15438 = class1763;
    }

    public final String Method6245() {
        return this.Field15437;
    }

    public final Class1763 Method6246() {
        return this.Field15438;
    }

    public abstract Class1590[] Method6247();

    public Class1590 Method6248(String string) {
        Class1590[] class1590Array = this.Method6247();
        int n = class1590Array.length;
        int n2 = 0;
        while (n2 < n) {
            Class1590 class1590 = class1590Array[n2];
            if (class1590.Field15437.equals(string)) {
                return class1590;
            }
            ++n2;
        }
        return null;
    }
}

