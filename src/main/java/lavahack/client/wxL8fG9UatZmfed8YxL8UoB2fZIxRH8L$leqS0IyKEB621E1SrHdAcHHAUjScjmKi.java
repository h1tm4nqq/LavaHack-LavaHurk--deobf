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
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.NREDuDbOBX0uUenjamC4Fz7tEkLPv8mE;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD;
import lavahack.client.dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI;
import lavahack.client.vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy;
import lavahack.client.wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0010Jn\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010J\u0016\u0010%\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J \u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0002J\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020.2\u0006\u0010'\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006/"}, d2={"Lcom/kisman/cc/features/module/combat/autorer/AutoRerUtil$Companion;", "", "()V", "mc", "Lnet/minecraft/client/Minecraft;", "targetFinder", "Lcom/kisman/cc/features/module/combat/autorer/AutoRerTargetFinder;", "getTargetFinder", "()Lcom/kisman/cc/features/module/combat/autorer/AutoRerTargetFinder;", "setTargetFinder", "(Lcom/kisman/cc/features/module/combat/autorer/AutoRerTargetFinder;)V", "getDamageByCrystal", "", "target", "Lnet/minecraft/entity/Entity;", "terrain", "", "crystal", "Lnet/minecraft/util/math/BlockPos;", "getPlaceInfo", "Lcom/kisman/cc/features/module/combat/autorer/PlaceInfo;", "placePos", "Lnet/minecraft/entity/EntityLivingBase;", "getPlacePos", "range", "wallRange", "Lnet/minecraft/entity/player/EntityPlayer;", "multiPlace", "firePlace", "secondCheck", "thirdCheck", "minDamage", "", "maxSelfDamage", "lethalMult", "wallRangeUsage", "noSuicide", "getSelfDamageByCrystal", "isPosValid", "pos", "placeRange", "", "placeWallRange", "onEnable", "", "toVec3dCenter", "Lnet/minecraft/util/math/Vec3d;", "kisman.cc"})
public final class wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    private String Field16050 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final NREDuDbOBX0uUenjamC4Fz7tEkLPv8mE Method6685() {
        return wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L.Method7266();
    }

    public final void Method6686(@NotNull @NotNull NREDuDbOBX0uUenjamC4Fz7tEkLPv8mE nREDuDbOBX0uUenjamC4Fz7tEkLPv8mE) {
        Intrinsics.checkParameterIsNotNull((Object)nREDuDbOBX0uUenjamC4Fz7tEkLPv8mE, (String)"<set-?>");
        wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L.Method7267(nREDuDbOBX0uUenjamC4Fz7tEkLPv8mE);
    }

    public final void Method6687() {
        this.Method6685().Method498();
    }

    public final float Method6688(@NotNull @NotNull Entity entity, boolean bl, @NotNull @NotNull BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)entity, (String)"target");
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"crystal");
        if (wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L.Method7268().world != null) return vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7773(wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L.Method7268().world, (float)blockPos.getX() + Float.intBitsToFloat(0x104FD57A ^ 0x2F4FD57A), blockPos.getY() + ((int)879516006L ^ 0x346C5967), (double)blockPos.getZ() + Double.longBitsToDouble((long)521932150 ^ 0x3FE000001F1C0D76L), entity, bl, (boolean)((long)-1287574573 ^ (long)-1287574574));
        return 0.0f;
    }

    public final float Method6689(boolean bl, @NotNull @NotNull BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"crystal");
        EntityPlayerSP entityPlayerSP = wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L.Method7268().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        return this.Method6688((Entity)entityPlayerSP, bl, blockPos);
    }

    @NotNull
    @NotNull
    public final dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI Method6690(@NotNull @NotNull BlockPos blockPos, @NotNull @NotNull EntityLivingBase entityLivingBase, boolean bl) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"placePos");
        Intrinsics.checkParameterIsNotNull((Object)entityLivingBase, (String)"target");
        return new dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI(entityLivingBase, blockPos, this.Method6689(bl, blockPos), this.Method6688((Entity)entityLivingBase, bl, blockPos), null, null, null);
    }

    @NotNull
    @NotNull
    public final Vec3d Method6691(@NotNull @NotNull BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        return new Vec3d((double)blockPos.getX(), (double)blockPos.getY(), (double)blockPos.getZ());
    }

    private final boolean Method6692(BlockPos blockPos, double d, double d2) {
        boolean bl;
        double d4 = wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L.Method7268().player.getDistance((double)blockPos.getX() + Double.longBitsToDouble(0xDBDEC8CF48B538F8L ^ 0xE43EC8CF48B538F8L), (double)blockPos.getY(), (double)blockPos.getZ() + Double.longBitsToDouble(0x943DFF1A5574E0E6L ^ 0xABDDFF1A5574E0E6L));
        d4 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1917(blockPos) ? d : d2;
        if (d3 <= d4) {
            bl = (int)-835591980L ^ 0xCE31E0D5;
            return bl;
        }
        bl = (int)785951528L ^ 0x2ED8AB28;
        return bl;
    }

    @NotNull
    @NotNull
    public final dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI Method6693(float f, float f2, @NotNull @NotNull EntityPlayer entityPlayer, boolean bl, boolean bl2, boolean bl3, boolean bl4, int n, int n2, float f3, boolean bl5, boolean bl6, boolean bl7) {
        Intrinsics.checkParameterIsNotNull((Object)entityPlayer, (String)"target");
        float f4 = Float.intBitsToFloat(0x1AF399F6 ^ 0x25F399F6);
        float f5 = 0.0f;
        BlockPos blockPos = null;
        EntityPlayerSP entityPlayerSP = wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L.Method7268().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        BlockPos blockPos2 = entityPlayerSP.getPosition();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"mc.player.position");
        int n3 = blockPos2.getX() - (int)f;
        while (true) {
            float f6 = n3;
            EntityPlayerSP entityPlayerSP2 = wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L.Method7268().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
            BlockPos blockPos3 = entityPlayerSP2.getPosition();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"mc.player.position");
            if (!(f6 <= (float)blockPos3.getX() + f)) return new dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI((EntityLivingBase)entityPlayer, blockPos, f5, f4, null, null, null);
            EntityPlayerSP entityPlayerSP3 = wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L.Method7268().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP3, (String)"mc.player");
            BlockPos blockPos4 = entityPlayerSP3.getPosition();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos4, (String)"mc.player.position");
            int n4 = blockPos4.getZ() - (int)f;
            while (true) {
                float f7 = n4;
                EntityPlayerSP entityPlayerSP4 = wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L.Method7268().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP4, (String)"mc.player");
                BlockPos blockPos5 = entityPlayerSP4.getPosition();
                Intrinsics.checkExpressionValueIsNotNull((Object)blockPos5, (String)"mc.player.position");
                if (!(f7 <= (float)blockPos5.getZ() + f)) break;
                EntityPlayerSP entityPlayerSP5 = wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L.Method7268().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP5, (String)"mc.player");
                BlockPos blockPos6 = entityPlayerSP5.getPosition();
                Intrinsics.checkExpressionValueIsNotNull((Object)blockPos6, (String)"mc.player.position");
                int n5 = blockPos6.getY() - (int)f;
                while (true) {
                    float f8 = n5;
                    EntityPlayerSP entityPlayerSP6 = wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L.Method7268().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP6, (String)"mc.player");
                    BlockPos blockPos7 = entityPlayerSP6.getPosition();
                    Intrinsics.checkExpressionValueIsNotNull((Object)blockPos7, (String)"mc.player.position");
                    if (!(f8 < (float)blockPos7.getY() + f)) break;
                    EntityPlayerSP entityPlayerSP7 = wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L.Method7268().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP7, (String)"mc.player");
                    BlockPos blockPos8 = entityPlayerSP7.getPosition();
                    Intrinsics.checkExpressionValueIsNotNull((Object)blockPos8, (String)"mc.player.position");
                    double d = (double)blockPos8.getX() - ((double)n3 + Double.longBitsToDouble(0x1996C9E4D63FFFBDL ^ 0x2676C9E4D63FFFBDL));
                    EntityPlayerSP entityPlayerSP8 = wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L.Method7268().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP8, (String)"mc.player");
                    BlockPos blockPos9 = entityPlayerSP8.getPosition();
                    Intrinsics.checkExpressionValueIsNotNull((Object)blockPos9, (String)"mc.player.position");
                    double d2 = d * ((double)blockPos9.getX() - ((double)n3 + Double.longBitsToDouble((long)1646136673 ^ 0x3FE00000621E0D61L)));
                    EntityPlayerSP entityPlayerSP9 = wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L.Method7268().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP9, (String)"mc.player");
                    BlockPos blockPos10 = entityPlayerSP9.getPosition();
                    Intrinsics.checkExpressionValueIsNotNull((Object)blockPos10, (String)"mc.player.position");
                    double d3 = (double)blockPos10.getZ() - ((double)n4 + Double.longBitsToDouble((long)576132734 ^ 0x3FE000002257167EL));
                    EntityPlayerSP entityPlayerSP10 = wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L.Method7268().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP10, (String)"mc.player");
                    BlockPos blockPos11 = entityPlayerSP10.getPosition();
                    Intrinsics.checkExpressionValueIsNotNull((Object)blockPos11, (String)"mc.player.position");
                    double d4 = d2 + d3 * ((double)blockPos11.getZ() - ((double)n4 + Double.longBitsToDouble((long)1670298331 ^ 0x3FE00000638EBADBL)));
                    EntityPlayerSP entityPlayerSP11 = wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L.Method7268().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP11, (String)"mc.player");
                    BlockPos blockPos12 = entityPlayerSP11.getPosition();
                    Intrinsics.checkExpressionValueIsNotNull((Object)blockPos12, (String)"mc.player.position");
                    int n6 = blockPos12.getY() - n5;
                    EntityPlayerSP entityPlayerSP12 = wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L.Method7268().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP12, (String)"mc.player");
                    BlockPos blockPos13 = entityPlayerSP12.getPosition();
                    Intrinsics.checkExpressionValueIsNotNull((Object)blockPos13, (String)"mc.player.position");
                    double d5 = d4 + (double)(n6 * (blockPos13.getY() - n5));
                    if (d5 < (double)(f * f)) {
                        BlockPos blockPos14 = new BlockPos(n3, n5, n4);
                        if (!(bl4 && bl6 && EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1917(blockPos14) && !(d5 <= (double)(f2 * f2)) || !vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7755(blockPos14, bl3, ((int)-1840801215L ^ 0x92479A40) != 0, bl, bl2))) {
                            float f9;
                            float f10 = this.Method6688((Entity)entityPlayer, bl5, blockPos14);
                            if ((b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Field14544.Method28() && (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Field14544.Method5617(f10) || b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Field14544.Method29()) || f10 > (float)n || f10 * f3 > entityPlayer.getHealth() + entityPlayer.absorptionAmount) && (f9 = this.Method6689(bl5, blockPos14)) <= (float)n2) {
                                float f11 = f9 + (float)(((int)526626054L ^ 0x1F63AD07) << 1);
                                EntityPlayerSP entityPlayerSP13 = wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L.Method7268().player;
                                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP13, (String)"mc.player");
                                if ((f11 < entityPlayerSP13.getHealth() + wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L.Method7268().player.absorptionAmount || !bl7) && f9 < f10) {
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

    private wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
    }

    public wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static String Method6694(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)334368994 ^ (long)334368994);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1256032478 ^ (long)-1256032291);
            int n2 = ((int)554195160L ^ 0x210858C5) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-489034318 ^ (long)-489038655) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

