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
import lavahack.client.Class254;
import lavahack.client.Class264;
import lavahack.client.Class967;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"<anonymous>", "", "event", "Lcom/kisman/cc/event/events/client/console/ConsoleMessageEvent;", "invoke"})
final class Class1090
implements Class254 {
    final Class264 Field12886;
    private String Field12887 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method4465((Class967)object);
    }

    public final void Method4465(@NotNull @NotNull Class967 class967) {
        Intrinsics.checkParameterIsNotNull((Object)class967, (String)"event");
        Class264.Method1437(this.Field12886).add(class967.Method3968());
    }

    Class1090(Class264 class264) {
        this.Field12886 = class264;
    }

    private static String Method4466(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 20;
            cArray2[n] = (char)(cArray[n] ^ (0x72E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

