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
import lavahack.client.HM0EXaADYNMax37QakJtJf61jpa9VoRu;
import lavahack.client.LjrZhVJZgdYdOQjs8taUmhVG2ojE4ziG$1;
import lavahack.client.ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA;
import lavahack.client.Zlk9e3kfSWGG6zqSbWF0nVPgAvKtrhFE;
import lavahack.client.rWOxkXahfy879ZWg1QDRw2hroxYTBucF;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class LjrZhVJZgdYdOQjs8taUmhVG2ojE4ziG
extends Zlk9e3kfSWGG6zqSbWF0nVPgAvKtrhFE {
    private final Logger Field10765 = LogManager.getLogger(LjrZhVJZgdYdOQjs8taUmhVG2ojE4ziG.class);
    private boolean Field10766;
    private boolean Field10767;
    private ScheduledExecutorService Field10768;
    private ScheduledFuture Field10769;
    private long Field10770 = TimeUnit.SECONDS.toNanos(0x2805043CL & 0x42800BCL);
    private boolean Field10771 = (int)-852382242L ^ 0xCD31ADDE;
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
            ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA = (ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA)iterator.next();
            if (!(zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA instanceof rWOxkXahfy879ZWg1QDRw2hroxYTBucF)) continue;
            rWOxkXahfy879ZWg1QDRw2hroxYTBucF rWOxkXahfy879ZWg1QDRw2hroxYTBucF2 = (rWOxkXahfy879ZWg1QDRw2hroxYTBucF)zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA;
            rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Method5293();
        }
    }

    protected void Method523() {
        Object object = this.Field10772;
        if (this.Field10768 == null) {
            if (this.Field10769 == null) return;
        }
        this.Field10771 = (int)183842735L ^ 0xAF537AF;
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
        this.Field10771 = (int)((long)2105001533 ^ (long)2105001532);
        this.Method525();
    }

    private void Method525() {
        this.Method528();
        this.Field10768 = Executors.newSingleThreadScheduledExecutor(new HM0EXaADYNMax37QakJtJf61jpa9VoRu("connectionLostChecker"));
        LjrZhVJZgdYdOQjs8taUmhVG2ojE4ziG$1 ljrZhVJZgdYdOQjs8taUmhVG2ojE4ziG$1 = new LjrZhVJZgdYdOQjs8taUmhVG2ojE4ziG$1(this);
        this.Field10769 = this.Field10768.scheduleAtFixedRate(ljrZhVJZgdYdOQjs8taUmhVG2ojE4ziG$1, this.Field10770, this.Field10770, TimeUnit.NANOSECONDS);
    }

    private void Method526(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, long l) {
        if (!(zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA instanceof rWOxkXahfy879ZWg1QDRw2hroxYTBucF)) {
            return;
        }
        rWOxkXahfy879ZWg1QDRw2hroxYTBucF rWOxkXahfy879ZWg1QDRw2hroxYTBucF2 = (rWOxkXahfy879ZWg1QDRw2hroxYTBucF)zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA;
        if (rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Method5292() < l) {
            this.Field10765.trace("Closing connection due to no pong received: {}", (Object)rWOxkXahfy879ZWg1QDRw2hroxYTBucF2);
            rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Method540(((int)248420061L ^ 0xECE972A) << 1, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection");
            return;
        }
        if (rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Method551()) {
            rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Method546();
            return;
        }
        this.Field10765.trace("Trying to ping a non open connection: {}", (Object)rWOxkXahfy879ZWg1QDRw2hroxYTBucF2);
    }

    protected abstract Collection Method527();

    private void Method528() {
        if (this.Field10768 != null) {
            this.Field10768.shutdownNow();
            this.Field10768 = null;
        }
        if (this.Field10769 == null) return;
        this.Field10769.cancel((boolean)((long)1899594444 ^ (long)1899594444));
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

    static Object Method533(LjrZhVJZgdYdOQjs8taUmhVG2ojE4ziG ljrZhVJZgdYdOQjs8taUmhVG2ojE4ziG) {
        return ljrZhVJZgdYdOQjs8taUmhVG2ojE4ziG.Field10772;
    }

    static long Method534(LjrZhVJZgdYdOQjs8taUmhVG2ojE4ziG ljrZhVJZgdYdOQjs8taUmhVG2ojE4ziG) {
        return ljrZhVJZgdYdOQjs8taUmhVG2ojE4ziG.Field10770;
    }

    static void Method535(LjrZhVJZgdYdOQjs8taUmhVG2ojE4ziG ljrZhVJZgdYdOQjs8taUmhVG2ojE4ziG, ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, long l) {
        ljrZhVJZgdYdOQjs8taUmhVG2ojE4ziG.Method526(zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, l);
    }

    private static String Method536(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1011671082 ^ (long)-1011671082);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1369073842L ^ 0x519A684D);
            int n2 = (int)((long)-354845614 ^ (long)-354845629) << 3;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1586181402L ^ 0xA174DF67) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

