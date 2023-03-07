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
final class I7AHWwwmI6gi3Rn5IHQ1VybeS0WgS62N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements Supplier {
    public static final I7AHWwwmI6gi3Rn5IHQ1VybeS0WgS62N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field13937 = new I7AHWwwmI6gi3Rn5IHQ1VybeS0WgS62N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    private String Field13938 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method5270();
    }

    @NotNull
    @NotNull
    public final qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW Method5270() {
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

    I7AHWwwmI6gi3Rn5IHQ1VybeS0WgS62N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
    }

    private static String Method5271(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-165325849L ^ 0xF62553E7;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-443537911L ^ 0xE59026F6);
            int n2 = (int)((long)813953024 ^ (long)813953091) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1467300278 ^ (long)-1467292697) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

