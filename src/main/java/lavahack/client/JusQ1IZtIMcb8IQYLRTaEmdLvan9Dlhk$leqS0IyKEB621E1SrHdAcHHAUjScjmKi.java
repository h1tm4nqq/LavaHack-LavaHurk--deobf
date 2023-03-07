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
import lavahack.client.aaIDVwbtzp3KxPpHfK7jnkVMYqAV3lzi;
import lavahack.client.qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "Lcom/kisman/cc/util/enums/FontStyles;", "get"})
final class JusQ1IZtIMcb8IQYLRTaEmdLvan9Dlhk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements Supplier {
    public static final JusQ1IZtIMcb8IQYLRTaEmdLvan9Dlhk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field17027 = new JusQ1IZtIMcb8IQYLRTaEmdLvan9Dlhk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    private String Field17028 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method7272();
    }

    @NotNull
    @NotNull
    public final qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW Method7272() {
        qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW2;
        if (aaIDVwbtzp3KxPpHfK7jnkVMYqAV3lzi.Field16465 == null) {
            qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW2 = qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW.Field15543;
            return qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW2;
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = aaIDVwbtzp3KxPpHfK7jnkVMYqAV3lzi.Field16465.Field16456;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"CustomFontModule.instance.style");
        Enum enum_ = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.FontStyles");
        }
        qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW2 = (qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW)enum_;
        return qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW2;
    }

    JusQ1IZtIMcb8IQYLRTaEmdLvan9Dlhk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
    }

    private static String Method7273(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1728124239L ^ 0x98FEEAB1;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1643406024 ^ (long)-1643405881);
            int n2 = (int)((long)173699072 ^ (long)173699127);
            cArray2[n] = (char)(cArray[n] ^ ((int)-557910381L ^ 0xDEBEE0F0 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

