/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import java.util.function.Supplier;
import kotlin.Metadata;
import lavahack.client.Class1087;
import lavahack.client.Class786;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class Class1262
implements Supplier {
    final Class1087 Field13710;
    private String Field13711 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method5095();
    }

    public final boolean Method5095() {
        if (this.Field13710.Method4380().Method341() == Class786.Field11316) return true;
        if (this.Field13710.Method4380().Method341() == Class786.Field11318) return true;
        if (this.Field13710.Method4380().Method341() == Class786.Field11319) return true;
        return false;
    }

    Class1262(Class1087 class1087) {
        this.Field13710 = class1087;
    }
}

