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
import lavahack.client.Class1101;
import lavahack.client.Class1393;
import lavahack.client.Class1740;
import lavahack.client.Class254;
import lavahack.client.Class44;
import lavahack.client.Class504;
import lavahack.client.Class544;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketBlockChange;
import net.minecraft.network.play.server.SPacketRespawn;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "kotlin.jvm.PlatformType", "invoke"})
final class Class657
implements Class254 {
    final Class504 Field10807;
    private String Field10808 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method2831((Class544)object);
    }

    public final void Method2831(Class544 class544) {
        if (Class504.Method2331(this.Field10807) == null) {
            return;
        }
        Class544 class5442 = class544;
        Intrinsics.checkExpressionValueIsNotNull((Object)class5442, (String)"it");
        Packet packet = class5442.Method982();
        if (packet instanceof SPacketBlockChange) {
            String string = "unknown";
            if (Intrinsics.areEqual((Object)((SPacketBlockChange)packet).getBlockPosition(), (Object)Class504.Method2333(this.Field10807))) {
                string = "heartbeat";
                Class1101 class1101 = Class504.Method2331(this.Field10807);
                if (class1101 == null) {
                    Intrinsics.throwNpe();
                }
                class1101.Method4504();
            } else {
                BlockPos blockPos = ((SPacketBlockChange)packet).getBlockPosition();
                Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, (String)"packet.blockPosition");
                if (blockPos.getY() != 0) {
                    return;
                }
                Class1101 class1101 = Class504.Method2331(this.Field10807);
                if (class1101 == null) {
                    Intrinsics.throwNpe();
                }
                for (ChunkPos chunkPos : class1101.Method4498()) {
                    if (!Intrinsics.areEqual((Object)chunkPos.getBlock(0, 0, 0), (Object)((SPacketBlockChange)packet).getBlockPosition())) continue;
                    Class1101 class11012 = Class504.Method2331(this.Field10807);
                    if (class11012 == null) {
                        Intrinsics.throwNpe();
                    }
                    ChunkPos chunkPos2 = chunkPos;
                    Intrinsics.checkExpressionValueIsNotNull((Object)chunkPos2, (String)"chunk");
                    class11012.Method4507(chunkPos2);
                    string = "primary chunk";
                    break;
                }
            }
            Class44 class44 = this.Field10807.Method2320();
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"this.debug");
            if (!class44.Method365()) return;
            Class1740 class1740 = Class1393.Method5506();
            StringBuilder stringBuilder = new StringBuilder().append(string).append(' ').append(((SPacketBlockChange)packet).getBlockPosition().toString()).append(" -> ");
            IBlockState iBlockState = ((SPacketBlockChange)packet).blockState;
            Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"packet.blockState");
            Block block = iBlockState.getBlock();
            Intrinsics.checkExpressionValueIsNotNull((Object)block, (String)"packet.blockState.block");
            class1740.Method1886(stringBuilder.append(block.getLocalizedName()).toString());
            return;
        }
        if (!(packet instanceof SPacketRespawn)) return;
        Class1101 class1101 = Class504.Method2331(this.Field10807);
        if (class1101 == null) {
            Intrinsics.throwNpe();
        }
        if (class1101.Method4500() == ((SPacketRespawn)packet).getDimensionID()) return;
        Class1101 class11013 = Class504.Method2331(this.Field10807);
        if (class11013 == null) {
            Intrinsics.throwNpe();
        }
        class11013.Method4505(((SPacketRespawn)packet).getDimensionID());
    }

    Class657(Class504 class504) {
        this.Field10807 = class504;
    }

    private static String Method2832(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 194;
            cArray2[n] = (char)(cArray[n] ^ (0xD56 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

