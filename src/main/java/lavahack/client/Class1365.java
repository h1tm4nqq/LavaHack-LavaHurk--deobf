//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import net.minecraft.util.*;
import kotlin.jvm.internal.*;
import net.minecraft.world.*;
import com.kisman.cc.util.*;
import kotlin.*;
import net.minecraft.util.math.*;
import java.awt.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0017" }, d2 = { "Lcom/kisman/cc/settings/util/ChromaRenderingPattern;", "", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "bright", "Lcom/kisman/cc/settings/Setting;", "diff", "gradientMode", "getModule", "()Lcom/kisman/cc/features/module/Module;", "pulsiveColor1", "pulsiveColor2", "sat", "speed", "staticColor", "drawBlockSide", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "facing", "Lnet/minecraft/util/EnumFacing;", "init", "kisman.cc" })
public final class Class1365
{
    private final Class44 Field14209;
    private final Class44 Field14210;
    private final Class44 Field14211;
    private final Class44 Field14212;
    private final Class44 Field14213;
    private final Class44 Field14214;
    private final Class44 Field14215;
    private final Class44 Field14216;
    @NotNull
    private final Class42 Field14217;
    private String Field14218 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class1365 Method5457() {
        this.Field14217.Method23(this.Field14209);
        this.Field14217.Method23(this.Field14210);
        this.Field14217.Method23(this.Field14211);
        this.Field14217.Method23(this.Field14212);
        this.Field14217.Method23(this.Field14213);
        this.Field14217.Method23(this.Field14214);
        this.Field14217.Method23(this.Field14215);
        this.Field14217.Method23(this.Field14216);
        return this;
    }
    
    public final void Method5458(@NotNull @NotNull final BlockPos blockPos, @NotNull @NotNull final EnumFacing enumFacing) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "pos");
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, "facing");
        final AxisAlignedBB method3447 = Class815.Method3447(Class2142.Field17803.world.getBlockState(blockPos).getSelectedBoundingBox((World)Class2142.Field17803.world, blockPos));
        final Class1672 field15802 = Class1672.Field15802;
        final Class2027 method3448 = this.Field14210.Method339();
        final Class2027[] array = new Class2027[2];
        final int n = 0;
        final Class2027 method3449 = this.Field14211.Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)method3449, "pulsiveColor1.colour");
        array[n] = method3449;
        final int n2 = 1;
        final Class2027 method3450 = this.Field14212.Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)method3450, "pulsiveColor2.colour");
        array[n2] = method3450;
        final Enum method3451 = this.Field14209.Method341();
        if (method3451 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.ChromaColorTypes");
        }
        final Color method3452 = field15802.Method6456(method3448, array, (Class169)method3451, 0, this.Field14213.Method335(), this.Field14214.Method368(), this.Field14215.Method368(), this.Field14216.Method367()).Method3625();
        final Class1672 field15803 = Class1672.Field15802;
        final Class2027 method3453 = this.Field14210.Method339();
        final Class2027[] array2 = new Class2027[2];
        final int n3 = 0;
        final Class2027 method3454 = this.Field14211.Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)method3454, "pulsiveColor1.colour");
        array2[n3] = method3454;
        final int n4 = 1;
        final Class2027 method3455 = this.Field14212.Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)method3455, "pulsiveColor2.colour");
        array2[n4] = method3455;
        final Enum method3456 = this.Field14209.Method341();
        if (method3456 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.ChromaColorTypes");
        }
        final Color method3457 = field15803.Method6456(method3453, array2, (Class169)method3456, 1, this.Field14213.Method335(), this.Field14214.Method368(), this.Field14215.Method368(), this.Field14216.Method367()).Method3625();
        final Class1672 field15804 = Class1672.Field15802;
        final Class2027 method3458 = this.Field14210.Method339();
        final Class2027[] array3 = new Class2027[2];
        final int n5 = 0;
        final Class2027 method3459 = this.Field14211.Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)method3459, "pulsiveColor1.colour");
        array3[n5] = method3459;
        final int n6 = 1;
        final Class2027 method3460 = this.Field14212.Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)method3460, "pulsiveColor2.colour");
        array3[n6] = method3460;
        final Enum method3461 = this.Field14209.Method341();
        if (method3461 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.ChromaColorTypes");
        }
        final Color method3462 = field15804.Method6456(method3458, array3, (Class169)method3461, 2, this.Field14213.Method335(), this.Field14214.Method368(), this.Field14215.Method368(), this.Field14216.Method367()).Method3625();
        final Class1672 field15805 = Class1672.Field15802;
        final Class2027 method3463 = this.Field14210.Method339();
        final Class2027[] array4 = new Class2027[2];
        final int n7 = 0;
        final Class2027 method3464 = this.Field14211.Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)method3464, "pulsiveColor1.colour");
        array4[n7] = method3464;
        final int n8 = 1;
        final Class2027 method3465 = this.Field14212.Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)method3465, "pulsiveColor2.colour");
        array4[n8] = method3465;
        final Enum method3466 = this.Field14209.Method341();
        if (method3466 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.ChromaColorTypes");
        }
        Class815.Method3463(method3447, enumFacing, method3452, method3457, method3462, field15805.Method6456(method3463, array4, (Class169)method3466, 3, this.Field14213.Method335(), this.Field14214.Method368(), this.Field14215.Method368(), this.Field14216.Method367()).Method3625());
    }
    
    @NotNull
    @NotNull
    public final Class42 Method5459() {
        return this.Field14217;
    }
    
    public Class1365(@NotNull @NotNull final Class42 field14217) {
        Intrinsics.checkParameterIsNotNull((Object)field14217, "module");
        this.Field14217 = field14217;
        this.Field14209 = new Class44("Gradient Mode", this.Field14217, Class169.Field8718);
        this.Field14210 = new Class44("Static Color", this.Field14217, new Class2027(255, 255, 255, 255));
        this.Field14211 = new Class44("Pulsive Color 1", this.Field14217, new Class2027(255, 255, 255, 255));
        this.Field14212 = new Class44("Pulsive Color 2", this.Field14217, new Class2027(255, 255, 255, 255));
        this.Field14213 = new Class44("Diff", this.Field14217, Double.longBitsToDouble(4636033603912859648L), 1.0, Double.longBitsToDouble(4639481672377565184L), true);
        this.Field14214 = new Class44("Sat", this.Field14217, Double.longBitsToDouble(4636737291354636288L), 0.0, Double.longBitsToDouble((long)116746498 ^ 0x4059000006F56902L), true);
        this.Field14215 = new Class44("Bright", this.Field14217, Double.longBitsToDouble(4632233691727265792L), 0.0, Double.longBitsToDouble((long)197172554 ^ 0x405900000BC09D4AL), true);
        this.Field14216 = new Class44("Speed", this.Field14217, Double.longBitsToDouble((long)921243532 ^ 0x4000000036E90F8CL), Double.longBitsToDouble(4591870180066964927L), Double.longBitsToDouble((long)682354096 ^ 0x4014000028ABE5B0L), false);
    }
    
    private static String Method5460(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4D18 ^ 0x10));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
