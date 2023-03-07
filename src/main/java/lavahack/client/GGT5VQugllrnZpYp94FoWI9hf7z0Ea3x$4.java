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
final class GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$4
implements Supplier {
    final GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x Field15635;
    private int Field15636;

    public Object get() {
        return this.Method6376();
    }

    @NotNull
    @NotNull
    public final String Method6376() {
        StringBuilder stringBuilder = new StringBuilder().append((char)((long)132885116 ^ (long)132885031));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7121(this.Field15635);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"entitySpeedVal");
        return stringBuilder.append(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method335()).append((char)((int)-389281810L ^ 0xE8CC07B3)).toString();
    }

    GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$4(GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x) {
        this.Field15635 = gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x;
    }

    private static String Method6377(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)192884014L ^ 0xB7F2D2E;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1284707675 ^ (long)1284707748);
            int n2 = (int)-806622866L ^ 0xCFEBE995;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1134688327L ^ 0xBC5E2AA8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

