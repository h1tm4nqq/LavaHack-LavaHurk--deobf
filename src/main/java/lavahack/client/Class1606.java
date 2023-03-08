//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.nio.*;

public class Class1606
{
    private String Field15506 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1606() {
    }
    
    public static int Method6268(final ByteBuffer byteBuffer, final ByteBuffer byteBuffer2) {
        if (byteBuffer == null || byteBuffer2 == null) {
            throw new IllegalArgumentException();
        }
        final int remaining = byteBuffer.remaining();
        final int remaining2 = byteBuffer2.remaining();
        if (remaining > remaining2) {
            final int min = Math.min(remaining, remaining2);
            byteBuffer.limit(min);
            byteBuffer2.put(byteBuffer);
            return min;
        }
        byteBuffer2.put(byteBuffer);
        return remaining;
    }
    
    public static ByteBuffer Method6269() {
        return ByteBuffer.allocate(0);
    }
}
