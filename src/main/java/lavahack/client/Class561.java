//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.entity.player.*;
import kotlin.jvm.internal.*;
import net.minecraft.entity.*;
import net.minecraft.init.*;
import java.util.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.entity.*;
import net.minecraft.block.state.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "run" })
final class Class561 implements Runnable
{
    final Class791 Field10390;
    private String Field10391 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public final void run() {
        if (!Class1917.Method7159() && !Class791.Method3303(this.Field10390)) {
            for (final EntityPlayer entityPlayer : Class791.Method3301().world.playerEntities) {
                if (Intrinsics.areEqual((Object)entityPlayer, (Object)Class791.Method3301().player)) {
                    continue;
                }
                final float getDistance = Class791.Method3301().player.getDistance((Entity)entityPlayer);
                final Class44 method3305 = Class791.Method3305(this.Field10390);
                Intrinsics.checkExpressionValueIsNotNull((Object)method3305, "distance");
                if (getDistance <= method3305.Method335()) {
                    final Class44 method3306 = Class791.Method3306(this.Field10390);
                    Intrinsics.checkExpressionValueIsNotNull((Object)method3306, "autoBurrow");
                    Label_0191: {
                        if (method3306.Method365()) {
                            final Class44 field13063 = Class1124.Field13068.Field13063;
                            Intrinsics.checkExpressionValueIsNotNull((Object)field13063, "Burrow2.instance.keepOn");
                            if (!field13063.Method365()) {
                                final WorldClient world = Class791.Method3301().world;
                                final EntityPlayerSP player = Class791.Method3301().player;
                                Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
                                final IBlockState getBlockState = world.getBlockState(player.getPosition());
                                Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState, "mc.world.getBlockState(mc.player.position)");
                                if (!(Intrinsics.areEqual((Object)getBlockState.getBlock(), (Object)Blocks.AIR) ^ true)) {
                                    break Label_0191;
                                }
                            }
                            Class1124.Field13068.Method36();
                        }
                    }
                    final Class44 method3307 = Class791.Method3307(this.Field10390);
                    Intrinsics.checkExpressionValueIsNotNull((Object)method3307, "autoSurround");
                    if (method3307.Method365()) {
                        Class1008.Field12376.Method36();
                    }
                    Class791.Method3304(this.Field10390, true);
                    break;
                }
            }
        }
        if (Class791.Method3303(this.Field10390)) {
            for (final EntityPlayer entityPlayer2 : Class791.Method3301().world.playerEntities) {
                if (Intrinsics.areEqual((Object)entityPlayer2, (Object)Class791.Method3301().player)) {
                    continue;
                }
                final float getDistance2 = Class791.Method3301().player.getDistance((Entity)entityPlayer2);
                final Class44 method3308 = Class791.Method3305(this.Field10390);
                Intrinsics.checkExpressionValueIsNotNull((Object)method3308, "distance");
                if (getDistance2 <= method3308.Method335()) {
                    break;
                }
            }
            Class791.Method3304(this.Field10390, false);
        }
    }
    
    Class561(final Class791 field10390) {
        this.Field10390 = field10390;
    }
    
    private static String Method2478(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5EE6 ^ 0x8E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
