//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU;
import lavahack.client.MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK;
import lavahack.client.RzBuXINbHt5tRWlCGAsjWoWk0p3hR7t2$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs;
import lavahack.client.wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L;
import lavahack.client.xTW5jX5xE7m5KIe2YKQVrytvZvJhFuoj;
import lavahack.client.yA6FfBWveAENft82JRISn3FwZ8fifzBI$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.yA6FfBWveAENft82JRISn3FwZ8fifzBI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.yyudEpjUiGZaElZMrUcgZH8OIB4Fn8JN;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tH\u0004J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J<\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0018\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0004JF\u0010 \u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J2\u0010 \u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010$\u001a\u00020\u0018H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0004J\u0018\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u001a\u0010'\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u0015R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R,\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\fj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t`\r8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2={"Lcom/kisman/cc/util/render/pattern/SlideRendererPattern;", "", "()V", "currentPos", "Lnet/minecraft/util/math/Vec3d;", "lastBlockPos", "Lnet/minecraft/util/math/BlockPos;", "lastRenderPos", "lastUpdateTime", "", "prevPos", "processedPossesList", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "scale", "", "startTime", "alpha", "alphaFadeLength", "", "renderer", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "time", "handleRenderWorld", "", "Lcom/kisman/cc/settings/util/SlideRenderingRewritePattern;", "pos", "text", "", "movingLength", "fadeLength", "multiplier", "renderWorld", "aabbModifier", "Lkotlin/Function1;", "Lnet/minecraft/util/math/AxisAlignedBB;", "reset", "toRenderBox", "vec3d", "update", "updatePosses", "Lcom/kisman/cc/util/math/vectors/xyz/ColorableSlidePos;", "kisman.cc"})
public class RzBuXINbHt5tRWlCGAsjWoWk0p3hR7t2 {
    @JvmField
    @Nullable
    public BlockPos Field14149;
    @JvmField
    @Nullable
    public Vec3d Field14150;
    @JvmField
    @Nullable
    public Vec3d Field14151;
    @JvmField
    @Nullable
    public Vec3d Field14152;
    @JvmField
    public long Field14153;
    @JvmField
    public long Field14154;
    @JvmField
    public double Field14155;
    @JvmField
    @NotNull
    public final HashMap Field14156 = new HashMap();
    private String Field14157 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void Method2988() {
        this.Field14149 = null;
        this.Field14150 = null;
        this.Field14151 = null;
        this.Field14152 = null;
        this.Field14153 = 0L;
        this.Field14154 = 0L;
        this.Field14155 = 0.0;
        this.Field14156.clear();
    }

    public void Method2989(float f, float f2, float f3, @NotNull @NotNull MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK, @Nullable @Nullable BlockPos blockPos, @Nullable @Nullable String string) {
        Intrinsics.checkParameterIsNotNull((Object)mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK, (String)"renderer");
        this.Method2998(blockPos, mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK);
        this.Method2992(f, f2, f3, mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK, string);
    }

    public void Method2990(@NotNull @NotNull cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2, @Nullable @Nullable BlockPos blockPos, @Nullable @Nullable String string) {
        Intrinsics.checkParameterIsNotNull((Object)cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2, (String)"renderer");
        this.Method2989(cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2.Field15093.Method368(), cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2.Field15094.Method368(), cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2.Field15095.Method368(), cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2, blockPos, string);
    }

