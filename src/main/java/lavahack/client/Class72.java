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
final class Class72
implements Supplier {
    final Class631 Field8241;
    private int Field8242;

    public Object get() {
        return this.Method659();
    }

    public final boolean Method659() {
        if (this.Field8241.Method2735().Method341() == Class786.Field11316) return true;
        if (this.Field8241.Method2735().Method341() == Class786.Field11318) return true;
        if (this.Field8241.Method2735().Method341() == Class786.Field11319) return true;
        return false;
    }

    Class72(Class631 class631) {
        this.Field8241 = class631;
    }
}

