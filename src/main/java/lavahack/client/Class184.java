//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.util.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.math.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0016\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f\u001a\n\u0010\u000e\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\u0001\"\u0011\u0010\u0000\u001a\u00020\u0001?\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0011\u0010\u0006\u001a\u00020\u0001?\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0011\u0010\b\u001a\u00020\u0001?\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003?\u0006\u0010" }, d2 = { "x_minus", "Lnet/minecraft/util/EnumFacing;", "getX_minus", "()Lnet/minecraft/util/EnumFacing;", "x_plus", "getX_plus", "z_minus", "getZ_minus", "z_plus", "getZ_plus", "nearestFacing", "pos1", "Lnet/minecraft/util/math/BlockPos;", "pos2", "left", "right", "kisman.cc" })
public final class Class184
{
    @NotNull
    private static final EnumFacing Field8802;
    @NotNull
    private static final EnumFacing Field8803;
    @NotNull
    private static final EnumFacing Field8804;
    @NotNull
    private static final EnumFacing Field8805;
    private String Field8806 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public static final EnumFacing Method1111() {
        return Class184.Field8802;
    }
    
    @NotNull
    @NotNull
    public static final EnumFacing Method1112() {
        return Class184.Field8803;
    }
    
    @NotNull
    @NotNull
    public static final EnumFacing Method1113() {
        return Class184.Field8804;
    }
    
    @NotNull
    @NotNull
    public static final EnumFacing Method1114() {
        return Class184.Field8805;
    }
    
    @NotNull
    @NotNull
    public static final EnumFacing Method1115(@NotNull @NotNull final BlockPos blockPos, @NotNull @NotNull final BlockPos blockPos2) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "pos1");
        Intrinsics.checkParameterIsNotNull((Object)blockPos2, "pos2");
        final int a = blockPos.getX() - blockPos2.getX();
        final int a2 = blockPos.getZ() - blockPos2.getZ();
        EnumFacing enumFacing = (a < 0) ? Class184.Field8802 : ((a > 0) ? Class184.Field8803 : ((a2 < 0) ? Class184.Field8805 : ((a2 > 0) ? Class184.Field8804 : EnumFacing.EAST)));
        if (Math.abs(a2) > Math.abs(a)) {
            if (a2 < 0) {
                enumFacing = Class184.Field8805;
            }
            else if (a2 > 0) {
                enumFacing = Class184.Field8804;
            }
        }
        return enumFacing;
    }
    
    @NotNull
    @NotNull
    public static final EnumFacing Method1116(@NotNull @NotNull final EnumFacing enumFacing) {
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, "receiver$0");
        EnumFacing enumFacing2;
        if (enumFacing == Class184.Field8802) {
            enumFacing2 = Class184.Field8805;
        }
        else if (enumFacing == Class184.Field8805) {
            enumFacing2 = Class184.Field8803;
        }
        else if (enumFacing == Class184.Field8803) {
            enumFacing2 = Class184.Field8804;
        }
        else if (enumFacing == Class184.Field8804) {
            enumFacing2 = Class184.Field8802;
        }
        else {
            final EnumFacing enumFacing3 = null;
            Intrinsics.throwNpe();
            enumFacing2 = enumFacing3;
        }
        return enumFacing2;
    }
    
    @NotNull
    @NotNull
    public static final EnumFacing Method1117(@NotNull @NotNull final EnumFacing enumFacing) {
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, "receiver$0");
        final EnumFacing getOpposite = Method1116(enumFacing).getOpposite();
        Intrinsics.checkExpressionValueIsNotNull((Object)getOpposite, "left().opposite");
        return getOpposite;
    }
    
    static {
        Field8802 = EnumFacing.EAST;
        Field8803 = EnumFacing.WEST;
        Field8804 = EnumFacing.SOUTH;
        Field8805 = EnumFacing.NORTH;
    }
    
    private static String Method1118(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6907 ^ 0x7A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
