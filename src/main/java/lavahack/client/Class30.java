//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.network.play.server.SPacketSpawnObject
 */
package lavahack.client;

import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1347;
import lavahack.client.Class376;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.server.SPacketSpawnObject;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"<anonymous>", "", "it", "Lnet/minecraft/entity/player/EntityPlayer;", "accept"})
final class Class30
implements Consumer {
    final Class376 Field7940;
    final Packet Field7941;
    private String Field7942 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void accept(Object object) {
        this.Method247((EntityPlayer)object);
    }

    public final void Method247(@NotNull @NotNull EntityPlayer entityPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)entityPlayer, (String)"it");
        Class1347.Method5406().player.motionX = 0.0;
        Class1347.Method5406().player.motionY = 0.0;
        Class1347.Method5406().player.motionZ = 0.0;
        Class1347.Method5406().player.movementInput.moveForward = 0.0f;
        Class1347.Method5406().player.movementInput.moveStrafe = 0.0f;
        Class1347.Method5406().player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1347.Method5406().player.posX, Class1347.Method5406().player.posY + 1.0, Class1347.Method5406().player.posZ, false));
        Class1347.Method5412(this.Field7940.Field9582, true);
        Class1347.Method5409(this.Field7940.Field9582, ((SPacketSpawnObject)this.Field7941).getEntityID());
    }

    Class30(Class376 class376, Packet packet) {
        this.Field7940 = class376;
        this.Field7941 = packet;
    }

    private static String Method248(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 107;
            cArray2[n] = (char)(cArray[n] ^ (0x4458 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

