//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.h0z1yvYP96doPrGLztrdTjS3jHWuMnCN;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/features/module/combat/cityboss/Cases$SimpleCase2;", "Lcom/kisman/cc/features/module/combat/cityboss/Cases;", "posses", "", "Lnet/minecraft/util/math/BlockPos;", "facing", "Lnet/minecraft/util/EnumFacing;", "kisman.cc"})
final class h0z1yvYP96doPrGLztrdTjS3jHWuMnCN$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS
extends h0z1yvYP96doPrGLztrdTjS3jHWuMnCN {
    private String Field12396 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    @NotNull
    @NotNull
    public List Method942(@NotNull @NotNull EnumFacing enumFacing) {
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, (String)"facing");
        Object[] objectArray = new BlockPos[((int)409440869L ^ 0x18679264) << 2];
        int n = (int)-899900475L ^ 0xCA5C9BC5;
        BlockPos blockPos = BlockPos.ORIGIN.offset(enumFacing);
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, (String)"BlockPos.ORIGIN.offset(facing)");
        objectArray[n] = blockPos;
        int n2 = (int)557082340L ^ 0x213466E5;
        BlockPos blockPos2 = BlockPos.ORIGIN.offset(enumFacing).offset(enumFacing);
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"BlockPos.ORIGIN.offset(facing).offset(facing)");
        objectArray[n2] = blockPos2;
        int n3 = ((int)2068076167L ^ 0x7B445686) << 1;
        BlockPos blockPos3 = BlockPos.ORIGIN.offset(enumFacing).offset(enumFacing).offset(enumFacing);
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"BlockPos.ORIGIN.offset(f\u2026et(facing).offset(facing)");
        objectArray[n3] = blockPos3;
        int n4 = (int)-1254459303L ^ 0xB53A785A;
        BlockPos blockPos4 = BlockPos.ORIGIN.offset(enumFacing).offset(enumFacing).offset(enumFacing).up();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos4, (String)"BlockPos.ORIGIN.offset(f\u2026cing).offset(facing).up()");
        objectArray[n4] = blockPos4;
        return CollectionsKt.listOf((Object[])objectArray);
    }

    h0z1yvYP96doPrGLztrdTjS3jHWuMnCN$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS(String string, int n) {
    }

    private static String Method950(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-211097039L ^ 0xF36AEA31;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-747743280L ^ 0xD36E572F);
            int n2 = (int)((long)720060302 ^ (long)720060399);
            cArray2[n] = (char)(cArray[n] ^ (((int)-2458373L ^ 0xFFDA6B3A) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

