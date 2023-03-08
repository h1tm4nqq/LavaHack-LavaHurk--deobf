//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import java.nio.*;
import java.io.*;

class Class1915 implements Runnable
{
    private final Class1654 Field16902;
    final Class1654 Field16903;
    private int Field16904;
    
    Class1915(final Class1654 field16903, final Class1654 field16904) {
        this.Field16903 = field16903;
        this.Field16902 = field16904;
    }
    
    @Override
    public void run() {
        Thread.currentThread().setName("WebSocketWriteThread-" + Thread.currentThread().getId());
        this.Method7136();
        this.Method7137();
        Class1654.Method3374(this.Field16903, (Thread)null);
    }
    
    private void Method7136() throws IOException {
        while (!Thread.interrupted()) {
            final ByteBuffer byteBuffer = Class1654.Method3375(this.Field16903).Field13833.take();
            Class1654.Method3376(this.Field16903).write(byteBuffer.array(), 0, byteBuffer.limit());
            Class1654.Method3376(this.Field16903).flush();
        }
    }
    
    private void Method7137() {
        if (Class1654.Method3377(this.Field16903) != null) {
            Class1654.Method3377(this.Field16903).close();
        }
    }
    
    private static String Method7138(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6B6 ^ 0x5C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
