/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX;
import lavahack.client.slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;

class slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$1
implements Thread.UncaughtExceptionHandler {
    final slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX Field12633;
    final slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12634;
    private int Field12635;

    slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$1(slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX2) {
        this.Field12634 = slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        this.Field12633 = slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX2;
    }

    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {
        slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX.Method6353(this.Field12634.Field13382).error("Uncaught exception in thread {}: {}", (Object)thread.getName(), (Object)throwable);
    }

    private static String Method4277(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1354793005 ^ (long)1354793005);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-725572257L ^ 0xD4C0A5A0);
            int n2 = (int)1587059305L ^ 0x5E989A78;
            cArray2[n] = (char)(cArray[n] ^ ((int)1989372471L ^ 0x769365BE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

