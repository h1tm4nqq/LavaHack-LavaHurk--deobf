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

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2={"Lcom/kisman/cc/features/module/Debug/TestBlockGui;", "Lcom/kisman/cc/features/module/Module;", "()V", "kisman.cc"})
public final class Class1005
extends Class42 {
    private int Field12318;

    public Class1005() {
        super("TestBlockGui", "Test of search gui like dallas.", Class97.Field8345);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 30;
            cArray2[n] = (char)(cArray[n] ^ (0x49BF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

