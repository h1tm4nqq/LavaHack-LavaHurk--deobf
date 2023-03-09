/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import java.util.function.Supplier;
import kotlin.Metadata;
import lavahack.client.Class1745;
import lavahack.client.Class44;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class Class1363
implements Supplier {
    final Class44 Field14202;
    private int Field14203;

    public Object get() {
        return this.Method5443();
    }

    public final boolean Method5443() {
        if (this.Field14202.Method341() != Class1745.Field16012) return false;
        return true;
    }

    Class1363(Class44 class44) {
        this.Field14202 = class44;
    }
}

