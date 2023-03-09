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

import com.kisman.cc.util.Class2027;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1024;
import lavahack.client.Class1047;
import lavahack.client.Class1366;
import lavahack.client.Class1515;
import lavahack.client.Class1612;
import lavahack.client.Class187;
import lavahack.client.Class1918;
import lavahack.client.Class1955;
import lavahack.client.Class308;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tH\u0004J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J<\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0018\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0004JF\u0010 \u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J2\u0010 \u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010$\u001a\u00020\u0018H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0004J\u0018\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u001a\u0010'\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u0015R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R,\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\fj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t`\r8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2={"Lcom/kisman/cc/util/render/pattern/SlideRendererPattern;", "", "()V", "currentPos", "Lnet/minecraft/util/math/Vec3d;", "lastBlockPos", "Lnet/minecraft/util/math/BlockPos;", "lastRenderPos", "lastUpdateTime", "", "prevPos", "processedPossesList", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "scale", "", "startTime", "alpha", "alphaFadeLength", "", "renderer", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "time", "handleRenderWorld", "", "Lcom/kisman/cc/settings/util/SlideRenderingRewritePattern;", "pos", "text", "", "movingLength", "fadeLength", "multiplier", "renderWorld", "aabbModifier", "Lkotlin/Function1;", "Lnet/minecraft/util/math/AxisAlignedBB;", "reset", "toRenderBox", "vec3d", "update", "updatePosses", "Lcom/kisman/cc/util/math/vectors/xyz/ColorableSlidePos;", "kisman.cc"})
public class Class1352 {
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

    public void Method2989(float f, float f2, float f3, @NotNull @NotNull Class1612 class1612, @Nullable @Nullable BlockPos blockPos, @Nullable @Nullable String string) {
        Intrinsics.checkParameterIsNotNull((Object)class1612, (String)"renderer");
        this.Method2998(blockPos, class1612);
        this.Method2992(f, f2, f3, class1612, string);
    }

    public void Method2990(@NotNull @NotNull Class1515 class1515, @Nullable @Nullable BlockPos blockPos, @Nullable @Nullable String string) {
        Intrinsics.checkParameterIsNotNull((Object)class1515, (String)"renderer");
        this.Method2989(class1515.Field15093.Method368(), class1515.Field15094.Method368(), class1515.Field15095.Method368(), class1515, blockPos, string);
    }

