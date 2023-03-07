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

import com.kisman.cc.util.agYEaptPUW8OPC6jB7DK1WZuIoCKRIex;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.KSMK0r3rozhCk9i2GXUE6z6wFyNidrRu;
import lavahack.client.MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK;
import lavahack.client.RzBuXINbHt5tRWlCGAsjWoWk0p3hR7t2;
import lavahack.client.cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs;
import lavahack.client.um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000[\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002J$\u0010\u0015\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0010H\u0014J\u001a\u0010\u001d\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u001eH\u0002J\u001c\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u001eH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000bj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2={"com/kisman/cc/features/module/render/BlockHighlight$renderer$1", "Lcom/kisman/cc/util/render/pattern/SlideRendererPattern;", "Lcom/kisman/cc/features/module/render/BlockHighlight$IRenderer;", "bb", "Lnet/minecraft/util/math/AxisAlignedBB;", "facing", "Lnet/minecraft/util/EnumFacing;", "lastBB", "lastVec", "Lnet/minecraft/util/math/Vec3d;", "processedBBsList", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "vec", "getSizeCoefficient", "", "axis", "", "getVec", "bb_", "onRenderWorld", "", "renderer", "Lcom/kisman/cc/settings/util/SlideRenderingRewritePattern;", "reset", "toRenderBox", "vec3d", "scale", "update", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "updateBBs", "Lcom/kisman/cc/util/math/vectors/bb/ColorableSlideBB;", "kisman.cc"})
public final class um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9$Ljc0gDTN8WkwPRHY480HpEkScGALG41A
extends RzBuXINbHt5tRWlCGAsjWoWk0p3hR7t2
implements um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf {
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
    public void Method4271(@Nullable @Nullable AxisAlignedBB axisAlignedBB, @Nullable @Nullable EnumFacing enumFacing, @NotNull @NotNull cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2) {
        Intrinsics.checkParameterIsNotNull((Object)cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2, (String)"renderer");
        this.Method4276(axisAlignedBB, cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2);
        this.Field12630 = enumFacing;
        if (axisAlignedBB != null) {
            this.Method2992(cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2.Field15093.Method368(), cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2.Field15094.Method368(), cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2.Field15095.Method368(), cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2, null);
        }
        if (cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2.Field15095.Method368() == 0.0f) return;
        double d = this.Method2994(cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2.Field15093.Method368(), cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2);
        ArrayList<Map> arrayList = new ArrayList<Map>();
        Map map = this.Field12631;
        int n = (int)1176779628L ^ 0x46243B6C;
        for (Map.Entry axisAlignedBB2 : map.entrySet()) {
            map = (AxisAlignedBB)axisAlignedBB2.getKey();
            long l = ((Number)axisAlignedBB2.getValue()).longValue();
            if (d == 0.0 && Intrinsics.areEqual((Object)map, (Object)this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS)) {
                arrayList.add(map);
                continue;
            }
            double d2 = this.Method2993(cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2.Field15095.Method368(), cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2, l);
            if (d2 == 0.0) {
                arrayList.add(map);
                continue;
            }
            cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2.Method3801((AxisAlignedBB)map, map instanceof KSMK0r3rozhCk9i2GXUE6z6wFyNidrRu ? ((KSMK0r3rozhCk9i2GXUE6z6wFyNidrRu)((Object)map)).getColour1() : cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2.Method3806(), map instanceof KSMK0r3rozhCk9i2GXUE6z6wFyNidrRu ? ((KSMK0r3rozhCk9i2GXUE6z6wFyNidrRu)((Object)map)).getColour2() : cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2.Method3807(), map instanceof KSMK0r3rozhCk9i2GXUE6z6wFyNidrRu ? ((KSMK0r3rozhCk9i2GXUE6z6wFyNidrRu)((Object)map)).getColour3() : cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2.Method3808(), map instanceof KSMK0r3rozhCk9i2GXUE6z6wFyNidrRu ? ((KSMK0r3rozhCk9i2GXUE6z6wFyNidrRu)((Object)map)).getColour4() : cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2.Method3809(), map instanceof KSMK0r3rozhCk9i2GXUE6z6wFyNidrRu ? ((KSMK0r3rozhCk9i2GXUE6z6wFyNidrRu)((Object)map)).getColour5() : cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2.Method3810(), map instanceof KSMK0r3rozhCk9i2GXUE6z6wFyNidrRu ? ((KSMK0r3rozhCk9i2GXUE6z6wFyNidrRu)((Object)map)).getColour6() : cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2.Method3811(), d2);
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
        double d2 = this.Method4274(axisAlignedBB2, (int)-269971326L ^ 0xEFE89083) * d;
        double d3 = this.Method4274(axisAlignedBB2, ((int)985219888L ^ 0x3AB94331) << 1) * d;
        double d4 = this.Method4274(axisAlignedBB2, (int)((long)-1008314580 ^ (long)-1008314577)) * d;
        AxisAlignedBB axisAlignedBB3 = new AxisAlignedBB(vec3d.x - d2 + this.Method4274(axisAlignedBB2, (int)((long)-932043759 ^ (long)-932043760)), vec3d.y - d3 + this.Method4274(axisAlignedBB2, ((int)408161693L ^ 0x18540D9C) << 1), vec3d.z - d4 + this.Method4274(axisAlignedBB2, (int)1972684498L ^ 0x7594C6D1), vec3d.x + d2 + this.Method4274(axisAlignedBB2, (int)-1692831177L ^ 0x9B197236), vec3d.y + d3 + this.Method4274(axisAlignedBB2, ((int)-69756280L ^ 0xFBD79A89) << 1), vec3d.z + d4 + this.Method4274(axisAlignedBB2, (int)((long)687691903 ^ (long)687691900)));
        if (this.Field12630 == null) return axisAlignedBB3;
        EnumFacing enumFacing = this.Field12630;
        if (enumFacing != null) return agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3715(axisAlignedBB3, enumFacing);
        Intrinsics.throwNpe();
        return agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3715(axisAlignedBB3, enumFacing);
    }

    private final Vec3d Method4273(AxisAlignedBB axisAlignedBB) {
        double d;
        AxisAlignedBB axisAlignedBB2 = axisAlignedBB;
        if (axisAlignedBB2 == null) return new Vec3d(0.0, 0.0, 0.0);
        AxisAlignedBB axisAlignedBB3 = axisAlignedBB2;
        double d2 = axisAlignedBB3.minX;
        double d3 = axisAlignedBB3.maxX;
        int n = (int)((long)854645027 ^ (long)854645027);
        double d4 = Math.min(d2, d3);
        d2 = axisAlignedBB3.minY;
        d3 = axisAlignedBB3.maxY;
        n = (int)((long)-1819286173 ^ (long)-1819286173);
        double d5 = Math.min(d2, d3);
        d2 = axisAlignedBB3.minZ;
        d3 = axisAlignedBB3.maxZ;
        n = (int)343707405L ^ 0x147C8F0D;
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
                int n2 = (int)-686033780L ^ 0xD71BF48C;
                double d5 = Math.max(d3, d4);
                d3 = axisAlignedBB.minX;
                d4 = axisAlignedBB.maxX;
                double d6 = d5;
                n2 = (int)((long)1090036349 ^ (long)1090036349);
                double d7 = Math.min(d3, d4);
                d = (d6 - d7) / (double)((int)((long)843070529 ^ (long)843070528) << 1);
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
                int n3 = (int)((long)1545903193 ^ (long)1545903193);
                double d11 = Math.max(d9, d10);
                d9 = axisAlignedBB.minY;
                d10 = axisAlignedBB.maxY;
                double d12 = d11;
                n3 = (int)((long)-1513674397 ^ (long)-1513674397);
                double d13 = Math.min(d9, d10);
                d = (d12 - d13) / (double)((int)((long)-772749193 ^ (long)-772749194) << 1);
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
                int n4 = (int)-1450866473L ^ 0xA98588D7;
                double d17 = Math.max(d15, d16);
                d15 = axisAlignedBB.minZ;
                d16 = axisAlignedBB.maxZ;
                double d18 = d17;
                n4 = (int)731379612L ^ 0x2B97F79C;
                double d19 = Math.min(d15, d16);
                d = (d18 - d19) / (double)(((int)1649428090L ^ 0x6250467B) << 1);
                return d;
            }
        }
        d = Double.longBitsToDouble((long)1168446615 ^ 0x3FE0000045A51497L);
        return d;
    }

    private final KSMK0r3rozhCk9i2GXUE6z6wFyNidrRu Method4275(AxisAlignedBB axisAlignedBB, MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK) {
        KSMK0r3rozhCk9i2GXUE6z6wFyNidrRu kSMK0r3rozhCk9i2GXUE6z6wFyNidrRu = axisAlignedBB != null ? new KSMK0r3rozhCk9i2GXUE6z6wFyNidrRu(axisAlignedBB, mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method3806(), mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method3807(), mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method3808(), mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method3809(), mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method3810(), mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method3811()) : null;
        if (kSMK0r3rozhCk9i2GXUE6z6wFyNidrRu == null) return kSMK0r3rozhCk9i2GXUE6z6wFyNidrRu;
        Map map = this.Field12631;
        Long l = System.currentTimeMillis();
        int n = (int)-506787638L ^ 0xE1CB08CA;
        map.put(kSMK0r3rozhCk9i2GXUE6z6wFyNidrRu, l);
        return kSMK0r3rozhCk9i2GXUE6z6wFyNidrRu;
    }

    private final void Method4276(AxisAlignedBB axisAlignedBB, MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK) {
        this.Method4275(axisAlignedBB, mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK);
        this.Field12629 = axisAlignedBB;
        this.Field12626 = this.Method4273(axisAlignedBB);
        if ((Intrinsics.areEqual((Object)this.Field12626, (Object)this.Field12627) ^ ((int)-701753413L ^ 0xD62C17BA)) == 0) return;
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

    um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9$Ljc0gDTN8WkwPRHY480HpEkScGALG41A() {
    }

    private static String Method2999(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-334867523L ^ 0xEC0A53BD;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)125704823 ^ (long)125704840);
            int n2 = (int)((long)1545857046 ^ (long)1545857145) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1551927129 ^ (long)1551930338) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

