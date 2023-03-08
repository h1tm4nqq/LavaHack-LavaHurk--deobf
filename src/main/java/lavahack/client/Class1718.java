//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import net.minecraft.client.entity.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016?\u0006\u0005" }, d2 = { "com/kisman/cc/features/module/movement/speed/SpeedModes$1", "Lcom/kisman/cc/features/module/movement/speed/ISpeedMode;", "onEnable", "", "update", "kisman.cc" })
public final class Class1718 implements Class1703
{
    private String Field15917 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method6529() {
    }
    
    public void Method6530() {
        if (Class1917.Method7159() && Class2142.Field17803.player.hurtTime < 5) {
            if (Class2142.Field17803.player.onGround) {
                Class2142.Field17803.player.motionY = Double.longBitsToDouble(4600967451314246124L);
                final float method7160 = Class1917.Method7160();
                final EntityPlayerSP player = Class2142.Field17803.player;
                player.motionX -= (float)Math.sin(method7160) * Double.longBitsToDouble((long)886047033 ^ 0x3FC99999AD4998A3L);
                final EntityPlayerSP player2 = Class2142.Field17803.player;
                player2.motionZ += (float)Math.cos(method7160) * Double.longBitsToDouble((long)947573513 ^ 0x3FC99999A1E34A93L);
            }
            else {
                final double sqrt = Math.sqrt(Class2142.Field17803.player.motionX * Class2142.Field17803.player.motionX + Class2142.Field17803.player.motionZ * Class2142.Field17803.player.motionZ);
                final double n = (Math.abs(Class2142.Field17803.player.rotationYawHead - Class2142.Field17803.player.rotationYaw) < 90) ? Double.longBitsToDouble(4607211241837632579L) : Double.longBitsToDouble(4607186922399644778L);
                final float method7161 = Class1917.Method7160();
                Class2142.Field17803.player.motionX = -(float)Math.sin(method7161) * n * sqrt;
                Class2142.Field17803.player.motionY = (float)Math.cos(method7161) * n * sqrt;
            }
        }
    }
    
    Class1718() {
    }
}
