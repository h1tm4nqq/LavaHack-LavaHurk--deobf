//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.entity.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016?\u0006\u0005" }, d2 = { "com/kisman/cc/features/module/movement/speed/SpeedModes$7", "Lcom/kisman/cc/features/module/movement/speed/ISpeedMode;", "onEnable", "", "update", "kisman.cc" })
public final class Class1707 implements Class1703
{
    private String Field15896 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method6529() {
    }
    
    public void Method6530() {
        if (Class1917.Method7159()) {
            if (Class2142.Field17803.player.onGround) {
                Class2142.Field17803.player.jump();
            }
            else {
                final float method7160 = Class1917.Method7160();
                final EntityPlayerSP player = Class2142.Field17803.player;
                final float n = (float)Math.sin(method7160);
                final EntityPlayerSP entityPlayerSP = player;
                final double n2 = -n;
                final Class44 method7161 = Class1989.Field17152.Method7377();
                if (method7161 == null) {
                    Intrinsics.throwNpe();
                }
                entityPlayerSP.motionX = n2 * method7161.Method367();
                final EntityPlayerSP player2 = Class2142.Field17803.player;
                final float n3 = (float)Math.cos(method7160);
                final EntityPlayerSP entityPlayerSP2 = player2;
                final double n4 = n3;
                final Class44 method7162 = Class1989.Field17152.Method7378();
                if (method7162 == null) {
                    Intrinsics.throwNpe();
                }
                entityPlayerSP2.motionZ = n4 * method7162.Method367();
            }
        }
    }
    
    Class1707() {
    }
}
