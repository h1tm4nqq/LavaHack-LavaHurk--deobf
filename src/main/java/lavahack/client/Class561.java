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
import lavahack.client.Class1008;
import lavahack.client.Class1124;
import lavahack.client.Class1917;
import lavahack.client.Class44;
import lavahack.client.Class791;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class Class561
implements Runnable {
    final Class791 Field10390;
    private String Field10391 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public final void run() {
        block6: {
            if (Class1917.Method7159() || Class791.Method3303(this.Field10390)) break block6;
            for (EntityPlayer entityPlayer : Class791.Method3301().world.playerEntities) {
                block7: {
                    block8: {
                        if (Intrinsics.areEqual((Object)entityPlayer, (Object)Class791.Method3301().player)) continue;
                        float f = Class791.Method3301().player.getDistance((Entity)entityPlayer);
                        Class44 class44 = Class791.Method3305(this.Field10390);
                        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"distance");
                        if (!(f <= (float)class44.Method335())) continue;
                        Class44 class442 = Class791.Method3306(this.Field10390);
                        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"autoBurrow");
                        if (!class442.Method365()) break block7;
                        Class44 class443 = Class1124.Field13068.Field13063;
                        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"Burrow2.instance.keepOn");
                        if (class443.Method365()) break block8;
                        WorldClient worldClient = Class791.Method3301().world;
                        EntityPlayerSP entityPlayerSP = Class791.Method3301().player;
                        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                        IBlockState iBlockState = worldClient.getBlockState(entityPlayerSP.getPosition());
                        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(mc.player.position)");
                        if (!(Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.AIR) ^ true)) break block7;
                    }
                    Class1124.Field13068.Method36();
                }
                Class44 class44 = Class791.Method3307(this.Field10390);
                Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"autoSurround");
                if (class44.Method365()) {
                    Class1008.Field12376.Method36();
                }
                Class791.Method3304(this.Field10390, true);
                break;
            }
        }
        if (!Class791.Method3303(this.Field10390)) return;
        boolean bl = false;
        for (EntityPlayer entityPlayer : Class791.Method3301().world.playerEntities) {
            if (Intrinsics.areEqual((Object)entityPlayer, (Object)Class791.Method3301().player)) continue;
            float f = Class791.Method3301().player.getDistance((Entity)entityPlayer);
            Class44 class44 = Class791.Method3305(this.Field10390);
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"distance");
            if (!(f <= (float)class44.Method335())) continue;
            bl = true;
            break;
        }
        Class791.Method3304(this.Field10390, false);
    }

    Class561(Class791 class791) {
        this.Field10390 = class791;
    }

    private static String Method2478(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 142;
            cArray2[n] = (char)(cArray[n] ^ (0x5EE6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

