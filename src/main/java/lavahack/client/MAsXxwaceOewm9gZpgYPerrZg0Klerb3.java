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
import lavahack.client.MAsXxwaceOewm9gZpgYPerrZg0Klerb3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.ZsqKASV8G7yUg4Domk5av9lNh2eJ8jx0;
import lavahack.client.ZsqKASV8G7yUg4Domk5av9lNh2eJ8jx0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.zR5cZ6n0tpJURx8GTKdomWS4aGzBURjq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/util/thread/kisman/suppliers/ThreaddedSupplier;", "T", "Lcom/kisman/cc/util/thread/kisman/GlobalThreads;", "get0", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "get1", "Lcom/kisman/cc/util/thread/kisman/ThreadSafeValue;", "get", "()Ljava/lang/Object;", "kisman.cc"})
public class MAsXxwaceOewm9gZpgYPerrZg0Klerb3
implements ZsqKASV8G7yUg4Domk5av9lNh2eJ8jx0 {
    private final zR5cZ6n0tpJURx8GTKdomWS4aGzBURjq Field11827;
    private final Function0 Field11828;
    private String Field11829 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Nullable
    @Nullable
    public Object Method3751() {
        this.Method2359().submit(new MAsXxwaceOewm9gZpgYPerrZg0Klerb3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this));
        return this.Field11827.Method2269();
    }

    public MAsXxwaceOewm9gZpgYPerrZg0Klerb3(@NotNull @NotNull Function0 function0) {
        Intrinsics.checkParameterIsNotNull((Object)function0, (String)"get0");
        this.Field11828 = function0;
        this.Field11827 = new zR5cZ6n0tpJURx8GTKdomWS4aGzBURjq(null);
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

    public static final zR5cZ6n0tpJURx8GTKdomWS4aGzBURjq Method3752(MAsXxwaceOewm9gZpgYPerrZg0Klerb3 mAsXxwaceOewm9gZpgYPerrZg0Klerb3) {
        return mAsXxwaceOewm9gZpgYPerrZg0Klerb3.Field11827;
    }

    public static final Function0 Method3753(MAsXxwaceOewm9gZpgYPerrZg0Klerb3 mAsXxwaceOewm9gZpgYPerrZg0Klerb3) {
        return mAsXxwaceOewm9gZpgYPerrZg0Klerb3.Field11828;
    }

    private static String Method3754(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)60910007 ^ (long)60910007);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)734146221 ^ (long)734146130);
            int n2 = ((int)667704625L ^ 0x27CC5D30) << 6;
            cArray2[n] = (char)(cArray[n] ^ (((int)1126694045L ^ 0x4327F5E2) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

