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
import lavahack.client.Class1913;
import lavahack.client.Class254;
import lavahack.client.Class44;
import lavahack.client.Class756;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventEntityControl;", "kotlin.jvm.PlatformType", "invoke"})
final class Class1457
implements Class254 {
    final Class1913 Field14818;
    private int Field14819;

    @Override
    public void Method979(Object object) {
        this.Method5815((Class756)object);
    }

    public final void Method5815(Class756 class756) {
        Class44 class44 = Class1913.Method7124(this.Field14818);
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"entityControl");
        if (!class44.Method365()) return;
        class756.Method158();
    }

    Class1457(Class1913 class1913) {
        this.Field14818 = class1913;
    }

    private static String Method5816(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 205;
            cArray2[n] = (char)(cArray[n] ^ (0xA90 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

