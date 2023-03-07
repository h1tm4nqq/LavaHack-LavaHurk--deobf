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
import lavahack.client.IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.gIvxvpNAI6XugtMxK19p7peBbgdbr5DL;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketBlockChange;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "kotlin.jvm.PlatformType", "invoke"})
final class IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    final IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6 Field13520;
    private String Field13521 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method4915((TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV)object);
    }

    public final void Method4915(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2 = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        Intrinsics.checkExpressionValueIsNotNull((Object)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2, (String)"it");
        Packet packet = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2.Method982();
        if (!(packet instanceof SPacketBlockChange)) return;
        ChunkPos chunkPos = new ChunkPos(((SPacketBlockChange)packet).getBlockPosition());
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Method2638(this.Field13520);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"ignore");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            if (!IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Method2639(this.Field13520).contains(chunkPos) && IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Method2636().world.isBlockLoaded(((SPacketBlockChange)packet).getBlockPosition(), (boolean)((long)491784445 ^ (long)491784445))) {
                return;
            }
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Method2640(this.Field13520);
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"notify");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) {
                NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5507().Method1886("NoCom found something");
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        double d = IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Method2636().player.posX;
        BlockPos blockPos = ((SPacketBlockChange)packet).getBlockPosition();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, (String)"packet.blockPosition");
        Vec3d vec3d = new Vec3d(d, (double)blockPos.getY(), IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Method2636().player.posZ);
        gIvxvpNAI6XugtMxK19p7peBbgdbr5DL gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2 = NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5503();
        StringBuilder stringBuilder = new StringBuilder().append(((SPacketBlockChange)packet).getBlockPosition()).append("->");
        IBlockState iBlockState = ((SPacketBlockChange)packet).blockState;
        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"packet.blockState");
        Block block = iBlockState.getBlock();
        Intrinsics.checkExpressionValueIsNotNull((Object)block, (String)"packet.blockState.block");
        gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2.Method1886(stringBuilder.append(block.getLocalizedName()).append(" (").append(decimalFormat.format(vec3d.distanceTo(new Vec3d((Vec3i)((SPacketBlockChange)packet).getBlockPosition())))).append(") ").append(IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Method2636().player.dimension == ((int)-2058643581L ^ 0x7AB4687C) ? "Nether" : (IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Method2636().player.dimension == (int)((long)-1262859402 ^ (long)-1262859401) ? "End" : "Overworld")).toString());
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Method2641(this.Field13520);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"latency");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method365() && IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Method2642(this.Field13520) != (0xFFFFFFFFFFFFFFFFL & 0xFFFFFFFFFFFFFFFFL)) {
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5506().Method1886("Latency = " + (System.currentTimeMillis() - IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Method2642(this.Field13520)) + " ms");
            IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Method2643(this.Field13520, 0xFFFFFFFFFFFFFFFFL & 0xFFFFFFFFFFFFFFFFL);
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Method2644(this.Field13520);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"loadChunks");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method365()) return;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Method2638(this.Field13520);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"ignore");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method365()) return;
        if (IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Method2639(this.Field13520).contains(chunkPos)) return;
        IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Method2636().world.doPreChunk(chunkPos.x, chunkPos.z, (boolean)((long)1246757421 ^ (long)1246757420));
        IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Method2639(this.Field13520).add(chunkPos);
    }

    IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6 ixCmTWNqonrT1aEfKEwU94YJ2BjoTjI6) {
        this.Field13520 = ixCmTWNqonrT1aEfKEwU94YJ2BjoTjI6;
    }

    private static String Method4916(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1038829010L ^ 0x3DEB45D2;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)85560013L ^ 0x5198A32);
            int n2 = ((int)26313392L ^ 0x1918289) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1424451338 ^ (long)1424452185) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

