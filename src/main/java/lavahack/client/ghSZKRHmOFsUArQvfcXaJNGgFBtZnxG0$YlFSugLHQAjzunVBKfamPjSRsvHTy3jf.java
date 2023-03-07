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
 *  net.minecraft.network.play.server.SPacketRespawn
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.ChunkPos
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.gIvxvpNAI6XugtMxK19p7peBbgdbr5DL;
import lavahack.client.ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.kuf37sLYG4IC7svenBai9Ct5aGFtOEqd;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketBlockChange;
import net.minecraft.network.play.server.SPacketRespawn;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "kotlin.jvm.PlatformType", "invoke"})
final class ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    final ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 Field10807;
    private String Field10808 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method2831((TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV)object);
    }

    public final void Method2831(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Method2331(this.Field10807) == null) {
            return;
        }
        TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2 = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        Intrinsics.checkExpressionValueIsNotNull((Object)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2, (String)"it");
        Packet packet = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2.Method982();
        if (packet instanceof SPacketBlockChange) {
            String string = "unknown";
            if (Intrinsics.areEqual((Object)((SPacketBlockChange)packet).getBlockPosition(), (Object)ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Method2333(this.Field10807))) {
                string = "heartbeat";
                kuf37sLYG4IC7svenBai9Ct5aGFtOEqd kuf37sLYG4IC7svenBai9Ct5aGFtOEqd2 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Method2331(this.Field10807);
                if (kuf37sLYG4IC7svenBai9Ct5aGFtOEqd2 == null) {
                    Intrinsics.throwNpe();
                }
                kuf37sLYG4IC7svenBai9Ct5aGFtOEqd2.Method4504();
            } else {
                BlockPos blockPos = ((SPacketBlockChange)packet).getBlockPosition();
                Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, (String)"packet.blockPosition");
                if (blockPos.getY() != 0) {
                    return;
                }
                kuf37sLYG4IC7svenBai9Ct5aGFtOEqd kuf37sLYG4IC7svenBai9Ct5aGFtOEqd3 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Method2331(this.Field10807);
                if (kuf37sLYG4IC7svenBai9Ct5aGFtOEqd3 == null) {
                    Intrinsics.throwNpe();
                }
                for (ChunkPos chunkPos : kuf37sLYG4IC7svenBai9Ct5aGFtOEqd3.Method4498()) {
                    if (!Intrinsics.areEqual((Object)chunkPos.getBlock((int)((long)320043354 ^ (long)320043354), (int)-1137585581L ^ 0xBC31D253, (int)((long)-2061534741 ^ (long)-2061534741)), (Object)((SPacketBlockChange)packet).getBlockPosition())) continue;
                    kuf37sLYG4IC7svenBai9Ct5aGFtOEqd kuf37sLYG4IC7svenBai9Ct5aGFtOEqd4 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Method2331(this.Field10807);
                    if (kuf37sLYG4IC7svenBai9Ct5aGFtOEqd4 == null) {
                        Intrinsics.throwNpe();
                    }
                    ChunkPos chunkPos2 = chunkPos;
                    Intrinsics.checkExpressionValueIsNotNull((Object)chunkPos2, (String)"chunk");
                    kuf37sLYG4IC7svenBai9Ct5aGFtOEqd4.Method4507(chunkPos2);
                    string = "primary chunk";
                    break;
                }
            }
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field10807.Method2320();
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"this.debug");
            if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return;
            gIvxvpNAI6XugtMxK19p7peBbgdbr5DL gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2 = NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5506();
            StringBuilder stringBuilder = new StringBuilder().append(string).append(((int)2001981340L ^ 0x7753CF9D) << 5).append(((SPacketBlockChange)packet).getBlockPosition().toString()).append(" -> ");
            IBlockState iBlockState = ((SPacketBlockChange)packet).blockState;
            Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"packet.blockState");
            Block block = iBlockState.getBlock();
            Intrinsics.checkExpressionValueIsNotNull((Object)block, (String)"packet.blockState.block");
            gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2.Method1886(stringBuilder.append(block.getLocalizedName()).toString());
            return;
        }
        if (!(packet instanceof SPacketRespawn)) return;
        kuf37sLYG4IC7svenBai9Ct5aGFtOEqd kuf37sLYG4IC7svenBai9Ct5aGFtOEqd5 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Method2331(this.Field10807);
        if (kuf37sLYG4IC7svenBai9Ct5aGFtOEqd5 == null) {
            Intrinsics.throwNpe();
        }
        if (kuf37sLYG4IC7svenBai9Ct5aGFtOEqd5.Method4500() == ((SPacketRespawn)packet).getDimensionID()) return;
        kuf37sLYG4IC7svenBai9Ct5aGFtOEqd kuf37sLYG4IC7svenBai9Ct5aGFtOEqd6 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Method2331(this.Field10807);
        if (kuf37sLYG4IC7svenBai9Ct5aGFtOEqd6 == null) {
            Intrinsics.throwNpe();
        }
        kuf37sLYG4IC7svenBai9Ct5aGFtOEqd6.Method4505(((SPacketRespawn)packet).getDimensionID());
    }

    ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02) {
        this.Field10807 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02;
    }

    private static String Method2832(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1681021650 ^ (long)-1681021650);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-269349188L ^ 0xEFF20E43);
            int n2 = (int)((long)-1011808771 ^ (long)-1011808868) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-951122908L ^ 0xC74F028F) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

