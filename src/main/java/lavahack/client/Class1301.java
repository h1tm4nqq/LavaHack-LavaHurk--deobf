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
import lavahack.client.Class1613;
import lavahack.client.Class1831;
import lavahack.client.Class44;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "Lcom/kisman/cc/util/enums/FontStyles;", "get"})
final class Class1301
implements Supplier {
    public static final Class1301 Field13937 = new Class1301();
    private String Field13938 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method5270();
    }

    @NotNull
    @NotNull
    public final Class1613 Method5270() {
        Class1613 class1613;
        if (Class1831.Field16465 == null) {
            class1613 = Class1613.Field15543;
            return class1613;
        }
        Class44 class44 = Class1831.Field16465.Field16456;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"CustomFontModule.instance.style");
        Enum enum_ = class44.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.FontStyles");
        }
        class1613 = (Class1613)enum_;
        return class1613;
    }

    Class1301() {
    }

    private static String Method5271(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 134;
            cArray2[n] = (char)(cArray[n] ^ (0x25AD ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

