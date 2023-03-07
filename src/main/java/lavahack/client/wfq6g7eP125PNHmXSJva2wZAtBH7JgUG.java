/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/util/enums/EntityESPModes;", "", "(Ljava/lang/String;I)V", "None", "Glow", "Box1", "Cubic", "kisman.cc"})
public final class wfq6g7eP125PNHmXSJva2wZAtBH7JgUG
extends Enum {
    public static final /* enum */ wfq6g7eP125PNHmXSJva2wZAtBH7JgUG Field16010;
    public static final /* enum */ wfq6g7eP125PNHmXSJva2wZAtBH7JgUG Field16011;
    public static final /* enum */ wfq6g7eP125PNHmXSJva2wZAtBH7JgUG Field16012;
    public static final /* enum */ wfq6g7eP125PNHmXSJva2wZAtBH7JgUG Field16013;
    private static final wfq6g7eP125PNHmXSJva2wZAtBH7JgUG[] Field16014;
    private String Field16015 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        wfq6g7eP125PNHmXSJva2wZAtBH7JgUG[] wfq6g7eP125PNHmXSJva2wZAtBH7JgUGArray = new wfq6g7eP125PNHmXSJva2wZAtBH7JgUG[(int)((long)-2145619567 ^ (long)-2145619568) << 2];
        wfq6g7eP125PNHmXSJva2wZAtBH7JgUG[] wfq6g7eP125PNHmXSJva2wZAtBH7JgUGArray2 = wfq6g7eP125PNHmXSJva2wZAtBH7JgUGArray;
        wfq6g7eP125PNHmXSJva2wZAtBH7JgUGArray[(int)((long)-687893341 ^ (long)-687893341)] = Field16010 = new wfq6g7eP125PNHmXSJva2wZAtBH7JgUG("None", (int)-1435953601L ^ 0xAA69163F);
        wfq6g7eP125PNHmXSJva2wZAtBH7JgUGArray[(int)((long)346824117 ^ (long)346824116)] = Field16011 = new wfq6g7eP125PNHmXSJva2wZAtBH7JgUG("Glow", (int)((long)-1007776633 ^ (long)-1007776634));
        wfq6g7eP125PNHmXSJva2wZAtBH7JgUGArray[(int)((long)-476472392 ^ (long)-476472391) << 1] = Field16012 = new wfq6g7eP125PNHmXSJva2wZAtBH7JgUG("Box1", ((int)-917272702L ^ 0xC9538783) << 1);
        wfq6g7eP125PNHmXSJva2wZAtBH7JgUGArray[(int)((long)319610955 ^ (long)319610952)] = Field16013 = new wfq6g7eP125PNHmXSJva2wZAtBH7JgUG("Cubic", (int)-1864277907L ^ 0x90E1606E);
        Field16014 = wfq6g7eP125PNHmXSJva2wZAtBH7JgUGArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private wfq6g7eP125PNHmXSJva2wZAtBH7JgUG() {
        void var2_-1;
        void var1_-1;
    }

    public static wfq6g7eP125PNHmXSJva2wZAtBH7JgUG[] values() {
        return (wfq6g7eP125PNHmXSJva2wZAtBH7JgUG[])Field16014.clone();
    }

    public static wfq6g7eP125PNHmXSJva2wZAtBH7JgUG valueOf(String string) {
        return Enum.valueOf(wfq6g7eP125PNHmXSJva2wZAtBH7JgUG.class, string);
    }

    private static String Method6666(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-766524078L ^ 0xD24FC552;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1689583912L ^ 0x9B4AFE27);
            int n2 = ((int)-1895435202L ^ 0x8F05F413) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1729609836 ^ (long)-1729616303) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

