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
import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import kotlin.Metadata;
import kotlin.TypeCastException;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.KERrE2LuaTOrvMyD8cdKgzP1mK1VMR0l;
import lavahack.client.o73igJQaa2O9BEYFQNAk42oaxHBow5kd;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016\u00a8\u0006\u0005"}, d2={"com/kisman/cc/features/module/movement/speed/SpeedModes$5", "Lcom/kisman/cc/features/module/movement/speed/ISpeedMode;", "onEnable", "", "update", "kisman.cc"})
public final class aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8$5
implements KERrE2LuaTOrvMyD8cdKgzP1mK1VMR0l {
    private String Field15901 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method6529() {
    }

    @Override
    public void Method6530() {
        if (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.ticksExisted % (((int)777588232L ^ 0x2E590E09) << 2) == 0) {
            Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player, CPacketEntityAction.Action.START_FALL_FLYING));
        }
        if (!o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159()) return;
        if (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.onGround) {
            Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.gameSettings.keyBindJump.pressed = (int)((long)1444901474 ^ (long)1444901474);
            Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.jump();
            return;
        }
        if ((double)Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.fallDistance <= Double.longBitsToDouble(0x439A6DBABE0C0527L ^ 0x7C23F42327959CBDL)) {
            EntityPlayerSP entityPlayerSP = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player;
            if (entityPlayerSP == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorEntityPlayer");
            }
            ((AccessorEntityPlayer)entityPlayerSP).Method6392(Float.intBitsToFloat((int)1995236899L ^ 0x4A499C5B));
            Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.jumpMovementFactor = Float.intBitsToFloat((int)210466502L ^ 0x305659DD);
            EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1952(Float.intBitsToFloat((int)598249086L ^ 0x1C688E7E));
            return;
        }
        if ((double)Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.fallDistance > Double.longBitsToDouble((long)1966718392 ^ 0x3FB99999ECA02422L) && (double)Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.fallDistance < Double.longBitsToDouble((long)1368009035 ^ 0x3FF4CCCC9D46E586L)) {
            EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1952(Float.intBitsToFloat((int)((long)1508639776 ^ (long)1725904659)));
            return;
        }
        if (!((double)Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.fallDistance >= Double.longBitsToDouble(0x6458356EB79F06BL ^ 0x39B14F9A27B53CA6L))) return;
        EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1953();
        EntityPlayerSP entityPlayerSP = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player;
        if (entityPlayerSP == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorEntityPlayer");
        }
        ((AccessorEntityPlayer)entityPlayerSP).Method6392(Float.intBitsToFloat((int)((long)1560721179 ^ (long)1638124899)));
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.jumpMovementFactor = Float.intBitsToFloat(0x4C9B7476 ^ 0x7057B8BB);
    }

    aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8$5() {
    }

    private static String Method6550(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1166469894 ^ (long)1166469894);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1798034858 ^ (long)1798034773);
            int n2 = (int)((long)571699184 ^ (long)571699015);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1017716865 ^ (long)-1017710092) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

