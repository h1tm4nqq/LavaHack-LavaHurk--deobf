/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.IOException;
import java.nio.ByteBuffer;
import lavahack.client.Class168;

class Class1690
implements Runnable {
    private final Class168 Field15847;
    final Class168 Field15848;
    private int Field15849;

    Class1690(Class168 class168, Class168 class1682) {
        this.Field15848 = class168;
        this.Field15847 = class1682;
    }

    @Override
    public void run() {
        Thread.currentThread().setName("WebSocketWriteThread-" + Thread.currentThread().getId());
        this.Method6494();
        this.Method6495();
        Class168.Method593(this.Field15848, null);
    }

    private void Method6494() throws IOException {
        while (!Thread.interrupted()) {
            ByteBuffer byteBuffer = (ByteBuffer)Class168.Method594((Class168)this.Field15848).Field13943.take();
            Class168.Method595(this.Field15848).write(byteBuffer.array(), 0, byteBuffer.limit());
            Class168.Method595(this.Field15848).flush();
        }
    }

    private void Method6495() {
        if (Class168.Method596(this.Field15848) == null) return;
        Class168.Method596(this.Field15848).close();
    }

    private static String Method6496(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 250;
            cArray2[n] = (char)(cArray[n] ^ (0x519F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

