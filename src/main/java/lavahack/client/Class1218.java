//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.server.SPacketBlockChange
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.ChunkPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 */
package lavahack.client;

import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1393;
import lavahack.client.Class1740;
import lavahack.client.Class254;
import lavahack.client.Class44;
import lavahack.client.Class544;
import lavahack.client.Class615;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketBlockChange;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "kotlin.jvm.PlatformType", "invoke"})
final class Class1218
implements Class254 {
    final Class615 Field13520;
    private String Field13521 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method4915((Class544)object);
    }

    public final void Method4915(Class544 class544) {
        Class544 class5442 = class544;
        Intrinsics.checkExpressionValueIsNotNull((Object)class5442, (String)"it");
        Packet packet = class5442.Method982();
        if (!(packet instanceof SPacketBlockChange)) return;
        ChunkPos chunkPos = new ChunkPos(((SPacketBlockChange)packet).getBlockPosition());
        Class44 class44 = Class615.Method2638(this.Field13520);
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"ignore");
        if (class44.Method365()) {
            if (!Class615.Method2639(this.Field13520).contains(chunkPos) && Class615.Method2636().world.isBlockLoaded(((SPacketBlockChange)packet).getBlockPosition(), false)) {
                return;
            }
            Class44 class442 = Class615.Method2640(this.Field13520);
            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"notify");
            if (class442.Method365()) {
                Class1393.Method5507().Method1886("NoCom found something");
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        double d = Class615.Method2636().player.posX;
        BlockPos blockPos = ((SPacketBlockChange)packet).getBlockPosition();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, (String)"packet.blockPosition");
        Vec3d vec3d = new Vec3d(d, (double)blockPos.getY(), Class615.Method2636().player.posZ);
        Class1740 class1740 = Class1393.Method5503();
        StringBuilder stringBuilder = new StringBuilder().append(((SPacketBlockChange)packet).getBlockPosition()).append("->");
        IBlockState iBlockState = ((SPacketBlockChange)packet).blockState;
        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"packet.blockState");
        Block block = iBlockState.getBlock();
        Intrinsics.checkExpressionValueIsNotNull((Object)block, (String)"packet.blockState.block");
        class1740.Method1886(stringBuilder.append(block.getLocalizedName()).append(" (").append(decimalFormat.format(vec3d.distanceTo(new Vec3d((Vec3i)((SPacketBlockChange)packet).getBlockPosition())))).append(") ").append(Class615.Method2636().player.dimension == -1 ? "Nether" : (Class615.Method2636().player.dimension == 1 ? "End" : "Overworld")).toString());
        Class44 class443 = Class615.Method2641(this.Field13520);
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"latency");
        if (class443.Method365() && Class615.Method2642(this.Field13520) != -1L) {
            Class1393.Method5506().Method1886("Latency = " + (System.currentTimeMillis() - Class615.Method2642(this.Field13520)) + " ms");
            Class615.Method2643(this.Field13520, -1L);
        }
        Class44 class444 = Class615.Method2644(this.Field13520);
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"loadChunks");
        if (!class444.Method365()) return;
        Class44 class445 = Class615.Method2638(this.Field13520);
        Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"ignore");
        if (!class445.Method365()) return;
        if (Class615.Method2639(this.Field13520).contains(chunkPos)) return;
        Class615.Method2636().world.doPreChunk(chunkPos.x, chunkPos.z, true);
        Class615.Method2639(this.Field13520).add(chunkPos);
    }

    Class1218(Class615 class615) {
        this.Field13520 = class615;
    }

    private static String Method4916(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 228;
            cArray2[n] = (char)(cArray[n] ^ (0x6A98 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

