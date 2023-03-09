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
import lavahack.client.Class84;
import lavahack.client.Class85;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class Class1307
implements Supplier {
    final Class1612 Field13971;
    private int Field13972;

    public Object get() {
        return this.Method5307();
    }

    public final boolean Method5307() {
        Class85 class85 = Class85.Field8286;
        Class84 class84 = new Class84(this);
        if (!this.Field13971.Method780().Field8061) return false;
        if (!class84.leqS0IyKEB621E1SrHdAcHHAUjScjmKi()) return false;
        return true;
    }

    Class1307(Class1612 class1612) {
        this.Field13971 = class1612;
    }
}

