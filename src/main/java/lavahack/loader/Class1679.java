/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import lavahack.loader.Class1327;
import lavahack.loader.Class1753;
import lavahack.loader.Class902;
import lavahack.loader.Class939;

public abstract class Class1679
extends Class1327 {
    private String Field15818 = "TheKisDevs & LavaHack Development owns you";

    public Class1679(Class1753 class1753) {
        super(class1753);
    }

    @Override
    public void Method84() throws Class902 {
        if (!this.Method76()) {
            throw new Class939("Control frame can't have fin==false set");
        }
        if (this.Method77()) {
            throw new Class939("Control frame can't have rsv1==true set");
        }
        if (this.Method78()) {
            throw new Class939("Control frame can't have rsv2==true set");
        }
        if (!this.Method79()) return;
        throw new Class939("Control frame can't have rsv3==true set");
    }

    private static String Method92(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 172;
            cArray2[n] = (char)(cArray[n] ^ (0x2358 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

