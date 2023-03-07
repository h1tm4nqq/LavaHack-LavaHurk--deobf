/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import java.io.IOException;
import java.nio.ByteBuffer;
import lavahack.loader.Z9isRG6BYbrxGGNGITuabJZMH69DuRSA;

class Z9isRG6BYbrxGGNGITuabJZMH69DuRSA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements Runnable {
    private final Z9isRG6BYbrxGGNGITuabJZMH69DuRSA Field16902;
    final Z9isRG6BYbrxGGNGITuabJZMH69DuRSA Field16903;
    private int Field16904;

    Z9isRG6BYbrxGGNGITuabJZMH69DuRSA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(Z9isRG6BYbrxGGNGITuabJZMH69DuRSA z9isRG6BYbrxGGNGITuabJZMH69DuRSA, Z9isRG6BYbrxGGNGITuabJZMH69DuRSA z9isRG6BYbrxGGNGITuabJZMH69DuRSA2) {
        this.Field16903 = z9isRG6BYbrxGGNGITuabJZMH69DuRSA;
        this.Field16902 = z9isRG6BYbrxGGNGITuabJZMH69DuRSA2;
    }

    @Override
    public void run() {
        Thread.currentThread().setName("WebSocketWriteThread-" + Thread.currentThread().getId());
        this.Method7136();
        this.Method7137();
        Z9isRG6BYbrxGGNGITuabJZMH69DuRSA.Method3374(this.Field16903, null);
    }

    private void Method7136() throws IOException {
        while (!Thread.interrupted()) {
            ByteBuffer byteBuffer = (ByteBuffer)Z9isRG6BYbrxGGNGITuabJZMH69DuRSA.Method3375((Z9isRG6BYbrxGGNGITuabJZMH69DuRSA)this.Field16903).Field13833.take();
            Z9isRG6BYbrxGGNGITuabJZMH69DuRSA.Method3376(this.Field16903).write(byteBuffer.array(), (int)1413698786L ^ 0x544354E2, byteBuffer.limit());
            Z9isRG6BYbrxGGNGITuabJZMH69DuRSA.Method3376(this.Field16903).flush();
        }
    }

    private void Method7137() {
        if (Z9isRG6BYbrxGGNGITuabJZMH69DuRSA.Method3377(this.Field16903) == null) return;
        Z9isRG6BYbrxGGNGITuabJZMH69DuRSA.Method3377(this.Field16903).close();
    }

    private static String Method7138(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1145626535L ^ 0xBBB72059;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1824859204 ^ (long)1824859323);
            int n2 = ((int)-449527906L ^ 0xE534BF89) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1880576972 ^ (long)-1880576145) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

