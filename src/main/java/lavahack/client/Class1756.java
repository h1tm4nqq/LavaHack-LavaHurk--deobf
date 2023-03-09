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
import lavahack.client.Class254;
import lavahack.client.Class339;
import lavahack.client.Class44;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventArmSwingAnimationEnd;", "kotlin.jvm.PlatformType", "invoke"})
final class Class1756
implements Class254 {
    public static final Class1756 Field16048 = new Class1756();
    private int Field16049;

    @Override
    public void Method979(Object object) {
        this.Method6683((Class339)object);
    }

    public final void Method6683(Class339 class339) {
        Class44 class44 = Class1783.Method6757(Class1783.Field16200);
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"animation");
        if (!class44.Method365()) return;
        Class44 class442 = Class1783.Method6758(Class1783.Field16200);
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"animationSpeed");
        class339.Method1671(class442.Method335());
    }

    Class1756() {
    }

    private static String Method6684(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 132;
            cArray2[n] = (char)(cArray[n] ^ (0x58A6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

