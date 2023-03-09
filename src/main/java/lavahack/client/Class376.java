//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.server.SPacketSpawnObject
 */
package lavahack.client;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1347;
import lavahack.client.Class254;
import lavahack.client.Class30;
import lavahack.client.Class35;
import lavahack.client.Class544;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketSpawnObject;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "kotlin.jvm.PlatformType", "invoke"})
final class Class376
implements Class254 {
    final Class1347 Field9582;
    private String Field9583 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method1833((Class544)object);
    }

    public final void Method1833(Class544 class544) {
        if (!Class1347.Method5406().player.onGround) return;
        Class544 class5442 = class544;
        Intrinsics.checkExpressionValueIsNotNull((Object)class5442, (String)"it");
        Packet packet = class5442.Method982();
        if (!(packet instanceof SPacketSpawnObject)) return;
        if (((SPacketSpawnObject)packet).getType() != 65) return;
        Class1347.Method5406().world.playerEntities.stream().min(Comparator.comparingDouble(new Class35(packet))).ifPresent(new Class30(this, packet));
    }

    Class376(Class1347 class1347) {
        this.Field9582 = class1347;
    }

    private static String Method1834(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 134;
            cArray2[n] = (char)(cArray[n] ^ (0x6156 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

