/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.ABhseIFL1PQVX4WAovmpeO8P6T0dQPpk;
import lavahack.client.cZ4bypSRWV3YzaQMwmpKCiS4RsRbKd08;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"<anonymous>", "", "event", "Lcom/kisman/cc/event/events/client/console/ConsoleMessageEvent;", "invoke"})
final class ABhseIFL1PQVX4WAovmpeO8P6T0dQPpk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    final ABhseIFL1PQVX4WAovmpeO8P6T0dQPpk Field12886;
    private String Field12887 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method4465((cZ4bypSRWV3YzaQMwmpKCiS4RsRbKd08)object);
    }

    public final void Method4465(@NotNull @NotNull cZ4bypSRWV3YzaQMwmpKCiS4RsRbKd08 cZ4bypSRWV3YzaQMwmpKCiS4RsRbKd082) {
        Intrinsics.checkParameterIsNotNull((Object)cZ4bypSRWV3YzaQMwmpKCiS4RsRbKd082, (String)"event");
        ABhseIFL1PQVX4WAovmpeO8P6T0dQPpk.Method1437(this.Field12886).add(cZ4bypSRWV3YzaQMwmpKCiS4RsRbKd082.Method3968());
    }

    ABhseIFL1PQVX4WAovmpeO8P6T0dQPpk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(ABhseIFL1PQVX4WAovmpeO8P6T0dQPpk aBhseIFL1PQVX4WAovmpeO8P6T0dQPpk) {
        this.Field12886 = aBhseIFL1PQVX4WAovmpeO8P6T0dQPpk;
    }

    private static String Method4466(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-699317681 ^ (long)-699317681);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1633852641 ^ (long)-1633852448);
            int n2 = (int)((long)-421709954 ^ (long)-421709957) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)2105684620 ^ (long)2105684251) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

