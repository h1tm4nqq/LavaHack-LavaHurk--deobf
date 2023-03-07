/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/util/enums/BoxRenderModes;", "", "(Ljava/lang/String;I)V", "Filled", "Outline", "Both", "kisman.cc"})
public final class cdqy6rDItOpkxgOPyMP0k8hjRZVGKSkO
extends Enum {
    public static final /* enum */ cdqy6rDItOpkxgOPyMP0k8hjRZVGKSkO Field13643;
    public static final /* enum */ cdqy6rDItOpkxgOPyMP0k8hjRZVGKSkO Field13644;
    public static final /* enum */ cdqy6rDItOpkxgOPyMP0k8hjRZVGKSkO Field13645;
    private static final cdqy6rDItOpkxgOPyMP0k8hjRZVGKSkO[] Field13646;
    private int Field13647;

    static {
        cdqy6rDItOpkxgOPyMP0k8hjRZVGKSkO[] cdqy6rDItOpkxgOPyMP0k8hjRZVGKSkOArray = new cdqy6rDItOpkxgOPyMP0k8hjRZVGKSkO[(int)-503835965L ^ 0xE1F812C0];
        cdqy6rDItOpkxgOPyMP0k8hjRZVGKSkO[] cdqy6rDItOpkxgOPyMP0k8hjRZVGKSkOArray2 = cdqy6rDItOpkxgOPyMP0k8hjRZVGKSkOArray;
        cdqy6rDItOpkxgOPyMP0k8hjRZVGKSkOArray[(int)((long)-827332354 ^ (long)-827332354)] = Field13643 = new cdqy6rDItOpkxgOPyMP0k8hjRZVGKSkO("Filled", (int)((long)1447361069 ^ (long)1447361069));
        cdqy6rDItOpkxgOPyMP0k8hjRZVGKSkOArray[(int)-621539589L ^ 0xDAF40EFA] = Field13644 = new cdqy6rDItOpkxgOPyMP0k8hjRZVGKSkO("Outline", (int)((long)-260751050 ^ (long)-260751049));
        cdqy6rDItOpkxgOPyMP0k8hjRZVGKSkOArray[((int)-1000281336L ^ 0xC460EB09) << 1] = Field13645 = new cdqy6rDItOpkxgOPyMP0k8hjRZVGKSkO("Both", ((int)676844451L ^ 0x2857D3A2) << 1);
        Field13646 = cdqy6rDItOpkxgOPyMP0k8hjRZVGKSkOArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cdqy6rDItOpkxgOPyMP0k8hjRZVGKSkO() {
        void var2_-1;
        void var1_-1;
    }

    public static cdqy6rDItOpkxgOPyMP0k8hjRZVGKSkO[] values() {
        return (cdqy6rDItOpkxgOPyMP0k8hjRZVGKSkO[])Field13646.clone();
    }

    public static cdqy6rDItOpkxgOPyMP0k8hjRZVGKSkO valueOf(String string) {
        return Enum.valueOf(cdqy6rDItOpkxgOPyMP0k8hjRZVGKSkO.class, string);
    }

    private static String Method5011(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)689049777L ^ 0x291210B1;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1394009946 ^ (long)1394010021);
            int n2 = (int)((long)-1564125854 ^ (long)-1564125875) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)2072572133 ^ (long)2072568422) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

