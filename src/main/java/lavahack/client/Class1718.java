//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.client.entity.EntityPlayerSP
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import kotlin.Metadata;
import lavahack.client.Class1703;
import lavahack.client.Class1917;
import net.minecraft.client.entity.EntityPlayerSP;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016\u00a8\u0006\u0005"}, d2={"com/kisman/cc/features/module/movement/speed/SpeedModes$1", "Lcom/kisman/cc/features/module/movement/speed/ISpeedMode;", "onEnable", "", "update", "kisman.cc"})
public final class Class1718
implements Class1703 {
    private String Field15917 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method6529() {
    }

    @Override
    public void Method6530() {
        if (!Class1917.Method7159()) return;
        if (Class2142.Field17803.player.hurtTime >= 5) return;
        if (Class2142.Field17803.player.onGround) {
            Class2142.Field17803.player.motionY = Double.longBitsToDouble(4600967451314246124L);
            float f = Class1917.Method7160();
            EntityPlayerSP entityPlayerSP = Class2142.Field17803.player;
            double d = entityPlayerSP.motionX;
            EntityPlayerSP entityPlayerSP2 = entityPlayerSP;
            boolean bl = false;
            float f2 = (float)Math.sin(f);
            entityPlayerSP2.motionX = d - (double)f2 * Double.longBitsToDouble((long)886047033 ^ 0x3FC99999AD4998A3L);
            EntityPlayerSP entityPlayerSP3 = Class2142.Field17803.player;
            d = entityPlayerSP3.motionZ;
            entityPlayerSP2 = entityPlayerSP3;
            bl = false;
            f2 = (float)Math.cos(f);
            entityPlayerSP2.motionZ = d + (double)f2 * Double.longBitsToDouble((long)947573513 ^ 0x3FC99999A1E34A93L);
            return;
        }
        double d = Class2142.Field17803.player.motionX * Class2142.Field17803.player.motionX + Class2142.Field17803.player.motionZ * Class2142.Field17803.player.motionZ;
        boolean bl = false;
        double d2 = Math.sqrt(d);
        float f = Class2142.Field17803.player.rotationYawHead - Class2142.Field17803.player.rotationYaw;
        boolean bl2 = false;
        d = Math.abs(f) < (float)90 ? Double.longBitsToDouble(4607211241837632579L) : Double.longBitsToDouble(4607186922399644778L);
        f = Class1917.Method7160();
        EntityPlayerSP entityPlayerSP = Class2142.Field17803.player;
        bl2 = false;
        float f3 = (float)Math.sin(f);
        entityPlayerSP.motionX = (double)(-f3) * d * d2;
        entityPlayerSP = Class2142.Field17803.player;
        bl2 = false;
        f3 = (float)Math.cos(f);
        entityPlayerSP.motionY = (double)f3 * d * d2;
    }

    Class1718() {
    }
}

