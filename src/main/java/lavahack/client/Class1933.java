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
final class Class1933
implements Supplier {
    final Class2072 Field16964;
    private String Field16965 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method7189();
    }

    public final boolean Method7189() {
        if (this.Field16964.Method7603().Method341() == Class786.Field11316) return true;
        if (this.Field16964.Method7603().Method341() == Class786.Field11318) return true;
        if (this.Field16964.Method7603().Method341() == Class786.Field11319) return true;
        return false;
    }

    Class1933(Class2072 class2072) {
        this.Field16964 = class2072;
    }
}

