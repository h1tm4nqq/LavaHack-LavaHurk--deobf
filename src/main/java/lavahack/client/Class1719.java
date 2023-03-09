//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1703;
import lavahack.client.Class1917;
import lavahack.client.Class1989;
import lavahack.client.Class394;
import lavahack.client.Class44;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016\u00a8\u0006\u0005"}, d2={"com/kisman/cc/features/module/movement/speed/SpeedModes$2", "Lcom/kisman/cc/features/module/movement/speed/ISpeedMode;", "onEnable", "", "update", "kisman.cc"})
public final class Class1719
implements Class1703 {
    private String Field15918 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method6529() {
    }

    @Override
    public void Method6530() {
        if (!Class1917.Method7159()) return;
        if (Class2142.Field17803.player.collidedHorizontally) return;
        if (!Class2142.Field17803.player.onGround) {
            Class2142.Field17803.player.motionY = Double.longBitsToDouble((long)1133958597 ^ 0xBFF000004396D5C5L);
            Class394.Method1953();
            return;
        }
        Class394.Method1952(Float.intBitsToFloat(0x3F933333));
        Class2142.Field17803.player.jump();
        Class44 class44 = Class1989.Field17152.Method7380();
        if (class44 == null) {
            Intrinsics.throwNpe();
        }
        double[] dArray = Class1917.Method7150(Class1917.Method7154(class44.Method365(), Double.longBitsToDouble((long)179947752 ^ 0x3FD2631F80B0CA36L)));
        Class2142.Field17803.player.motionX = dArray[0];
        Class2142.Field17803.player.motionZ = dArray[1];
    }

    Class1719() {
    }
}

