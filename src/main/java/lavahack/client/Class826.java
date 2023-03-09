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
import lavahack.client.Class1783;
import lavahack.client.Class1931;
import lavahack.client.Class254;
import lavahack.client.Class44;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventAspect;", "kotlin.jvm.PlatformType", "invoke"})
final class Class826
implements Class254 {
    public static final Class826 Field11520 = new Class826();
    private String Field11521 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method3535((Class1931)object);
    }

    public final void Method3535(Class1931 class1931) {
        Class44 class44 = Class1783.Method6759(Class1783.Field16200);
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"aspect");
        if (!class44.Method365()) return;
        Class44 class442 = Class1783.Method6760(Class1783.Field16200);
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"aspectWidth");
        float f = class442.Method368();
        Class44 class443 = Class1783.Method6761(Class1783.Field16200);
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"aspectHeight");
        class1931.Method7187(f / class443.Method368());
    }

    Class826() {
    }

    private static String Method3536(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 7;
            cArray2[n] = (char)(cArray[n] ^ (0x796 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

