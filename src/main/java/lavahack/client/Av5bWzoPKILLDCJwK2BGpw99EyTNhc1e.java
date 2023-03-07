/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2={"Lcom/kisman/cc/features/module/Debug/ClickCooldownReset;", "Lcom/kisman/cc/features/module/Module;", "()V", "kisman.cc"})
public final class Av5bWzoPKILLDCJwK2BGpw99EyTNhc1e
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public static final Av5bWzoPKILLDCJwK2BGpw99EyTNhc1e Field11106;
    private String Field11107 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Av5bWzoPKILLDCJwK2BGpw99EyTNhc1e() {
        super("ClickCooldownReset", "Uwa????", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    static {
        Av5bWzoPKILLDCJwK2BGpw99EyTNhc1e av5bWzoPKILLDCJwK2BGpw99EyTNhc1e;
        Field11106 = av5bWzoPKILLDCJwK2BGpw99EyTNhc1e = new Av5bWzoPKILLDCJwK2BGpw99EyTNhc1e();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1107359670 ^ (long)-1107359670);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1311950006L ^ 0xB1CD3BB5);
            int n2 = (int)-981584003L ^ 0xC57E370C;
            cArray2[n] = (char)(cArray[n] ^ ((int)-209840205L ^ 0xF37E24FA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

