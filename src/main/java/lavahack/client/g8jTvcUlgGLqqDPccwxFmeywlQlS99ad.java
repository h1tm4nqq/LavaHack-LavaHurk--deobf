/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/enums/GlowModes;", "", "(Ljava/lang/String;I)V", "Default", "Shader", "kisman.cc"})
public final class g8jTvcUlgGLqqDPccwxFmeywlQlS99ad
extends Enum {
    public static final /* enum */ g8jTvcUlgGLqqDPccwxFmeywlQlS99ad Field8170;
    public static final /* enum */ g8jTvcUlgGLqqDPccwxFmeywlQlS99ad Field8171;
    private static final g8jTvcUlgGLqqDPccwxFmeywlQlS99ad[] Field8172;
    private String Field8173 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        g8jTvcUlgGLqqDPccwxFmeywlQlS99ad[] g8jTvcUlgGLqqDPccwxFmeywlQlS99adArray = new g8jTvcUlgGLqqDPccwxFmeywlQlS99ad[(int)((long)-500593229 ^ (long)-500593230) << 1];
        g8jTvcUlgGLqqDPccwxFmeywlQlS99ad[] g8jTvcUlgGLqqDPccwxFmeywlQlS99adArray2 = g8jTvcUlgGLqqDPccwxFmeywlQlS99adArray;
        g8jTvcUlgGLqqDPccwxFmeywlQlS99adArray[(int)913321788L ^ 0x36702F3C] = Field8170 = new g8jTvcUlgGLqqDPccwxFmeywlQlS99ad("Default", (int)((long)-60389962 ^ (long)-60389962));
        g8jTvcUlgGLqqDPccwxFmeywlQlS99adArray[(int)-763059835L ^ 0xD284A184] = Field8171 = new g8jTvcUlgGLqqDPccwxFmeywlQlS99ad("Shader", (int)((long)-939613628 ^ (long)-939613627));
        Field8172 = g8jTvcUlgGLqqDPccwxFmeywlQlS99adArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private g8jTvcUlgGLqqDPccwxFmeywlQlS99ad() {
        void var2_-1;
        void var1_-1;
    }

    public static g8jTvcUlgGLqqDPccwxFmeywlQlS99ad[] values() {
        return (g8jTvcUlgGLqqDPccwxFmeywlQlS99ad[])Field8172.clone();
    }

    public static g8jTvcUlgGLqqDPccwxFmeywlQlS99ad valueOf(String string) {
        return Enum.valueOf(g8jTvcUlgGLqqDPccwxFmeywlQlS99ad.class, string);
    }

    private static String Method486(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1602591377L ^ 0xA07A656F;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1401746432 ^ (long)1401746687);
            int n2 = (int)((long)-1893648809 ^ (long)-1893648792) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1465728579L ^ 0xA8A2CA42) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

