//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.concurrent.*;
import java.nio.*;

public class Class1187 extends Thread
{
    private BlockingQueue Field13380;
    static final boolean Field13381;
    final Class1622 Field13382;
    private int Field13383;
    
    public Class1187(final Class1622 field13382) {
        this.Field13382 = field13382;
        this.Field13380 = new LinkedBlockingQueue();
        this.setName("WebSocketWorker-" + this.getId());
        this.setUncaughtExceptionHandler((UncaughtExceptionHandler)new Class1045(this, field13382));
    }
    
    public void Method4779(final Class1302 class1302) throws InterruptedException {
        this.Field13380.put(class1302);
    }
    
    @Override
    public void run() {
        while (true) {
            final Class1302 class1302 = this.Field13380.take();
            final ByteBuffer byteBuffer = (ByteBuffer)class1302.Field13944.poll();
            if (!Class1187.Field13381 && byteBuffer == null) {
                break;
            }
            this.Method4780(class1302, byteBuffer);
        }
        throw new AssertionError();
    }
    
    private void Method4780(final Class1302 class1302, final ByteBuffer byteBuffer) throws InterruptedException {
        class1302.Method5272(byteBuffer);
        Class1622.Method6355(this.Field13382, byteBuffer);
    }
    
    static {
        Field13381 = !Class1622.class.desiredAssertionStatus();
    }
    
    private static String Method4781(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x34E4 ^ 0xF6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
