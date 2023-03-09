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
final class Class2139
implements Supplier {
    final Class1087 Field17789;
    private int Field17790;

    public Object get() {
        return this.Method7710();
    }

    public final boolean Method7710() {
        if (this.Field17789.Method4380().Method341() == Class786.Field11309) return false;
        if (this.Field17789.Method4380().Method341() == Class786.Field11316) return false;
        return true;
    }

    Class2139(Class1087 class1087) {
        this.Field17789 = class1087;
    }
}

