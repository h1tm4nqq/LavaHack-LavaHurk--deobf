/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.Lambda
 */
package lavahack.client;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lavahack.client.Class1307;
import lavahack.client.Class1612;
import lavahack.client.Class85;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"processPatterns", "", "invoke"})
final class Class84
extends Lambda
implements Function0 {
    final Class1307 Field8284;
    private String Field8285 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object invoke() {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    }

    public final boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        boolean bl = false;
        Iterator iterator = this.Field8284.Field13971.Method780().Field8070.iterator();
        while (iterator.hasNext()) {
            Class1612 class1612;
            Class1612 class16122 = class1612 = (Class1612)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)class16122, (String)"pattern");
            if (!Class85.Field8286.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(class16122)) continue;
            bl = true;
        }
        return bl;
    }

    Class84(Class1307 class1307) {
        this.Field8284 = class1307;
        super(0);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 144;
            cArray2[n] = (char)(cArray[n] ^ (0x1622 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

