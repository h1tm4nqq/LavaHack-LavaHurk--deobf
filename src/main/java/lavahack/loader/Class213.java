/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import lavahack.loader.Class1105;
import lavahack.loader.Class1753;
import lavahack.loader.Class609;
import lavahack.loader.Class902;

public class Class213
extends Class609 {
    private String Field8912 = "TheKisDevs & LavaHack Development owns you";

    public Class213() {
        super(Class1753.Field16034);
    }

    @Override
    public void Method84() throws Class902 {
        super.Method84();
        if (Class1105.Method4532(this.Method82())) return;
        throw new Class902(1007, "Received text is no valid utf8 string!");
    }

    private static String Method92(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 209;
            cArray2[n] = (char)(cArray[n] ^ (0x63BF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

