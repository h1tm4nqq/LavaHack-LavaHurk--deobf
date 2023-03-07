//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0016\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f\u001a\n\u0010\u000e\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\u0001\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0011\u0010\u0006\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0011\u0010\b\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003\u00a8\u0006\u0010"}, d2={"x_minus", "Lnet/minecraft/util/EnumFacing;", "getX_minus", "()Lnet/minecraft/util/EnumFacing;", "x_plus", "getX_plus", "z_minus", "getZ_minus", "z_plus", "getZ_plus", "nearestFacing", "pos1", "Lnet/minecraft/util/math/BlockPos;", "pos2", "left", "right", "kisman.cc"})
public final class V6J7zszJg3aDVWGVNgIfZR9Z0B2PCHhk {
    @NotNull
    private static final EnumFacing Field8802 = EnumFacing.EAST;
    @NotNull
    private static final EnumFacing Field8803 = EnumFacing.WEST;
    @NotNull
    private static final EnumFacing Field8804 = EnumFacing.SOUTH;
    @NotNull
    private static final EnumFacing Field8805 = EnumFacing.NORTH;
    private String Field8806 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public static final EnumFacing Method1111() {
        return Field8802;
    }

    @NotNull
    @NotNull
    public static final EnumFacing Method1112() {
        return Field8803;
    }

    @NotNull
    @NotNull
    public static final EnumFacing Method1113() {
        return Field8804;
    }

    @NotNull
    @NotNull
    public static final EnumFacing Method1114() {
        return Field8805;
    }

    @NotNull
    @NotNull
    public static final EnumFacing Method1115(@NotNull @NotNull BlockPos blockPos, @NotNull @NotNull BlockPos blockPos2) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos1");
        Intrinsics.checkParameterIsNotNull((Object)blockPos2, (String)"pos2");
        int n = blockPos.getX() - blockPos2.getX();
        int n2 = blockPos.getZ() - blockPos2.getZ();
        EnumFacing enumFacing = null;
        enumFacing = n < 0 ? Field8802 : (n > 0 ? Field8803 : (n2 < 0 ? Field8805 : (n2 > 0 ? Field8804 : EnumFacing.EAST)));
        int n3 = (int)((long)1584667954 ^ (long)1584667954);
        int n4 = Math.abs(n2);
        n3 = (int)-1849357173L ^ 0x91C50C8B;
        int n5 = Math.abs(n);
        if (n4 <= n5) return enumFacing;
        if (n2 < 0) {
            return Field8805;
        }
        if (n2 <= 0) return enumFacing;
        return Field8804;
    }

    @NotNull
    @NotNull
    public static final EnumFacing Method1116(@NotNull @NotNull EnumFacing enumFacing) {
        EnumFacing enumFacing2;
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, (String)"receiver$0");
        if (enumFacing == Field8802) {
            enumFacing2 = Field8805;
            return enumFacing2;
        }
        if (enumFacing == Field8805) {
            enumFacing2 = Field8803;
            return enumFacing2;
        }
        if (enumFacing == Field8803) {
            enumFacing2 = Field8804;
            return enumFacing2;
        }
        if (enumFacing == Field8804) {
            enumFacing2 = Field8802;
            return enumFacing2;
        }
        Intrinsics.throwNpe();
        enumFacing2 = null;
        return enumFacing2;
    }

    @NotNull
    @NotNull
    public static final EnumFacing Method1117(@NotNull @NotNull EnumFacing enumFacing) {
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, (String)"receiver$0");
        EnumFacing enumFacing2 = V6J7zszJg3aDVWGVNgIfZR9Z0B2PCHhk.Method1116(enumFacing).getOpposite();
        Intrinsics.checkExpressionValueIsNotNull((Object)enumFacing2, (String)"left().opposite");
        return enumFacing2;
    }

    private static String Method1118(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)993044852L ^ 0x3B30A974;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-803823491L ^ 0xD016A082);
            int n2 = ((int)892320817L ^ 0x352FBC0C) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)2112500137L ^ 0x7DEA58AE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

