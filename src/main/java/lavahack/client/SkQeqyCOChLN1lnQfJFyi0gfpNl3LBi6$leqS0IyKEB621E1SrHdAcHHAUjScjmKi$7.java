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
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.sZ6sbQQyFIfme6FINdJ6W9UgWyr1cDwI;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0002\b\u0003"}, d2={"<anonymous>", "Lcom/kisman/cc/gui/hudeditor/HalqHudGui;", "kotlin.jvm.PlatformType", "invoke"})
final class SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$7
extends Lambda
implements Function0 {
    public static final SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$7 Field13164 = new SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$7();
    private int Field13165;

    public Object invoke() {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    }

    public final sZ6sbQQyFIfme6FINdJ6W9UgWyr1cDwI leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        sZ6sbQQyFIfme6FINdJ6W9UgWyr1cDwI sZ6sbQQyFIfme6FINdJ6W9UgWyr1cDwI2 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16263;
        Intrinsics.checkExpressionValueIsNotNull((Object)((Object)sZ6sbQQyFIfme6FINdJ6W9UgWyr1cDwI2), (String)"Kisman.instance.halqHudGui");
        return sZ6sbQQyFIfme6FINdJ6W9UgWyr1cDwI2;
    }

    SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$7() {
        super((int)((long)414346966 ^ (long)414346966));
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1358831436 ^ (long)-1358831436);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1111822375L ^ 0x424510D8);
            int n2 = (int)((long)-505156682 ^ (long)-505156723);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1941625637 ^ (long)1941610170) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

