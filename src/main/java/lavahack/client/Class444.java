/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import lavahack.client.Class1302;
import lavahack.client.Class1608;
import lavahack.client.Class803;

public class Class444 {
    private int Field9850;

    private Class444() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean Method2094(ByteBuffer byteBuffer, Class1302 class1302, ByteChannel byteChannel) throws IOException {
        byteBuffer.clear();
        int n = byteChannel.read(byteBuffer);
        byteBuffer.flip();
        if (n == -1) {
            class1302.Method5283();
            return false;
        }
        if (n == 0) return false;
        return true;
    }

    public static boolean Method2095(ByteBuffer byteBuffer, Class1302 class1302, Class1608 class1608) throws IOException {
        byteBuffer.clear();
        int n = class1608.Method2485(byteBuffer);
        byteBuffer.flip();
        if (n != -1) return class1608.Method2484();
        class1302.Method5283();
        return false;
    }

    public static boolean Method2096(Class1302 class1302, ByteChannel byteChannel) throws IOException {
        if (class1302 == null) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer)class1302.Field13943.peek();
        Class1608 class1608 = null;
        if (byteBuffer == null) {
            if (byteChannel instanceof Class1608 && (class1608 = (Class1608)byteChannel).Method2482()) {
                class1608.Method2483();
            }
        } else {
            do {
                byteChannel.write(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    return false;
                }
                class1302.Field13943.poll();
            } while ((byteBuffer = (ByteBuffer)class1302.Field13943.peek()) != null);
        }
        if (class1302.Field13943.isEmpty() && class1302.Method553() && class1302.Method555() != null && class1302.Method555().Method4419() != null && class1302.Method555().Method4419() == Class803.Field11415) {
            class1302.Method5281();
        }
        if (class1608 == null) return true;
        if (!((Class1608)byteChannel).Method2482()) return true;
        return false;
    }

    private static String Method2097(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 153;
            cArray2[n] = (char)(cArray[n] ^ (0x2050 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