    public void Method2991(float f, float f2, float f3, @NotNull @NotNull MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK, @NotNull @NotNull Function1 function1, @Nullable @Nullable String string) {
        int n;
        Map map;
        Object object;
        Intrinsics.checkParameterIsNotNull((Object)mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK, (String)"renderer");
        Intrinsics.checkParameterIsNotNull((Object)function1, (String)"aabbModifier");
        double d = this.Method2994(f, mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK);
        Vec3d vec3d = this.Field14150;
        if (vec3d != null) {
            Vec3d vec3d2;
            object = vec3d;
            int n2 = (int)-1768382427L ^ 0x9698A025;
            int n3 = (int)((long)1582042252 ^ (long)1582042252);
            map = object;
            n = (int)-60679394L ^ 0xFC621B1E;
            Object object2 = this.Field14151;
            if (object2 == null) {
                object2 = map;
            }
            Vec3d vec3d3 = object2;
            int n4 = (int)-660766234L ^ 0xD89D81E6;
            int n5 = (int)((long)-99490778 ^ (long)-99490778);
            Vec3d vec3d4 = vec3d3;
            int n6 = (int)-439665381L ^ 0xE5CB3D1B;
            this.Field14155 = this.Method2995(f2, mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK);
            Vec3d vec3d5 = vec3d2 = map.add(vec3d4.subtract((Vec3d)map).scale(d));
            Intrinsics.checkExpressionValueIsNotNull((Object)vec3d5, (String)"renderPos");
            mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method3804((AxisAlignedBB)function1.invoke((Object)this.Method2996(vec3d5, this.Field14155)));
            this.Field14152 = vec3d2;
            if (string != null) {
                new yyudEpjUiGZaElZMrUcgZH8OIB4Fn8JN(string, new BlockPos(vec3d4), new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)543416217 ^ (long)543416166), (int)1811271275L ^ 0x6BF5CE94, (int)((long)1760368753 ^ (long)1760368782), (int)((double)Float.intBitsToFloat((int)494291715L ^ 0x5E094B03) * this.Field14155)));
            }
        }
        if (f3 == 0.0f) return;
        object = new ArrayList();
        map = this.Field14156;
        n = (int)-124842888L ^ 0xF88F0C78;
        for (Map.Entry entry : map.entrySet()) {
            map = (BlockPos)entry.getKey();
            long l = ((Number)entry.getValue()).longValue();
            if (d == 0.0 && Intrinsics.areEqual((Object)map, (Object)this.Field14151)) {
                ((ArrayList)object).add(map);
                continue;
            }
            double d2 = this.Method2993(f3, mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK, l);
            if (d2 == 0.0) {
                ((ArrayList)object).add(map);
                continue;
            }
            mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method3800((BlockPos)map, map instanceof xTW5jX5xE7m5KIe2YKQVrytvZvJhFuoj ? ((xTW5jX5xE7m5KIe2YKQVrytvZvJhFuoj)((Object)map)).getColour1() : mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method3806(), map instanceof xTW5jX5xE7m5KIe2YKQVrytvZvJhFuoj ? ((xTW5jX5xE7m5KIe2YKQVrytvZvJhFuoj)((Object)map)).getColour2() : mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method3807(), map instanceof xTW5jX5xE7m5KIe2YKQVrytvZvJhFuoj ? ((xTW5jX5xE7m5KIe2YKQVrytvZvJhFuoj)((Object)map)).getColour3() : mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method3808(), map instanceof xTW5jX5xE7m5KIe2YKQVrytvZvJhFuoj ? ((xTW5jX5xE7m5KIe2YKQVrytvZvJhFuoj)((Object)map)).getColour4() : mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method3809(), map instanceof xTW5jX5xE7m5KIe2YKQVrytvZvJhFuoj ? ((xTW5jX5xE7m5KIe2YKQVrytvZvJhFuoj)((Object)map)).getColour5() : mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method3810(), map instanceof xTW5jX5xE7m5KIe2YKQVrytvZvJhFuoj ? ((xTW5jX5xE7m5KIe2YKQVrytvZvJhFuoj)((Object)map)).getColour6() : mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method3811(), d2);
        }
        Iterator iterator = ((ArrayList)object).iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            this.Field14156.remove(blockPos);
        }
    }

    public void Method2992(float f, float f2, float f3, @NotNull @NotNull MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK, @Nullable @Nullable String string) {
        Intrinsics.checkParameterIsNotNull((Object)mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK, (String)"renderer");
        this.Method2991(f, f2, f3, mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK, RzBuXINbHt5tRWlCGAsjWoWk0p3hR7t2$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field9315, string);
    }

    protected final double Method2993(float f, @NotNull @NotNull MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK, long l) {
        double d;
        Intrinsics.checkParameterIsNotNull((Object)mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK, (String)"renderer");
        if (f == 0.0f) {
            return 1.0;
        }
        if (mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK instanceof cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs) {
            d = ((yA6FfBWveAENft82JRISn3FwZ8fifzBI$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)((cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs)mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK).Field15100.Method341()).Method845(HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU.Method4285(l, f));
            return d;
        }
        d = yA6FfBWveAENft82JRISn3FwZ8fifzBI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field8825.Method848(HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU.Method4285(l, f));
        return d;
    }

    protected final double Method2994(float f, @NotNull @NotNull MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK) {
        double d;
        Intrinsics.checkParameterIsNotNull((Object)mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK, (String)"renderer");
        if (f == 0.0f) {
            return 1.0;
        }
        if (mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK instanceof cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs) {
            d = ((yA6FfBWveAENft82JRISn3FwZ8fifzBI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)((cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs)mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK).Field15097.Method3886()).Method845(HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU.Method4285(this.Field14153, f));
            return d;
        }
        d = yA6FfBWveAENft82JRISn3FwZ8fifzBI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field8825.Method845(HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU.Method4285(this.Field14153, f));
        return d;
    }

    protected final double Method2995(float f, @NotNull @NotNull MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK) {
        Intrinsics.checkParameterIsNotNull((Object)mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK, (String)"renderer");
        if (f != 0.0f) {
            double d;
            if (mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK instanceof cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs) {
                if (this.Field14151 != null) {
                    d = ((yA6FfBWveAENft82JRISn3FwZ8fifzBI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)((cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs)mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK).Field15099.Method3886()).Method845(HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU.Method4285(this.Field14154, f));
                    return d;
                }
                d = ((yA6FfBWveAENft82JRISn3FwZ8fifzBI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)((cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs)mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK).Field15098.Method3886()).Method848(HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU.Method4285(this.Field14154, f));
                return d;
            }
            if (this.Field14151 != null) {
                d = yA6FfBWveAENft82JRISn3FwZ8fifzBI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field8822.Method845(HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU.Method4285(this.Field14154, f));
                return d;
            }
            d = yA6FfBWveAENft82JRISn3FwZ8fifzBI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field8821.Method848(HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU.Method4285(this.Field14154, f));
            return d;
        }
        if (this.Field14151 == null) return 0.0;
        return 1.0;
    }

    @NotNull
    @NotNull
    protected AxisAlignedBB Method2996(@NotNull @NotNull Vec3d vec3d, double d) {
        Intrinsics.checkParameterIsNotNull((Object)vec3d, (String)"vec3d");
        double d2 = Double.longBitsToDouble((long)1195400629 ^ 0x3FE0000047405DB5L) * d;
        return new AxisAlignedBB(vec3d.x - d2 + Double.longBitsToDouble((long)301617588 ^ 0x3FE0000011FA51B4L), vec3d.y - d2 + Double.longBitsToDouble(0x4AC470915194FB38L ^ 0x752470915194FB38L), vec3d.z - d2 + Double.longBitsToDouble((long)325413565 ^ 0x3FE0000013656ABDL), vec3d.x + d2 + Double.longBitsToDouble(0x36D725B5CEA8F26FL ^ 0x93725B5CEA8F26FL), vec3d.y + d2 + Double.longBitsToDouble((long)631311856 ^ 0x3FE0000025A10DF0L), vec3d.z + d2 + Double.longBitsToDouble(0xA7A4AD0292399C7L ^ 0x359A4AD0292399C7L));
    }

    @Nullable
    @Nullable
    public final xTW5jX5xE7m5KIe2YKQVrytvZvJhFuoj Method2997(@Nullable @Nullable BlockPos blockPos, @NotNull @NotNull MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK) {
        Intrinsics.checkParameterIsNotNull((Object)mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK, (String)"renderer");
        xTW5jX5xE7m5KIe2YKQVrytvZvJhFuoj xTW5jX5xE7m5KIe2YKQVrytvZvJhFuoj2 = blockPos != null ? new xTW5jX5xE7m5KIe2YKQVrytvZvJhFuoj(blockPos, mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method3806(), mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method3807(), mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method3808(), mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method3809(), mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method3810(), mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method3811()) : null;
        if (xTW5jX5xE7m5KIe2YKQVrytvZvJhFuoj2 == null) return xTW5jX5xE7m5KIe2YKQVrytvZvJhFuoj2;
        Map map = this.Field14156;
        Long l = System.currentTimeMillis();
        int n = (int)((long)904536149 ^ (long)904536149);
        map.put(xTW5jX5xE7m5KIe2YKQVrytvZvJhFuoj2, l);
        return xTW5jX5xE7m5KIe2YKQVrytvZvJhFuoj2;
    }

    public void Method2998(@Nullable @Nullable BlockPos blockPos, @NotNull @NotNull MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK) {
        Intrinsics.checkParameterIsNotNull((Object)mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK, (String)"renderer");
        xTW5jX5xE7m5KIe2YKQVrytvZvJhFuoj xTW5jX5xE7m5KIe2YKQVrytvZvJhFuoj2 = this.Method2997(blockPos, mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK);
        if ((Intrinsics.areEqual((Object)((Object)xTW5jX5xE7m5KIe2YKQVrytvZvJhFuoj2), (Object)this.Field14149) ^ (int)((long)-525804772 ^ (long)-525804771)) == 0) return;
        this.Field14151 = xTW5jX5xE7m5KIe2YKQVrytvZvJhFuoj2 != null ? wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L.Field17021.Method6691(xTW5jX5xE7m5KIe2YKQVrytvZvJhFuoj2) : null;
        Vec3d vec3d = this.Field14152;
        if (vec3d == null) {
            vec3d = this.Field14151;
        }
        this.Field14150 = vec3d;
        this.Field14153 = System.currentTimeMillis();
        if (this.Field14149 == null) {
            this.Field14154 = System.currentTimeMillis();
        }
        this.Field14149 = xTW5jX5xE7m5KIe2YKQVrytvZvJhFuoj2;
    }

    private static String Method2999(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-280779865 ^ (long)-280779865);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1221002638 ^ (long)-1221002611);
            int n2 = (int)((long)1217695662 ^ (long)1217695637) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)2017986443L ^ 0x784851DC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

