/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraftforge.fml.common.ProgressManager
 *  net.minecraftforge.fml.common.ProgressManager$ProgressBar
 */
package lavahack.client;

import com.kisman.cc.mixin.mixins.accessor.AccessorProgressBar;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.chvHQJoInyPpoXaeZOwvyRVxSb8GEhWP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraftforge.fml.common.ProgressManager;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2={"Lcom/kisman/cc/gui/loadingscreen/progressbar/ProgressBarController;", "", "name", "", "(Ljava/lang/String;)V", "bar", "Lnet/minecraftforge/fml/common/ProgressManager$ProgressBar;", "event", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/client/loadingscreen/progressbar/EventProgressBar;", "getName", "()Ljava/lang/String;", "steps", "", "init", "", "uninit", "kisman.cc"})
public final class chvHQJoInyPpoXaeZOwvyRVxSb8GEhWP {
    @JvmField
    public int Field11713;
    private ProgressManager.ProgressBar Field11714;
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field11715;
    @NotNull
    private final String Field11716;
    private String Field11717 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method3685() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field11715);
        this.Field11714 = ProgressManager.push((String)this.Field11716, (int)this.Field11713, ((int)106894606L ^ 0x65F150F) != 0);
    }

    public final void Method3686() {
        ProgressManager.ProgressBar progressBar = this.Field11714;
        if (progressBar == null) {
            Intrinsics.throwNpe();
        }
        int n = progressBar.getSteps();
        ProgressManager.ProgressBar progressBar2 = this.Field11714;
        if (progressBar2 == null) {
            Intrinsics.throwNpe();
        }
        if (n != progressBar2.getStep()) {
            StringBuilder stringBuilder = new StringBuilder().append("ProgressBar: Trying to pop progress bar(");
            ProgressManager.ProgressBar progressBar3 = this.Field11714;
            if (progressBar3 == null) {
                Intrinsics.throwNpe();
            }
            StringBuilder stringBuilder2 = stringBuilder.append(progressBar3.getSteps()).append(") with ");
            ProgressManager.ProgressBar progressBar4 = this.Field11714;
            if (progressBar4 == null) {
                Intrinsics.throwNpe();
            }
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.error(stringBuilder2.append(progressBar4.getStep()).append(" passed steps!").toString());
            ProgressManager.ProgressBar progressBar5 = this.Field11714;
            if (progressBar5 == null) {
                Intrinsics.throwNpe();
            }
            if (progressBar5 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorProgressBar");
            }
            AccessorProgressBar accessorProgressBar = (AccessorProgressBar)progressBar5;
            ProgressManager.ProgressBar progressBar6 = this.Field11714;
            if (progressBar6 == null) {
                Intrinsics.throwNpe();
            }
            accessorProgressBar.Method739(progressBar6.getSteps());
        }
        ProgressManager.ProgressBar progressBar7 = this.Field11714;
        if (progressBar7 == null) {
            Intrinsics.throwNpe();
        }
        ProgressManager.pop((ProgressManager.ProgressBar)progressBar7);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field11715);
    }

    @NotNull
    @NotNull
    public final String Method3687() {
        return this.Field11716;
    }

    public chvHQJoInyPpoXaeZOwvyRVxSb8GEhWP(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        this.Field11716 = string;
        this.Field11715 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)new chvHQJoInyPpoXaeZOwvyRVxSb8GEhWP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this), new Predicate[(int)77695173L ^ 0x4A188C5]);
    }

    public static final ProgressManager.ProgressBar Method3688(chvHQJoInyPpoXaeZOwvyRVxSb8GEhWP chvHQJoInyPpoXaeZOwvyRVxSb8GEhWP2) {
        return chvHQJoInyPpoXaeZOwvyRVxSb8GEhWP2.Field11714;
    }

    public static final void Method3689(chvHQJoInyPpoXaeZOwvyRVxSb8GEhWP chvHQJoInyPpoXaeZOwvyRVxSb8GEhWP2, ProgressManager.ProgressBar progressBar) {
        chvHQJoInyPpoXaeZOwvyRVxSb8GEhWP2.Field11714 = progressBar;
    }

    private static String Method3690(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1127084526L ^ 0xBCD20E12;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1723886155 ^ (long)1723886260);
            int n2 = (int)311954662L ^ 0x12980C4F;
            cArray2[n] = (char)(cArray[n] ^ (((int)1122912533L ^ 0x42EE4EF2) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

