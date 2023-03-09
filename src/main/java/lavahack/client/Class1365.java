//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import com.kisman.cc.util.Class2142;
import java.awt.Color;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1672;
import lavahack.client.Class169;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class815;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2={"Lcom/kisman/cc/settings/util/ChromaRenderingPattern;", "", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "bright", "Lcom/kisman/cc/settings/Setting;", "diff", "gradientMode", "getModule", "()Lcom/kisman/cc/features/module/Module;", "pulsiveColor1", "pulsiveColor2", "sat", "speed", "staticColor", "drawBlockSide", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "facing", "Lnet/minecraft/util/EnumFacing;", "init", "kisman.cc"})
public final class Class1365 {
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

    public final void Method5458(@NotNull @NotNull BlockPos blockPos, @NotNull @NotNull EnumFacing enumFacing) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, (String)"facing");
        AxisAlignedBB axisAlignedBB = Class815.Method3447(Class2142.Field17803.world.getBlockState(blockPos).getSelectedBoundingBox((World)Class2142.Field17803.world, blockPos));
        Class2027 class2027 = this.Field14210.Method339();
        Class2027[] class2027Array = new Class2027[2];
        Class2027 class20272 = this.Field14211.Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)class20272, (String)"pulsiveColor1.colour");
        class2027Array[0] = class20272;
        Class2027 class20273 = this.Field14212.Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)class20273, (String)"pulsiveColor2.colour");
        class2027Array[1] = class20273;
        Enum enum_ = this.Field14209.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.ChromaColorTypes");
        }
        Color color = Class1672.Field15802.Method6456(class2027, class2027Array, (Class169)enum_, 0, this.Field14213.Method335(), this.Field14214.Method368(), this.Field14215.Method368(), this.Field14216.Method367()).Method3625();
        Class2027 class20274 = this.Field14210.Method339();
        Class2027[] class2027Array2 = new Class2027[2];
        Class2027 class20275 = this.Field14211.Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)class20275, (String)"pulsiveColor1.colour");
        class2027Array2[0] = class20275;
        Class2027 class20276 = this.Field14212.Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)class20276, (String)"pulsiveColor2.colour");
        class2027Array2[1] = class20276;
        Enum enum_2 = this.Field14209.Method341();
        if (enum_2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.ChromaColorTypes");
        }
        Color color2 = Class1672.Field15802.Method6456(class20274, class2027Array2, (Class169)enum_2, 1, this.Field14213.Method335(), this.Field14214.Method368(), this.Field14215.Method368(), this.Field14216.Method367()).Method3625();
        Class2027 class20277 = this.Field14210.Method339();
        Class2027[] class2027Array3 = new Class2027[2];
        Class2027 class20278 = this.Field14211.Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)class20278, (String)"pulsiveColor1.colour");
        class2027Array3[0] = class20278;
        Class2027 class20279 = this.Field14212.Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)class20279, (String)"pulsiveColor2.colour");
        class2027Array3[1] = class20279;
        Enum enum_3 = this.Field14209.Method341();
        if (enum_3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.ChromaColorTypes");
        }
        Color color3 = Class1672.Field15802.Method6456(class20277, class2027Array3, (Class169)enum_3, 2, this.Field14213.Method335(), this.Field14214.Method368(), this.Field14215.Method368(), this.Field14216.Method367()).Method3625();
        Class2027 class202710 = this.Field14210.Method339();
        Class2027[] class2027Array4 = new Class2027[2];
        Class2027 class202711 = this.Field14211.Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)class202711, (String)"pulsiveColor1.colour");
        class2027Array4[0] = class202711;
        Class2027 class202712 = this.Field14212.Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)class202712, (String)"pulsiveColor2.colour");
        class2027Array4[1] = class202712;
        Enum enum_4 = this.Field14209.Method341();
        if (enum_4 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.ChromaColorTypes");
        }
        Class815.Method3463(axisAlignedBB, enumFacing, color, color2, color3, Class1672.Field15802.Method6456(class202710, class2027Array4, (Class169)enum_4, 3, this.Field14213.Method335(), this.Field14214.Method368(), this.Field14215.Method368(), this.Field14216.Method367()).Method3625());
    }

    @NotNull
    @NotNull
    public final Class42 Method5459() {
        return this.Field14217;
    }

    public Class1365(@NotNull @NotNull Class42 class42) {
        Intrinsics.checkParameterIsNotNull((Object)class42, (String)"module");
        this.Field14217 = class42;
        this.Field14209 = new Class44("Gradient Mode", this.Field14217, Class169.Field8718);
        this.Field14210 = new Class44("Static Color", this.Field14217, new Class2027(255, 255, 255, 255));
        this.Field14211 = new Class44("Pulsive Color 1", this.Field14217, new Class2027(255, 255, 255, 255));
        this.Field14212 = new Class44("Pulsive Color 2", this.Field14217, new Class2027(255, 255, 255, 255));
        this.Field14213 = new Class44("Diff", this.Field14217, Double.longBitsToDouble(4636033603912859648L), 1.0, Double.longBitsToDouble(4639481672377565184L), true);
        this.Field14214 = new Class44("Sat", this.Field14217, Double.longBitsToDouble(4636737291354636288L), 0.0, Double.longBitsToDouble((long)116746498 ^ 0x4059000006F56902L), true);
        this.Field14215 = new Class44("Bright", this.Field14217, Double.longBitsToDouble(0x4049000000000000L), 0.0, Double.longBitsToDouble((long)197172554 ^ 0x405900000BC09D4AL), true);
        this.Field14216 = new Class44("Speed", this.Field14217, Double.longBitsToDouble((long)921243532 ^ 0x4000000036E90F8CL), Double.longBitsToDouble(4591870180066964927L), Double.longBitsToDouble((long)682354096 ^ 0x4014000028ABE5B0L), false);
    }

    private static String Method5460(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 16;
            cArray2[n] = (char)(cArray[n] ^ (0x4D18 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

