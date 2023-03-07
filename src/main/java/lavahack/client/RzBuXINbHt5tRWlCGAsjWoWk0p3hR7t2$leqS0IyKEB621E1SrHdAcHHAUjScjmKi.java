/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.Lambda
 *  net.minecraft.util.math.AxisAlignedBB
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import net.minecraft.util.math.AxisAlignedBB;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0003"}, d2={"<anonymous>", "Lnet/minecraft/util/math/AxisAlignedBB;", "it", "invoke"})
final class RzBuXINbHt5tRWlCGAsjWoWk0p3hR7t2$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Lambda
implements Function1 {
    public static final RzBuXINbHt5tRWlCGAsjWoWk0p3hR7t2$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9315 = new RzBuXINbHt5tRWlCGAsjWoWk0p3hR7t2$leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    private String Field9316 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object invoke(Object object) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((AxisAlignedBB)object);
    }

    @NotNull
    @NotNull
    public final AxisAlignedBB leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull AxisAlignedBB axisAlignedBB) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"it");
        return axisAlignedBB;
    }

    RzBuXINbHt5tRWlCGAsjWoWk0p3hR7t2$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        super((int)1554622960L ^ 0x5CA9A9F1);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)2103823133L ^ 0x7D65CB1D;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1163902682 ^ (long)1163902501);
            int n2 = ((int)-760019921L ^ 0xD2B30428) << 5;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1979051206 ^ (long)1979050423) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

