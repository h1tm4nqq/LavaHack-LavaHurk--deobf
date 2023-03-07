/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends Enum {
    public static final /* enum */ jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field16467 = new jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("None", (int)((long)1038479370 ^ (long)1038479370));
    public static final /* enum */ jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field16468 = new jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Full", (int)-1902203936L ^ 0x8E9EABE1);
    public static final /* enum */ jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field16469 = new jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Smart", (int)((long)390205421 ^ (long)390205420) << 1);
    private static final jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field16470;
    private String Field16471 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] values() {
        return (jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field16470.clone();
    }

    public static jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf valueOf(String string) {
        return Enum.valueOf(jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        void var2_-1;
        void var1_-1;
    }

    static {
        jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[(int)1519164925L ^ 0x5A8C9DFE];
        jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)2099298238L ^ 0x7D20BFBE] = Field16467;
        jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)900990287L ^ 0x35B4054E] = Field16468;
        jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[((int)-1283818945L ^ 0xB37A7A3E) << 1] = Field16469;
        Field16470 = jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
    }

    private static String Method6900(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1126638822 ^ (long)-1126638822);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)507091747 ^ (long)507091932);
            int n2 = (int)((long)395527808 ^ (long)395527879);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1609542599 ^ (long)1609546042) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

