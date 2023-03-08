//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.util.math.*;
import net.minecraft.util.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;
import com.kisman.cc.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000[\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002J$\u0010\u0015\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0010H\u0014J\u001a\u0010\u001d\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u001eH\u0002J\u001c\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u001eH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e?\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e?\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e?\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e?\u0006\u0002\n\u0000R*\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000bj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004?\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0082\u000e?\u0006\u0002\n\u0000?\u0006!" }, d2 = { "com/kisman/cc/features/module/render/BlockHighlight$renderer$1", "Lcom/kisman/cc/util/render/pattern/SlideRendererPattern;", "Lcom/kisman/cc/features/module/render/BlockHighlight$IRenderer;", "bb", "Lnet/minecraft/util/math/AxisAlignedBB;", "facing", "Lnet/minecraft/util/EnumFacing;", "lastBB", "lastVec", "Lnet/minecraft/util/math/Vec3d;", "processedBBsList", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "vec", "getSizeCoefficient", "", "axis", "", "getVec", "bb_", "onRenderWorld", "", "renderer", "Lcom/kisman/cc/settings/util/SlideRenderingRewritePattern;", "reset", "toRenderBox", "vec3d", "scale", "update", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "updateBBs", "Lcom/kisman/cc/util/math/vectors/bb/ColorableSlideBB;", "kisman.cc" })
public final class Class1044 extends Class1352 implements Class1950
{
    private Vec3d Field12626;
    private Vec3d Field12627;
    private AxisAlignedBB Field12628;
    private AxisAlignedBB Field12629;
    private EnumFacing Field12630;
    private final HashMap Field12631;
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
    public void Method4271(@Nullable @Nullable final AxisAlignedBB axisAlignedBB, @Nullable @Nullable final EnumFacing field12630, @NotNull @NotNull final Class1515 class1515) {
        Intrinsics.checkParameterIsNotNull((Object)class1515, "renderer");
        this.Method4276(axisAlignedBB, class1515);
        this.Field12630 = field12630;
        if (axisAlignedBB != null) {
            this.Method2992(class1515.Field15093.Method368(), class1515.Field15094.Method368(), class1515.Field15095.Method368(), class1515, null);
        }
        if (class1515.Field15095.Method368() != 0.0f) {
            final double method2994 = this.Method2994(class1515.Field15093.Method368(), class1515);
            final ArrayList<Class152> list = new ArrayList<Class152>();
            for (final Map.Entry<AxisAlignedBB, V> entry : this.Field12631.entrySet()) {
                final AxisAlignedBB axisAlignedBB2 = entry.getKey();
                final long longValue = ((Number)entry.getValue()).longValue();
                if (method2994 == 0.0 && Intrinsics.areEqual((Object)axisAlignedBB2, (Object)this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS)) {
                    list.add((Class152)axisAlignedBB2);
                }
                else {
                    final double method2995 = this.Method2993(class1515.Field15095.Method368(), class1515, longValue);
                    if (method2995 == 0.0) {
                        list.add((Class152)axisAlignedBB2);
                    }
                    else {
                        class1515.Method3801(axisAlignedBB2, (axisAlignedBB2 instanceof Class152) ? ((Class152)axisAlignedBB2).getColour1() : class1515.Method3806(), (axisAlignedBB2 instanceof Class152) ? ((Class152)axisAlignedBB2).getColour2() : class1515.Method3807(), (axisAlignedBB2 instanceof Class152) ? ((Class152)axisAlignedBB2).getColour3() : class1515.Method3808(), (axisAlignedBB2 instanceof Class152) ? ((Class152)axisAlignedBB2).getColour4() : class1515.Method3809(), (axisAlignedBB2 instanceof Class152) ? ((Class152)axisAlignedBB2).getColour5() : class1515.Method3810(), (axisAlignedBB2 instanceof Class152) ? ((Class152)axisAlignedBB2).getColour6() : class1515.Method3811(), method2995);
                    }
                }
            }
            final Iterator<Class152> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                this.Field12631.remove(iterator2.next());
            }
        }
    }
    
    @NotNull
    @NotNull
    @Override
    protected AxisAlignedBB Method2996(@NotNull @NotNull final Vec3d vec3d, final double n) {
        Intrinsics.checkParameterIsNotNull((Object)vec3d, "vec3d");
        AxisAlignedBB axisAlignedBB;
        if ((axisAlignedBB = this.Field12629) == null) {
            if ((axisAlignedBB = this.Field12628) == null) {
                Intrinsics.throwNpe();
            }
        }
        final AxisAlignedBB axisAlignedBB2 = axisAlignedBB;
        final double n2 = this.Method4274(axisAlignedBB2, 1) * n;
        final double n3 = this.Method4274(axisAlignedBB2, 2) * n;
        final double n4 = this.Method4274(axisAlignedBB2, 3) * n;
        AxisAlignedBB method3715 = new AxisAlignedBB(vec3d.x - n2 + this.Method4274(axisAlignedBB2, 1), vec3d.y - n3 + this.Method4274(axisAlignedBB2, 2), vec3d.z - n4 + this.Method4274(axisAlignedBB2, 3), vec3d.x + n2 + this.Method4274(axisAlignedBB2, 1), vec3d.y + n3 + this.Method4274(axisAlignedBB2, 2), vec3d.z + n4 + this.Method4274(axisAlignedBB2, 3));
        if (this.Field12630 != null) {
            final AxisAlignedBB axisAlignedBB3 = method3715;
            final EnumFacing field12630 = this.Field12630;
            if (field12630 == null) {
                Intrinsics.throwNpe();
            }
            method3715 = Class886.Method3715(axisAlignedBB3, field12630);
        }
        return method3715;
    }
    
    private final Vec3d Method4273(final AxisAlignedBB axisAlignedBB) {
        if (axisAlignedBB != null) {
            return new Vec3d(Math.min(axisAlignedBB.minX, axisAlignedBB.maxX), Math.min(axisAlignedBB.minY, axisAlignedBB.maxY), Math.min(axisAlignedBB.minZ, axisAlignedBB.maxZ));
        }
        return new Vec3d(0.0, 0.0, 0.0);
    }
    
    private final double Method4274(final AxisAlignedBB axisAlignedBB, final int n) {
        double longBitsToDouble = 0.0;
        switch (n) {
            case 1: {
                final Double n2 = (axisAlignedBB != null) ? Double.valueOf(axisAlignedBB.maxX) : null;
                if (n2 == null) {
                    Intrinsics.throwNpe();
                }
                longBitsToDouble = (Math.max(n2, axisAlignedBB.minX) - Math.min(axisAlignedBB.minX, axisAlignedBB.maxX)) / 2;
                break;
            }
            case 2: {
                final Double n3 = (axisAlignedBB != null) ? Double.valueOf(axisAlignedBB.maxY) : null;
                if (n3 == null) {
                    Intrinsics.throwNpe();
                }
                longBitsToDouble = (Math.max(n3, axisAlignedBB.minY) - Math.min(axisAlignedBB.minY, axisAlignedBB.maxY)) / 2;
                break;
            }
            case 3: {
                final Double n4 = (axisAlignedBB != null) ? Double.valueOf(axisAlignedBB.maxZ) : null;
                if (n4 == null) {
                    Intrinsics.throwNpe();
                }
                longBitsToDouble = (Math.max(n4, axisAlignedBB.minZ) - Math.min(axisAlignedBB.minZ, axisAlignedBB.maxZ)) / 2;
                break;
            }
            default: {
                longBitsToDouble = Double.longBitsToDouble((long)1168446615 ^ 0x3FE0000045A51497L);
                break;
            }
        }
        return longBitsToDouble;
    }
    
    private final Class152 Method4275(final AxisAlignedBB axisAlignedBB, final Class1612 class1612) {
        final Class152 class1613 = (axisAlignedBB != null) ? new Class152(axisAlignedBB, class1612.Method3806(), class1612.Method3807(), class1612.Method3808(), class1612.Method3809(), class1612.Method3810(), class1612.Method3811()) : null;
        if (class1613 != null) {
            this.Field12631.put(class1613, System.currentTimeMillis());
        }
        return class1613;
    }
    
    private final void Method4276(final AxisAlignedBB axisAlignedBB, final Class1612 class1612) {
        this.Method4275(axisAlignedBB, class1612);
        this.Field12629 = axisAlignedBB;
        this.Field12626 = this.Method4273(axisAlignedBB);
        if (Intrinsics.areEqual((Object)this.Field12626, (Object)this.Field12627) ^ true) {
            this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS = this.Field12626;
            Vec3d vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
            if ((vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = this.Ljc0gDTN8WkwPRHY480HpEkScGALG41A) == null) {
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
            }
            this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
            this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi = System.currentTimeMillis();
            if (this.Field12628 == null) {
                this.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3 = System.currentTimeMillis();
            }
            this.Field12628 = axisAlignedBB;
            this.Field12627 = this.Field12626;
        }
    }
    
    Class1044() {
        this.Field12631 = new HashMap();
    }
    
    private static String Method2999(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x14BB ^ 0xDE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
