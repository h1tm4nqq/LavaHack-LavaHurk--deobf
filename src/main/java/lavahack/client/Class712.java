/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1178;
import lavahack.client.Class392;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "first", "Lcom/kisman/cc/features/hud/modules/BindList$Element;", "second", "compare"})
final class Class712
implements Comparator {
    public static final Class712 Field11033 = new Class712();
    private String Field11034 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public int compare(Object object, Object object2) {
        return this.Method2977((Class392)object, (Class392)object2);
    }

    public final int Method2977(@NotNull @NotNull Class392 class392, @NotNull @NotNull Class392 class3922) {
        int n;
        Intrinsics.checkParameterIsNotNull((Object)class392, (String)"first");
        Intrinsics.checkParameterIsNotNull((Object)class3922, (String)"second");
        float f = Class1178.Method4741(class3922.Method1910()) - Class1178.Method4741(class392.Method1910());
        if (f != 0.0f) {
            n = (int)f;
            return n;
        }
        n = class3922.Method1910().compareTo(class392.Method1910());
        return n;
    }

    Class712() {
    }

    private static String Method2978(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 188;
            cArray2[n] = (char)(cArray[n] ^ (0x4CC5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

