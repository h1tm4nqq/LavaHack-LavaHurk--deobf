//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.nio.*;
import java.io.*;

class Class1690 implements Runnable
{
    private final Class168 Field15847;
    final Class168 Field15848;
    private int Field15849;
    
    Class1690(final Class168 field15848, final Class168 field15849) {
        this.Field15848 = field15848;
        this.Field15847 = field15849;
    }
    
    @Override
    public void run() {
        Thread.currentThread().setName("WebSocketWriteThread-" + Thread.currentThread().getId());
        this.Method6494();
        this.Method6495();
        Class168.Method593(this.Field15848, (Thread)null);
    }
    
    private void Method6494() throws IOException {
        while (!Thread.interrupted()) {
            final ByteBuffer byteBuffer = Class168.Method594(this.Field15848).Field13943.take();
            Class168.Method595(this.Field15848).write(byteBuffer.array(), 0, byteBuffer.limit());
            Class168.Method595(this.Field15848).flush();
        }
    }
    
    private void Method6495() {
        if (Class168.Method596(this.Field15848) != null) {
            Class168.Method596(this.Field15848).close();
        }
    }
    
    private static String Method6496(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x519F ^ 0xFA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
