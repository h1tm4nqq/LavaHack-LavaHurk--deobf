/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.concurrent.Callable;

class ma9zo6UmHG7noLaYe920e2UQ4kD2ON6Z {
    final Thread Field13385;
    Object Field13386 = null;
    boolean Field13387 = (int)((long)-1436317887 ^ (long)-1436317887);
    private String Field13388 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    ma9zo6UmHG7noLaYe920e2UQ4kD2ON6Z(Callable callable) {
        this.Field13385 = new Thread(() -> this.Method4785(callable));
    }

    private void Method4785(Callable callable) {
        this.Field13386 = callable.call();
        this.Field13387 = (int)((long)-424613646 ^ (long)-424613645);
    }
}

