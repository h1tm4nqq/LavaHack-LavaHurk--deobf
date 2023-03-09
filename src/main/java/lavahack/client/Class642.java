//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.init.Items
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketHeldItemChange
 *  net.minecraft.network.play.client.CPacketPlayer$Rotation
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItem
 *  net.minecraft.util.EnumHand
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class770;
import lavahack.client.Class843;
import lavahack.client.Class9;
import net.minecraft.init.Items;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.util.EnumHand;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2={"com/kisman/cc/util/enums/PhaseModes$1", "Lcom/kisman/cc/util/enums/IPhaseMode;", "update", "", "phase", "Lcom/kisman/cc/features/module/movement/Phase;", "kisman.cc"})
public final class Class642
implements Class770 {
    private String Field10774 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    /*
     * Unable to fully structure code
     */
    @Override
    public void Method2773(@NotNull @NotNull Class843 var1_1) {
        Intrinsics.checkParameterIsNotNull((Object)var1_1, (String)"phase");
        var2_2 = Class9.Method116(Items.ENDER_PEARL, 0, 9);
        var3_3 = Class2142.Field17803.player.rotationPitch;
        if (Class2142.Field17803.player.collidedHorizontally == false) return;
        if (var2_2 == -1) return;
        Class2142.Field17803.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(Class2142.Field17803.player.rotationYaw, Float.intBitsToFloat(1118306304), Class2142.Field17803.player.onGround));
        v0 = Class2142.Field17803.player;
        Intrinsics.checkExpressionValueIsNotNull((Object)v0, (String)"mc.player");
        if (v0.getHeldItemMainhand().getItem().equals((Object)Items.ENDER_PEARL)) ** GOTO lbl-1000
        v1 = Class2142.Field17803.player;
        Intrinsics.checkExpressionValueIsNotNull((Object)v1, (String)"mc.player");
        if (v1.getHeldItemOffhand().getItem().equals((Object)Items.ENDER_PEARL)) lbl-1000:
        // 2 sources

        {
            Class2142.Field17803.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
        } else {
            var4_4 = Class2142.Field17803.player.inventory.currentItem;
            Class2142.Field17803.player.connection.sendPacket((Packet)new CPacketHeldItemChange(var2_2));
            Class2142.Field17803.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
            Class2142.Field17803.player.connection.sendPacket((Packet)new CPacketHeldItemChange(var4_4));
        }
        Class2142.Field17803.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(Class2142.Field17803.player.rotationYaw, var3_3, Class2142.Field17803.player.onGround));
        if (var1_1.Method3573().Method365() == false) return;
        var1_1.Method21(false);
    }

    Class642() {
    }

    private static String Method2774(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 113;
            cArray2[n] = (char)(cArray[n] ^ (0xDAD ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

