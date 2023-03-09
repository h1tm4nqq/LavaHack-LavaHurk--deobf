//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketEntityAction
 *  net.minecraft.network.play.client.CPacketEntityAction$Action
 */
package lavahack.client;

import com.kisman.cc.mixin.mixins.accessor.AccessorEntityPlayer;
import com.kisman.cc.util.Class2142;
import kotlin.Metadata;
import kotlin.TypeCastException;
import lavahack.client.Class1703;
import lavahack.client.Class1917;
import lavahack.client.Class394;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016\u00a8\u0006\u0005"}, d2={"com/kisman/cc/features/module/movement/speed/SpeedModes$5", "Lcom/kisman/cc/features/module/movement/speed/ISpeedMode;", "onEnable", "", "update", "kisman.cc"})
public final class Class1710
implements Class1703 {
    private String Field15901 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method6529() {
    }

    @Override
    public void Method6530() {
        if (Class2142.Field17803.player.ticksExisted % 4 == 0) {
            Class2142.Field17803.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class2142.Field17803.player, CPacketEntityAction.Action.START_FALL_FLYING));
        }
        if (!Class1917.Method7159()) return;
        if (Class2142.Field17803.player.onGround) {
            Class2142.Field17803.gameSettings.keyBindJump.pressed = false;
            Class2142.Field17803.player.jump();
            return;
        }
        if ((double)Class2142.Field17803.player.fallDistance <= Double.longBitsToDouble(4591870180066957722L)) {
            EntityPlayerSP entityPlayerSP = Class2142.Field17803.player;
            if (entityPlayerSP == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorEntityPlayer");
            }
            ((AccessorEntityPlayer)entityPlayerSP).Method6392(Float.intBitsToFloat(1017477752));
            Class2142.Field17803.player.jumpMovementFactor = Float.intBitsToFloat(1021128475);
            Class394.Method1952(Float.intBitsToFloat(1069547520));
            return;
        }
        if ((double)Class2142.Field17803.player.fallDistance > Double.longBitsToDouble((long)1966718392 ^ 0x3FB99999ECA02422L) && (double)Class2142.Field17803.player.fallDistance < Double.longBitsToDouble((long)1368009035 ^ 0x3FF4CCCC9D46E586L)) {
            Class394.Method1952(Float.intBitsToFloat(0x3F333333));
            return;
        }
        if (!((double)Class2142.Field17803.player.fallDistance >= Double.longBitsToDouble(4608533498688228557L))) return;
        Class394.Method1953();
        EntityPlayerSP entityPlayerSP = Class2142.Field17803.player;
        if (entityPlayerSP == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorEntityPlayer");
        }
        ((AccessorEntityPlayer)entityPlayerSP).Method6392(Float.intBitsToFloat(1017477752));
        Class2142.Field17803.player.jumpMovementFactor = Float.intBitsToFloat(0x3CCCCCCD);
    }

    Class1710() {
    }

    private static String Method6550(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 183;
            cArray2[n] = (char)(cArray[n] ^ (0x4D16 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

