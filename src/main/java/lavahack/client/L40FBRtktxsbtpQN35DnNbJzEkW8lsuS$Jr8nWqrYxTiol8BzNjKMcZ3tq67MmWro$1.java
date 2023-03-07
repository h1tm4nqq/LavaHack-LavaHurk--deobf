/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.Lambda
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0005"}, d2={"valid", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "obby", "invoke"})
final class L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro$1
extends Lambda
implements Function2 {
    final L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro Field9766;
    private int Field9767;

    public Object invoke(Object object, Object object2) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((BlockPos)object, (Boolean)object2);
    }

    public final boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull BlockPos blockPos, boolean bl) {
        boolean bl2;
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        if (bl) {
            bl2 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5185(this.Field9766.Field16933, blockPos);
            return bl2;
        }
        bl2 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5182(this.Field9766.Field16933, blockPos);
        return bl2;
    }

    L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro$1(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro) {
        this.Field9766 = l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro;
        super(((int)1061894458L ^ 0x3F4B393B) << 1);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-13572284L ^ 0xFF30E744;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-379163299L ^ 0xE9666DA2);
            int n2 = (int)((long)-615370854 ^ (long)-615370783);
            cArray2[n] = (char)(cArray[n] ^ (((int)1224425135L ^ 0x48FB3EE0) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

