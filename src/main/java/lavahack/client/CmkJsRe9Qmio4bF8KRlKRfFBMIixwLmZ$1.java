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
import lavahack.client.CmkJsRe9Qmio4bF8KRlKRfFBMIixwLmZ;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.t78OP2bAm0IpqKGogPcm5ldff27AWz8I;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class CmkJsRe9Qmio4bF8KRlKRfFBMIixwLmZ$1
implements Supplier {
    final CmkJsRe9Qmio4bF8KRlKRfFBMIixwLmZ Field15398;
    private String Field15399 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method6217();
    }

    @NotNull
    @NotNull
    public final String Method6217() {
        StringBuilder stringBuilder = new StringBuilder().append((char)((long)586060865 ^ (long)586060826));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = CmkJsRe9Qmio4bF8KRlKRfFBMIixwLmZ.Method7716(this.Field15398);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"speedUnit");
        Enum enum_ = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method341();
        if (enum_ != null) return stringBuilder.append(((t78OP2bAm0IpqKGogPcm5ldff27AWz8I)enum_).Method5427()).append((char)((int)-1269411608L ^ 0xB45650B5)).toString();
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.SpeedUnits");
    }

    CmkJsRe9Qmio4bF8KRlKRfFBMIixwLmZ$1(CmkJsRe9Qmio4bF8KRlKRfFBMIixwLmZ cmkJsRe9Qmio4bF8KRlKRfFBMIixwLmZ) {
        this.Field15398 = cmkJsRe9Qmio4bF8KRlKRfFBMIixwLmZ;
    }

    private static String Method6218(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1480255889L ^ 0xA7C5166F;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-318540647L ^ 0xED037466);
            int n2 = (int)((long)-570036090 ^ (long)-570036197);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)2124051370 ^ (long)2124026945) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

