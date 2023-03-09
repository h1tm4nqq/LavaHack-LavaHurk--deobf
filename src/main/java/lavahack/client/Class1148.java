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
import lavahack.client.Class12;
import lavahack.client.Class1796;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0002\b\u0003"}, d2={"<anonymous>", "Lcom/kisman/cc/gui/other/music/MusicGui;", "kotlin.jvm.PlatformType", "invoke"})
final class Class1148
extends Lambda
implements Function0 {
    public static final Class1148 Field13189 = new Class1148();
    private int Field13190;

    public Object invoke() {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    }

    public final Class12 leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        Class12 class12 = Class1796.Field16241.Field16270;
        Intrinsics.checkExpressionValueIsNotNull((Object)((Object)class12), (String)"Kisman.instance.musicGui");
        return class12;
    }

    Class1148() {
        super(0);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 54;
            cArray2[n] = (char)(cArray[n] ^ (0x7268 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

