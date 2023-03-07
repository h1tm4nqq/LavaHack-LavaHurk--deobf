/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$6
implements Supplier {
    final GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x Field15629;
    private int Field15630;

    public Object get() {
        return this.Method6370();
    }

    @NotNull
    @NotNull
    public final String Method6370() {
        StringBuilder stringBuilder = new StringBuilder().append((char)((long)1406177564 ^ (long)1406177607));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7122(this.Field15629);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"iceSpeedVal");
        return stringBuilder.append(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method335()).append((char)((long)-1464179799 ^ (long)-1464179724)).toString();
    }

    GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$6(GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x) {
        this.Field15629 = gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x;
    }

    private static String Method6371(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-683845075L ^ 0xD73D5A2D;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)391776266 ^ (long)391776501);
            int n2 = (int)((long)218550706 ^ (long)218550685) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)478300844L ^ 0x1C82180D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

