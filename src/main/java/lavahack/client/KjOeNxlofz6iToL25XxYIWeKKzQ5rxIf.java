/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/enums/ShaderCharmsOverlaying;", "", "(Ljava/lang/String;I)V", "Pre", "Post", "kisman.cc"})
public final class KjOeNxlofz6iToL25XxYIWeKKzQ5rxIf
extends Enum {
    public static final /* enum */ KjOeNxlofz6iToL25XxYIWeKKzQ5rxIf Field15625;
    public static final /* enum */ KjOeNxlofz6iToL25XxYIWeKKzQ5rxIf Field15626;
    private static final KjOeNxlofz6iToL25XxYIWeKKzQ5rxIf[] Field15627;
    private String Field15628 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        KjOeNxlofz6iToL25XxYIWeKKzQ5rxIf[] kjOeNxlofz6iToL25XxYIWeKKzQ5rxIfArray = new KjOeNxlofz6iToL25XxYIWeKKzQ5rxIf[(int)((long)1248980160 ^ (long)1248980161) << 1];
        KjOeNxlofz6iToL25XxYIWeKKzQ5rxIf[] kjOeNxlofz6iToL25XxYIWeKKzQ5rxIfArray2 = kjOeNxlofz6iToL25XxYIWeKKzQ5rxIfArray;
        kjOeNxlofz6iToL25XxYIWeKKzQ5rxIfArray[(int)((long)-642279209 ^ (long)-642279209)] = Field15625 = new KjOeNxlofz6iToL25XxYIWeKKzQ5rxIf("Pre", (int)-1074664584L ^ 0xBFF1EB78);
        kjOeNxlofz6iToL25XxYIWeKKzQ5rxIfArray[(int)((long)262135843 ^ (long)262135842)] = Field15626 = new KjOeNxlofz6iToL25XxYIWeKKzQ5rxIf("Post", (int)((long)790962434 ^ (long)790962435));
        Field15627 = kjOeNxlofz6iToL25XxYIWeKKzQ5rxIfArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private KjOeNxlofz6iToL25XxYIWeKKzQ5rxIf() {
        void var2_-1;
        void var1_-1;
    }

    public static KjOeNxlofz6iToL25XxYIWeKKzQ5rxIf[] values() {
        return (KjOeNxlofz6iToL25XxYIWeKKzQ5rxIf[])Field15627.clone();
    }

    public static KjOeNxlofz6iToL25XxYIWeKKzQ5rxIf valueOf(String string) {
        return Enum.valueOf(KjOeNxlofz6iToL25XxYIWeKKzQ5rxIf.class, string);
    }

    private static String Method6369(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1355646570L ^ 0x50CD866A;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1897025722L ^ 0x71125045);
            int n2 = ((int)-1372655750L ^ 0xAE2EEF59) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1619077093 ^ (long)-1619072524) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

