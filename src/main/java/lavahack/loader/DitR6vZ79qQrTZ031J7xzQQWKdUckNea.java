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
import lavahack.loader.ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy;
import lavahack.loader.DitR6vZ79qQrTZ031J7xzQQWKdUckNea$1;
import lavahack.loader.Fyymy8MPWe9GTgSZGRyDRSPKb14FqQfA;
import lavahack.loader.ItyDJooi2U23sHYdNmIhbJFmcHy1UFNl;
import lavahack.loader.uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class DitR6vZ79qQrTZ031J7xzQQWKdUckNea
extends ItyDJooi2U23sHYdNmIhbJFmcHy1UFNl {
    private final Logger Field10669 = LogManager.getLogger(DitR6vZ79qQrTZ031J7xzQQWKdUckNea.class);
    private boolean Field10670;
    private boolean Field10671;
    private ScheduledExecutorService Field10672;
    private ScheduledFuture Field10673;
    private long Field10674 = TimeUnit.SECONDS.toNanos(0x1A04023CL & 0x4448943CL);
    private boolean Field10675 = (int)1644113878L ^ 0x61FF2FD6;
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
            ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy aRQmBQvY5BCKjQHAEtWILloZwAOUZwhy = (ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy)iterator.next();
            if (!(aRQmBQvY5BCKjQHAEtWILloZwAOUZwhy instanceof uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x)) continue;
            uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2 = (uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x)aRQmBQvY5BCKjQHAEtWILloZwAOUZwhy;
            uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Method5215();
        }
    }

    protected void Method2677() {
        Object object = this.Field10676;
        if (this.Field10672 == null) {
            if (this.Field10673 == null) return;
        }
        this.Field10675 = (int)2040767114L ^ 0x79A3A28A;
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
        this.Field10675 = (int)((long)-792995917 ^ (long)-792995918);
        this.Method2679();
    }

    private void Method2679() {
        this.Method2682();
        this.Field10672 = Executors.newSingleThreadScheduledExecutor(new Fyymy8MPWe9GTgSZGRyDRSPKb14FqQfA("connectionLostChecker"));
        DitR6vZ79qQrTZ031J7xzQQWKdUckNea$1 ditR6vZ79qQrTZ031J7xzQQWKdUckNea$1 = new DitR6vZ79qQrTZ031J7xzQQWKdUckNea$1(this);
        this.Field10673 = this.Field10672.scheduleAtFixedRate(ditR6vZ79qQrTZ031J7xzQQWKdUckNea$1, this.Field10674, this.Field10674, TimeUnit.NANOSECONDS);
    }

    private void Method2680(ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy aRQmBQvY5BCKjQHAEtWILloZwAOUZwhy, long l) {
        if (!(aRQmBQvY5BCKjQHAEtWILloZwAOUZwhy instanceof uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x)) {
            return;
        }
        uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2 = (uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x)aRQmBQvY5BCKjQHAEtWILloZwAOUZwhy;
        if (uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Method5214() < l) {
            this.Field10669.trace("Closing connection due to no pong received: {}", (Object)uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2);
            uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Method3321(((int)-1522786127L ^ 0xA53C2146) << 1, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection");
            return;
        }
        if (uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Method3332()) {
            uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Method3327();
            return;
        }
        this.Field10669.trace("Trying to ping a non open connection: {}", (Object)uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2);
    }

    protected abstract Collection Method2681();

    private void Method2682() {
        if (this.Field10672 != null) {
            this.Field10672.shutdownNow();
            this.Field10672 = null;
        }
        if (this.Field10673 == null) return;
        this.Field10673.cancel(((int)-1026392168L ^ 0xC2D27F98) != 0);
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

    static Object Method2687(DitR6vZ79qQrTZ031J7xzQQWKdUckNea ditR6vZ79qQrTZ031J7xzQQWKdUckNea) {
        return ditR6vZ79qQrTZ031J7xzQQWKdUckNea.Field10676;
    }

    static long Method2688(DitR6vZ79qQrTZ031J7xzQQWKdUckNea ditR6vZ79qQrTZ031J7xzQQWKdUckNea) {
        return ditR6vZ79qQrTZ031J7xzQQWKdUckNea.Field10674;
    }

    static void Method2689(DitR6vZ79qQrTZ031J7xzQQWKdUckNea ditR6vZ79qQrTZ031J7xzQQWKdUckNea, ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy aRQmBQvY5BCKjQHAEtWILloZwAOUZwhy, long l) {
        ditR6vZ79qQrTZ031J7xzQQWKdUckNea.Method2680(aRQmBQvY5BCKjQHAEtWILloZwAOUZwhy, l);
    }

    private static String Method2690(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)414060823L ^ 0x18AE1117;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-441531582L ^ 0xE5AEC3BD);
            int n2 = (int)((long)191986375 ^ (long)191986344);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)805110134 ^ (long)805130623) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

