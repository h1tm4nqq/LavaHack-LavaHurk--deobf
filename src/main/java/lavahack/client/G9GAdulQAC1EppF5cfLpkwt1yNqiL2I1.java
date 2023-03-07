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

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2={"Lcom/kisman/cc/features/module/Debug/TestBlockGui;", "Lcom/kisman/cc/features/module/Module;", "()V", "kisman.cc"})
public final class G9GAdulQAC1EppF5cfLpkwt1yNqiL2I1
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private int Field12318;

    public G9GAdulQAC1EppF5cfLpkwt1yNqiL2I1() {
        super("TestBlockGui", "Test of search gui like dallas.", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1998721972L ^ 0x88DDEC4C;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-519156849L ^ 0xE10E4B70);
            int n2 = ((int)579802798L ^ 0x228F16A1) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)402683517L ^ 0x18003FC2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

