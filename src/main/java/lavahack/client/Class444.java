//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.nio.*;
import java.nio.channels.*;
import java.io.*;

public class Class444
{
    private int Field9850;
    
    private Class444() {
        throw new IllegalStateException("Utility class");
    }
    
    public static boolean Method2094(final ByteBuffer byteBuffer, final Class1302 class1302, final ByteChannel byteChannel) throws IOException {
        byteBuffer.clear();
        final int read = byteChannel.read(byteBuffer);
        byteBuffer.flip();
        if (read == -1) {
            class1302.Method5283();
            return false;
        }
        return read != 0;
    }
    
    public static boolean Method2095(final ByteBuffer byteBuffer, final Class1302 class1302, final Class1608 class1303) throws IOException {
        byteBuffer.clear();
        final int method2485 = class1303.Method2485(byteBuffer);
        byteBuffer.flip();
        if (method2485 == -1) {
            class1302.Method5283();
            return false;
        }
        return class1303.Method2484();
    }
    
    public static boolean Method2096(final Class1302 class1302, final ByteChannel byteChannel) throws IOException {
        if (class1302 == null) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer)class1302.Field13943.peek();
        Class1608 class1303 = null;
        if (byteBuffer == null) {
            if (byteChannel instanceof Class1608) {
                class1303 = (Class1608)byteChannel;
                if (class1303.Method2482()) {
                    class1303.Method2483();
                }
            }
        }
        else {
            do {
                byteChannel.write(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    return false;
                }
                class1302.Field13943.poll();
                byteBuffer = (ByteBuffer)class1302.Field13943.peek();
            } while (byteBuffer != null);
        }
        if (class1302.Field13943.isEmpty() && class1302.Method553() && class1302.Method555() != null && class1302.Method555().Method4419() != null && class1302.Method555().Method4419() == Class803.Field11415) {
            class1302.Method5281();
        }
        return class1303 == null || !((Class1608)byteChannel).Method2482();
    }
    
    private static String Method2097(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2050 ^ 0x99));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
