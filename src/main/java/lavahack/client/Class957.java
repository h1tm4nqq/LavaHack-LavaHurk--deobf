/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.File;

public class Class957 {
    private String Field12076 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static String Method3925(long l) {
        int n = 1024;
        if (l < 1024L) {
            return l + " B";
        }
        int n2 = (int)(Math.log(l) / Math.log(Double.longBitsToDouble((long)46708753 ^ 0x4090000002C8B811L)));
        String string = "KMGTPE".charAt(n2 - 1) + "i";
        return String.format("%3.0f %sB", (double)l / Math.pow(Double.longBitsToDouble((long)348374186 ^ 0x4090000014C3C4AAL), n2), string);
    }

    public static boolean Method3926(File file, String string) {
        return Class957.Method3927(file, new File(file, string));
    }

    public static boolean Method3927(File file, File file2) {
        return file2.getCanonicalPath().startsWith(file.getCanonicalPath() + File.separator);
    }

    private static String Method3928(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 183;
            cArray2[n] = (char)(cArray[n] ^ (0xE4E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

