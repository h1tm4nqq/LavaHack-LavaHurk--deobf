//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.server.SPacketSpawnObject
 */
package lavahack.client;

import java.util.function.ToDoubleFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketSpawnObject;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"<anonymous>", "", "player", "Lnet/minecraft/entity/player/EntityPlayer;", "applyAsDouble"})
final class Class35
implements ToDoubleFunction {
    final Packet Field8034;
    private int Field8035;

    public double applyAsDouble(Object object) {
        return this.Method278((EntityPlayer)object);
    }

    public final double Method278(@NotNull @NotNull EntityPlayer entityPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)entityPlayer, (String)"player");
        return entityPlayer.getDistance(((SPacketSpawnObject)this.Field8034).getX(), ((SPacketSpawnObject)this.Field8034).getY(), ((SPacketSpawnObject)this.Field8034).getZ());
    }

    Class35(Packet packet) {
        this.Field8034 = packet;
    }

    private static String Method279(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 216;
            cArray2[n] = (char)(cArray[n] ^ (0x78D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

