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

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2={"Lcom/kisman/cc/features/module/Debug/ElytraFly2b2t;", "Lcom/kisman/cc/features/module/Module;", "()V", "kisman.cc"})
public final class feYvXnXEnWWeOXMeYllCrHL7hDylYWCS
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private String Field10401 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public feYvXnXEnWWeOXMeYllCrHL7hDylYWCS() {
        super("ElytraFly2b2t", "skidded from bloom ware", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)194230512 ^ (long)194230512);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1137142567L ^ 0xBC389426);
            int n2 = ((int)-633361669L ^ 0xDA3FAAB2) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)1572959867L ^ 0x5DC17CFE) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

