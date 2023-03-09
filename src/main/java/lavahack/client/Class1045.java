/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1187;
import lavahack.client.Class1622;

class Class1045
implements Thread.UncaughtExceptionHandler {
    final Class1622 Field12633;
    final Class1187 Field12634;
    private int Field12635;

    Class1045(Class1187 class1187, Class1622 class1622) {
        this.Field12634 = class1187;
        this.Field12633 = class1622;
    }

    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {
        Class1622.Method6353(this.Field12634.Field13382).error("Uncaught exception in thread {}: {}", (Object)thread.getName(), (Object)throwable);
    }

    private static String Method4277(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 17;
            cArray2[n] = (char)(cArray[n] ^ (0xF89 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

