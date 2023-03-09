/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.functions.Function5
 *  kotlin.jvm.internal.Lambda
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0012\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n\u00a2\u0006\u0002\b\b"}, d2={"limitMotion", "", "currentMotion", "positiveLimit", "negativeLimit", "positiveFlag", "", "negativeFlag", "invoke"})
final class Class148
extends Lambda
implements Function5 {
    public static final Class148 Field8575 = new Class148();
    private int Field8576;

    public Object invoke(Object object, Object object2, Object object3, Object object4, Object object5) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(((Number)object).doubleValue(), ((Number)object2).doubleValue(), ((Number)object3).doubleValue(), (Boolean)object4, (Boolean)object5);
    }

    public final double leqS0IyKEB621E1SrHdAcHHAUjScjmKi(double d, double d2, double d3, boolean bl, boolean bl2) {
        if (d > d2 && bl) {
            return d2;
        }
        if (!(d < -d3)) return d;
        if (!bl2) return d;
        return -d3;
    }

    Class148() {
        super(5);
    }
}

