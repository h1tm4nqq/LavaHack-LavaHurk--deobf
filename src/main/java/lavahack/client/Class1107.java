/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import java.util.List;
import kotlin.Metadata;
import lavahack.client.Class1945;
import lavahack.client.Class295;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class Class1107
implements Runnable {
    final Class1945 Field12989;
    final List Field12990;
    private String Field12991 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public final void run() {
        Class295.Method1555(this.Field12989.Field16993, this.Field12990);
    }

    Class1107(Class1945 class1945, List list) {
        this.Field12989 = class1945;
        this.Field12990 = list;
    }
}

