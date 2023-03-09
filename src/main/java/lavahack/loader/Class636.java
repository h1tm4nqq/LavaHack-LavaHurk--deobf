/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
import lavahack.loader.Class1900;

public class Class636 {
    public static final int Field10725;
    public static final int Field10726;
    public static final int Field10727;
    public static final int Field10728;
    public static final int Field10729;
    public static final int Field10730;
    private static final int Field10731;
    private static final byte Field10732;
    private static final byte Field10733;
    private static final String Field10734;
    private static final byte Field10735;
    private static final byte[] Field10736;
    private static final byte[] Field10737;
    private static final byte[] Field10738;
    private static final byte[] Field10739;
    private static final byte[] Field10740;
    private static final byte[] Field10741;
    static final boolean Field10742;
    private int Field10743;

    private static final byte[] Method2754(int n) {
        if ((n & 0x10) == 16) {
            return Field10738;
        }
        if ((n & 0x20) != 32) return Field10736;
        return Field10740;
    }

    private static final byte[] Method2755(int n) {
        if ((n & 0x10) == 16) {
            return Field10739;
        }
        if ((n & 0x20) != 32) return Field10737;
        return Field10741;
    }

    private Class636() {
    }

    private static byte[] Method2756(byte[] byArray, byte[] byArray2, int n, int n2) {
        Class636.Method2757(byArray2, 0, n, byArray, 0, n2);
        return byArray;
    }

    private static byte[] Method2757(byte[] byArray, int n, int n2, byte[] byArray2, int n3, int n4) {
        byte[] byArray3 = Class636.Method2754(n4);
        int n5 = (n2 > 0 ? byArray[n] << 24 >>> 8 : 0) | (n2 > 1 ? byArray[n + 1] << 24 >>> 16 : 0) | (n2 > 2 ? byArray[n + 2] << 24 >>> 24 : 0);
        switch (n2) {
            case 3: {
                byArray2[n3] = byArray3[n5 >>> 18];
                byArray2[n3 + 1] = byArray3[n5 >>> 12 & 0x3F];
                byArray2[n3 + 2] = byArray3[n5 >>> 6 & 0x3F];
                byArray2[n3 + 3] = byArray3[n5 & 0x3F];
                return byArray2;
            }
            case 2: {
                byArray2[n3] = byArray3[n5 >>> 18];
                byArray2[n3 + 1] = byArray3[n5 >>> 12 & 0x3F];
                byArray2[n3 + 2] = byArray3[n5 >>> 6 & 0x3F];
                byArray2[n3 + 3] = 61;
                return byArray2;
            }
            case 1: {
                byArray2[n3] = byArray3[n5 >>> 18];
                byArray2[n3 + 1] = byArray3[n5 >>> 12 & 0x3F];
                byArray2[n3 + 2] = 61;
                byArray2[n3 + 3] = 61;
                return byArray2;
            }
        }
        return byArray2;
    }

    public static String Method2758(byte[] byArray) {
        String string = null;
        string = Class636.Method2759(byArray, 0, byArray.length, 0);
        if (Field10742) return string;
        if (string != null) return string;
        throw new AssertionError();
    }

    public static String Method2759(byte[] byArray, int n, int n2, int n3) throws IOException {
        byte[] byArray2 = Class636.Method2760(byArray, n, n2, n3);
        return new String(byArray2, "US-ASCII");
    }

