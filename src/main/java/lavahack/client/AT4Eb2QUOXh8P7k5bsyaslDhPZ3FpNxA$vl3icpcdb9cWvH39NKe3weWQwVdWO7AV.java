/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV
extends Enum {
    public static final /* enum */ AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field9292 = new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV("Update", (int)((long)-1463226410 ^ (long)-1463226410));
    public static final /* enum */ AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field9293 = new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV("Tick", (int)-1090865283L ^ 0xBEFAB77C);
    private static final AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] Field9294;
    private String Field9295 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] values() {
        return (AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[])Field9294.clone();
    }

    public static AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV valueOf(String string) {
        return Enum.valueOf(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV() {
        void var2_-1;
        void var1_-1;
    }

    static {
        AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray = new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[(int)((long)-200663278 ^ (long)-200663277) << 1];
        aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[(int)((long)1944574035 ^ (long)1944574035)] = Field9292;
        aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[(int)-1083682022L ^ 0xBF68531B] = Field9293;
        Field9294 = aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray;
    }

    private static String Method1557(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1179938760 ^ (long)1179938760);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1021510745L ^ 0x3CE304A6);
            int n2 = ((int)2125035374L ^ 0x7EA97767) << 4;
            cArray2[n] = (char)(cArray[n] ^ ((int)208626683L ^ 0xC6F78FC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

