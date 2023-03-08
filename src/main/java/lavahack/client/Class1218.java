//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.network.play.server.*;
import java.text.*;
import net.minecraft.network.*;
import net.minecraft.util.math.*;
import net.minecraft.block.state.*;
import net.minecraft.block.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "kotlin.jvm.PlatformType", "invoke" })
final class Class1218 implements Class254
{
    final Class615 Field13520;
    private String Field13521 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method979(final Object o) {
        this.Method4915((Class544)o);
    }
    
    public final void Method4915(final Class544 class544) {
        Intrinsics.checkExpressionValueIsNotNull((Object)class544, "it");
        final Packet method982 = class544.Method982();
        if (method982 instanceof SPacketBlockChange) {
            final ChunkPos e = new ChunkPos(((SPacketBlockChange)method982).getBlockPosition());
            final Class44 method983 = Class615.Method2638(this.Field13520);
            Intrinsics.checkExpressionValueIsNotNull((Object)method983, "ignore");
            if (method983.Method365()) {
                if (!Class615.Method2639(this.Field13520).contains(e) && Class615.Method2636().world.isBlockLoaded(((SPacketBlockChange)method982).getBlockPosition(), false)) {
                    return;
                }
                final Class44 method984 = Class615.Method2640(this.Field13520);
                Intrinsics.checkExpressionValueIsNotNull((Object)method984, "notify");
                if (method984.Method365()) {
                    Class1393.Method5507().Method1886("NoCom found something");
                }
            }
            final DecimalFormat decimalFormat = new DecimalFormat("#.#");
            final double posX = Class615.Method2636().player.posX;
            final BlockPos getBlockPosition = ((SPacketBlockChange)method982).getBlockPosition();
            Intrinsics.checkExpressionValueIsNotNull((Object)getBlockPosition, "packet.blockPosition");
            final Vec3d vec3d = new Vec3d(posX, (double)getBlockPosition.getY(), Class615.Method2636().player.posZ);
            final Class1740 method985 = Class1393.Method5503();
            final StringBuilder append = new StringBuilder().append(((SPacketBlockChange)method982).getBlockPosition()).append("->");
            final IBlockState blockState = ((SPacketBlockChange)method982).blockState;
            Intrinsics.checkExpressionValueIsNotNull((Object)blockState, "packet.blockState");
            final Block getBlock = blockState.getBlock();
            Intrinsics.checkExpressionValueIsNotNull((Object)getBlock, "packet.blockState.block");
            method985.Method1886(append.append(getBlock.getLocalizedName()).append(" (").append(decimalFormat.format(vec3d.distanceTo(new Vec3d((Vec3i)((SPacketBlockChange)method982).getBlockPosition())))).append(") ").append((Class615.Method2636().player.dimension == -1) ? "Nether" : ((Class615.Method2636().player.dimension == 1) ? "End" : "Overworld")).toString());
            final Class44 method986 = Class615.Method2641(this.Field13520);
            Intrinsics.checkExpressionValueIsNotNull((Object)method986, "latency");
            if (method986.Method365() && Class615.Method2642(this.Field13520) != -1L) {
                Class1393.Method5506().Method1886("Latency = " + (System.currentTimeMillis() - Class615.Method2642(this.Field13520)) + " ms");
                Class615.Method2643(this.Field13520, -1L);
            }
            final Class44 method987 = Class615.Method2644(this.Field13520);
            Intrinsics.checkExpressionValueIsNotNull((Object)method987, "loadChunks");
            if (method987.Method365()) {
                final Class44 method988 = Class615.Method2638(this.Field13520);
                Intrinsics.checkExpressionValueIsNotNull((Object)method988, "ignore");
                if (method988.Method365() && !Class615.Method2639(this.Field13520).contains(e)) {
                    Class615.Method2636().world.doPreChunk(e.x, e.z, true);
                    Class615.Method2639(this.Field13520).add(e);
                }
            }
        }
    }
    
    Class1218(final Class615 field13520) {
        this.Field13520 = field13520;
    }
    
    private static String Method4916(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6A98 ^ 0xE4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
