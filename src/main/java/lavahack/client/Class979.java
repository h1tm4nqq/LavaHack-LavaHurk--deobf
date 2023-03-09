/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import com.kisman.cc.util.Class650;
import java.util.function.Predicate;
import kotlin.Metadata;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class254;
import lavahack.client.Class618;
import lavahack.client.Class781;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0016\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\b\u00a8\u0006\u0017"}, d2={"Lcom/kisman/cc/util/manager/CPSManager;", "", "()V", "cps", "", "getCps", "()I", "setCps", "(I)V", "send", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "kotlin.jvm.PlatformType", "getSend", "()Lme/zero/alpine/listener/Listener;", "timer", "Lcom/kisman/cc/util/TimerUtils;", "getTimer", "()Lcom/kisman/cc/util/TimerUtils;", "usage", "getUsage", "setUsage", "getCPS", "kisman.cc"})
public final class Class979 {
    @NotNull
    private final Class650 Field12185 = new Class650();
    private int Field12186;
    private int Field12187;
    @Class1801
    @NotNull
    private final Class618 Field12188 = new Class618((Class254)new Class781(this), new Predicate[0]);
    private String Field12189 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final Class650 Method3984() {
        return this.Field12185;
    }

    public final int Method3985() {
        return this.Field12186;
    }

    public final void Method3986(int n) {
        this.Field12186 = n;
    }

    public final int Method3987() {
        return this.Field12187;
    }

    public final void Method3988(int n) {
        this.Field12187 = n;
    }

    @NotNull
    @NotNull
    public final Class618 Method3989() {
        return this.Field12188;
    }

    public final int Method3990() {
        if (!this.Field12185.Method2797(1000L)) return this.Field12187;
        if (this.Field12186 == 0) {
            this.Field12187 = 0;
            this.Field12185.Method2801();
            return this.Field12187;
        }
        this.Field12187 = this.Field12186;
        this.Field12185.Method2801();
        this.Field12186 = 0;
        return this.Field12187;
    }

    public Class979() {
        Class1796.Field16242.Method706(this.Field12188);
    }
}

