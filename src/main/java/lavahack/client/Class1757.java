//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1416;
import lavahack.client.Class1921;
import lavahack.client.Class1955;
import lavahack.client.Class204;
import lavahack.client.Class2155;
import lavahack.client.Class394;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0010Jn\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010J\u0016\u0010%\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J \u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0002J\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020.2\u0006\u0010'\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006/"}, d2={"Lcom/kisman/cc/features/module/combat/autorer/AutoRerUtil$Companion;", "", "()V", "mc", "Lnet/minecraft/client/Minecraft;", "targetFinder", "Lcom/kisman/cc/features/module/combat/autorer/AutoRerTargetFinder;", "getTargetFinder", "()Lcom/kisman/cc/features/module/combat/autorer/AutoRerTargetFinder;", "setTargetFinder", "(Lcom/kisman/cc/features/module/combat/autorer/AutoRerTargetFinder;)V", "getDamageByCrystal", "", "target", "Lnet/minecraft/entity/Entity;", "terrain", "", "crystal", "Lnet/minecraft/util/math/BlockPos;", "getPlaceInfo", "Lcom/kisman/cc/features/module/combat/autorer/PlaceInfo;", "placePos", "Lnet/minecraft/entity/EntityLivingBase;", "getPlacePos", "range", "wallRange", "Lnet/minecraft/entity/player/EntityPlayer;", "multiPlace", "firePlace", "secondCheck", "thirdCheck", "minDamage", "", "maxSelfDamage", "lethalMult", "wallRangeUsage", "noSuicide", "getSelfDamageByCrystal", "isPosValid", "pos", "placeRange", "", "placeWallRange", "onEnable", "", "toVec3dCenter", "Lnet/minecraft/util/math/Vec3d;", "kisman.cc"})
public final class Class1757 {
    private String Field16050 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final Class1921 Method6685() {
        return Class1955.Method7266();
    }

    public final void Method6686(@NotNull @NotNull Class1921 class1921) {
        Intrinsics.checkParameterIsNotNull((Object)class1921, (String)"<set-?>");
        Class1955.Method7267(class1921);
    }

    public final void Method6687() {
        this.Method6685().Method498();
    }

