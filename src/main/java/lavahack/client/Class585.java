/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.concurrent.Callable;
import lavahack.client.Class1189;
import lavahack.client.Class1984;
import lavahack.client.Class31;

public class Class585
implements Runnable {
    private final transient Class1189 Field10485;
    private transient boolean Field10486;
    private transient boolean Field10487;
    private int Field10488;

    private Class585(Class1189 class1189) {
        this.Field10485 = class1189;
    }

    @Override
    public void run() {
        if (this.Field10486) {
            throw new IllegalStateException("Already running");
        }
        this.Field10486 = true;
        this.Field10485.Field13385.start();
    }

    public Class585 Method2535() {
        if (this.Field10486) {
            throw new IllegalStateException("Already running");
        }
        this.Field10486 = true;
        this.Field10485.Field13385.start();
        return this;
    }

    public Class31 Method2536() {
        if (!this.Field10486) return new Class31(null, true);
        if (this.Field10487) {
            return new Class31(null, true);
        }
        if (!this.Field10485.Field13387) {
            this.Field10485.Field13385.stop();
            this.Field10486 = false;
            return new Class31(null, true);
        }
        this.Field10486 = false;
        return new Class31(this.Field10485.Field13386, false);
    }

    public void Method2537() {
        if (this.Field10487) {
            throw new IllegalStateException("Already paused");
        }
        this.Field10487 = true;
        this.Field10485.Field13385.suspend();
    }

    public void Method2538() {
        if (!this.Field10487) {
            throw new IllegalStateException("Not paused");
        }
        this.Field10487 = false;
        this.Field10485.Field13385.resume();
    }

    public Object Method2539() {
        if (!this.Field10486) throw new IllegalStateException("No running");
        if (this.Field10487) {
            throw new IllegalStateException("No running");
        }
        Class585.Method2546(this.Field10485.Field13385::join);
        this.Field10486 = false;
        return this.Field10485.Field13386;
    }

    public Object Method2540() {
        if (!this.Field10486) throw new IllegalStateException("No running");
        if (this.Field10487) {
            throw new IllegalStateException("No running");
        }
        while (!this.Field10485.Field13387) {
        }
        this.Field10486 = false;
        return this.Field10485.Field13386;
    }

    public boolean Method2541() {
        return this.Field10485.Field13387;
    }

    public boolean Method2542() {
        return this.Field10486;
    }

    public boolean Method2543() {
        return this.Field10487;
    }

    public static Class585 Method2544(Callable callable) {
        return new Class585(new Class1189(callable));
    }

    private static Object Method2545(Callable callable) {
        callable.call();
        return null;
    }

    private static void Method2546(Class1984 class1984) {
        class1984.Method7342();
    }

    private static String Method2547(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 183;
            cArray2[n] = (char)(cArray[n] ^ (0xDBA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

