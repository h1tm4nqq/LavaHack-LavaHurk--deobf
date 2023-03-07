//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.init.MobEffects
 *  net.minecraft.potion.PotionEffect
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Ffcv07tLImFck2OjGznu2fLGW0hkgJEV;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/module/movement/speed/SpeedModes$Companion;", "", "()V", "getCap", "", "kisman.cc"})
public final class aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    private int Field16032;

    public final double Method6679() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = Ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Field17152.Method7381();
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 == null) {
            Intrinsics.throwNpe();
        }
        double d = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method367();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = Ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Field17152.Method7382();
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 == null) {
            Intrinsics.throwNpe();
        }
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) {
            return d;
        }
        if (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.isPotionActive(MobEffects.SPEED)) {
            double d2 = (int)607759410L ^ 0x2439AC33;
            double d3 = Double.longBitsToDouble(0xB81E279F7658059BL ^ 0x87D7BE06EFC19C01L);
            PotionEffect potionEffect = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.getActivePotionEffect(MobEffects.SPEED);
            Integer n = potionEffect != null ? Integer.valueOf(potionEffect.getAmplifier()) : null;
            if (n == null) {
                Intrinsics.throwNpe();
            }
            d *= d2 + d3 * (double)(n + (int)((long)1223885584 ^ (long)1223885585));
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = Ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Field17152.Method7380();
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 == null) {
            Intrinsics.throwNpe();
        }
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method365()) return d;
        if (!Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.isPotionActive(MobEffects.SLOWNESS)) return d;
        double d4 = (int)763275044L ^ 0x2D7EA725;
        double d5 = Double.longBitsToDouble(0x78A213F2B2F6B936L ^ 0x476B8A6B2B6F20ACL);
        PotionEffect potionEffect = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.getActivePotionEffect(MobEffects.SLOWNESS);
        Integer n = potionEffect != null ? Integer.valueOf(potionEffect.getAmplifier()) : null;
        if (n == null) {
            Intrinsics.throwNpe();
        }
        d /= d4 + d5 * (double)(n + ((int)1221394230L ^ 0x48CCFF37));
        return d;
    }

    private aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
    }

    public aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

