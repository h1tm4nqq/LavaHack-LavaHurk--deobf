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
import lavahack.client.MAsXxwaceOewm9gZpgYPerrZg0Klerb3;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2={"Lcom/kisman/cc/util/thread/kisman/suppliers/ThreaddedBooleanSupplier;", "Lcom/kisman/cc/util/thread/kisman/suppliers/ThreaddedSupplier;", "", "get0", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "get", "()Ljava/lang/Boolean;", "kisman.cc"})
public final class zB8OwokcxyYdSF1sXy4lXdeNGXDffbJL
extends MAsXxwaceOewm9gZpgYPerrZg0Klerb3 {
    private String Field12567 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public Boolean Method4228() {
        int n;
        Boolean bl = (Boolean)super.Method3751();
        if (bl != null) {
            n = bl.booleanValue();
            return n != 0;
        }
        n = (int)((long)397513075 ^ (long)397513075);
        return n != 0;
    }

    @Override
    public Object Method3751() {
        return this.Method4228();
    }

    public zB8OwokcxyYdSF1sXy4lXdeNGXDffbJL(@NotNull @NotNull Function0 function0) {
        Intrinsics.checkParameterIsNotNull((Object)function0, (String)"get0");
        super(function0);
    }

    private static String Method3754(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-760562198 ^ (long)-760562198);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1486700847 ^ (long)-1486701010);
            int n2 = (int)((long)815160421 ^ (long)815160404) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)800242672L ^ 0x2FB2844F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

