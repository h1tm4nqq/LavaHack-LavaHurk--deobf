/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class904;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2={"Lcom/kisman/cc/util/thread/kisman/suppliers/ThreaddedBooleanSupplier;", "Lcom/kisman/cc/util/thread/kisman/suppliers/ThreaddedSupplier;", "", "get0", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "get", "()Ljava/lang/Boolean;", "kisman.cc"})
public final class Class1037
extends Class904 {
    private String Field12567 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public Boolean Method4228() {
        boolean bl;
        Boolean bl2 = (Boolean)super.Method3751();
        if (bl2 != null) {
            bl = bl2;
            return bl;
        }
        bl = false;
        return bl;
    }

    @Override
    public Object Method3751() {
        return this.Method4228();
    }

    public Class1037(@NotNull @NotNull Function0 function0) {
        Intrinsics.checkParameterIsNotNull((Object)function0, (String)"get0");
        super(function0);
    }

    private static String Method3754(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 98;
            cArray2[n] = (char)(cArray[n] ^ (0x3FBF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

