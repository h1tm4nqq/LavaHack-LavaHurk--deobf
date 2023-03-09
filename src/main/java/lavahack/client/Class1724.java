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
import lavahack.client.Class1281;
import lavahack.client.Class654;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"shouldMine", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "invoke"})
final class Class1724
extends Lambda
implements Function1 {
    final Class654 Field15923;
    private int Field15924;

    public Object invoke(Object object) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((BlockPos)object);
    }

    public final boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        if (Class1281.Method5179(this.Field15923.Field10800, blockPos)) return false;
        if (Class1281.Method5182(this.Field15923.Field10800, blockPos)) return false;
        return true;
    }

    Class1724(Class654 class654) {
        this.Field15923 = class654;
        super(1);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 163;
            cArray2[n] = (char)(cArray[n] ^ (0x65B0 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

