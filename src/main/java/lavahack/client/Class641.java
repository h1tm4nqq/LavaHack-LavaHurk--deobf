//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.apache.logging.log4j.*;
import java.util.*;
import java.util.concurrent.*;

public abstract class Class641 extends Class630
{
    private final Logger Field10765;
    private boolean Field10766;
    private boolean Field10767;
    private ScheduledExecutorService Field10768;
    private ScheduledFuture Field10769;
    private long Field10770;
    private boolean Field10771;
    private final Object Field10772;
    private int Field10773;
    
    public Class641() {
        this.Field10765 = LogManager.getLogger((Class)Class641.class);
        this.Field10770 = TimeUnit.SECONDS.toNanos(60L);
        this.Field10771 = false;
        this.Field10772 = new Object();
    }
    
    public int Method521() {
        final Object field10772 = this.Field10772;
        return (int)TimeUnit.NANOSECONDS.toSeconds(this.Field10770);
    }
    
    public void Method522(final int n) {
        final Object field10772 = this.Field10772;
        this.Field10770 = TimeUnit.SECONDS.toNanos(n);
        if (this.Field10770 <= 0L) {
            this.Field10765.trace("Connection lost timer stopped");
            this.Method528();
            return;
        }
        if (this.Field10771) {
            this.Field10765.trace("Connection lost timer restarted");
            for (final Class1728 class1728 : new ArrayList<Class1728>(this.Method527())) {
                if (class1728 instanceof Class1302) {
                    ((Class1302)class1728).Method5293();
                }
            }
            this.Method525();
        }
    }
    
    protected void Method523() {
        final Object field10772 = this.Field10772;
        if (this.Field10768 != null || this.Field10769 != null) {
            this.Field10771 = false;
            this.Field10765.trace("Connection lost timer stopped");
            this.Method528();
        }
    }
    
    protected void Method524() {
        final Object field10772 = this.Field10772;
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
        this.Field10768 = Executors.newSingleThreadScheduledExecutor((ThreadFactory)new Class551("connectionLostChecker"));
        this.Field10769 = this.Field10768.scheduleAtFixedRate((Runnable)new Class1574(this), this.Field10770, this.Field10770, TimeUnit.NANOSECONDS);
    }
    
    private void Method526(final Class1728 class1728, final long n) {
        if (!(class1728 instanceof Class1302)) {
            return;
        }
        final Class1302 class1729 = (Class1302)class1728;
        if (class1729.Method5292() < n) {
            this.Field10765.trace("Closing connection due to no pong received: {}", (Object)class1729);
            class1729.Method540(1006, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection");
        }
        else if (class1729.Method551()) {
            class1729.Method546();
        }
        else {
            this.Field10765.trace("Trying to ping a non open connection: {}", (Object)class1729);
        }
    }
    
    protected abstract Collection Method527();
    
    private void Method528() {
        if (this.Field10768 != null) {
            this.Field10768.shutdownNow();
            this.Field10768 = null;
        }
        if (this.Field10769 != null) {
            this.Field10769.cancel(false);
            this.Field10769 = null;
        }
    }
    
    public boolean Method529() {
        return this.Field10766;
    }
    
    public void Method530(final boolean field10766) {
        this.Field10766 = field10766;
    }
    
    public boolean Method531() {
        return this.Field10767;
    }
    
    public void Method532(final boolean field10767) {
        this.Field10767 = field10767;
    }
    
    static Object Method533(final Class641 class641) {
        return class641.Field10772;
    }
    
    static long Method534(final Class641 class641) {
        return class641.Field10770;
    }
    
    static void Method535(final Class641 class641, final Class1728 class642, final long n) {
        class641.Method526(class642, n);
    }
    
    private static String Method536(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5604 ^ 0x88));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
