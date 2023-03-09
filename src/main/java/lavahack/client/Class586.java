/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.Packet
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class218;
import lavahack.client.Class254;
import lavahack.client.Class275;
import lavahack.client.Class805;
import net.minecraft.network.Packet;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "kotlin.jvm.PlatformType", "invoke"})
final class Class586
implements Class254 {
    public static final Class586 Field10489 = new Class586();
    private String Field10490 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method2548((Class805)object);
    }

    public final void Method2548(Class805 class805) {
        Class805 class8052 = class805;
        Intrinsics.checkExpressionValueIsNotNull((Object)class8052, (String)"it");
        Packet packet = class8052.Method982();
        Intrinsics.checkExpressionValueIsNotNull((Object)packet, (String)"it.packet");
        if (!Class275.Field9212.Method1462(packet)) return;
        if (!Class218.Field8954.Method1254()) return;
        if (!Class275.Method1466(Class275.Field9212).contains(class805.Method982().getClass())) return;
        if (!Class275.Field9212.Method1463()) return;
        class805.Method158();
    }

    Class586() {
    }

    private static String Method2549(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 101;
            cArray2[n] = (char)(cArray[n] ^ (0x43D6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

