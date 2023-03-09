/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Class42;
import lavahack.client.Class97;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2={"Lcom/kisman/cc/features/module/Debug/ClickCooldownReset;", "Lcom/kisman/cc/features/module/Module;", "()V", "kisman.cc"})
public final class Class731
extends Class42 {
    public static final Class731 Field11106;
    private String Field11107 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Class731() {
        super("ClickCooldownReset", "Uwa????", Class97.Field8345);
    }

    static {
        Class731 class731;
        Field11106 = class731 = new Class731();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 113;
            cArray2[n] = (char)(cArray[n] ^ (0x3349 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

