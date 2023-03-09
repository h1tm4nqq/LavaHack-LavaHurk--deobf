/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.login.client.CPacketLoginStart
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1409;
import lavahack.client.Class254;
import lavahack.client.Class805;
import net.minecraft.network.login.client.CPacketLoginStart;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "kotlin.jvm.PlatformType", "invoke"})
final class Class1339
implements Class254 {
    public static final Class1339 Field14118 = new Class1339();
    private String Field14119 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method5394((Class805)object);
    }

    public final void Method5394(Class805 class805) {
        Class805 class8052 = class805;
        Intrinsics.checkExpressionValueIsNotNull((Object)class8052, (String)"it");
        if (!(class8052.Method982() instanceof CPacketLoginStart)) return;
        Class1409.Method5557(Class1409.Field14381);
    }

    Class1339() {
    }

    private static String Method5395(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 191;
            cArray2[n] = (char)(cArray[n] ^ (0x7BE9 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

