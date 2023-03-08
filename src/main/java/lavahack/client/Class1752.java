//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import net.minecraft.init.*;
import net.minecraft.potion.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004?\u0006\u0005" }, d2 = { "Lcom/kisman/cc/features/module/movement/speed/SpeedModes$Companion;", "", "()V", "getCap", "", "kisman.cc" })
public final class Class1752
{
    private int Field16032;
    
    public final double Method6679() {
        final Class44 method7381 = Class1989.Field17152.Method7381();
        if (method7381 == null) {
            Intrinsics.throwNpe();
        }
        double method7382 = method7381.Method367();
        final Class44 method7383 = Class1989.Field17152.Method7382();
        if (method7383 == null) {
            Intrinsics.throwNpe();
        }
        if (!method7383.Method365()) {
            return method7382;
        }
        if (Class2142.Field17803.player.isPotionActive(MobEffects.SPEED)) {
            final double n = method7382;
            final double n2 = 1;
            final double longBitsToDouble = Double.longBitsToDouble(4596373779694328218L);
            final PotionEffect getActivePotionEffect = Class2142.Field17803.player.getActivePotionEffect(MobEffects.SPEED);
            final Integer n3 = (getActivePotionEffect != null) ? Integer.valueOf(getActivePotionEffect.getAmplifier()) : null;
            if (n3 == null) {
                Intrinsics.throwNpe();
            }
            method7382 = n * (n2 + longBitsToDouble * (n3 + 1));
        }
        final Class44 method7384 = Class1989.Field17152.Method7380();
        if (method7384 == null) {
            Intrinsics.throwNpe();
        }
        if (method7384.Method365() && Class2142.Field17803.player.isPotionActive(MobEffects.SLOWNESS)) {
            final double n4 = method7382;
            final double n5 = 1;
            final double longBitsToDouble2 = Double.longBitsToDouble(4596373779694328218L);
            final PotionEffect getActivePotionEffect2 = Class2142.Field17803.player.getActivePotionEffect(MobEffects.SLOWNESS);
            final Integer n6 = (getActivePotionEffect2 != null) ? Integer.valueOf(getActivePotionEffect2.getAmplifier()) : null;
            if (n6 == null) {
                Intrinsics.throwNpe();
            }
            method7382 = n4 / (n5 + longBitsToDouble2 * (n6 + 1));
        }
        return method7382;
    }
    
    private Class1752() {
    }
    
    public Class1752(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
