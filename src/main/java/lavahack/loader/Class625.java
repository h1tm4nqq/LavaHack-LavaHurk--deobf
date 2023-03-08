//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import org.apache.logging.log4j.*;
import java.util.*;
import java.util.concurrent.*;

public abstract class Class625 extends Class1548
{
    private final Logger Field10669;
    private boolean Field10670;
    private boolean Field10671;
    private ScheduledExecutorService Field10672;
    private ScheduledFuture Field10673;
    private long Field10674;
    private boolean Field10675;
    private final Object Field10676;
    private int Field10677;
    
    public Class625() {
        this.Field10669 = LogManager.getLogger((Class)Class625.class);
        this.Field10674 = TimeUnit.SECONDS.toNanos(60L);
        this.Field10675 = false;
        this.Field10676 = new Object();
    }
    
    public int Method2675() {
        final Object field10676 = this.Field10676;
        return (int)TimeUnit.NANOSECONDS.toSeconds(this.Field10674);
    }
    
    public void Method2676(final int n) {
        final Object field10676 = this.Field10676;
        this.Field10674 = TimeUnit.SECONDS.toNanos(n);
        if (this.Field10674 <= 0L) {
            this.Field10669.trace("Connection lost timer stopped");
            this.Method2682();
            return;
        }
        if (this.Field10675) {
            this.Field10669.trace("Connection lost timer restarted");
            for (final Class1966 class1966 : new ArrayList<Class1966>(this.Method2681())) {
                if (class1966 instanceof Class1282) {
                    ((Class1282)class1966).Method5215();
                }
            }
            this.Method2679();
        }
    }
    
    protected void Method2677() {
        final Object field10676 = this.Field10676;
        if (this.Field10672 != null || this.Field10673 != null) {
            this.Field10675 = false;
            this.Field10669.trace("Connection lost timer stopped");
            this.Method2682();
        }
    }
    
    protected void Method2678() {
        final Object field10676 = this.Field10676;
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
        this.Field10672 = Executors.newSingleThreadScheduledExecutor((ThreadFactory)new Class2132("connectionLostChecker"));
        this.Field10673 = this.Field10672.scheduleAtFixedRate((Runnable)new Class1201(this), this.Field10674, this.Field10674, TimeUnit.NANOSECONDS);
    }
    
    private void Method2680(final Class1966 class1966, final long n) {
        if (!(class1966 instanceof Class1282)) {
            return;
        }
        final Class1282 class1967 = (Class1282)class1966;
        if (class1967.Method5214() < n) {
            this.Field10669.trace("Closing connection due to no pong received: {}", (Object)class1967);
            class1967.Method3321(1006, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection");
        }
        else if (class1967.Method3332()) {
            class1967.Method3327();
        }
        else {
            this.Field10669.trace("Trying to ping a non open connection: {}", (Object)class1967);
        }
    }
    
    protected abstract Collection Method2681();
    
    private void Method2682() {
        if (this.Field10672 != null) {
            this.Field10672.shutdownNow();
            this.Field10672 = null;
        }
        if (this.Field10673 != null) {
            this.Field10673.cancel(false);
            this.Field10673 = null;
        }
    }
    
    public boolean Method2683() {
        return this.Field10670;
    }
    
    public void Method2684(final boolean field10670) {
        this.Field10670 = field10670;
    }
    
    public boolean Method2685() {
        return this.Field10671;
    }
    
    public void Method2686(final boolean field10671) {
        this.Field10671 = field10671;
    }
    
    static Object Method2687(final Class625 class625) {
        return class625.Field10676;
    }
    
    static long Method2688(final Class625 class625) {
        return class625.Field10674;
    }
    
    static void Method2689(final Class625 class625, final Class1966 class626, final long n) {
        class625.Method2680(class626, n);
    }
    
    private static String Method2690(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5009 ^ 0x6F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
