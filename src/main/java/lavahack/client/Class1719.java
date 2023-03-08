//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016?\u0006\u0005" }, d2 = { "com/kisman/cc/features/module/movement/speed/SpeedModes$2", "Lcom/kisman/cc/features/module/movement/speed/ISpeedMode;", "onEnable", "", "update", "kisman.cc" })
public final class Class1719 implements Class1703
{
    private String Field15918 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method6529() {
    }
    
    public void Method6530() {
        if (Class1917.Method7159() && !Class2142.Field17803.player.collidedHorizontally) {
            if (Class2142.Field17803.player.onGround) {
                Class394.Method1952(Float.intBitsToFloat(1066611507));
                Class2142.Field17803.player.jump();
                final Class44 method7380 = Class1989.Field17152.Method7380();
                if (method7380 == null) {
                    Intrinsics.throwNpe();
                }
                final double[] method7381 = Class1917.Method7150(Class1917.Method7154(method7380.Method365(), Double.longBitsToDouble((long)179947752 ^ 0x3FD2631F80B0CA36L)));
                Class2142.Field17803.player.motionX = method7381[0];
                Class2142.Field17803.player.motionZ = method7381[1];
            }
            else {
                Class2142.Field17803.player.motionY = Double.longBitsToDouble((long)1133958597 ^ 0xBFF000004396D5C5L);
                Class394.Method1953();
            }
        }
    }
    
    Class1719() {
    }
}
