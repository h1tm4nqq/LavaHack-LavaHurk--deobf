/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import java.util.function.Supplier;
import kotlin.Metadata;
import lavahack.client.Class631;
import lavahack.client.Class786;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class Class2041
implements Supplier {
    final Class631 Field17376;
    private String Field17377 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method7535();
    }

    public final boolean Method7535() {
        if (this.Field17376.Method2735().Method341() == Class786.Field11309) return false;
        if (this.Field17376.Method2735().Method341() == Class786.Field11316) return false;
        return true;
    }

    Class2041(Class631 class631) {
        this.Field17376 = class631;
    }
}

