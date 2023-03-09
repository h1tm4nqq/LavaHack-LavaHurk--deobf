/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/command/commands/UseCommand$Mode;", "", "(Ljava/lang/String;I)V", "BLOCK", "ENTITY", "kisman.cc"})
public final class Class581
extends Enum {
    public static final /* enum */ Class581 Field10477;
    public static final /* enum */ Class581 Field10478;
    private static final Class581[] Field10479;
    private String Field10480 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class581[] class581Array = new Class581[2];
        Class581[] class581Array2 = class581Array;
        class581Array[0] = Field10477 = new Class581("BLOCK", 0);
        class581Array[1] = Field10478 = new Class581("ENTITY", 1);
        Field10479 = class581Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class581() {
        void var2_-1;
        void var1_-1;
    }

    public static Class581[] values() {
        return (DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field10479.clone();
    }

    public static Class581 valueOf(String string) {
        return Enum.valueOf(Class581.class, string);
    }

    private static String Method2531(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 185;
            cArray2[n] = (char)(cArray[n] ^ (0x2601 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

