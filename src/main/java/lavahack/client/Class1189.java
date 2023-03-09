/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.concurrent.Callable;

class Class1189 {
    final Thread Field13385 = new Thread(() -> this.Method4785(callable));
    Object Field13386 = null;
    boolean Field13387 = false;
    private String Field13388 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    Class1189(Callable callable) {
    }

    private void Method4785(Callable callable) {
        this.Field13386 = callable.call();
        this.Field13387 = true;
    }
}

