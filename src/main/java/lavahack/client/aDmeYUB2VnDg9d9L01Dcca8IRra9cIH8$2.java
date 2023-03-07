//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.Ffcv07tLImFck2OjGznu2fLGW0hkgJEV;
import lavahack.client.KERrE2LuaTOrvMyD8cdKgzP1mK1VMR0l;
import lavahack.client.o73igJQaa2O9BEYFQNAk42oaxHBow5kd;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016\u00a8\u0006\u0005"}, d2={"com/kisman/cc/features/module/movement/speed/SpeedModes$2", "Lcom/kisman/cc/features/module/movement/speed/ISpeedMode;", "onEnable", "", "update", "kisman.cc"})
public final class aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8$2
implements KERrE2LuaTOrvMyD8cdKgzP1mK1VMR0l {
    private String Field15918 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method6529() {
    }

    @Override
    public void Method6530() {
        if (!o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159()) return;
        if (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.collidedHorizontally) return;
        if (!Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.onGround) {
            Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.motionY = Double.longBitsToDouble((long)1133958597 ^ 0xBFF000004396D5C5L);
            EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1953();
            return;
        }
        EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1952(Float.intBitsToFloat(0x6781F3E4 ^ 0x5812C0D7));
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.jump();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = Ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Field17152.Method7380();
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 == null) {
            Intrinsics.throwNpe();
        }
        double[] dArray = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7150(o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7154(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365(), Double.longBitsToDouble((long)179947752 ^ 0x3FD2631F80B0CA36L)));
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.motionX = dArray[(int)((long)468421847 ^ (long)468421847)];
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.motionZ = dArray[(int)((long)1868600750 ^ (long)1868600751)];
    }

    aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8$2() {
    }
}

