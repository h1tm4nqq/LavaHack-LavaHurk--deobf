//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import java.util.function.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.concurrent.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004B!\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006?\u0006\u0002\u0010\nJ\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006?\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006?\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0015" }, d2 = { "Lcom/kisman/cc/util/thread/kisman/ThreadHandler;", "Lcom/kisman/cc/util/thread/kisman/GlobalThreads;", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "(Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;)V", "delay", "Ljava/util/function/Supplier;", "", "threadded", "", "(Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V", "getDelay", "()Ljava/util/function/Supplier;", "getThreadded", "timer", "Lcom/kisman/cc/util/TimerUtils;", "reset", "", "update", "task", "Ljava/lang/Runnable;", "kisman.cc" })
public final class Class511 implements Class651
{
    private final Class650 Field10155;
    @NotNull
    private final Supplier Field10156;
    @NotNull
    private final Supplier Field10157;
    private String Field10158 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final void Method2360() {
        this.Field10155.Method2801();
    }
    
    public final void Method2361(@NotNull @NotNull final Runnable runnable) {
        Intrinsics.checkParameterIsNotNull((Object)runnable, "task");
        final Class650 field10155 = this.Field10155;
        final Number value = this.Field10156.get();
        Intrinsics.checkExpressionValueIsNotNull((Object)value, "delay.get()");
        if (field10155.Method2797(value.longValue())) {
            this.Field10155.Method2801();
            final Boolean value2 = this.Field10157.get();
            Intrinsics.checkExpressionValueIsNotNull((Object)value2, "threadded.get()");
            if (value2) {
                this.Method2359().submit(runnable);
            }
            else {
                runnable.run();
            }
        }
    }
    
    @NotNull
    @NotNull
    public final Supplier Method2362() {
        return this.Field10156;
    }
    
    @NotNull
    @NotNull
    public final Supplier Method2363() {
        return this.Field10157;
    }
    
    public Class511(@NotNull @NotNull final Supplier field10156, @NotNull @NotNull final Supplier field10157) {
        Intrinsics.checkParameterIsNotNull((Object)field10156, "delay");
        Intrinsics.checkParameterIsNotNull((Object)field10157, "threadded");
        this.Field10156 = field10156;
        this.Field10157 = field10157;
        this.Field10155 = new Class650();
    }
    
    public Class511(@NotNull @NotNull final Class411 class411) {
        Intrinsics.checkParameterIsNotNull((Object)class411, "threads");
        final Supplier method395 = class411.Method2000().Method395();
        Intrinsics.checkExpressionValueIsNotNull((Object)method395, "threads.delay.supplierLong");
        final Supplier method396 = class411.Method2001().Method397();
        Intrinsics.checkExpressionValueIsNotNull((Object)method396, "threads.multiThread.supplierBoolean");
        this(method395, method396);
    }
    
    @NotNull
    @NotNull
    @Override
    public ThreadFactory Method2358() {
        return Class1080.Method4357((Class651)this);
    }
    
    @NotNull
    @NotNull
    @Override
    public ExecutorService Method2359() {
        return Class1080.Method4358((Class651)this);
    }
    
    private static String Method2364(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3E6 ^ 0x59));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
