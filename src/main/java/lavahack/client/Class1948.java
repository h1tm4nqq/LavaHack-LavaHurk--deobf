/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1136;
import lavahack.client.Class61;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class Class1948
implements Runnable {
    final Class1136 Field17002;
    private String Field17003 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public final void run() {
        Class61 class61 = this.Field17002.Field13148;
        Class61 class612 = this.Field17002.Field13148;
        double d = ((Number)Class61.Method503(this.Field17002.Field13148).get()).doubleValue();
        Object t = Class61.Method503(this.Field17002.Field13148).get();
        Intrinsics.checkExpressionValueIsNotNull(t, (String)"range.get()");
        class61.Method497(class612.Method500((float)(d * ((Number)t).doubleValue())));
    }

    Class1948(Class1136 class1136) {
        this.Field17002 = class1136;
    }

    private static String Method7234(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 116;
            cArray2[n] = (char)(cArray[n] ^ (0x29E3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

