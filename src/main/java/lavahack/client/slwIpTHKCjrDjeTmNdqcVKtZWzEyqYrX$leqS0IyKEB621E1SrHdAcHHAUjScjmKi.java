/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.nio.ByteBuffer;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import lavahack.client.rWOxkXahfy879ZWg1QDRw2hroxYTBucF;
import lavahack.client.slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX;
import lavahack.client.slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$1;

public class slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Thread {
    private BlockingQueue Field13380;
    static final boolean Field13381 = !slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX.class.desiredAssertionStatus() ? (int)((long)1938297713 ^ (long)1938297712) : (int)-1131046056L ^ 0xBC959B58;
    final slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX Field13382;
    private int Field13383;

    public slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX2) {
        this.Field13382 = slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX2;
        this.Field13380 = new LinkedBlockingQueue();
        this.setName("WebSocketWorker-" + this.getId());
        this.setUncaughtExceptionHandler(new slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$1(this, slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX2));
    }

    public void Method4779(rWOxkXahfy879ZWg1QDRw2hroxYTBucF rWOxkXahfy879ZWg1QDRw2hroxYTBucF2) throws InterruptedException {
        this.Field13380.put(rWOxkXahfy879ZWg1QDRw2hroxYTBucF2);
    }

    @Override
    public void run() {
        rWOxkXahfy879ZWg1QDRw2hroxYTBucF rWOxkXahfy879ZWg1QDRw2hroxYTBucF2 = null;
        while (true) {
            rWOxkXahfy879ZWg1QDRw2hroxYTBucF2 = (rWOxkXahfy879ZWg1QDRw2hroxYTBucF)this.Field13380.take();
            ByteBuffer byteBuffer = (ByteBuffer)rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Field13944.poll();
            if (!Field13381 && byteBuffer == null) {
                throw new AssertionError();
            }
            this.Method4780(rWOxkXahfy879ZWg1QDRw2hroxYTBucF2, byteBuffer);
            rWOxkXahfy879ZWg1QDRw2hroxYTBucF2 = null;
        }
    }

    private void Method4780(rWOxkXahfy879ZWg1QDRw2hroxYTBucF rWOxkXahfy879ZWg1QDRw2hroxYTBucF2, ByteBuffer byteBuffer) throws InterruptedException {
        rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Method5272(byteBuffer);
        slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX.Method6355(this.Field13382, byteBuffer);
    }

    private static String Method4781(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1646753177L ^ 0x62277599;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-2033320808L ^ 0x86CDFC67);
            int n2 = ((int)732434474L ^ 0x2BA81051) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1899096246 ^ (long)-1899095437) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

