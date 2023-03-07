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

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Ffcv07tLImFck2OjGznu2fLGW0hkgJEV;
import lavahack.client.KERrE2LuaTOrvMyD8cdKgzP1mK1VMR0l;
import lavahack.client.o73igJQaa2O9BEYFQNAk42oaxHBow5kd;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.entity.EntityPlayerSP;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016\u00a8\u0006\u0005"}, d2={"com/kisman/cc/features/module/movement/speed/SpeedModes$7", "Lcom/kisman/cc/features/module/movement/speed/ISpeedMode;", "onEnable", "", "update", "kisman.cc"})
public final class aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8$7
implements KERrE2LuaTOrvMyD8cdKgzP1mK1VMR0l {
    private String Field15896 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method6529() {
    }

    @Override
    public void Method6530() {
        if (!o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159()) return;
        if (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.onGround) {
            Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.jump();
            return;
        }
        float f = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7160();
        EntityPlayerSP entityPlayerSP = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player;
        int n = (int)((long)1143257702 ^ (long)1143257702);
        float f2 = (float)Math.sin(f);
        double d = -f2;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = Ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Field17152.Method7377();
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 == null) {
            Intrinsics.throwNpe();
        }
        entityPlayerSP.motionX = d * qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method367();
        entityPlayerSP = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player;
        n = (int)((long)591718232 ^ (long)591718232);
        f2 = (float)Math.cos(f);
        double d2 = f2;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = Ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Field17152.Method7378();
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 == null) {
            Intrinsics.throwNpe();
        }
        entityPlayerSP.motionZ = d2 * qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method367();
    }

    aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8$7() {
    }
}

