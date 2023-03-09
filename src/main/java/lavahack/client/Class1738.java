/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1347;
import lavahack.client.Class254;
import lavahack.client.Class805;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "kotlin.jvm.PlatformType", "invoke"})
final class Class1738
implements Class254 {
    final Class1347 Field15977;
    private String Field15978 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method6616((Class805)object);
    }

    public final void Method6616(Class805 class805) {
        if (Class1347.Method5408(this.Field15977) == -1) return;
        Class805 class8052 = class805;
        Intrinsics.checkExpressionValueIsNotNull((Object)class8052, (String)"it");
        if (!(class8052.Method982() instanceof CPacketPlayer)) return;
        Packet packet = class805.Method982();
        if (packet == null) {
            throw new TypeCastException("null cannot be cast to non-null type net.minecraft.network.play.client.CPacketPlayer");
        }
        Class1347.Method5410(this.Field15977).add((CPacketPlayer)packet);
        class805.Method158();
    }

    Class1738(Class1347 class1347) {
        this.Field15977 = class1347;
    }

    private static String Method6617(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 239;
            cArray2[n] = (char)(cArray[n] ^ (0x7B4D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

