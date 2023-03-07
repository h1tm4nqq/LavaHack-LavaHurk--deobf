/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ;
import lavahack.client.ZsqKASV8G7yUg4Domk5av9lNh2eJ8jx0;
import lavahack.client.ZsqKASV8G7yUg4Domk5av9lNh2eJ8jx0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B!\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2={"Lcom/kisman/cc/util/thread/kisman/ThreadHandler;", "Lcom/kisman/cc/util/thread/kisman/GlobalThreads;", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "(Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;)V", "delay", "Ljava/util/function/Supplier;", "", "threadded", "", "(Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V", "getDelay", "()Ljava/util/function/Supplier;", "getThreadded", "timer", "Lcom/kisman/cc/util/TimerUtils;", "reset", "", "update", "task", "Ljava/lang/Runnable;", "kisman.cc"})
public final class dLRp42sXVbFaJ5rZZSCKqqXbZCgvDQiP
implements ZsqKASV8G7yUg4Domk5av9lNh2eJ8jx0 {
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field10155;
    @NotNull
    private final Supplier Field10156;
    @NotNull
    private final Supplier Field10157;
    private String Field10158 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method2360() {
        this.Field10155.Method2801();
    }

    public final void Method2361(@NotNull @NotNull Runnable runnable) {
        Intrinsics.checkParameterIsNotNull((Object)runnable, (String)"task");
        Object t = this.Field10156.get();
        Intrinsics.checkExpressionValueIsNotNull(t, (String)"delay.get()");
        if (!this.Field10155.Method2797(((Number)t).longValue())) return;
        this.Field10155.Method2801();
        Object t2 = this.Field10157.get();
        Intrinsics.checkExpressionValueIsNotNull(t2, (String)"threadded.get()");
        if (((Boolean)t2).booleanValue()) {
            this.Method2359().submit(runnable);
            return;
        }
        runnable.run();
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

    public dLRp42sXVbFaJ5rZZSCKqqXbZCgvDQiP(@NotNull @NotNull Supplier supplier, @NotNull @NotNull Supplier supplier2) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, (String)"delay");
        Intrinsics.checkParameterIsNotNull((Object)supplier2, (String)"threadded");
        this.Field10156 = supplier;
        this.Field10157 = supplier2;
        this.Field10155 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    }

    public dLRp42sXVbFaJ5rZZSCKqqXbZCgvDQiP(@NotNull @NotNull Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ) {
        Intrinsics.checkParameterIsNotNull((Object)q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ, (String)"threads");
        Supplier supplier = q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ.Method2000().Method395();
        Intrinsics.checkExpressionValueIsNotNull((Object)supplier, (String)"threads.delay.supplierLong");
        Supplier supplier2 = q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ.Method2001().Method397();
        Intrinsics.checkExpressionValueIsNotNull((Object)supplier2, (String)"threads.multiThread.supplierBoolean");
        this(supplier, supplier2);
    }

    @Override
    @NotNull
    @NotNull
    public ThreadFactory Method2358() {
        return ZsqKASV8G7yUg4Domk5av9lNh2eJ8jx0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4357(this);
    }

    @Override
    @NotNull
    @NotNull
    public ExecutorService Method2359() {
        return ZsqKASV8G7yUg4Domk5av9lNh2eJ8jx0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4358(this);
    }

    private static String Method2364(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)696396628 ^ (long)696396628);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1227115909 ^ (long)1227115898);
            int n2 = (int)((long)-1283117230 ^ (long)-1283117301);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)2089672460 ^ (long)2089672447) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

