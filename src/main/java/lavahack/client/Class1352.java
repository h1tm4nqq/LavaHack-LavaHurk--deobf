//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import net.minecraft.util.math.*;
import com.kisman.cc.util.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J \u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tH\u0004J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J<\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0018\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0004JF\u0010 \u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J2\u0010 \u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010$\u001a\u00020\u0018H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0004J\u0018\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u001a\u0010'\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u0015R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R,\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\fj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t`\r8\u0006X\u0087\u0004?\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000?\u0006*" }, d2 = { "Lcom/kisman/cc/util/render/pattern/SlideRendererPattern;", "", "()V", "currentPos", "Lnet/minecraft/util/math/Vec3d;", "lastBlockPos", "Lnet/minecraft/util/math/BlockPos;", "lastRenderPos", "lastUpdateTime", "", "prevPos", "processedPossesList", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "scale", "", "startTime", "alpha", "alphaFadeLength", "", "renderer", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "time", "handleRenderWorld", "", "Lcom/kisman/cc/settings/util/SlideRenderingRewritePattern;", "pos", "text", "", "movingLength", "fadeLength", "multiplier", "renderWorld", "aabbModifier", "Lkotlin/Function1;", "Lnet/minecraft/util/math/AxisAlignedBB;", "reset", "toRenderBox", "vec3d", "update", "updatePosses", "Lcom/kisman/cc/util/math/vectors/xyz/ColorableSlidePos;", "kisman.cc" })
public class Class1352
{
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
    public final HashMap Field14156;
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
    
    public void Method2989(final float n, final float n2, final float n3, @NotNull @NotNull final Class1612 class1612, @Nullable @Nullable final BlockPos blockPos, @Nullable @Nullable final String s) {
        Intrinsics.checkParameterIsNotNull((Object)class1612, "renderer");
        this.Method2998(blockPos, class1612);
        this.Method2992(n, n2, n3, class1612, s);
    }
    
    public void Method2990(@NotNull @NotNull final Class1515 class1515, @Nullable @Nullable final BlockPos blockPos, @Nullable @Nullable final String s) {
        Intrinsics.checkParameterIsNotNull((Object)class1515, "renderer");
        this.Method2989(class1515.Field15093.Method368(), class1515.Field15094.Method368(), class1515.Field15095.Method368(), class1515, blockPos, s);
    }
    
