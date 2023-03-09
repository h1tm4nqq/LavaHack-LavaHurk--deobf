/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import lavahack.loader.Class902;

public class Class1105 {
    private static final CodingErrorAction Field12985 = CodingErrorAction.REPORT;
    private static final int[] Field12986 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 10, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 3, 11, 6, 6, 6, 5, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 0, 1, 2, 3, 5, 8, 7, 1, 1, 1, 4, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    private String Field12987 = "TheKisDevs & LavaHack Development owns you";

    private Class1105() {
    }

    public static byte[] Method4525(String string) {
        return string.getBytes(StandardCharsets.UTF_8);
    }

    public static byte[] Method4526(String string) {
        return string.getBytes(StandardCharsets.US_ASCII);
    }

    public static String Method4527(byte[] byArray) {
        return Class1105.Method4528(byArray, 0, byArray.length);
    }

    public static String Method4528(byte[] byArray, int n, int n2) {
        return new String(byArray, n, n2, StandardCharsets.US_ASCII);
    }

    public static String Method4529(byte[] byArray) throws Class902 {
        return Class1105.Method4530(ByteBuffer.wrap(byArray));
    }

    public static String Method4530(ByteBuffer byteBuffer) throws Class902 {
        CharsetDecoder charsetDecoder = StandardCharsets.UTF_8.newDecoder();
        charsetDecoder.onMalformedInput(Field12985);
        charsetDecoder.onUnmappableCharacter(Field12985);
        byteBuffer.mark();
        String string = charsetDecoder.decode(byteBuffer).toString();
        byteBuffer.reset();
        return string;
    }

    public static boolean Method4531(ByteBuffer byteBuffer, int n) {
        int n2 = byteBuffer.remaining();
        if (n2 < n) {
            return false;
        }
        int n3 = 0;
        int n4 = n;
        while (n4 < n2) {
            if ((n3 = Field12986[256 + (n3 << 4) + Field12986[0xFF & byteBuffer.get(n4)]]) == 1) {
                return false;
            }
            ++n4;
        }
        return true;
    }

    public static boolean Method4532(ByteBuffer byteBuffer) {
        return Class1105.Method4531(byteBuffer, 0);
    }
}

