//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.network.play.client.CPacketPlayer
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1913;
import lavahack.client.Class1917;
import lavahack.client.Class254;
import lavahack.client.Class44;
import lavahack.client.Class805;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.network.play.client.CPacketPlayer;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "kotlin.jvm.PlatformType", "invoke"})
final class Class1171
implements Class254 {
    final Class1913 Field13276;
    private String Field13277 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method4697((Class805)object);
    }

    public final void Method4697(Class805 class805) {
        if (Class1913.Method7117().player == null) return;
        EntityPlayerSP entityPlayerSP = Class1913.Method7117().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (!entityPlayerSP.isOnLadder()) return;
        Class44 class44 = Class1913.Method7123(this.Field13276);
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"fastLadder");
        if (!class44.Method365()) return;
        if (!Class1917.Method7159()) return;
        Class805 class8052 = class805;
        Intrinsics.checkExpressionValueIsNotNull((Object)class8052, (String)"it");
        if (!(class8052.Method982() instanceof CPacketPlayer)) return;
        if (class805.Method982() == null) {
            throw new TypeCastException("null cannot be cast to non-null type net.minecraft.network.play.client.CPacketPlayer");
        }
        ((CPacketPlayer)class805.Method982()).onGround = true;
    }

    Class1171(Class1913 class1913) {
        this.Field13276 = class1913;
    }

    private static String Method4698(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 197;
            cArray2[n] = (char)(cArray[n] ^ (0x226 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

