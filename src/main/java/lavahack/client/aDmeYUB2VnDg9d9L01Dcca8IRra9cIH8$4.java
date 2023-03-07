//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  net.minecraft.client.entity.EntityPlayerSP
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

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016\u00a8\u0006\u0005"}, d2={"com/kisman/cc/features/module/movement/speed/SpeedModes$4", "Lcom/kisman/cc/features/module/movement/speed/ISpeedMode;", "onEnable", "", "update", "kisman.cc"})
public final class aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8$4
implements KERrE2LuaTOrvMyD8cdKgzP1mK1VMR0l {
    private String Field15916 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method6529() {
    }

    @Override
    public void Method6530() {
        if (!o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159()) return;
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.gameSettings.keyBindJump.pressed = (int)((long)-2006012349 ^ (long)-2006012349);
        if (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.onGround) {
            Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.jump();
            EntityPlayerSP entityPlayerSP = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player;
            if (entityPlayerSP == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorEntityPlayer");
            }
            ((AccessorEntityPlayer)entityPlayerSP).Method6392(Float.intBitsToFloat(0x39C02670 ^ 0x56A42B3));
            Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.jumpMovementFactor = Float.intBitsToFloat((int)((long)1771732854 ^ (long)1414968251));
            EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1952(Float.intBitsToFloat((int)1002239352L ^ 0x4CC56AF));
        }
        if (!((double)Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.fallDistance > Double.longBitsToDouble(0x595163E6FA526137L ^ 0x66B250D5C9615204L))) return;
        if (!((double)Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.fallDistance < Double.longBitsToDouble(0xD6BDDF82416FC6BAL ^ 0xE949134E8DA30A77L))) return;
        EntityPlayerSP entityPlayerSP = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player;
        if (entityPlayerSP == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorEntityPlayer");
        }
        ((AccessorEntityPlayer)entityPlayerSP).Method6392(Float.intBitsToFloat((int)1106115553L ^ 0x7D479F22));
        EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1952(Float.intBitsToFloat((int)((long)1621894926 ^ (long)1598701928)));
    }

    aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8$4() {
    }

    private static String Method6570(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1542260308 ^ (long)1542260308);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1837092331L ^ 0x928032EA);
            int n2 = (int)((long)2103755675 ^ (long)2103755762);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1238953395 ^ (long)-1238953142) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

