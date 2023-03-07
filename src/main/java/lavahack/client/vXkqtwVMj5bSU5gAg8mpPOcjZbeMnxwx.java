/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import org.jetbrains.annotations.NotNull;

public class vXkqtwVMj5bSU5gAg8mpPOcjZbeMnxwx
extends FrvoqED59Mj96pmO7hxn2tEew1fZAOzj {
    private String Field9581 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public vXkqtwVMj5bSU5gAg8mpPOcjZbeMnxwx() {
        super("modcount");
    }

    @Override
    public String Method447() {
        return null;
    }

    @Override
    public String Method448() {
        return null;
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505().Method1892("LavaHack has " + leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Field8854.size() + " modules");
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1282743996 ^ (long)-1282743996);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-846056936 ^ (long)-846056729);
            int n2 = (int)((long)1467312415 ^ (long)1467312498) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-762599098L ^ 0xD28BAD1F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