    public void Method2991(final float n, final float n2, final float n3, @NotNull @NotNull final Class1612 class1612, @NotNull @NotNull final Function1 function1, @Nullable @Nullable final String s) {
        Intrinsics.checkParameterIsNotNull((Object)class1612, "renderer");
        Intrinsics.checkParameterIsNotNull((Object)function1, "aabbModifier");
        final double method2994 = this.Method2994(n, class1612);
        final Vec3d field14150 = this.Field14150;
        if (field14150 != null) {
            final Vec3d vec3d = field14150;
            Vec3d field14151;
            if ((field14151 = this.Field14151) == null) {
                field14151 = vec3d;
            }
            final Vec3d vec3d2 = field14151;
            this.Field14155 = this.Method2995(n2, class1612);
            final Vec3d add;
            final Vec3d field14152 = add = vec3d.add(vec3d2.subtract(vec3d).scale(method2994));
            Intrinsics.checkExpressionValueIsNotNull((Object)add, "renderPos");
            class1612.Method3804((AxisAlignedBB)function1.invoke((Object)this.Method2996(add, this.Field14155)));
            this.Field14152 = field14152;
            if (s != null) {
                new Class1366(s, new BlockPos(vec3d2), new Class2027(255, 255, 255, (int)(Float.intBitsToFloat(1132396544) * this.Field14155)));
            }
        }
        if (n3 != 0.0f) {
            final ArrayList<Class1918> list = new ArrayList<Class1918>();
            for (final Map.Entry<BlockPos, V> entry : this.Field14156.entrySet()) {
                final BlockPos blockPos = entry.getKey();
                final long longValue = ((Number)entry.getValue()).longValue();
                if (method2994 == 0.0 && Intrinsics.areEqual((Object)blockPos, (Object)this.Field14151)) {
                    list.add((Class1918)blockPos);
                }
                else {
                    final double method2995 = this.Method2993(n3, class1612, longValue);
                    if (method2995 == 0.0) {
                        list.add((Class1918)blockPos);
                    }
                    else {
                        class1612.Method3800(blockPos, (blockPos instanceof Class1918) ? ((Class1918)blockPos).getColour1() : class1612.Method3806(), (blockPos instanceof Class1918) ? ((Class1918)blockPos).getColour2() : class1612.Method3807(), (blockPos instanceof Class1918) ? ((Class1918)blockPos).getColour3() : class1612.Method3808(), (blockPos instanceof Class1918) ? ((Class1918)blockPos).getColour4() : class1612.Method3809(), (blockPos instanceof Class1918) ? ((Class1918)blockPos).getColour5() : class1612.Method3810(), (blockPos instanceof Class1918) ? ((Class1918)blockPos).getColour6() : class1612.Method3811(), method2995);
                    }
                }
            }
            final Iterator<Class1918> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                this.Field14156.remove(iterator2.next());
            }
        }
    }
    
    public void Method2992(final float n, final float n2, final float n3, @NotNull @NotNull final Class1612 class1612, @Nullable @Nullable final String s) {
        Intrinsics.checkParameterIsNotNull((Object)class1612, "renderer");
        this.Method2991(n, n2, n3, class1612, (Function1)Class308.Field9315, s);
    }
    
    protected final double Method2993(final float n, @NotNull @NotNull final Class1612 class1612, final long n2) {
        Intrinsics.checkParameterIsNotNull((Object)class1612, "renderer");
        return (n != 0.0f) ? ((class1612 instanceof Class1515) ? ((Class1024)((Class1515)class1612).Field15100.Method341()).Method845(Class1047.Method4285(n2, n)) : Class187.Field8825.Method848(Class1047.Method4285(n2, n))) : 1.0;
    }
    
    protected final double Method2994(final float n, @NotNull @NotNull final Class1612 class1612) {
        Intrinsics.checkParameterIsNotNull((Object)class1612, "renderer");
        return (n != 0.0f) ? ((class1612 instanceof Class1515) ? ((Class187)((Class1515)class1612).Field15097.Method3886()).Method845(Class1047.Method4285(this.Field14153, n)) : Class187.Field8825.Method845(Class1047.Method4285(this.Field14153, n))) : 1.0;
    }
    
    protected final double Method2995(final float n, @NotNull @NotNull final Class1612 class1612) {
        Intrinsics.checkParameterIsNotNull((Object)class1612, "renderer");
        return (n != 0.0f) ? ((class1612 instanceof Class1515) ? ((this.Field14151 != null) ? ((Class187)((Class1515)class1612).Field15099.Method3886()).Method845(Class1047.Method4285(this.Field14154, n)) : ((Class187)((Class1515)class1612).Field15098.Method3886()).Method848(Class1047.Method4285(this.Field14154, n))) : ((this.Field14151 != null) ? Class187.Field8822.Method845(Class1047.Method4285(this.Field14154, n)) : Class187.Field8821.Method848(Class1047.Method4285(this.Field14154, n)))) : ((this.Field14151 != null) ? 1.0 : 0.0);
    }
    
    @NotNull
    @NotNull
    protected AxisAlignedBB Method2996(@NotNull @NotNull final Vec3d vec3d, final double n) {
        Intrinsics.checkParameterIsNotNull((Object)vec3d, "vec3d");
        final double n2 = Double.longBitsToDouble((long)1195400629 ^ 0x3FE0000047405DB5L) * n;
        return new AxisAlignedBB(vec3d.x - n2 + Double.longBitsToDouble((long)301617588 ^ 0x3FE0000011FA51B4L), vec3d.y - n2 + Double.longBitsToDouble(4602678819172646912L), vec3d.z - n2 + Double.longBitsToDouble((long)325413565 ^ 0x3FE0000013656ABDL), vec3d.x + n2 + Double.longBitsToDouble(4602678819172646912L), vec3d.y + n2 + Double.longBitsToDouble((long)631311856 ^ 0x3FE0000025A10DF0L), vec3d.z + n2 + Double.longBitsToDouble(4602678819172646912L));
    }
    
    @Nullable
    @Nullable
    public final Class1918 Method2997(@Nullable @Nullable final BlockPos blockPos, @NotNull @NotNull final Class1612 class1612) {
        Intrinsics.checkParameterIsNotNull((Object)class1612, "renderer");
        final Class1918 class1613 = (blockPos != null) ? new Class1918(blockPos, class1612.Method3806(), class1612.Method3807(), class1612.Method3808(), class1612.Method3809(), class1612.Method3810(), class1612.Method3811()) : null;
        if (class1613 != null) {
            this.Field14156.put(class1613, System.currentTimeMillis());
        }
        return class1613;
    }
    
    public void Method2998(@Nullable @Nullable final BlockPos blockPos, @NotNull @NotNull final Class1612 class1612) {
        Intrinsics.checkParameterIsNotNull((Object)class1612, "renderer");
        final Class1918 method2997 = this.Method2997(blockPos, class1612);
        if (Intrinsics.areEqual((Object)method2997, (Object)this.Field14149) ^ true) {
            this.Field14151 = ((method2997 != null) ? Class1955.Field17021.Method6691(method2997) : null);
            Vec3d field14150;
            if ((field14150 = this.Field14152) == null) {
                field14150 = this.Field14151;
            }
            this.Field14150 = field14150;
            this.Field14153 = System.currentTimeMillis();
            if (this.Field14149 == null) {
                this.Field14154 = System.currentTimeMillis();
            }
            this.Field14149 = method2997;
        }
    }
    
    public Class1352() {
        this.Field14156 = new HashMap();
    }
    
    private static String Method2999(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5657 ^ 0x76));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
