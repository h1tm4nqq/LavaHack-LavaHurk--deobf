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

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/features/module/combat/cityboss/Cases$SimpleCase1;", "Lcom/kisman/cc/features/module/combat/cityboss/Cases;", "posses", "", "Lnet/minecraft/util/math/BlockPos;", "facing", "Lnet/minecraft/util/EnumFacing;", "kisman.cc"})
final class h0z1yvYP96doPrGLztrdTjS3jHWuMnCN$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV
extends h0z1yvYP96doPrGLztrdTjS3jHWuMnCN {
    private String Field8526 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    @NotNull
    @NotNull
    public List Method942(@NotNull @NotNull EnumFacing enumFacing) {
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, (String)"facing");
        Object[] objectArray = new BlockPos[(int)((long)1082102041 ^ (long)1082102040) << 1];
        int n = (int)((long)1260595027 ^ (long)1260595027);
        BlockPos blockPos = BlockPos.ORIGIN.offset(enumFacing);
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, (String)"BlockPos.ORIGIN.offset(facing)");
        objectArray[n] = blockPos;
        int n2 = (int)-591221185L ^ 0xDCC2AE3E;
        BlockPos blockPos2 = BlockPos.ORIGIN.offset(enumFacing).up();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"BlockPos.ORIGIN.offset(facing).up()");
        objectArray[n2] = blockPos2;
        return CollectionsKt.listOf((Object[])objectArray);
    }

    h0z1yvYP96doPrGLztrdTjS3jHWuMnCN$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(String string, int n) {
    }

    private static String Method950(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)977419783L ^ 0x3A423E07;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1331564439 ^ (long)-1331564394);
            int n2 = (int)((long)-1162658951 ^ (long)-1162658954) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)-739929610L ^ 0xD3E5914D) << 5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

