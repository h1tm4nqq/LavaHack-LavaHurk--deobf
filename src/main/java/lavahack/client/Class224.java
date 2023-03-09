/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import java.util.function.Supplier;
import kotlin.Metadata;
import lavahack.client.Class2072;
import lavahack.client.Class786;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class Class224
implements Supplier {
    final Class2072 Field8966;
    private String Field8967 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method1274();
    }

    public final boolean Method1274() {
        if (this.Field8966.Method7603().Method341() == Class786.Field11309) return false;
        if (this.Field8966.Method7603().Method341() == Class786.Field11316) return false;
        return true;
    }

    Class224(Class2072 class2072) {
        this.Field8966 = class2072;
    }
}

