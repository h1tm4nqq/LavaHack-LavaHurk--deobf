/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.Lambda
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"shouldMine", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "invoke"})
final class L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG$1
extends Lambda
implements Function1 {
    final L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG Field15923;
    private int Field15924;

    public Object invoke(Object object) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((BlockPos)object);
    }

    public final boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull BlockPos blockPos) {
        int n;
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        if (!L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5179(this.Field15923.Field10800, blockPos) && !L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5182(this.Field15923.Field10800, blockPos)) {
            n = (int)2071533881L ^ 0x7B791938;
            return n != 0;
        }
        n = (int)-1912399602L ^ 0x8E03190E;
        return n != 0;
    }

    L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG$1(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG) {
        this.Field15923 = l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG;
        super((int)2033886890L ^ 0x793AA6AB);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-901879663L ^ 0xCA3E6891;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1377057093L ^ 0x521439BA);
            int n2 = (int)-1793267915L ^ 0x951CE796;
            cArray2[n] = (char)(cArray[n] ^ (((int)-823090339L ^ 0xCEF0A506) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

