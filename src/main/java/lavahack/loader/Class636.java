//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import java.io.*;
import java.util.zip.*;

public class Class636
{
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
    
    private static final byte[] Method2754(final int n) {
        if ((n & 0x10) == 0x10) {
            return Class636.Field10738;
        }
        if ((n & 0x20) == 0x20) {
            return Class636.Field10740;
        }
        return Class636.Field10736;
    }
    
    private static final byte[] Method2755(final int n) {
        if ((n & 0x10) == 0x10) {
            return Class636.Field10739;
        }
        if ((n & 0x20) == 0x20) {
            return Class636.Field10741;
        }
        return Class636.Field10737;
    }
    
    private Class636() {
    }
    
    private static byte[] Method2756(final byte[] array, final byte[] array2, final int n, final int n2) {
        Method2757(array2, 0, n, array, 0, n2);
        return array;
    }
    
    private static byte[] Method2757(final byte[] array, final int n, final int n2, final byte[] array2, final int n3, final int n4) {
        final byte[] method2754 = Method2754(n4);
        final int n5 = ((n2 > 0) ? (array[n] << 24 >>> 8) : 0) | ((n2 > 1) ? (array[n + 1] << 24 >>> 16) : 0) | ((n2 > 2) ? (array[n + 2] << 24 >>> 24) : 0);
        switch (n2) {
            case 3: {
                array2[n3] = method2754[n5 >>> 18];
                array2[n3 + 1] = method2754[n5 >>> 12 & 0x3F];
                array2[n3 + 2] = method2754[n5 >>> 6 & 0x3F];
                array2[n3 + 3] = method2754[n5 & 0x3F];
                return array2;
            }
            case 2: {
                array2[n3] = method2754[n5 >>> 18];
                array2[n3 + 1] = method2754[n5 >>> 12 & 0x3F];
                array2[n3 + 2] = method2754[n5 >>> 6 & 0x3F];
                array2[n3 + 3] = 61;
                return array2;
            }
            case 1: {
                array2[n3] = method2754[n5 >>> 18];
                array2[n3 + 1] = method2754[n5 >>> 12 & 0x3F];
                array2[n3 + 3] = (array2[n3 + 2] = 61);
                return array2;
            }
            default: {
                return array2;
            }
        }
    }
    
    public static String Method2758(final byte[] array) {
        final String method2759 = Method2759(array, 0, array.length, 0);
        if (!Class636.Field10742 && method2759 == null) {
            throw new AssertionError();
        }
        return method2759;
    }
    
    public static String Method2759(final byte[] array, final int n, final int n2, final int n3) throws IOException {
        return new String(Method2760(array, n, n2, n3), "US-ASCII");
    }
    
    public static byte[] Method2760(final byte[] buf, final int off, final int len, final int n) throws IOException {
        if (buf == null) {
            throw new IllegalArgumentException("Cannot serialize a null array.");
        }
        if (off < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + off);
        }
        if (len < 0) {
            throw new IllegalArgumentException("Cannot have length offset: " + len);
        }
        if (off + len > buf.length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", off, len, buf.length));
        }
        if ((n & 0x2) != 0x0) {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            final Class1900 out = new Class1900((OutputStream)byteArrayOutputStream, 0x1 | n);
            final GZIPOutputStream gzipOutputStream = new GZIPOutputStream((OutputStream)out);
            gzipOutputStream.write(buf, off, len);
            gzipOutputStream.close();
            if (gzipOutputStream != null) {
                gzipOutputStream.close();
            }
            if (out != null) {
                out.close();
            }
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            return byteArrayOutputStream.toByteArray();
        }
        final boolean b = (n & 0x8) != 0x0;
        final byte[] array = new byte[len / 3 * 4 + ((len % 3 > 0) ? 4 : 0)];
        int i = 0;
        int n2 = 0;
        final int n3 = len - 2;
        int n4 = 0;
        while (i < n3) {
            Method2757(buf, i + off, 3, array, n2, n);
            n4 += 4;
            i += 3;
            n2 += 4;
        }
        if (i < len) {
            Method2757(buf, i + off, len - i, array, n2, n);
            n2 += 4;
        }
        if (n2 <= array.length - 1) {
            final byte[] array2 = new byte[n2];
            System.arraycopy(array, 0, array2, 0, n2);
            return array2;
        }
        return array;
    }
    
    private static int Method2761(final byte[] array, final int i, final byte[] array2, final int j, final int n) {
        if (array == null) {
            throw new IllegalArgumentException("Source array was null.");
        }
        if (array2 == null) {
            throw new IllegalArgumentException("Destination array was null.");
        }
        if (i < 0 || i + 3 >= array.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", array.length, i));
        }
        if (j < 0 || j + 2 >= array2.length) {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", array2.length, j));
        }
        final byte[] method2755 = Method2755(n);
        if (array[i + 2] == 61) {
            array2[j] = (byte)(((method2755[array[i]] & 0xFF) << 18 | (method2755[array[i + 1]] & 0xFF) << 12) >>> 16);
            return 1;
        }
        if (array[i + 3] == 61) {
            final int n2 = (method2755[array[i]] & 0xFF) << 18 | (method2755[array[i + 1]] & 0xFF) << 12 | (method2755[array[i + 2]] & 0xFF) << 6;
            array2[j] = (byte)(n2 >>> 16);
            array2[j + 1] = (byte)(n2 >>> 8);
            return 2;
        }
        final int n3 = (method2755[array[i]] & 0xFF) << 18 | (method2755[array[i + 1]] & 0xFF) << 12 | (method2755[array[i + 2]] & 0xFF) << 6 | (method2755[array[i + 3]] & 0xFF);
        array2[j] = (byte)(n3 >> 16);
        array2[j + 1] = (byte)(n3 >> 8);
        array2[j + 2] = (byte)n3;
        return 3;
    }
    
    static byte[] Method2762(final int n) {
        return Method2755(n);
    }
    
    static byte[] Method2763(final byte[] array, final byte[] array2, final int n, final int n2) {
        return Method2756(array, array2, n, n2);
    }
    
    static int Method2764(final byte[] array, final int n, final byte[] array2, final int n2, final int n3) {
        return Method2761(array, n, array2, n2, n3);
    }
    
    static {
        Field10735 = -5;
        Field10734 = "US-ASCII";
        Field10733 = 10;
        Field10732 = 61;
        Field10731 = 76;
        Field10730 = 32;
        Field10729 = 16;
        Field10728 = 8;
        Field10727 = 2;
        Field10726 = 1;
        Field10725 = 0;
        Field10742 = !Class636.class.desiredAssertionStatus();
        Field10736 = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
        Field10737 = new byte[] { -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9 };
        Field10738 = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
        Field10739 = new byte[] { -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9 };
        Field10740 = new byte[] { 45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122 };
        Field10741 = new byte[] { -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9 };
    }
    
    private static String Method2765(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xE7A ^ 0xBA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
