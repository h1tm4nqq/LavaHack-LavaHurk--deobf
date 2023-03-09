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

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lavahack.client.Class1748;
import lavahack.client.Class1796;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0002\b\u0003"}, d2={"<anonymous>", "Lcom/kisman/cc/gui/hudeditor/HalqHudGui;", "kotlin.jvm.PlatformType", "invoke"})
final class Class1143
extends Lambda
implements Function0 {
    public static final Class1143 Field13164 = new Class1143();
    private int Field13165;

    public Object invoke() {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    }

    public final Class1748 leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        Class1748 class1748 = Class1796.Field16241.Field16263;
        Intrinsics.checkExpressionValueIsNotNull((Object)((Object)class1748), (String)"Kisman.instance.halqHudGui");
        return class1748;
    }

    Class1143() {
        super(0);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 59;
            cArray2[n] = (char)(cArray[n] ^ (0x459F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

