//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.Lambda
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lavahack.client.Class1281;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n\u00a2\u0006\u0002\b\u0006"}, d2={"valid", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "facing", "Lnet/minecraft/util/EnumFacing;", "invoke"})
final class Class1513
extends Lambda
implements Function2 {
    final Class1281 Field15080;
    private int Field15081;

    public Object invoke(Object object, Object object2) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((BlockPos)object, (EnumFacing)object2);
    }

    public final boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull BlockPos blockPos, @NotNull @NotNull EnumFacing enumFacing) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, (String)"facing");
        BlockPos blockPos2 = blockPos.up();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos.up()");
        if (!Class1281.Method5179(this.Field15080, blockPos2)) return false;
        BlockPos blockPos3 = blockPos.offset(enumFacing).up();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"pos.offset(facing).up()");
        if (!Class1281.Method5179(this.Field15080, blockPos3)) return false;
        BlockPos blockPos4 = blockPos.offset(enumFacing);
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos4, (String)"pos.offset(facing)");
        if (Class1281.Method5179(this.Field15080, blockPos4)) {
            BlockPos blockPos5 = blockPos.offset(enumFacing).up();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos5, (String)"pos.offset(facing).up()");
            if (Class1281.Method5179(this.Field15080, blockPos5)) return true;
        }
        BlockPos blockPos6 = blockPos.offset(enumFacing);
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos6, (String)"pos.offset(facing)");
        if (Class1281.Method5179(this.Field15080, blockPos6)) return false;
        BlockPos blockPos7 = blockPos.offset(enumFacing).up(2);
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos7, (String)"pos.offset(facing).up(2)");
        if (!Class1281.Method5179(this.Field15080, blockPos7)) return false;
        BlockPos blockPos8 = blockPos.up(2);
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos8, (String)"pos.up(2)");
        if (!Class1281.Method5179(this.Field15080, blockPos8)) return false;
        return true;
    }

    Class1513(Class1281 class1281) {
        this.Field15080 = class1281;
        super(2);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 153;
            cArray2[n] = (char)(cArray[n] ^ (0x657F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

