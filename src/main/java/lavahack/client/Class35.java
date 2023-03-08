//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import net.minecraft.network.*;
import net.minecraft.entity.player.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.network.play.server.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n?\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "", "player", "Lnet/minecraft/entity/player/EntityPlayer;", "applyAsDouble" })
final class Class35 implements ToDoubleFunction
{
    final Packet Field8034;
    private int Field8035;
    
    @Override
    public double applyAsDouble(final Object o) {
        return this.Method278((EntityPlayer)o);
    }
    
    public final double Method278(@NotNull @NotNull final EntityPlayer entityPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)entityPlayer, "player");
        return entityPlayer.getDistance(((SPacketSpawnObject)this.Field8034).getX(), ((SPacketSpawnObject)this.Field8034).getY(), ((SPacketSpawnObject)this.Field8034).getZ());
    }
    
    Class35(final Packet field8034) {
        this.Field8034 = field8034;
    }
    
    private static String Method279(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x78D ^ 0xD8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
