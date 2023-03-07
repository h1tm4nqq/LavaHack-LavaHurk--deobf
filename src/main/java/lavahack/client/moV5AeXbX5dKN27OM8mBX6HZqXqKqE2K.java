/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.File;

public class moV5AeXbX5dKN27OM8mBX6HZqXqKqE2K {
    private String Field12076 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static String Method3925(long l) {
        int n = ((int)112881844L ^ 0x6BA70B5) << 10;
        if (l < (0x28582L & 0x20105E01L)) {
            return l + " B";
        }
        int n2 = (int)(Math.log(l) / Math.log(Double.longBitsToDouble((long)46708753 ^ 0x4090000002C8B811L)));
        String string = "KMGTPE".charAt(n2 - ((int)672712304L ^ 0x2818C671)) + "i";
        Object[] objectArray = new Object[((int)705437033L ^ 0x2A0C1D68) << 1];
        objectArray[(int)((long)697568793 ^ (long)697568793)] = (double)l / Math.pow(Double.longBitsToDouble((long)348374186 ^ 0x4090000014C3C4AAL), n2);
        objectArray[(int)1263821905L ^ 0x4B546450] = string;
        return String.format("%3.0f %sB", objectArray);
    }

    public static boolean Method3926(File file, String string) {
        return moV5AeXbX5dKN27OM8mBX6HZqXqKqE2K.Method3927(file, new File(file, string));
    }

    public static boolean Method3927(File file, File file2) {
        return file2.getCanonicalPath().startsWith(file.getCanonicalPath() + File.separator);
    }

    private static String Method3928(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)457355835L ^ 0x1B42B23B;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1758331729 ^ (long)-1758331824);
            int n2 = (int)1335058349L ^ 0x4F935F1A;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1165987775 ^ (long)1165985944) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

