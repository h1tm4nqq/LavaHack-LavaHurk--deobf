//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

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
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro$1;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n\u00a2\u0006\u0002\b\u0005"}, d2={"findBlock", "Lnet/minecraft/util/math/BlockPos;", "centre", "obby", "", "invoke"})
final class L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro
extends Lambda
implements Function2 {
    final L40FBRtktxsbtpQN35DnNbJzEkW8lsuS Field16933;
    private String Field16934 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object invoke(Object object, Object object2) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((BlockPos)object, (Boolean)object2);
    }

    @Nullable
    @Nullable
    public final BlockPos leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull BlockPos blockPos, boolean bl) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"centre");
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro$1 l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro$1 = new L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro$1(this);
        BlockPos blockPos2 = blockPos.north();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"centre.north()");
        boolean bl2 = l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro$1.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos2, bl);
        int n = (int)-1663643194L ^ 0x9CD6D1C6;
        int n2 = (int)1729024264L ^ 0x670ED108;
        boolean bl3 = bl2;
        int n3 = (int)-868748449L ^ 0xCC37F35F;
        if (bl3) {
            return blockPos.north();
        }
        BlockPos blockPos3 = blockPos.west();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"centre.west()");
        bl2 = l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro$1.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos3, bl);
        n = (int)1971187543L ^ 0x757DEF57;
        n2 = (int)((long)-1209800443 ^ (long)-1209800443);
        bl3 = bl2;
        n3 = (int)-701441855L ^ 0xD630D8C1;
        if (bl3) {
            return blockPos.west();
        }
        BlockPos blockPos4 = blockPos.east();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos4, (String)"centre.east()");
        bl2 = l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro$1.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos4, bl);
        n = (int)((long)-1959325736 ^ (long)-1959325736);
        n2 = (int)((long)-844843550 ^ (long)-844843550);
        bl3 = bl2;
        n3 = (int)((long)-1349726767 ^ (long)-1349726767);
        if (bl3) {
            return blockPos.east();
        }
        BlockPos blockPos5 = blockPos.south();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos5, (String)"centre.south()");
        bl2 = l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro$1.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos5, bl);
        n = (int)((long)1363523392 ^ (long)1363523392);
        n2 = (int)-1457992669L ^ 0xA918CC23;
        bl3 = bl2;
        n3 = (int)188667259L ^ 0xB3ED57B;
        if (!bl3) return null;
        return blockPos.south();
    }

    L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS) {
        this.Field16933 = l40FBRtktxsbtpQN35DnNbJzEkW8lsuS;
        super(((int)-907946709L ^ 0xC9E1D52A) << 1);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1711142778 ^ (long)1711142778);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)222722991 ^ (long)222722896);
            int n2 = ((int)-977901803L ^ 0xC5B6673C) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)788241388 ^ (long)788253889) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

