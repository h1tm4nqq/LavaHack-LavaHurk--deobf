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

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/features/module/combat/cityboss/Cases$MiddleCase;", "Lcom/kisman/cc/features/module/combat/cityboss/Cases;", "posses", "", "Lnet/minecraft/util/math/BlockPos;", "facing", "Lnet/minecraft/util/EnumFacing;", "kisman.cc"})
final class h0z1yvYP96doPrGLztrdTjS3jHWuMnCN$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends h0z1yvYP96doPrGLztrdTjS3jHWuMnCN {
    private int Field8879;

    @Override
    @NotNull
    @NotNull
    public List Method942(@NotNull @NotNull EnumFacing enumFacing) {
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, (String)"facing");
        Object[] objectArray = new BlockPos[(int)981281087L ^ 0x3A7D293C];
        int n = (int)((long)1763536612 ^ (long)1763536612);
        BlockPos blockPos = BlockPos.ORIGIN.offset(enumFacing);
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, (String)"BlockPos.ORIGIN.offset(facing)");
        objectArray[n] = blockPos;
        int n2 = (int)((long)305257357 ^ (long)305257356);
        BlockPos blockPos2 = BlockPos.ORIGIN.offset(enumFacing).offset(enumFacing);
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"BlockPos.ORIGIN.offset(facing).offset(facing)");
        objectArray[n2] = blockPos2;
        int n3 = (int)((long)321238431 ^ (long)321238430) << 1;
        BlockPos blockPos3 = BlockPos.ORIGIN.offset(enumFacing).offset(enumFacing).up();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"BlockPos.ORIGIN.offset(facing).offset(facing).up()");
        objectArray[n3] = blockPos3;
        return CollectionsKt.listOf((Object[])objectArray);
    }

    h0z1yvYP96doPrGLztrdTjS3jHWuMnCN$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(String string, int n) {
    }

    private static String Method950(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1405858651L ^ 0xAC344CA5;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1701273683L ^ 0x9A989F52);
            int n2 = (int)1742928887L ^ 0x67E2FB8C;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1873200631 ^ (long)1873188874) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

