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

import com.kisman.cc.util.Class2142;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1989;
import lavahack.client.Class44;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/module/movement/speed/SpeedModes$Companion;", "", "()V", "getCap", "", "kisman.cc"})
public final class Class1752 {
    private int Field16032;

    public final double Method6679() {
        Class44 class44 = Class1989.Field17152.Method7381();
        if (class44 == null) {
            Intrinsics.throwNpe();
        }
        double d = class44.Method367();
        Class44 class442 = Class1989.Field17152.Method7382();
        if (class442 == null) {
            Intrinsics.throwNpe();
        }
        if (!class442.Method365()) {
            return d;
        }
        if (Class2142.Field17803.player.isPotionActive(MobEffects.SPEED)) {
            double d2 = 1.0;
            double d3 = Double.longBitsToDouble(4596373779694328218L);
            PotionEffect potionEffect = Class2142.Field17803.player.getActivePotionEffect(MobEffects.SPEED);
            Integer n = potionEffect != null ? Integer.valueOf(potionEffect.getAmplifier()) : null;
            if (n == null) {
                Intrinsics.throwNpe();
            }
            d *= d2 + d3 * (double)(n + 1);
        }
        Class44 class443 = Class1989.Field17152.Method7380();
        if (class443 == null) {
            Intrinsics.throwNpe();
        }
        if (!class443.Method365()) return d;
        if (!Class2142.Field17803.player.isPotionActive(MobEffects.SLOWNESS)) return d;
        double d4 = 1.0;
        double d5 = Double.longBitsToDouble(4596373779694328218L);
        PotionEffect potionEffect = Class2142.Field17803.player.getActivePotionEffect(MobEffects.SLOWNESS);
        Integer n = potionEffect != null ? Integer.valueOf(potionEffect.getAmplifier()) : null;
        if (n == null) {
            Intrinsics.throwNpe();
        }
        d /= d4 + d5 * (double)(n + 1);
        return d;
    }

    private Class1752() {
    }

    public Class1752(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

