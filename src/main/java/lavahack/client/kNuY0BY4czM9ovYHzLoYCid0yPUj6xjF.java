/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/websockets/api/enums/CloseHandshakeType;", "", "(Ljava/lang/String;I)V", "NONE", "ONEWAY", "TWOWAY", "kisman.cc"})
public final class kNuY0BY4czM9ovYHzLoYCid0yPUj6xjF
extends Enum {
    public static final /* enum */ kNuY0BY4czM9ovYHzLoYCid0yPUj6xjF Field10859;
    public static final /* enum */ kNuY0BY4czM9ovYHzLoYCid0yPUj6xjF Field10860;
    public static final /* enum */ kNuY0BY4czM9ovYHzLoYCid0yPUj6xjF Field10861;
    private static final kNuY0BY4czM9ovYHzLoYCid0yPUj6xjF[] Field10862;
    private int Field10863;

    static {
        kNuY0BY4czM9ovYHzLoYCid0yPUj6xjF[] kNuY0BY4czM9ovYHzLoYCid0yPUj6xjFArray = new kNuY0BY4czM9ovYHzLoYCid0yPUj6xjF[(int)((long)831239420 ^ (long)831239423)];
        kNuY0BY4czM9ovYHzLoYCid0yPUj6xjF[] kNuY0BY4czM9ovYHzLoYCid0yPUj6xjFArray2 = kNuY0BY4czM9ovYHzLoYCid0yPUj6xjFArray;
        kNuY0BY4czM9ovYHzLoYCid0yPUj6xjFArray[(int)((long)668082470 ^ (long)668082470)] = Field10859 = new kNuY0BY4czM9ovYHzLoYCid0yPUj6xjF("NONE", (int)((long)1655029521 ^ (long)1655029521));
        kNuY0BY4czM9ovYHzLoYCid0yPUj6xjFArray[(int)((long)1493594529 ^ (long)1493594528)] = Field10860 = new kNuY0BY4czM9ovYHzLoYCid0yPUj6xjF("ONEWAY", (int)((long)1202422163 ^ (long)1202422162));
        kNuY0BY4czM9ovYHzLoYCid0yPUj6xjFArray[((int)-1392738755L ^ 0xACFC7E3C) << 1] = Field10861 = new kNuY0BY4czM9ovYHzLoYCid0yPUj6xjF("TWOWAY", (int)((long)37171646 ^ (long)37171647) << 1);
        Field10862 = kNuY0BY4czM9ovYHzLoYCid0yPUj6xjFArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private kNuY0BY4czM9ovYHzLoYCid0yPUj6xjF() {
        void var2_-1;
        void var1_-1;
    }

    public static kNuY0BY4czM9ovYHzLoYCid0yPUj6xjF[] values() {
        return (kNuY0BY4czM9ovYHzLoYCid0yPUj6xjF[])Field10862.clone();
    }

    public static kNuY0BY4czM9ovYHzLoYCid0yPUj6xjF valueOf(String string) {
        return Enum.valueOf(kNuY0BY4czM9ovYHzLoYCid0yPUj6xjF.class, string);
    }

    private static String Method2858(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)384218401 ^ (long)384218401);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1400211814L ^ 0x53758999);
            int n2 = ((int)-947479962L ^ 0xC7869A25) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-588806014L ^ 0xDCE7D4B7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

