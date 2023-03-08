//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.nio.*;
import java.nio.charset.*;

public class Class176
{
    private static final CodingErrorAction Field8783;
    private static final int[] Field8784;
    private int Field8785;
    
    private Class176() {
    }
    
    public static byte[] Method1094(final String s) {
        return s.getBytes(StandardCharsets.UTF_8);
    }
    
    public static byte[] Method1095(final String s) {
        return s.getBytes(StandardCharsets.US_ASCII);
    }
    
    public static String Method1096(final byte[] array) {
        return Method1097(array, 0, array.length);
    }
    
    public static String Method1097(final byte[] bytes, final int offset, final int length) {
        return new String(bytes, offset, length, StandardCharsets.US_ASCII);
    }
    
    public static String Method1098(final byte[] array) throws Class23 {
        return Method1099(ByteBuffer.wrap(array));
    }
    
    public static String Method1099(final ByteBuffer in) throws Class23 {
        final CharsetDecoder decoder = StandardCharsets.UTF_8.newDecoder();
        decoder.onMalformedInput(Class176.Field8783);
        decoder.onUnmappableCharacter(Class176.Field8783);
        in.mark();
        final String string = decoder.decode(in).toString();
        in.reset();
        return string;
    }
    
    public static boolean Method1100(final ByteBuffer byteBuffer, final int n) {
        final int remaining = byteBuffer.remaining();
        if (remaining < n) {
            return false;
        }
        int n2 = 0;
        for (int i = n; i < remaining; ++i) {
            n2 = Class176.Field8784[256 + (n2 << 4) + Class176.Field8784[0xFF & byteBuffer.get(i)]];
            if (n2 == 1) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean Method1101(final ByteBuffer byteBuffer) {
        return Method1100(byteBuffer, 0);
    }
    
    static {
        Field8783 = CodingErrorAction.REPORT;
        Field8784 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 10, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 3, 11, 6, 6, 6, 5, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 0, 1, 2, 3, 5, 8, 7, 1, 1, 1, 4, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    }
}