    public static byte[] Method2760(byte[] byArray, int n, int n2, int n3) throws IOException {
        int n4;
        if (byArray == null) {
            throw new IllegalArgumentException("Cannot serialize a null array.");
        }
        if (n < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + n);
        }
        if (n2 < 0) {
            throw new IllegalArgumentException("Cannot have length offset: " + n2);
        }
        if (n + n2 > byArray.length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", n, n2, byArray.length));
        }
        if ((n3 & 2) != 0) {
            ByteArrayOutputStream byteArrayOutputStream = null;
            GZIPOutputStream gZIPOutputStream = null;
            Class1900 class1900 = null;
            byteArrayOutputStream = new ByteArrayOutputStream();
            class1900 = new Class1900(byteArrayOutputStream, 1 | n3);
            gZIPOutputStream = new GZIPOutputStream(class1900);
            gZIPOutputStream.write(byArray, n, n2);
            gZIPOutputStream.close();
            if (gZIPOutputStream != null) {
                gZIPOutputStream.close();
            }
            if (class1900 != null) {
                class1900.close();
            }
            if (byteArrayOutputStream == null) return byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        }
        boolean bl = (n3 & 8) != 0;
        int n5 = n2 / 3 * 4 + (n2 % 3 > 0 ? 4 : 0);
        byte[] byArray2 = new byte[n5];
        int n6 = 0;
        int n7 = n2 - 2;
        int n8 = 0;
        for (n4 = 0; n4 < n7; n8 += 4, n4 += 3, n6 += 4) {
            Class636.Method2757(byArray, n4 + n, 3, byArray2, n6, n3);
        }
        if (n4 < n2) {
            Class636.Method2757(byArray, n4 + n, n2 - n4, byArray2, n6, n3);
            n6 += 4;
        }
        if (n6 > byArray2.length - 1) return byArray2;
        byte[] byArray3 = new byte[n6];
        System.arraycopy(byArray2, 0, byArray3, 0, n6);
        return byArray3;
    }

    private static int Method2761(byte[] byArray, int n, byte[] byArray2, int n2, int n3) {
        if (byArray == null) {
            throw new IllegalArgumentException("Source array was null.");
        }
        if (byArray2 == null) {
            throw new IllegalArgumentException("Destination array was null.");
        }
        if (n < 0 || n + 3 >= byArray.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", byArray.length, n));
        }
        if (n2 < 0 || n2 + 2 >= byArray2.length) {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", byArray2.length, n2));
        }
        byte[] byArray3 = Class636.Method2755(n3);
        if (byArray[n + 2] == 61) {
            int n4 = (byArray3[byArray[n]] & 0xFF) << 18 | (byArray3[byArray[n + 1]] & 0xFF) << 12;
            byArray2[n2] = (byte)(n4 >>> 16);
            return 1;
        }
        if (byArray[n + 3] == 61) {
            int n5 = (byArray3[byArray[n]] & 0xFF) << 18 | (byArray3[byArray[n + 1]] & 0xFF) << 12 | (byArray3[byArray[n + 2]] & 0xFF) << 6;
            byArray2[n2] = (byte)(n5 >>> 16);
            byArray2[n2 + 1] = (byte)(n5 >>> 8);
            return 2;
        }
        int n6 = (byArray3[byArray[n]] & 0xFF) << 18 | (byArray3[byArray[n + 1]] & 0xFF) << 12 | (byArray3[byArray[n + 2]] & 0xFF) << 6 | byArray3[byArray[n + 3]] & 0xFF;
        byArray2[n2] = (byte)(n6 >> 16);
        byArray2[n2 + 1] = (byte)(n6 >> 8);
        byArray2[n2 + 2] = (byte)n6;
        return 3;
    }

    static byte[] Method2762(int n) {
        return Class636.Method2755(n);
    }

    static byte[] Method2763(byte[] byArray, byte[] byArray2, int n, int n2) {
        return Class636.Method2756(byArray, byArray2, n, n2);
    }

    static int Method2764(byte[] byArray, int n, byte[] byArray2, int n2, int n3) {
        return Class636.Method2761(byArray, n, byArray2, n2, n3);
    }

    static {
        Field10735 = (byte)-5;
        Field10734 = "US-ASCII";
        Field10733 = (byte)10;
        Field10732 = (byte)61;
        Field10731 = 76;
        Field10730 = 32;
        Field10729 = 16;
        Field10728 = 8;
        Field10727 = 2;
        Field10726 = 1;
        Field10725 = 0;
        Field10742 = !Class636.class.desiredAssertionStatus();
        Field10736 = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        Field10737 = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
        Field10738 = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        Field10739 = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
        Field10740 = new byte[]{45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
        Field10741 = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    }

    private static String Method2765(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 186;
            cArray2[n] = (char)(cArray[n] ^ (0xE7A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

