/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12390 = new h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("BLANK", (int)((long)962333904 ^ (long)962333904));
    public static final /* enum */ h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12391 = new h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("BREAKABLE", (int)((long)-1090386867 ^ (long)-1090386868));
    public static final /* enum */ h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12392 = new h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("RESISTANT", ((int)-469353783L ^ 0xE4063AC8) << 1);
    public static final /* enum */ h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12393 = new h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("UNBREAKABLE", (int)((long)123138535 ^ (long)123138532));
    private static final h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field12394;
    private int Field12395;

    public static h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field12394.clone();
    }

    public static h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)1304022879 ^ (long)1304022878) << 2];
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-1243956104L ^ 0xB5DABC78] = Field12390;
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-16422427L ^ 0xFF0569E4] = Field12391;
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)-1681872133L ^ 0x9BC0AAFA) << 1] = Field12392;
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-1112564012 ^ (long)-1112564009)] = Field12393;
        Field12394 = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method4120(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-239544717L ^ 0xF1B8D673;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1712652704 ^ (long)1712652639);
            int n2 = ((int)-425806948L ^ 0xE69EB3CD) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)948497361 ^ (long)948500722) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

