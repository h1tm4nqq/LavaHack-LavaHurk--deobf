//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import java.nio.*;

public class Class492
{
    private String Field10046 = "TheKisDevs & LavaHack Development owns you";
    
    private Class492() {
    }
    
    public static int Method2279(final ByteBuffer byteBuffer, final ByteBuffer byteBuffer2) {
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
    
    public static ByteBuffer Method2280() {
        return ByteBuffer.allocate(0);
    }
}
