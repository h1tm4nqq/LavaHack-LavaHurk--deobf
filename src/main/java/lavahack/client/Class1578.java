/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1358;
import lavahack.client.Class2141;
import lavahack.client.Class44;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class Class1578
implements Supplier {
    final Class2141 Field15398;
    private String Field15399 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method6217();
    }

    @NotNull
    @NotNull
    public final String Method6217() {
        StringBuilder stringBuilder = new StringBuilder().append('[');
        Class44 class44 = Class2141.Method7716(this.Field15398);
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"speedUnit");
        Enum enum_ = class44.Method341();
        if (enum_ != null) return stringBuilder.append(((Class1358)enum_).Method5427()).append(']').toString();
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.SpeedUnits");
    }

    Class1578(Class2141 class2141) {
        this.Field15398 = class2141;
    }

    private static String Method6218(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 157;
            cArray2[n] = (char)(cArray[n] ^ (0x67EB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