    public void Method2991(float f, float f2, float f3, @NotNull @NotNull Class1612 class1612, @NotNull @NotNull Function1 function1, @Nullable @Nullable String string) {
        boolean bl;
        Object object;
        Object object2;
        Intrinsics.checkParameterIsNotNull((Object)class1612, (String)"renderer");
        Intrinsics.checkParameterIsNotNull((Object)function1, (String)"aabbModifier");
        double d = this.Method2994(f, class1612);
        Vec3d vec3d = this.Field14150;
        if (vec3d != null) {
            Vec3d vec3d2;
            object2 = vec3d;
            boolean bl2 = false;
            boolean bl3 = false;
            object = object2;
            bl = false;
            Vec3d vec3d3 = this.Field14151;
            if (vec3d3 == null) {
                vec3d3 = object;
            }
            Vec3d vec3d4 = vec3d3;
            boolean bl4 = false;
            boolean bl5 = false;
            Vec3d vec3d5 = vec3d4;
            boolean bl6 = false;
            this.Field14155 = this.Method2995(f2, class1612);
            Vec3d vec3d6 = vec3d2 = object.add(vec3d5.subtract((Vec3d)object).scale(d));
            Intrinsics.checkExpressionValueIsNotNull((Object)vec3d6, (String)"renderPos");
            class1612.Method3804((AxisAlignedBB)function1.invoke((Object)this.Method2996(vec3d6, this.Field14155)));
            this.Field14152 = vec3d2;
            if (string != null) {
                new Class1366(string, new BlockPos(vec3d5), new Class2027(255, 255, 255, (int)((double)Float.intBitsToFloat(1132396544) * this.Field14155)));
            }
        }
        if (f3 == 0.0f) return;
        object2 = new ArrayList();
        object = this.Field14156;
        bl = false;
        for (Map.Entry entry : object.entrySet()) {
            object = (BlockPos)entry.getKey();
            long l = ((Number)entry.getValue()).longValue();
            if (d == 0.0 && Intrinsics.areEqual((Object)object, (Object)this.Field14151)) {
                ((ArrayList)object2).add(object);
                continue;
            }
            double d2 = this.Method2993(f3, class1612, l);
            if (d2 == 0.0) {
                ((ArrayList)object2).add(object);
                continue;
            }
            class1612.Method3800((BlockPos)object, object instanceof Class1918 ? ((Class1918)((Object)object)).getColour1() : class1612.Method3806(), object instanceof Class1918 ? ((Class1918)((Object)object)).getColour2() : class1612.Method3807(), object instanceof Class1918 ? ((Class1918)((Object)object)).getColour3() : class1612.Method3808(), object instanceof Class1918 ? ((Class1918)((Object)object)).getColour4() : class1612.Method3809(), object instanceof Class1918 ? ((Class1918)((Object)object)).getColour5() : class1612.Method3810(), object instanceof Class1918 ? ((Class1918)((Object)object)).getColour6() : class1612.Method3811(), d2);
        }
        Iterator iterator = ((ArrayList)object2).iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            this.Field14156.remove(blockPos);
        }
    }

    public void Method2992(float f, float f2, float f3, @NotNull @NotNull Class1612 class1612, @Nullable @Nullable String string) {
        Intrinsics.checkParameterIsNotNull((Object)class1612, (String)"renderer");
        this.Method2991(f, f2, f3, class1612, Class308.Field9315, string);
    }

    protected final double Method2993(float f, @NotNull @NotNull Class1612 class1612, long l) {
        double d;
        Intrinsics.checkParameterIsNotNull((Object)class1612, (String)"renderer");
        if (f == 0.0f) {
            return 1.0;
        }
        if (class1612 instanceof Class1515) {
            d = ((Class1024)((Class1515)class1612).Field15100.Method341()).Method845(Class1047.Method4285(l, f));
            return d;
        }
        d = Class187.Field8825.Method848(Class1047.Method4285(l, f));
        return d;
    }

    protected final double Method2994(float f, @NotNull @NotNull Class1612 class1612) {
        double d;
        Intrinsics.checkParameterIsNotNull((Object)class1612, (String)"renderer");
        if (f == 0.0f) {
            return 1.0;
        }
        if (class1612 instanceof Class1515) {
            d = ((Class187)((Class1515)class1612).Field15097.Method3886()).Method845(Class1047.Method4285(this.Field14153, f));
            return d;
        }
        d = Class187.Field8825.Method845(Class1047.Method4285(this.Field14153, f));
        return d;
    }

    protected final double Method2995(float f, @NotNull @NotNull Class1612 class1612) {
        Intrinsics.checkParameterIsNotNull((Object)class1612, (String)"renderer");
        if (f != 0.0f) {
            double d;
            if (class1612 instanceof Class1515) {
                if (this.Field14151 != null) {
                    d = ((Class187)((Class1515)class1612).Field15099.Method3886()).Method845(Class1047.Method4285(this.Field14154, f));
                    return d;
                }
                d = ((Class187)((Class1515)class1612).Field15098.Method3886()).Method848(Class1047.Method4285(this.Field14154, f));
                return d;
            }
            if (this.Field14151 != null) {
                d = Class187.Field8822.Method845(Class1047.Method4285(this.Field14154, f));
                return d;
            }
            d = Class187.Field8821.Method848(Class1047.Method4285(this.Field14154, f));
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
        return new AxisAlignedBB(vec3d.x - d2 + Double.longBitsToDouble((long)301617588 ^ 0x3FE0000011FA51B4L), vec3d.y - d2 + Double.longBitsToDouble(4602678819172646912L), vec3d.z - d2 + Double.longBitsToDouble((long)325413565 ^ 0x3FE0000013656ABDL), vec3d.x + d2 + Double.longBitsToDouble(4602678819172646912L), vec3d.y + d2 + Double.longBitsToDouble((long)631311856 ^ 0x3FE0000025A10DF0L), vec3d.z + d2 + Double.longBitsToDouble(4602678819172646912L));
    }

    @Nullable
    @Nullable
    public final Class1918 Method2997(@Nullable @Nullable BlockPos blockPos, @NotNull @NotNull Class1612 class1612) {
        Intrinsics.checkParameterIsNotNull((Object)class1612, (String)"renderer");
        Class1918 class1918 = blockPos != null ? new Class1918(blockPos, class1612.Method3806(), class1612.Method3807(), class1612.Method3808(), class1612.Method3809(), class1612.Method3810(), class1612.Method3811()) : null;
        if (class1918 == null) return class1918;
        Map map = this.Field14156;
        Long l = System.currentTimeMillis();
        boolean bl = false;
        map.put(class1918, l);
        return class1918;
    }

    public void Method2998(@Nullable @Nullable BlockPos blockPos, @NotNull @NotNull Class1612 class1612) {
        Intrinsics.checkParameterIsNotNull((Object)class1612, (String)"renderer");
        Class1918 class1918 = this.Method2997(blockPos, class1612);
        if (!(Intrinsics.areEqual((Object)((Object)class1918), (Object)this.Field14149) ^ true)) return;
        this.Field14151 = class1918 != null ? Class1955.Field17021.Method6691(class1918) : null;
        Vec3d vec3d = this.Field14152;
        if (vec3d == null) {
            vec3d = this.Field14151;
        }
        this.Field14150 = vec3d;
        this.Field14153 = System.currentTimeMillis();
        if (this.Field14149 == null) {
            this.Field14154 = System.currentTimeMillis();
        }
        this.Field14149 = class1918;
    }

    private static String Method2999(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 118;
            cArray2[n] = (char)(cArray[n] ^ (0x5657 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

