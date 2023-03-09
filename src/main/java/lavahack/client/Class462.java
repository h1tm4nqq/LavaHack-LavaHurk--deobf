/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import java.util.function.Supplier;
import kotlin.Metadata;
import lavahack.client.Class1612;
import lavahack.client.Class786;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class Class462
implements Supplier {
    final Class1612 Field9922;
    private int Field9923;

    public Object get() {
        return this.Method2175();
    }

    public final boolean Method2175() {
        if (this.Field9922.Method3765().Method341() == Class786.Field11309) return false;
        if (this.Field9922.Method3765().Method341() == Class786.Field11316) return false;
        return true;
    }

    Class462(Class1612 class1612) {
        this.Field9922 = class1612;
    }
}

