/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import java.io.IOException;
import java.nio.ByteBuffer;
import lavahack.loader.Class1654;

class Class1915
implements Runnable {
    private final Class1654 Field16902;
    final Class1654 Field16903;
    private int Field16904;

    Class1915(Class1654 class1654, Class1654 class16542) {
        this.Field16903 = class1654;
        this.Field16902 = class16542;
    }

    @Override
    public void run() {
        Thread.currentThread().setName("WebSocketWriteThread-" + Thread.currentThread().getId());
        this.Method7136();
        this.Method7137();
        Class1654.Method3374(this.Field16903, null);
    }

    private void Method7136() throws IOException {
        while (!Thread.interrupted()) {
            ByteBuffer byteBuffer = (ByteBuffer)Class1654.Method3375((Class1654)this.Field16903).Field13833.take();
            Class1654.Method3376(this.Field16903).write(byteBuffer.array(), 0, byteBuffer.limit());
            Class1654.Method3376(this.Field16903).flush();
        }
    }

    private void Method7137() {
        if (Class1654.Method3377(this.Field16903) == null) return;
        Class1654.Method3377(this.Field16903).close();
    }

    private static String Method7138(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 92;
            cArray2[n] = (char)(cArray[n] ^ (0x6B6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

