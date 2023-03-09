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
import lavahack.client.Class1913;
import lavahack.client.Class44;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class Class1637
implements Supplier {
    final Class1913 Field15629;
    private int Field15630;

    public Object get() {
        return this.Method6370();
    }

    @NotNull
    @NotNull
    public final String Method6370() {
        StringBuilder stringBuilder = new StringBuilder().append('[');
        Class44 class44 = Class1913.Method7122(this.Field15629);
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"iceSpeedVal");
        return stringBuilder.append(class44.Method335()).append(']').toString();
    }

    Class1637(Class1913 class1913) {
        this.Field15629 = class1913;
    }

    private static String Method6371(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 188;
            cArray2[n] = (char)(cArray[n] ^ (0x52A1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

