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
import com.kisman.cc.util.Class2142;
import kotlin.Metadata;
import kotlin.TypeCastException;
import lavahack.client.Class1703;
import lavahack.client.Class1917;
import lavahack.client.Class394;
import net.minecraft.client.entity.EntityPlayerSP;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016\u00a8\u0006\u0005"}, d2={"com/kisman/cc/features/module/movement/speed/SpeedModes$4", "Lcom/kisman/cc/features/module/movement/speed/ISpeedMode;", "onEnable", "", "update", "kisman.cc"})
public final class Class1717
implements Class1703 {
    private String Field15916 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method6529() {
    }

    @Override
    public void Method6530() {
        if (!Class1917.Method7159()) return;
        Class2142.Field17803.gameSettings.keyBindJump.pressed = false;
        if (Class2142.Field17803.player.onGround) {
            Class2142.Field17803.player.jump();
            EntityPlayerSP entityPlayerSP = Class2142.Field17803.player;
            if (entityPlayerSP == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorEntityPlayer");
            }
            ((AccessorEntityPlayer)entityPlayerSP).Method6392(Float.intBitsToFloat(1017799875));
            Class2142.Field17803.player.jumpMovementFactor = Float.intBitsToFloat(0x3DCCCCCD);
            Class394.Method1952(Float.intBitsToFloat(1064346583));
        }
        if (!((double)Class2142.Field17803.player.fallDistance > Double.longBitsToDouble(0x3FE3333333333333L))) return;
        if (!((double)Class2142.Field17803.player.fallDistance < Double.longBitsToDouble(4608533498688228557L))) return;
        EntityPlayerSP entityPlayerSP = Class2142.Field17803.player;
        if (entityPlayerSP == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorEntityPlayer");
        }
        ((AccessorEntityPlayer)entityPlayerSP).Method6392(Float.intBitsToFloat(1017799875));
        Class394.Method1952(Float.intBitsToFloat(1072064102));
    }

    Class1717() {
    }

    private static String Method6570(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 105;
            cArray2[n] = (char)(cArray[n] ^ (0x20E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

