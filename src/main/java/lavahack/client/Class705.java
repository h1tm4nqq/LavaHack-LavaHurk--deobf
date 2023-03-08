//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.io.*;
import java.util.zip.*;

public class Class705
{
    public static final int Field10995;
    public static final int Field10996;
    public static final int Field10997;
    public static final int Field10998;
    public static final int Field10999;
    public static final int Field11000;
    private static final int Field11001;
    private static final byte Field11002;
    private static final byte Field11003;
    private static final String Field11004;
    private static final byte Field11005;
    private static final byte[] Field11006;
    private static final byte[] Field11007;
    private static final byte[] Field11008;
    private static final byte[] Field11009;
    private static final byte[] Field11010;
    private static final byte[] Field11011;
    static final boolean Field11012;
    private String Field11013 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private static final byte[] Method2933(final int n) {
        if ((n & 0x10) == 0x10) {
            return Class705.Field11008;
        }
        if ((n & 0x20) == 0x20) {
            return Class705.Field11010;
        }
        return Class705.Field11006;
    }
    
    private static final byte[] Method2934(final int n) {
        if ((n & 0x10) == 0x10) {
            return Class705.Field11009;
        }
        if ((n & 0x20) == 0x20) {
            return Class705.Field11011;
        }
        return Class705.Field11007;
    }
    
    private Class705() {
    }
    
    private static byte[] Method2935(final byte[] array, final byte[] array2, final int n, final int n2) {
        Method2936(array2, 0, n, array, 0, n2);
        return array;
    }
    
    private static byte[] Method2936(final byte[] array, final int n, final int n2, final byte[] array2, final int n3, final int n4) {
        final byte[] method2933 = Method2933(n4);
        final int n5 = ((n2 > 0) ? (array[n] << 24 >>> 8) : 0) | ((n2 > 1) ? (array[n + 1] << 24 >>> 16) : 0) | ((n2 > 2) ? (array[n + 2] << 24 >>> 24) : 0);
        switch (n2) {
            case 3: {
                array2[n3] = method2933[n5 >>> 18];
                array2[n3 + 1] = method2933[n5 >>> 12 & 0x3F];
                array2[n3 + 2] = method2933[n5 >>> 6 & 0x3F];
                array2[n3 + 3] = method2933[n5 & 0x3F];
                return array2;
            }
            case 2: {
                array2[n3] = method2933[n5 >>> 18];
                array2[n3 + 1] = method2933[n5 >>> 12 & 0x3F];
                array2[n3 + 2] = method2933[n5 >>> 6 & 0x3F];
                array2[n3 + 3] = 61;
                return array2;
            }
            case 1: {
                array2[n3] = method2933[n5 >>> 18];
                array2[n3 + 1] = method2933[n5 >>> 12 & 0x3F];
                array2[n3 + 3] = (array2[n3 + 2] = 61);
                return array2;
            }
            default: {
                return array2;
            }
        }
    }
    
    public static String Method2937(final byte[] array) {
        final String method2938 = Method2938(array, 0, array.length, 0);
        if (!Class705.Field11012 && method2938 == null) {
            throw new AssertionError();
        }
        return method2938;
    }
    
    public static String Method2938(final byte[] array, final int n, final int n2, final int n3) throws IOException {
        return new String(Method2939(array, n, n2, n3), "US-ASCII");
    }
    
    public static byte[] Method2939(final byte[] buf, final int off, final int len, final int n) throws IOException {
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
            final Class474 out = new Class474((OutputStream)byteArrayOutputStream, 0x1 | n);
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
            Method2936(buf, i + off, 3, array, n2, n);
            n4 += 4;
            i += 3;
            n2 += 4;
        }
        if (i < len) {
            Method2936(buf, i + off, len - i, array, n2, n);
            n2 += 4;
        }
        if (n2 <= array.length - 1) {
            final byte[] array2 = new byte[n2];
            System.arraycopy(array, 0, array2, 0, n2);
            return array2;
        }
        return array;
    }
    
    private static int Method2940(final byte[] array, final int i, final byte[] array2, final int j, final int n) {
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
        final byte[] method2934 = Method2934(n);
        if (array[i + 2] == 61) {
            array2[j] = (byte)(((method2934[array[i]] & 0xFF) << 18 | (method2934[array[i + 1]] & 0xFF) << 12) >>> 16);
            return 1;
        }
        if (array[i + 3] == 61) {
            final int n2 = (method2934[array[i]] & 0xFF) << 18 | (method2934[array[i + 1]] & 0xFF) << 12 | (method2934[array[i + 2]] & 0xFF) << 6;
            array2[j] = (byte)(n2 >>> 16);
            array2[j + 1] = (byte)(n2 >>> 8);
            return 2;
        }
        final int n3 = (method2934[array[i]] & 0xFF) << 18 | (method2934[array[i + 1]] & 0xFF) << 12 | (method2934[array[i + 2]] & 0xFF) << 6 | (method2934[array[i + 3]] & 0xFF);
        array2[j] = (byte)(n3 >> 16);
        array2[j + 1] = (byte)(n3 >> 8);
        array2[j + 2] = (byte)n3;
        return 3;
    }
    
    static byte[] Method2941(final int n) {
        return Method2934(n);
    }
    
    static byte[] Method2942(final byte[] array, final byte[] array2, final int n, final int n2) {
        return Method2935(array, array2, n, n2);
    }
    
    static int Method2943(final byte[] array, final int n, final byte[] array2, final int n2, final int n3) {
        return Method2940(array, n, array2, n2, n3);
    }
    
    static {
        Field11005 = -5;
        Field11004 = "US-ASCII";
        Field11003 = 10;
        Field11002 = 61;
        Field11001 = 76;
        Field11000 = 32;
        Field10999 = 16;
        Field10998 = 8;
        Field10997 = 2;
        Field10996 = 1;
        Field10995 = 0;
        Field11012 = !Class705.class.desiredAssertionStatus();
        Field11006 = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
        Field11007 = new byte[] { -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9 };
        Field11008 = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
        Field11009 = new byte[] { -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9 };
        Field11010 = new byte[] { 45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122 };
        Field11011 = new byte[] { -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9 };
    }
    
    private static String Method2944(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x487C ^ 0xFA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
