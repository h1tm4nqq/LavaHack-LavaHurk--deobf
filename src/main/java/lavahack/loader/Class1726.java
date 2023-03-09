/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import lavahack.loader.Class1720;
import lavahack.loader.Class1926;
import lavahack.loader.Class902;
import lavahack.loader.Class939;

public class Class1726
implements Class1720 {
    private int Field15928;

    @Override
    public void Method6571(Class1926 class1926) throws Class902 {
    }

    @Override
    public void Method6572(Class1926 class1926) {
    }

    @Override
    public boolean Method6573(String string) {
        return true;
    }

    @Override
    public boolean Method6574(String string) {
        return true;
    }

    @Override
    public void Method6575(Class1926 class1926) throws Class902 {
        if (class1926.Method77()) throw new Class939("bad rsv RSV1: " + class1926.Method77() + " RSV2: " + class1926.Method78() + " RSV3: " + class1926.Method79());
        if (class1926.Method78()) throw new Class939("bad rsv RSV1: " + class1926.Method77() + " RSV2: " + class1926.Method78() + " RSV3: " + class1926.Method79());
        if (!class1926.Method79()) return;
        throw new Class939("bad rsv RSV1: " + class1926.Method77() + " RSV2: " + class1926.Method78() + " RSV3: " + class1926.Method79());
    }

    @Override
    public String Method6576() {
        return "";
    }

    @Override
    public String Method6577() {
        return "";
    }

    @Override
    public Class1720 Method6578() {
        return new Class1726();
    }

    @Override
    public void Method6579() {
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

    private static String Method6597(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 191;
            cArray2[n] = (char)(cArray[n] ^ (0x1749 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

