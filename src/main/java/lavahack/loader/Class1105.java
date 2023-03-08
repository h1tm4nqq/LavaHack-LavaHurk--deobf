//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import java.nio.*;
import java.nio.charset.*;

public class Class1105
{
    private static final CodingErrorAction Field12985;
    private static final int[] Field12986;
    private String Field12987 = "TheKisDevs & LavaHack Development owns you";
    
    private Class1105() {
    }
    
    public static byte[] Method4525(final String s) {
        return s.getBytes(StandardCharsets.UTF_8);
    }
    
    public static byte[] Method4526(final String s) {
        return s.getBytes(StandardCharsets.US_ASCII);
    }
    
    public static String Method4527(final byte[] array) {
        return Method4528(array, 0, array.length);
    }
    
    public static String Method4528(final byte[] bytes, final int offset, final int length) {
        return new String(bytes, offset, length, StandardCharsets.US_ASCII);
    }
    
    public static String Method4529(final byte[] array) throws Class902 {
        return Method4530(ByteBuffer.wrap(array));
    }
    
    public static String Method4530(final ByteBuffer in) throws Class902 {
        final CharsetDecoder decoder = StandardCharsets.UTF_8.newDecoder();
        decoder.onMalformedInput(Class1105.Field12985);
        decoder.onUnmappableCharacter(Class1105.Field12985);
        in.mark();
        final String string = decoder.decode(in).toString();
        in.reset();
        return string;
    }
    
    public static boolean Method4531(final ByteBuffer byteBuffer, final int n) {
        final int remaining = byteBuffer.remaining();
        if (remaining < n) {
            return false;
        }
        int n2 = 0;
        for (int i = n; i < remaining; ++i) {
            n2 = Class1105.Field12986[256 + (n2 << 4) + Class1105.Field12986[0xFF & byteBuffer.get(i)]];
            if (n2 == 1) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean Method4532(final ByteBuffer byteBuffer) {
        return Method4531(byteBuffer, 0);
    }
    
    static {
        Field12985 = CodingErrorAction.REPORT;
        Field12986 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 10, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 3, 11, 6, 6, 6, 5, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 0, 1, 2, 3, 5, 8, 7, 1, 1, 1, 4, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    }
}
