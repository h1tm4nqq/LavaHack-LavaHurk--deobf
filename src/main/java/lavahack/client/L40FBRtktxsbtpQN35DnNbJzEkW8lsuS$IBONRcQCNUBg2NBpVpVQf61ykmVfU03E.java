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
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n\u00a2\u0006\u0002\b\u0006"}, d2={"valid", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "facing", "Lnet/minecraft/util/EnumFacing;", "invoke"})
final class L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E
extends Lambda
implements Function2 {
    final L40FBRtktxsbtpQN35DnNbJzEkW8lsuS Field15080;
    private int Field15081;

    public Object invoke(Object object, Object object2) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((BlockPos)object, (EnumFacing)object2);
    }

    public final boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull BlockPos blockPos, @NotNull @NotNull EnumFacing enumFacing) {
        int n;
        block2: {
            block4: {
                block3: {
                    Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
                    Intrinsics.checkParameterIsNotNull((Object)enumFacing, (String)"facing");
                    BlockPos blockPos2 = blockPos.up();
                    Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos.up()");
                    if (!L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5179(this.Field15080, blockPos2)) break block2;
                    BlockPos blockPos3 = blockPos.offset(enumFacing).up();
                    Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"pos.offset(facing).up()");
                    if (!L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5179(this.Field15080, blockPos3)) break block2;
                    BlockPos blockPos4 = blockPos.offset(enumFacing);
                    Intrinsics.checkExpressionValueIsNotNull((Object)blockPos4, (String)"pos.offset(facing)");
                    if (!L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5179(this.Field15080, blockPos4)) break block3;
                    BlockPos blockPos5 = blockPos.offset(enumFacing).up();
                    Intrinsics.checkExpressionValueIsNotNull((Object)blockPos5, (String)"pos.offset(facing).up()");
                    if (L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5179(this.Field15080, blockPos5)) break block4;
                }
                BlockPos blockPos6 = blockPos.offset(enumFacing);
                Intrinsics.checkExpressionValueIsNotNull((Object)blockPos6, (String)"pos.offset(facing)");
                if (L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5179(this.Field15080, blockPos6)) break block2;
                BlockPos blockPos7 = blockPos.offset(enumFacing).up(((int)117182516L ^ 0x6FC1035) << 1);
                Intrinsics.checkExpressionValueIsNotNull((Object)blockPos7, (String)"pos.offset(facing).up(2)");
                if (!L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5179(this.Field15080, blockPos7)) break block2;
                BlockPos blockPos8 = blockPos.up(((int)843452418L ^ 0x32461003) << 1);
                Intrinsics.checkExpressionValueIsNotNull((Object)blockPos8, (String)"pos.up(2)");
                if (!L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5179(this.Field15080, blockPos8)) break block2;
            }
            n = (int)916553870L ^ 0x36A1808F;
            return n != 0;
        }
        n = (int)((long)1432096807 ^ (long)1432096807);
        return n != 0;
    }

    L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS) {
        this.Field15080 = l40FBRtktxsbtpQN35DnNbJzEkW8lsuS;
        super((int)((long)-455883516 ^ (long)-455883515) << 1);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1953357747 ^ (long)-1953357747);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)479701060L ^ 0x1C97A8BB);
            int n2 = (int)((long)-884994270 ^ (long)-884994117);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1164034601 ^ (long)1164027734) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

