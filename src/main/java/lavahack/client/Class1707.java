//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.entity.EntityPlayerSP
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1703;
import lavahack.client.Class1917;
import lavahack.client.Class1989;
import lavahack.client.Class44;
import net.minecraft.client.entity.EntityPlayerSP;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016\u00a8\u0006\u0005"}, d2={"com/kisman/cc/features/module/movement/speed/SpeedModes$7", "Lcom/kisman/cc/features/module/movement/speed/ISpeedMode;", "onEnable", "", "update", "kisman.cc"})
public final class Class1707
implements Class1703 {
    private String Field15896 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method6529() {
    }

    @Override
    public void Method6530() {
        if (!Class1917.Method7159()) return;
        if (Class2142.Field17803.player.onGround) {
            Class2142.Field17803.player.jump();
            return;
        }
        float f = Class1917.Method7160();
        EntityPlayerSP entityPlayerSP = Class2142.Field17803.player;
        boolean bl = false;
        float f2 = (float)Math.sin(f);
        double d = -f2;
        Class44 class44 = Class1989.Field17152.Method7377();
        if (class44 == null) {
            Intrinsics.throwNpe();
        }
        entityPlayerSP.motionX = d * class44.Method367();
        entityPlayerSP = Class2142.Field17803.player;
        bl = false;
        f2 = (float)Math.cos(f);
        double d2 = f2;
        Class44 class442 = Class1989.Field17152.Method7378();
        if (class442 == null) {
            Intrinsics.throwNpe();
        }
        entityPlayerSP.motionZ = d2 * class442.Method367();
    }

    Class1707() {
    }
}

