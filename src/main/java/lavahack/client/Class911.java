//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketInput
 */
package lavahack.client;

import com.kisman.cc.event.Class1273;
import com.kisman.cc.util.Class2142;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1409;
import lavahack.client.Class1963;
import lavahack.client.Class254;
import lavahack.client.Class349;
import lavahack.client.Class44;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketInput;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventPlayerMotionUpdate$Riding;", "kotlin.jvm.PlatformType", "invoke"})
final class Class911
implements Class254 {
    public static final Class911 Field11868 = new Class911();
    private String Field11869 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method3822((Class349)object);
    }

    public final void Method3822(Class349 class349) {
        Class349 class3492 = class349;
        Intrinsics.checkExpressionValueIsNotNull((Object)class3492, (String)"it");
        if (class3492.Method160() != Class1273.Field13746) return;
        if (!Class1409.Field14381.Method35()) return;
        Class44 class44 = Class1409.Field14381.Method5551();
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"PingBypass.protocol");
        if (class44.Method341() != Class1963.Field17038) return;
        Class2142.Field17803.player.connection.sendPacket((Packet)new CPacketInput(class349.Method1749(), class349.Method1751(), class349.Method1753(), class349.Method1755()));
        EntityPlayerSP entityPlayerSP = Class2142.Field17803.player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        Entity entity = entityPlayerSP.getLowestRidingEntity();
        if (!(Intrinsics.areEqual((Object)entity, (Object)Class2142.Field17803.player) ^ true)) return;
        if (!entity.canPassengerSteer()) return;
    }

    Class911() {
    }

    private static String Method3823(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 170;
            cArray2[n] = (char)(cArray[n] ^ (0x32F9 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

