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

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.awt.Color;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.NWGvXku8eTVn9iTQ8yPCeInlHaAJefP7;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import lavahack.client.m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2={"Lcom/kisman/cc/settings/util/ChromaRenderingPattern;", "", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "bright", "Lcom/kisman/cc/settings/Setting;", "diff", "gradientMode", "getModule", "()Lcom/kisman/cc/features/module/Module;", "pulsiveColor1", "pulsiveColor2", "sat", "speed", "staticColor", "drawBlockSide", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "facing", "Lnet/minecraft/util/EnumFacing;", "init", "kisman.cc"})
public final class jxq9vjxqXSadGa0SNXilT7p3PaAfRM8h {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14209;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14210;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14211;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14212;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14213;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14214;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14215;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14216;
    @NotNull
    private final WjjBVRrUqJUKhloA7ANknrTEODhuGa0J Field14217;
    private String Field14218 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final jxq9vjxqXSadGa0SNXilT7p3PaAfRM8h Method5457() {
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
        AxisAlignedBB axisAlignedBB = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3447(Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world.getBlockState(blockPos).getSelectedBoundingBox((World)Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world, blockPos));
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = this.Field14210.Method339();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray = new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[(int)((long)1523607096 ^ (long)1523607097) << 1];
        int n = (int)-1849575913L ^ 0x91C1B617;
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = this.Field14211.Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"pulsiveColor1.colour");
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[n] = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
        int n2 = (int)((long)-1817834311 ^ (long)-1817834312);
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4 = this.Field14212.Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"pulsiveColor2.colour");
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[n2] = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4;
        Enum enum_ = this.Field14209.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.ChromaColorTypes");
        }
        Color color = NWGvXku8eTVn9iTQ8yPCeInlHaAJefP7.Field15802.Method6456(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray, (m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs)enum_, (int)((long)266318327 ^ (long)266318327), this.Field14213.Method335(), this.Field14214.Method368(), this.Field14215.Method368(), this.Field14216.Method367()).Method3625();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5 = this.Field14210.Method339();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray2 = new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[(int)((long)-346432952 ^ (long)-346432951) << 1];
        int n3 = (int)1122077608L ^ 0x42E18BA8;
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6 = this.Field14211.Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, (String)"pulsiveColor1.colour");
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray2[n3] = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6;
        int n4 = (int)-520373498L ^ 0xE0FBBB07;
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7 = this.Field14212.Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, (String)"pulsiveColor2.colour");
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray2[n4] = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7;
        Enum enum_2 = this.Field14209.Method341();
        if (enum_2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.ChromaColorTypes");
        }
        Color color2 = NWGvXku8eTVn9iTQ8yPCeInlHaAJefP7.Field15802.Method6456(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray2, (m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs)enum_2, (int)((long)0x655622 ^ (long)6641187), this.Field14213.Method335(), this.Field14214.Method368(), this.Field14215.Method368(), this.Field14216.Method367()).Method3625();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV8 = this.Field14210.Method339();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray3 = new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[((int)-908376967L ^ 0xC9DB4478) << 1];
        int n5 = (int)((long)1155616621 ^ (long)1155616621);
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV9 = this.Field14211.Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV9, (String)"pulsiveColor1.colour");
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray3[n5] = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV9;
        int n6 = (int)((long)1124956654 ^ (long)1124956655);
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV10 = this.Field14212.Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV10, (String)"pulsiveColor2.colour");
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray3[n6] = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV10;
        Enum enum_3 = this.Field14209.Method341();
        if (enum_3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.ChromaColorTypes");
        }
        Color color3 = NWGvXku8eTVn9iTQ8yPCeInlHaAJefP7.Field15802.Method6456(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV8, vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray3, (m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs)enum_3, (int)((long)154922204 ^ (long)154922205) << 1, this.Field14213.Method335(), this.Field14214.Method368(), this.Field14215.Method368(), this.Field14216.Method367()).Method3625();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV11 = this.Field14210.Method339();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray4 = new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[(int)((long)926672656 ^ (long)926672657) << 1];
        int n7 = (int)((long)105288692 ^ (long)105288692);
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV12 = this.Field14211.Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV12, (String)"pulsiveColor1.colour");
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray4[n7] = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV12;
        int n8 = (int)((long)-1881065390 ^ (long)-1881065389);
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV13 = this.Field14212.Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV13, (String)"pulsiveColor2.colour");
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray4[n8] = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV13;
        Enum enum_4 = this.Field14209.Method341();
        if (enum_4 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.ChromaColorTypes");
        }
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3463(axisAlignedBB, enumFacing, color, color2, color3, NWGvXku8eTVn9iTQ8yPCeInlHaAJefP7.Field15802.Method6456(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV11, vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray4, (m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs)enum_4, (int)((long)261190460 ^ (long)261190463), this.Field14213.Method335(), this.Field14214.Method368(), this.Field14215.Method368(), this.Field14216.Method367()).Method3625());
    }

    @NotNull
    @NotNull
    public final WjjBVRrUqJUKhloA7ANknrTEODhuGa0J Method5459() {
        return this.Field14217;
    }

    public jxq9vjxqXSadGa0SNXilT7p3PaAfRM8h(@NotNull @NotNull WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) {
        Intrinsics.checkParameterIsNotNull((Object)wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, (String)"module");
        this.Field14217 = wjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
        this.Field14209 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Gradient Mode", this.Field14217, m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs.Field8718);
        this.Field14210 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Static Color", this.Field14217, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)589862989L ^ 0x232898B2, (int)-2093236082L ^ 0x833BC071, (int)-1842698906L ^ 0x922AA599, (int)((long)-1413698303 ^ (long)-1413698050)));
        this.Field14211 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Pulsive Color 1", this.Field14217, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)240259787L ^ 0xE521234, (int)((long)-2077735984 ^ (long)-2077736145), (int)500382593L ^ 0x1DD33B7E, (int)((long)-2016406100 ^ (long)-2016406189)));
        this.Field14212 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Pulsive Color 2", this.Field14217, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)-663307153L ^ 0xD876BC90, (int)60197579L ^ 0x3968A34, (int)1049490328L ^ 0x3E8DF367, (int)1759386636L ^ 0x68DE1CF3));
        this.Field14213 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Diff", this.Field14217, Double.longBitsToDouble(0xABEF95B657F22C4BL ^ 0xEBB915B657F22C4BL), 1.0, Double.longBitsToDouble(0x9FE41AB60738C887L ^ 0xDF86DAB60738C887L), ((int)1477766157L ^ 0x5814EC0C) != 0);
        this.Field14214 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Sat", this.Field14217, Double.longBitsToDouble(0xD59D5366CE2E962FL ^ 0x95C45366CE2E962FL), 0.0, Double.longBitsToDouble((long)116746498 ^ 0x4059000006F56902L), (boolean)((long)1790079631 ^ (long)1790079630));
        this.Field14215 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Bright", this.Field14217, Double.longBitsToDouble(0xB51D892531372460L ^ 0xF554892531372460L), 0.0, Double.longBitsToDouble((long)197172554 ^ 0x405900000BC09D4AL), ((int)-1221832138L ^ 0xB72C5237) != 0);
        this.Field14216 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Speed", this.Field14217, Double.longBitsToDouble((long)921243532 ^ 0x4000000036E90F8CL), Double.longBitsToDouble(0xE8E38958AE799A1BL ^ 0xD75A10C137E02FA4L), Double.longBitsToDouble((long)682354096 ^ 0x4014000028ABE5B0L), (boolean)((long)-980593999 ^ (long)-980593999));
    }

    private static String Method5460(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-806914020 ^ (long)-806914020);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-826943251 ^ (long)-826943470);
            int n2 = ((int)200660459L ^ 0xBF5D5EA) << 4;
            cArray2[n] = (char)(cArray[n] ^ (((int)933830360L ^ 0x37A9177B) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