    public final float Method6688(@NotNull @NotNull Entity entity, boolean bl, @NotNull @NotNull BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)entity, (String)"target");
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"crystal");
        if (Class1955.Method7268().world != null) return Class2155.Method7773(Class1955.Method7268().world, (float)blockPos.getX() + Float.intBitsToFloat(0x3F000000), blockPos.getY() + 1, (double)blockPos.getZ() + Double.longBitsToDouble((long)521932150 ^ 0x3FE000001F1C0D76L), entity, bl, true);
        return 0.0f;
    }

    public final float Method6689(boolean bl, @NotNull @NotNull BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"crystal");
        EntityPlayerSP entityPlayerSP = Class1955.Method7268().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        return this.Method6688((Entity)entityPlayerSP, bl, blockPos);
    }

    @NotNull
    @NotNull
    public final Class204 Method6690(@NotNull @NotNull BlockPos blockPos, @NotNull @NotNull EntityLivingBase entityLivingBase, boolean bl) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"placePos");
        Intrinsics.checkParameterIsNotNull((Object)entityLivingBase, (String)"target");
        return new Class204(entityLivingBase, blockPos, this.Method6689(bl, blockPos), this.Method6688((Entity)entityLivingBase, bl, blockPos), null, null, null);
    }

    @NotNull
    @NotNull
    public final Vec3d Method6691(@NotNull @NotNull BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        return new Vec3d((double)blockPos.getX(), (double)blockPos.getY(), (double)blockPos.getZ());
    }

    private final boolean Method6692(BlockPos blockPos, double d, double d2) {
        double d3 = Class1955.Method7268().player.getDistance((double)blockPos.getX() + Double.longBitsToDouble(4602678819172646912L), (double)blockPos.getY(), (double)blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L));
        double d4 = Class394.Method1917(blockPos) ? d : d2;
        if (!(d3 <= d4)) return false;
        return true;
    }

    @NotNull
    @NotNull
    public final Class204 Method6693(float f, float f2, @NotNull @NotNull EntityPlayer entityPlayer, boolean bl, boolean bl2, boolean bl3, boolean bl4, int n, int n2, float f3, boolean bl5, boolean bl6, boolean bl7) {
        Intrinsics.checkParameterIsNotNull((Object)entityPlayer, (String)"target");
        float f4 = Float.intBitsToFloat(0x3F000000);
        float f5 = 0.0f;
        BlockPos blockPos = null;
        EntityPlayerSP entityPlayerSP = Class1955.Method7268().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        BlockPos blockPos2 = entityPlayerSP.getPosition();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"mc.player.position");
        int n3 = blockPos2.getX() - (int)f;
        while (true) {
            float f6 = n3;
            EntityPlayerSP entityPlayerSP2 = Class1955.Method7268().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
            BlockPos blockPos3 = entityPlayerSP2.getPosition();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"mc.player.position");
            if (!(f6 <= (float)blockPos3.getX() + f)) return new Class204((EntityLivingBase)entityPlayer, blockPos, f5, f4, null, null, null);
            EntityPlayerSP entityPlayerSP3 = Class1955.Method7268().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP3, (String)"mc.player");
            BlockPos blockPos4 = entityPlayerSP3.getPosition();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos4, (String)"mc.player.position");
            int n4 = blockPos4.getZ() - (int)f;
            while (true) {
                float f7 = n4;
                EntityPlayerSP entityPlayerSP4 = Class1955.Method7268().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP4, (String)"mc.player");
                BlockPos blockPos5 = entityPlayerSP4.getPosition();
                Intrinsics.checkExpressionValueIsNotNull((Object)blockPos5, (String)"mc.player.position");
                if (!(f7 <= (float)blockPos5.getZ() + f)) break;
                EntityPlayerSP entityPlayerSP5 = Class1955.Method7268().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP5, (String)"mc.player");
                BlockPos blockPos6 = entityPlayerSP5.getPosition();
                Intrinsics.checkExpressionValueIsNotNull((Object)blockPos6, (String)"mc.player.position");
                int n5 = blockPos6.getY() - (int)f;
                while (true) {
                    float f8 = n5;
                    EntityPlayerSP entityPlayerSP6 = Class1955.Method7268().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP6, (String)"mc.player");
                    BlockPos blockPos7 = entityPlayerSP6.getPosition();
                    Intrinsics.checkExpressionValueIsNotNull((Object)blockPos7, (String)"mc.player.position");
                    if (!(f8 < (float)blockPos7.getY() + f)) break;
                    EntityPlayerSP entityPlayerSP7 = Class1955.Method7268().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP7, (String)"mc.player");
                    BlockPos blockPos8 = entityPlayerSP7.getPosition();
                    Intrinsics.checkExpressionValueIsNotNull((Object)blockPos8, (String)"mc.player.position");
                    double d = (double)blockPos8.getX() - ((double)n3 + Double.longBitsToDouble(4602678819172646912L));
                    EntityPlayerSP entityPlayerSP8 = Class1955.Method7268().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP8, (String)"mc.player");
                    BlockPos blockPos9 = entityPlayerSP8.getPosition();
                    Intrinsics.checkExpressionValueIsNotNull((Object)blockPos9, (String)"mc.player.position");
                    double d2 = d * ((double)blockPos9.getX() - ((double)n3 + Double.longBitsToDouble((long)1646136673 ^ 0x3FE00000621E0D61L)));
                    EntityPlayerSP entityPlayerSP9 = Class1955.Method7268().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP9, (String)"mc.player");
                    BlockPos blockPos10 = entityPlayerSP9.getPosition();
                    Intrinsics.checkExpressionValueIsNotNull((Object)blockPos10, (String)"mc.player.position");
                    double d3 = (double)blockPos10.getZ() - ((double)n4 + Double.longBitsToDouble((long)576132734 ^ 0x3FE000002257167EL));
                    EntityPlayerSP entityPlayerSP10 = Class1955.Method7268().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP10, (String)"mc.player");
                    BlockPos blockPos11 = entityPlayerSP10.getPosition();
                    Intrinsics.checkExpressionValueIsNotNull((Object)blockPos11, (String)"mc.player.position");
                    double d4 = d2 + d3 * ((double)blockPos11.getZ() - ((double)n4 + Double.longBitsToDouble((long)1670298331 ^ 0x3FE00000638EBADBL)));
                    EntityPlayerSP entityPlayerSP11 = Class1955.Method7268().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP11, (String)"mc.player");
                    BlockPos blockPos12 = entityPlayerSP11.getPosition();
                    Intrinsics.checkExpressionValueIsNotNull((Object)blockPos12, (String)"mc.player.position");
                    int n6 = blockPos12.getY() - n5;
                    EntityPlayerSP entityPlayerSP12 = Class1955.Method7268().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP12, (String)"mc.player");
                    BlockPos blockPos13 = entityPlayerSP12.getPosition();
                    Intrinsics.checkExpressionValueIsNotNull((Object)blockPos13, (String)"mc.player.position");
                    double d5 = d4 + (double)(n6 * (blockPos13.getY() - n5));
                    if (d5 < (double)(f * f)) {
                        BlockPos blockPos14 = new BlockPos(n3, n5, n4);
                        if (!(bl4 && bl6 && Class394.Method1917(blockPos14) && !(d5 <= (double)(f2 * f2)) || !Class2155.Method7755(blockPos14, bl3, true, bl, bl2))) {
                            float f9;
                            float f10 = this.Method6688((Entity)entityPlayer, bl5, blockPos14);
                            if ((Class1416.Field14544.Method28() && (Class1416.Field14544.Method5617(f10) || Class1416.Field14544.Method29()) || f10 > (float)n || f10 * f3 > entityPlayer.getHealth() + entityPlayer.absorptionAmount) && (f9 = this.Method6689(bl5, blockPos14)) <= (float)n2) {
                                float f11 = f9 + (float)2;
                                EntityPlayerSP entityPlayerSP13 = Class1955.Method7268().player;
                                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP13, (String)"mc.player");
                                if ((f11 < entityPlayerSP13.getHealth() + Class1955.Method7268().player.absorptionAmount || !bl7) && f9 < f10) {
                                    f4 = f10;
                                    f5 = f9;
                                    blockPos = blockPos14;
                                }
                            }
                        }
                    }
                    ++n5;
                }
                ++n4;
            }
            ++n3;
        }
    }

    private Class1757() {
    }

    public Class1757(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static String Method6694(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 232;
            cArray2[n] = (char)(cArray[n] ^ (0x3173 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

