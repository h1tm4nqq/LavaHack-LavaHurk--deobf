//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.init.*;
import com.kisman.cc.util.*;
import net.minecraft.network.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.client.entity.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016?\u0006\u0006" }, d2 = { "com/kisman/cc/util/enums/PhaseModes$1", "Lcom/kisman/cc/util/enums/IPhaseMode;", "update", "", "phase", "Lcom/kisman/cc/features/module/movement/Phase;", "kisman.cc" })
public final class Class642 implements Class770
{
    private String Field10774 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method2773(@NotNull @NotNull final Class843 class843) {
        Intrinsics.checkParameterIsNotNull((Object)class843, "phase");
        final int method116 = Class9.Method116(Items.ENDER_PEARL, 0, 9);
        final float rotationPitch = Class2142.Field17803.player.rotationPitch;
        if (Class2142.Field17803.player.collidedHorizontally && method116 != -1) {
            Class2142.Field17803.player.connection.sendPacket((Packet)new CPacketPlayer$Rotation(Class2142.Field17803.player.rotationYaw, Float.intBitsToFloat(1118306304), Class2142.Field17803.player.onGround));
            final EntityPlayerSP player = Class2142.Field17803.player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
            Label_0256: {
                if (!player.getHeldItemMainhand().getItem().equals((Object)Items.ENDER_PEARL)) {
                    final EntityPlayerSP player2 = Class2142.Field17803.player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
                    if (!player2.getHeldItemOffhand().getItem().equals((Object)Items.ENDER_PEARL)) {
                        final int currentItem = Class2142.Field17803.player.inventory.currentItem;
                        Class2142.Field17803.player.connection.sendPacket((Packet)new CPacketHeldItemChange(method116));
                        Class2142.Field17803.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
                        Class2142.Field17803.player.connection.sendPacket((Packet)new CPacketHeldItemChange(currentItem));
                        break Label_0256;
                    }
                }
                Class2142.Field17803.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
            }
            Class2142.Field17803.player.connection.sendPacket((Packet)new CPacketPlayer$Rotation(Class2142.Field17803.player.rotationYaw, rotationPitch, Class2142.Field17803.player.onGround));
            if (class843.Method3573().Method365()) {
                class843.Method21(false);
            }
        }
    }
    
    Class642() {
    }
    
    private static String Method2774(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xDAD ^ 0x71));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
