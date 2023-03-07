/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field11530 = new bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Default", (int)20368817L ^ 0x136CDB1);
    public static final /* enum */ bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field11531 = new bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("EndFocused", (int)((long)-215564794 ^ (long)-215564793));
    public static final /* enum */ bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field11532 = new bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("EveryTime", (int)((long)33435515 ^ (long)33435514) << 1);
    private static final bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field11533;
    private int Field11534;

    public static bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field11533.clone();
    }

    public static bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)1244186072L ^ 0x4A28C5DB];
        bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-261935970L ^ 0xF0632C9E] = Field11530;
        bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)1085767625L ^ 0x40B77FC8] = Field11531;
        bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)1332924667L ^ 0x4F72D0FA) << 1] = Field11532;
        Field11533 = bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method3552(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-533038723L ^ 0xE03A797D;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1075765239L ^ 0xBFE120F6);
            int n2 = ((int)1468959195L ^ 0x578E899E) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1126068209L ^ 0xBCE18F32) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

