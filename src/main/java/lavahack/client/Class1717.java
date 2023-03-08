//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import kotlin.*;
import com.kisman.cc.mixin.mixins.accessor.*;
import net.minecraft.client.entity.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016?\u0006\u0005" }, d2 = { "com/kisman/cc/features/module/movement/speed/SpeedModes$4", "Lcom/kisman/cc/features/module/movement/speed/ISpeedMode;", "onEnable", "", "update", "kisman.cc" })
public final class Class1717 implements Class1703
{
    private String Field15916 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method6529() {
    }
    
    public void Method6530() {
        if (Class1917.Method7159()) {
            Class2142.Field17803.gameSettings.keyBindJump.pressed = false;
            if (Class2142.Field17803.player.onGround) {
                Class2142.Field17803.player.jump();
                final EntityPlayerSP player = Class2142.Field17803.player;
                if (player == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorEntityPlayer");
                }
                ((AccessorEntityPlayer)player).Method6392(Float.intBitsToFloat(1017799875));
                Class2142.Field17803.player.jumpMovementFactor = Float.intBitsToFloat(1036831949);
                Class394.Method1952(Float.intBitsToFloat(1064346583));
            }
            if (Class2142.Field17803.player.fallDistance > Double.longBitsToDouble(4603579539098121011L) && Class2142.Field17803.player.fallDistance < Double.longBitsToDouble(4608533498688228557L)) {
                final EntityPlayerSP player2 = Class2142.Field17803.player;
                if (player2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorEntityPlayer");
                }
                ((AccessorEntityPlayer)player2).Method6392(Float.intBitsToFloat(1017799875));
                Class394.Method1952(Float.intBitsToFloat(1072064102));
            }
        }
    }
    
    Class1717() {
    }
    
    private static String Method6570(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x20E ^ 0x69));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
