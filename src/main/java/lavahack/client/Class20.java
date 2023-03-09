/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Class1729;
import lavahack.client.Class1796;
import lavahack.client.Class354;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2={"Lcom/kisman/cc/features/viaforge/gui/MainFrame;", "Lcom/kisman/cc/gui/halq/Frame;", "()V", "kisman.cc"})
public final class Class20
extends Class354 {
    private String Field7905 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class20() {
        super(null, 10, 10, true, "ViaForge");
        if (Class1729.Field15934 != null) {
            this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.add(Class1729.Field15934);
            return;
        }
        Class1796.Field16243.error("ViaForge module component is null!");
    }

    private static String Method74(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 119;
            cArray2[n] = (char)(cArray[n] ^ (0x6FEE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

