/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.nio.ByteBuffer;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import lavahack.client.Class1045;
import lavahack.client.Class1302;
import lavahack.client.Class1622;

public class Class1187
extends Thread {
    private BlockingQueue Field13380;
    static final boolean Field13381 = !Class1622.class.desiredAssertionStatus();
    final Class1622 Field13382;
    private int Field13383;

    public Class1187(Class1622 class1622) {
        this.Field13382 = class1622;
        this.Field13380 = new LinkedBlockingQueue();
        this.setName("WebSocketWorker-" + this.getId());
        this.setUncaughtExceptionHandler(new Class1045(this, class1622));
    }

    public void Method4779(Class1302 class1302) throws InterruptedException {
        this.Field13380.put(class1302);
    }

    @Override
    public void run() {
        Class1302 class1302 = null;
        while (true) {
            class1302 = (Class1302)this.Field13380.take();
            ByteBuffer byteBuffer = (ByteBuffer)class1302.Field13944.poll();
            if (!Field13381 && byteBuffer == null) {
                throw new AssertionError();
            }
            this.Method4780(class1302, byteBuffer);
            class1302 = null;
        }
    }

    private void Method4780(Class1302 class1302, ByteBuffer byteBuffer) throws InterruptedException {
        class1302.Method5272(byteBuffer);
        Class1622.Method6355(this.Field13382, byteBuffer);
    }

    private static String Method4781(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 246;
            cArray2[n] = (char)(cArray[n] ^ (0x34E4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

