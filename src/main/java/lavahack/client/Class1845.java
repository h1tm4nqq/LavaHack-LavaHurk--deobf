/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Class1477;
import lavahack.client.Class1685;
import lavahack.client.Class218;
import lavahack.client.Class254;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/client/friend/FriendEvent;", "kotlin.jvm.PlatformType", "invoke"})
final class Class1845
implements Class254 {
    final Class1685 Field16509;
    private int Field16510;

    @Override
    public void Method979(Object object) {
        this.Method6940((Class1477)object);
    }

    public final void Method6940(Class1477 class1477) {
        if (!Class218.Field8954.Method1264()) return;
        Class1685.Method6488(this.Field16509).add(class1477);
    }

    Class1845(Class1685 class1685) {
        this.Field16509 = class1685;
    }
}

