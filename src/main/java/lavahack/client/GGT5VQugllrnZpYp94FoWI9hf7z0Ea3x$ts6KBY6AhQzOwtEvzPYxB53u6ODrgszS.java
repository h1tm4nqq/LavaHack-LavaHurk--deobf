/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x;
import lavahack.client.agYEaptPUW8OPC6jB7DK1WZuIoCKRIex;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventEntityControl;", "kotlin.jvm.PlatformType", "invoke"})
final class GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    final GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x Field14818;
    private int Field14819;

    @Override
    public void Method979(Object object) {
        this.Method5815((agYEaptPUW8OPC6jB7DK1WZuIoCKRIex)object);
    }

    public final void Method5815(agYEaptPUW8OPC6jB7DK1WZuIoCKRIex agYEaptPUW8OPC6jB7DK1WZuIoCKRIex2) {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7124(this.Field14818);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"entityControl");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return;
        agYEaptPUW8OPC6jB7DK1WZuIoCKRIex2.Method158();
    }

    GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS(GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x) {
        this.Field14818 = gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x;
    }

    private static String Method5816(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1372240406L ^ 0xAE3545EA;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1267898585 ^ (long)-1267898408);
            int n2 = (int)((long)429789872 ^ (long)429789821);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1016582650 ^ (long)-1016582481) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

