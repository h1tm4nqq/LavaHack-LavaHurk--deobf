/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import java.util.ArrayList;
import kotlin.Metadata;
import lavahack.client.Class582;
import lavahack.client.Class818;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class Class1432
implements Runnable {
    final Class582 Field14696;
    final ArrayList Field14697;
    private String Field14698 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public final void run() {
        Class818.Method3485(this.Field14696.Field10481, this.Field14697);
    }

    Class1432(Class582 class582, ArrayList arrayList) {
        this.Field14696 = class582;
        this.Field14697 = arrayList;
    }
}

