/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1080;
import lavahack.client.Class1428;
import lavahack.client.Class489;
import lavahack.client.Class651;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/util/thread/kisman/suppliers/ThreaddedSupplier;", "T", "Lcom/kisman/cc/util/thread/kisman/GlobalThreads;", "get0", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "get1", "Lcom/kisman/cc/util/thread/kisman/ThreadSafeValue;", "get", "()Ljava/lang/Object;", "kisman.cc"})
public class Class904
implements Class651 {
    private final Class489 Field11827;
    private final Function0 Field11828;
    private String Field11829 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Nullable
    @Nullable
    public Object Method3751() {
        this.Method2359().submit(new Class1428(this));
        return this.Field11827.Method2269();
    }

    public Class904(@NotNull @NotNull Function0 function0) {
        Intrinsics.checkParameterIsNotNull((Object)function0, (String)"get0");
        this.Field11828 = function0;
        this.Field11827 = new Class489(null);
    }

    @Override
    @NotNull
    @NotNull
    public ThreadFactory Method2358() {
        return Class1080.Method4357(this);
    }

    @Override
    @NotNull
    @NotNull
    public ExecutorService Method2359() {
        return Class1080.Method4358(this);
    }

    public static final Class489 Method3752(Class904 class904) {
        return class904.Field11827;
    }

    public static final Function0 Method3753(Class904 class904) {
        return class904.Field11828;
    }

    private static String Method3754(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 64;
            cArray2[n] = (char)(cArray[n] ^ (0x25FC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

