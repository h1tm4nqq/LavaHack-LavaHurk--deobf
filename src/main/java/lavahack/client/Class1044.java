//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import com.kisman.cc.util.Class886;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1352;
import lavahack.client.Class1515;
import lavahack.client.Class152;
import lavahack.client.Class1612;
import lavahack.client.Class1950;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000[\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002J$\u0010\u0015\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0010H\u0014J\u001a\u0010\u001d\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u001eH\u0002J\u001c\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u001eH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000bj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2={"com/kisman/cc/features/module/render/BlockHighlight$renderer$1", "Lcom/kisman/cc/util/render/pattern/SlideRendererPattern;", "Lcom/kisman/cc/features/module/render/BlockHighlight$IRenderer;", "bb", "Lnet/minecraft/util/math/AxisAlignedBB;", "facing", "Lnet/minecraft/util/EnumFacing;", "lastBB", "lastVec", "Lnet/minecraft/util/math/Vec3d;", "processedBBsList", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "vec", "getSizeCoefficient", "", "axis", "", "getVec", "bb_", "onRenderWorld", "", "renderer", "Lcom/kisman/cc/settings/util/SlideRenderingRewritePattern;", "reset", "toRenderBox", "vec3d", "scale", "update", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "updateBBs", "Lcom/kisman/cc/util/math/vectors/bb/ColorableSlideBB;", "kisman.cc"})
public final class Class1044
extends Class1352
implements Class1950 {
    private Vec3d Field12626;
    private Vec3d Field12627;
    private AxisAlignedBB Field12628;
    private AxisAlignedBB Field12629;
    private EnumFacing Field12630;
    private final HashMap Field12631 = new HashMap();
    private int Field12632;

    @Override
    public void Method2988() {
        super.Method2988();
        this.Field12626 = null;
        this.Field12627 = null;
        this.Field12628 = null;
        this.Field12629 = null;
        this.Field12630 = null;
    }

    @Override
    public void Method4271(@Nullable @Nullable AxisAlignedBB axisAlignedBB, @Nullable @Nullable EnumFacing enumFacing, @NotNull @NotNull Class1515 class1515) {
        Intrinsics.checkParameterIsNotNull((Object)class1515, (String)"renderer");
        this.Method4276(axisAlignedBB, class1515);
        this.Field12630 = enumFacing;
        if (axisAlignedBB != null) {
            this.Method2992(class1515.Field15093.Method368(), class1515.Field15094.Method368(), class1515.Field15095.Method368(), class1515, null);
        }
        if (class1515.Field15095.Method368() == 0.0f) return;
        double d = this.Method2994(class1515.Field15093.Method368(), class1515);
        ArrayList<Map> arrayList = new ArrayList<Map>();
        Map map = this.Field12631;
        boolean bl = false;
        for (Map.Entry axisAlignedBB2 : map.entrySet()) {
            map = (AxisAlignedBB)axisAlignedBB2.getKey();
            long l = ((Number)axisAlignedBB2.getValue()).longValue();
            if (d == 0.0 && Intrinsics.areEqual((Object)map, (Object)this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS)) {
                arrayList.add(map);
                continue;
            }
            double d2 = this.Method2993(class1515.Field15095.Method368(), class1515, l);
            if (d2 == 0.0) {
                arrayList.add(map);
                continue;
            }
            class1515.Method3801((AxisAlignedBB)map, map instanceof Class152 ? ((Class152)((Object)map)).getColour1() : class1515.Method3806(), map instanceof Class152 ? ((Class152)((Object)map)).getColour2() : class1515.Method3807(), map instanceof Class152 ? ((Class152)((Object)map)).getColour3() : class1515.Method3808(), map instanceof Class152 ? ((Class152)((Object)map)).getColour4() : class1515.Method3809(), map instanceof Class152 ? ((Class152)((Object)map)).getColour5() : class1515.Method3810(), map instanceof Class152 ? ((Class152)((Object)map)).getColour6() : class1515.Method3811(), d2);
        }
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            AxisAlignedBB axisAlignedBB2 = (AxisAlignedBB)iterator.next();
            this.Field12631.remove(axisAlignedBB2);
        }
    }

    @Override
    @NotNull
    @NotNull
    protected AxisAlignedBB Method2996(@NotNull @NotNull Vec3d vec3d, double d) {
        Intrinsics.checkParameterIsNotNull((Object)vec3d, (String)"vec3d");
        AxisAlignedBB axisAlignedBB = this.Field12629;
        if (axisAlignedBB == null && (axisAlignedBB = this.Field12628) == null) {
            Intrinsics.throwNpe();
        }
        AxisAlignedBB axisAlignedBB2 = axisAlignedBB;
        double d2 = this.Method4274(axisAlignedBB2, 1) * d;
        double d3 = this.Method4274(axisAlignedBB2, 2) * d;
        double d4 = this.Method4274(axisAlignedBB2, 3) * d;
        AxisAlignedBB axisAlignedBB3 = new AxisAlignedBB(vec3d.x - d2 + this.Method4274(axisAlignedBB2, 1), vec3d.y - d3 + this.Method4274(axisAlignedBB2, 2), vec3d.z - d4 + this.Method4274(axisAlignedBB2, 3), vec3d.x + d2 + this.Method4274(axisAlignedBB2, 1), vec3d.y + d3 + this.Method4274(axisAlignedBB2, 2), vec3d.z + d4 + this.Method4274(axisAlignedBB2, 3));
        if (this.Field12630 == null) return axisAlignedBB3;
        EnumFacing enumFacing = this.Field12630;
        if (enumFacing != null) return Class886.Method3715(axisAlignedBB3, enumFacing);
        Intrinsics.throwNpe();
        return Class886.Method3715(axisAlignedBB3, enumFacing);
    }

    private final Vec3d Method4273(AxisAlignedBB axisAlignedBB) {
        double d;
        AxisAlignedBB axisAlignedBB2 = axisAlignedBB;
        if (axisAlignedBB2 == null) return new Vec3d(0.0, 0.0, 0.0);
        AxisAlignedBB axisAlignedBB3 = axisAlignedBB2;
        double d2 = axisAlignedBB3.minX;
        double d3 = axisAlignedBB3.maxX;
        boolean bl = false;
        double d4 = Math.min(d2, d3);
        d2 = axisAlignedBB3.minY;
        d3 = axisAlignedBB3.maxY;
        bl = false;
        double d5 = Math.min(d2, d3);
        d2 = axisAlignedBB3.minZ;
        d3 = axisAlignedBB3.maxZ;
        bl = false;
        double d6 = d = Math.min(d2, d3);
        double d7 = d5;
        double d8 = d4;
        return new Vec3d(d8, d7, d6);
    }

    private final double Method4274(AxisAlignedBB axisAlignedBB, int n) {
        double d;
        switch (n) {
            case 1: {
                AxisAlignedBB axisAlignedBB2 = axisAlignedBB;
                Double d2 = axisAlignedBB2 != null ? Double.valueOf(axisAlignedBB2.maxX) : null;
                if (d2 == null) {
                    Intrinsics.throwNpe();
                }
                double d3 = d2;
                double d4 = axisAlignedBB.minX;
                boolean bl = false;
                double d5 = Math.max(d3, d4);
                d3 = axisAlignedBB.minX;
                d4 = axisAlignedBB.maxX;
                double d6 = d5;
                bl = false;
                double d7 = Math.min(d3, d4);
                d = (d6 - d7) / (double)2;
                return d;
            }
            case 2: {
                AxisAlignedBB axisAlignedBB3 = axisAlignedBB;
                Double d8 = axisAlignedBB3 != null ? Double.valueOf(axisAlignedBB3.maxY) : null;
                if (d8 == null) {
                    Intrinsics.throwNpe();
                }
                double d9 = d8;
                double d10 = axisAlignedBB.minY;
                boolean bl = false;
                double d11 = Math.max(d9, d10);
                d9 = axisAlignedBB.minY;
                d10 = axisAlignedBB.maxY;
                double d12 = d11;
                bl = false;
                double d13 = Math.min(d9, d10);
                d = (d12 - d13) / (double)2;
                return d;
            }
            case 3: {
                AxisAlignedBB axisAlignedBB4 = axisAlignedBB;
                Double d14 = axisAlignedBB4 != null ? Double.valueOf(axisAlignedBB4.maxZ) : null;
                if (d14 == null) {
                    Intrinsics.throwNpe();
                }
                double d15 = d14;
                double d16 = axisAlignedBB.minZ;
                boolean bl = false;
                double d17 = Math.max(d15, d16);
                d15 = axisAlignedBB.minZ;
                d16 = axisAlignedBB.maxZ;
                double d18 = d17;
                bl = false;
                double d19 = Math.min(d15, d16);
                d = (d18 - d19) / (double)2;
                return d;
            }
        }
        d = Double.longBitsToDouble((long)1168446615 ^ 0x3FE0000045A51497L);
        return d;
    }

    private final Class152 Method4275(AxisAlignedBB axisAlignedBB, Class1612 class1612) {
        Class152 class152 = axisAlignedBB != null ? new Class152(axisAlignedBB, class1612.Method3806(), class1612.Method3807(), class1612.Method3808(), class1612.Method3809(), class1612.Method3810(), class1612.Method3811()) : null;
        if (class152 == null) return class152;
        Map map = this.Field12631;
        Long l = System.currentTimeMillis();
        boolean bl = false;
        map.put(class152, l);
        return class152;
    }

    private final void Method4276(AxisAlignedBB axisAlignedBB, Class1612 class1612) {
        this.Method4275(axisAlignedBB, class1612);
        this.Field12629 = axisAlignedBB;
        this.Field12626 = this.Method4273(axisAlignedBB);
        if (!(Intrinsics.areEqual((Object)this.Field12626, (Object)this.Field12627) ^ true)) return;
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS = this.Field12626;
        Vec3d vec3d = this.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
        if (vec3d == null) {
            vec3d = this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
        }
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = vec3d;
        this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi = System.currentTimeMillis();
        if (this.Field12628 == null) {
            this.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3 = System.currentTimeMillis();
        }
        this.Field12628 = axisAlignedBB;
        this.Field12627 = this.Field12626;
    }

    Class1044() {
    }

    private static String Method2999(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 222;
            cArray2[n] = (char)(cArray[n] ^ (0x14BB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

