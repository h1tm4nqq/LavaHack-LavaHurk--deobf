//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA;
import lavahack.client.euqf1JFTGTMHHa42QPC0LPkhINLctBkD;
import lavahack.client.hjEf4RewUHmrg3aViFltbuwtrChcFb7G;
import lavahack.client.o73igJQaa2O9BEYFQNAk42oaxHBow5kd;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class hjEf4RewUHmrg3aViFltbuwtrChcFb7G$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements Runnable {
    final hjEf4RewUHmrg3aViFltbuwtrChcFb7G Field10390;
    private String Field10391 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public final void run() {
        block6: {
            if (o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159() || hjEf4RewUHmrg3aViFltbuwtrChcFb7G.Method3303(this.Field10390)) break block6;
            for (EntityPlayer entityPlayer : hjEf4RewUHmrg3aViFltbuwtrChcFb7G.Method3301().world.playerEntities) {
                block7: {
                    block8: {
                        if (Intrinsics.areEqual((Object)entityPlayer, (Object)hjEf4RewUHmrg3aViFltbuwtrChcFb7G.Method3301().player)) continue;
                        float f = hjEf4RewUHmrg3aViFltbuwtrChcFb7G.Method3301().player.getDistance((Entity)entityPlayer);
                        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = hjEf4RewUHmrg3aViFltbuwtrChcFb7G.Method3305(this.Field10390);
                        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"distance");
                        if (!(f <= (float)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method335())) continue;
                        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = hjEf4RewUHmrg3aViFltbuwtrChcFb7G.Method3306(this.Field10390);
                        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"autoBurrow");
                        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) break block7;
                        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = euqf1JFTGTMHHa42QPC0LPkhINLctBkD.Field13068.Field13063;
                        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"Burrow2.instance.keepOn");
                        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method365()) break block8;
                        WorldClient worldClient = hjEf4RewUHmrg3aViFltbuwtrChcFb7G.Method3301().world;
                        EntityPlayerSP entityPlayerSP = hjEf4RewUHmrg3aViFltbuwtrChcFb7G.Method3301().player;
                        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                        IBlockState iBlockState = worldClient.getBlockState(entityPlayerSP.getPosition());
                        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(mc.player.position)");
                        if ((Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.AIR) ^ (int)((long)1140114129 ^ (long)1140114128)) == 0) break block7;
                    }
                    euqf1JFTGTMHHa42QPC0LPkhINLctBkD.Field13068.Method36();
                }
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = hjEf4RewUHmrg3aViFltbuwtrChcFb7G.Method3307(this.Field10390);
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"autoSurround");
                if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method365()) {
                    AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Field12376.Method36();
                }
                hjEf4RewUHmrg3aViFltbuwtrChcFb7G.Method3304(this.Field10390, ((int)551976116L ^ 0x20E67CB5) != 0);
                break;
            }
        }
        if (!hjEf4RewUHmrg3aViFltbuwtrChcFb7G.Method3303(this.Field10390)) return;
        int n = (int)((long)-584195352 ^ (long)-584195352);
        for (EntityPlayer entityPlayer : hjEf4RewUHmrg3aViFltbuwtrChcFb7G.Method3301().world.playerEntities) {
            if (Intrinsics.areEqual((Object)entityPlayer, (Object)hjEf4RewUHmrg3aViFltbuwtrChcFb7G.Method3301().player)) continue;
            float f = hjEf4RewUHmrg3aViFltbuwtrChcFb7G.Method3301().player.getDistance((Entity)entityPlayer);
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = hjEf4RewUHmrg3aViFltbuwtrChcFb7G.Method3305(this.Field10390);
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"distance");
            if (!(f <= (float)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method335())) continue;
            n = (int)562356649L ^ 0x2184E1A8;
            break;
        }
        hjEf4RewUHmrg3aViFltbuwtrChcFb7G.Method3304(this.Field10390, (boolean)((long)43901532 ^ (long)43901532));
    }

    hjEf4RewUHmrg3aViFltbuwtrChcFb7G$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(hjEf4RewUHmrg3aViFltbuwtrChcFb7G hjEf4RewUHmrg3aViFltbuwtrChcFb7G2) {
        this.Field10390 = hjEf4RewUHmrg3aViFltbuwtrChcFb7G2;
    }

    private static String Method2478(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-585527201 ^ (long)-585527201);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-297514884L ^ 0xEE444883);
            int n2 = ((int)-1710371702L ^ 0x9A0DCCCD) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-41949250 ^ (long)-41957171) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

