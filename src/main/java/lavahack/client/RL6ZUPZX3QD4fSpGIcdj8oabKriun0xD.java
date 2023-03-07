/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Ju1BB2aMT8IOolxgeDUW0dWnHCQYhxWr;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.ohP0orxdq2P1v9VESBaGP1easnqKGTCb;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2={"Lcom/kisman/cc/features/viaforge/gui/MainFrame;", "Lcom/kisman/cc/gui/halq/Frame;", "()V", "kisman.cc"})
public final class RL6ZUPZX3QD4fSpGIcdj8oabKriun0xD
extends ohP0orxdq2P1v9VESBaGP1easnqKGTCb {
    private String Field7905 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public RL6ZUPZX3QD4fSpGIcdj8oabKriun0xD() {
        super(null, (int)((long)2096413003 ^ (long)2096413006) << 1, (int)((long)982871387 ^ (long)982871390) << 1, (boolean)((long)1938334653 ^ (long)1938334652), "ViaForge");
        if (Ju1BB2aMT8IOolxgeDUW0dWnHCQYhxWr.Field15934 != null) {
            this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.add(Ju1BB2aMT8IOolxgeDUW0dWnHCQYhxWr.Field15934);
            return;
        }
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.error("ViaForge module component is null!");
    }

    private static String Method74(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1297133271L ^ 0xB2AF5129;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)94126006L ^ 0x59C3F49);
            int n2 = (int)-1112157874L ^ 0xBDB5D139;
            cArray2[n] = (char)(cArray[n] ^ (((int)-634556655L ^ 0xDA2D58E6) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

