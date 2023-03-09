/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Class227;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class Class1003
implements Runnable {
    final Class227 Field12315;
    private int Field12316;

    @Override
    public final void run() {
        Class227.Method1285(this.Field12315);
    }

    Class1003(Class227 class227) {
        this.Field12315 = class227;
    }
}

