/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import lavahack.client.Class23;

public class Class176 {
    private static final CodingErrorAction Field8783 = CodingErrorAction.REPORT;
    private static final int[] Field8784 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 10, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 3, 11, 6, 6, 6, 5, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 0, 1, 2, 3, 5, 8, 7, 1, 1, 1, 4, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    private int Field8785;

    private Class176() {
    }

    public static byte[] Method1094(String string) {
        return string.getBytes(StandardCharsets.UTF_8);
    }

    public static byte[] Method1095(String string) {
        return string.getBytes(StandardCharsets.US_ASCII);
    }

    public static String Method1096(byte[] byArray) {
        return Class176.Method1097(byArray, 0, byArray.length);
    }

    public static String Method1097(byte[] byArray, int n, int n2) {
        return new String(byArray, n, n2, StandardCharsets.US_ASCII);
    }

    public static String Method1098(byte[] byArray) throws Class23 {
        return Class176.Method1099(ByteBuffer.wrap(byArray));
    }

    public static String Method1099(ByteBuffer byteBuffer) throws Class23 {
        CharsetDecoder charsetDecoder = StandardCharsets.UTF_8.newDecoder();
        charsetDecoder.onMalformedInput(Field8783);
        charsetDecoder.onUnmappableCharacter(Field8783);
        byteBuffer.mark();
        String string = charsetDecoder.decode(byteBuffer).toString();
        byteBuffer.reset();
        return string;
    }

    public static boolean Method1100(ByteBuffer byteBuffer, int n) {
        int n2 = byteBuffer.remaining();
        if (n2 < n) {
            return false;
        }
        int n3 = 0;
        int n4 = n;
        while (n4 < n2) {
            if ((n3 = Field8784[256 + (n3 << 4) + Field8784[0xFF & byteBuffer.get(n4)]]) == 1) {
                return false;
            }
            ++n4;
        }
        return true;
    }

    public static boolean Method1101(ByteBuffer byteBuffer) {
        return Class176.Method1100(byteBuffer, 0);
    }
}

