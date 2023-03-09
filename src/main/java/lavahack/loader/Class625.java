/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package lavahack.loader;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import lavahack.loader.Class1201;
import lavahack.loader.Class1282;
import lavahack.loader.Class1548;
import lavahack.loader.Class1966;
import lavahack.loader.Class2132;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Class625
extends Class1548 {
    private final Logger Field10669 = LogManager.getLogger(Class625.class);
    private boolean Field10670;
    private boolean Field10671;
    private ScheduledExecutorService Field10672;
    private ScheduledFuture Field10673;
    private long Field10674 = TimeUnit.SECONDS.toNanos(60L);
    private boolean Field10675 = false;
    private final Object Field10676 = new Object();
    private int Field10677;

    public int Method2675() {
        Object object = this.Field10676;
        return (int)TimeUnit.NANOSECONDS.toSeconds(this.Field10674);
    }

    public void Method2676(int n) {
        Object object = this.Field10676;
        this.Field10674 = TimeUnit.SECONDS.toNanos(n);
        if (this.Field10674 <= 0L) {
            this.Field10669.trace("Connection lost timer stopped");
            this.Method2682();
            return;
        }
        if (!this.Field10675) return;
        this.Field10669.trace("Connection lost timer restarted");
        ArrayList arrayList = new ArrayList(this.Method2681());
        Iterator iterator = arrayList.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Method2679();
                return;
            }
            Class1966 class1966 = (Class1966)iterator.next();
            if (!(class1966 instanceof Class1282)) continue;
            Class1282 class1282 = (Class1282)class1966;
            class1282.Method5215();
        }
    }

    protected void Method2677() {
        Object object = this.Field10676;
        if (this.Field10672 == null) {
            if (this.Field10673 == null) return;
        }
        this.Field10675 = false;
        this.Field10669.trace("Connection lost timer stopped");
        this.Method2682();
    }

    protected void Method2678() {
        Object object = this.Field10676;
        if (this.Field10674 <= 0L) {
            this.Field10669.trace("Connection lost timer deactivated");
            return;
        }
        this.Field10669.trace("Connection lost timer started");
        this.Field10675 = true;
        this.Method2679();
    }

    private void Method2679() {
        this.Method2682();
        this.Field10672 = Executors.newSingleThreadScheduledExecutor(new Class2132("connectionLostChecker"));
        Class1201 class1201 = new Class1201(this);
        this.Field10673 = this.Field10672.scheduleAtFixedRate(class1201, this.Field10674, this.Field10674, TimeUnit.NANOSECONDS);
    }

    private void Method2680(Class1966 class1966, long l) {
        if (!(class1966 instanceof Class1282)) {
            return;
        }
        Class1282 class1282 = (Class1282)class1966;
        if (class1282.Method5214() < l) {
            this.Field10669.trace("Closing connection due to no pong received: {}", (Object)class1282);
            class1282.Method3321(1006, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection");
            return;
        }
        if (class1282.Method3332()) {
            class1282.Method3327();
            return;
        }
        this.Field10669.trace("Trying to ping a non open connection: {}", (Object)class1282);
    }

    protected abstract Collection Method2681();

    private void Method2682() {
        if (this.Field10672 != null) {
            this.Field10672.shutdownNow();
            this.Field10672 = null;
        }
        if (this.Field10673 == null) return;
        this.Field10673.cancel(false);
        this.Field10673 = null;
    }

    public boolean Method2683() {
        return this.Field10670;
    }

    public void Method2684(boolean bl) {
        this.Field10670 = bl;
    }

    public boolean Method2685() {
        return this.Field10671;
    }

    public void Method2686(boolean bl) {
        this.Field10671 = bl;
    }

    static Object Method2687(Class625 class625) {
        return class625.Field10676;
    }

    static long Method2688(Class625 class625) {
        return class625.Field10674;
    }

    static void Method2689(Class625 class625, Class1966 class1966, long l) {
        class625.Method2680(class1966, l);
    }

    private static String Method2690(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 111;
            cArray2[n] = (char)(cArray[n] ^ (0x5009 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

