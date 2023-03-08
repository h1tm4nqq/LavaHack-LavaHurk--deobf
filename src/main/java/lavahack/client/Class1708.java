//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016?\u0006\u0005" }, d2 = { "com/kisman/cc/features/module/movement/speed/SpeedModes$8", "Lcom/kisman/cc/features/module/movement/speed/ISpeedMode;", "onEnable", "", "update", "kisman.cc" })
public final class Class1708 implements Class1703
{
    private String Field15897 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method6529() {
    }
    
    public void Method6530() {
        if (Class1917.Method7159()) {
            if (Class2142.Field17803.player.onGround) {
                Class2142.Field17803.player.jump();
            }
            else {
                Class1917.Method7147(Double.longBitsToDouble(4597329443535256236L));
            }
        }
    }
    
    Class1708() {
    }
}
