/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1260;
import lavahack.client.Class23;
import lavahack.client.Class475;
import lavahack.client.Class899;

public class Class1357
implements Class899 {
    private String Field14185 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method2866(Class1260 class1260) throws Class23 {
    }

    @Override
    public void Method2867(Class1260 class1260) {
    }

    @Override
    public boolean Method2868(String string) {
        return true;
    }

    @Override
    public boolean Method2869(String string) {
        return true;
    }

    @Override
    public void Method2870(Class1260 class1260) throws Class23 {
        if (class1260.Method1613()) throw new Class475("bad rsv RSV1: " + class1260.Method1613() + " RSV2: " + class1260.Method1614() + " RSV3: " + class1260.Method1615());
        if (class1260.Method1614()) throw new Class475("bad rsv RSV1: " + class1260.Method1613() + " RSV2: " + class1260.Method1614() + " RSV3: " + class1260.Method1615());
        if (!class1260.Method1615()) return;
        throw new Class475("bad rsv RSV1: " + class1260.Method1613() + " RSV2: " + class1260.Method1614() + " RSV3: " + class1260.Method1615());
    }

    @Override
    public String Method2871() {
        return "";
    }

    @Override
    public String Method2872() {
        return "";
    }

    @Override
    public Class899 Method2873() {
        return new Class1357();
    }

    @Override
    public void Method2874() {
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    public int hashCode() {
        return this.getClass().hashCode();
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;
        if (this.getClass() != object.getClass()) return false;
        return true;
    }

    private static String Method2875(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 53;
            cArray2[n] = (char)(cArray[n] ^ (0x2A3A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

