/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import lavahack.client.Class1302;
import lavahack.client.Class1574;
import lavahack.client.Class1728;
import lavahack.client.Class551;
import lavahack.client.Class630;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Class641
extends Class630 {
    private final Logger Field10765 = LogManager.getLogger(Class641.class);
    private boolean Field10766;
    private boolean Field10767;
    private ScheduledExecutorService Field10768;
    private ScheduledFuture Field10769;
    private long Field10770 = TimeUnit.SECONDS.toNanos(60L);
    private boolean Field10771 = false;
    private final Object Field10772 = new Object();
    private int Field10773;

    public int Method521() {
        Object object = this.Field10772;
        return (int)TimeUnit.NANOSECONDS.toSeconds(this.Field10770);
    }

    public void Method522(int n) {
        Object object = this.Field10772;
        this.Field10770 = TimeUnit.SECONDS.toNanos(n);
        if (this.Field10770 <= 0L) {
            this.Field10765.trace("Connection lost timer stopped");
            this.Method528();
            return;
        }
        if (!this.Field10771) return;
        this.Field10765.trace("Connection lost timer restarted");
        ArrayList arrayList = new ArrayList(this.Method527());
        Iterator iterator = arrayList.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Method525();
                return;
            }
            Class1728 class1728 = (Class1728)iterator.next();
            if (!(class1728 instanceof Class1302)) continue;
            Class1302 class1302 = (Class1302)class1728;
            class1302.Method5293();
        }
    }

    protected void Method523() {
        Object object = this.Field10772;
        if (this.Field10768 == null) {
            if (this.Field10769 == null) return;
        }
        this.Field10771 = false;
        this.Field10765.trace("Connection lost timer stopped");
        this.Method528();
    }

    protected void Method524() {
        Object object = this.Field10772;
        if (this.Field10770 <= 0L) {
            this.Field10765.trace("Connection lost timer deactivated");
            return;
        }
        this.Field10765.trace("Connection lost timer started");
        this.Field10771 = true;
        this.Method525();
    }

    private void Method525() {
        this.Method528();
        this.Field10768 = Executors.newSingleThreadScheduledExecutor(new Class551("connectionLostChecker"));
        Class1574 class1574 = new Class1574(this);
        this.Field10769 = this.Field10768.scheduleAtFixedRate(class1574, this.Field10770, this.Field10770, TimeUnit.NANOSECONDS);
    }

    private void Method526(Class1728 class1728, long l) {
        if (!(class1728 instanceof Class1302)) {
            return;
        }
        Class1302 class1302 = (Class1302)class1728;
        if (class1302.Method5292() < l) {
            this.Field10765.trace("Closing connection due to no pong received: {}", (Object)class1302);
            class1302.Method540(1006, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection");
            return;
        }
        if (class1302.Method551()) {
            class1302.Method546();
            return;
        }
        this.Field10765.trace("Trying to ping a non open connection: {}", (Object)class1302);
    }

    protected abstract Collection Method527();

    private void Method528() {
        if (this.Field10768 != null) {
            this.Field10768.shutdownNow();
            this.Field10768 = null;
        }
        if (this.Field10769 == null) return;
        this.Field10769.cancel(false);
        this.Field10769 = null;
    }

    public boolean Method529() {
        return this.Field10766;
    }

    public void Method530(boolean bl) {
        this.Field10766 = bl;
    }

    public boolean Method531() {
        return this.Field10767;
    }

    public void Method532(boolean bl) {
        this.Field10767 = bl;
    }

    static Object Method533(Class641 class641) {
        return class641.Field10772;
    }

    static long Method534(Class641 class641) {
        return class641.Field10770;
    }

    static void Method535(Class641 class641, Class1728 class1728, long l) {
        class641.Method526(class1728, l);
    }

    private static String Method536(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 136;
            cArray2[n] = (char)(cArray[n] ^ (0x5604 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

