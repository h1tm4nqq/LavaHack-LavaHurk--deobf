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
import lavahack.client.Class1504;
import lavahack.client.Class254;
import lavahack.client.Class544;
import net.minecraft.network.Packet;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "kotlin.jvm.PlatformType", "invoke"})
final class Class1582
implements Class254 {
    final Class1504 Field15409;
    private String Field15410 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method6225((Class544)object);
    }

    public final void Method6225(Class544 class544) {
        Class544 class5442 = class544;
        Intrinsics.checkExpressionValueIsNotNull((Object)class5442, (String)"it");
        Packet packet = class5442.Method982();
        Intrinsics.checkExpressionValueIsNotNull((Object)packet, (String)"it.packet");
        this.Field15409.Method6024(packet);
    }

    Class1582(Class1504 class1504) {
        this.Field15409 = class1504;
    }

    private static String Method6226(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 71;
            cArray2[n] = (char)(cArray[n] ^ (0x47B8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

