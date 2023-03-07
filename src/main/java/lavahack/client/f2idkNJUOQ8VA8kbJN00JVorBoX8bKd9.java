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
import lavahack.client.LjmXEwby3D747HQ8yMDBamZ4Wtw8da73;
import lavahack.client.hKyAp97OBjIOB2mZNQ64ZkkGxHZRPyNW;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/websockets/DefaultMessageProcessor;", "Lcom/kisman/cc/websockets/IMessageProcessor;", "()V", "processMessage", "", "message", "", "kisman.cc"})
public final class f2idkNJUOQ8VA8kbJN00JVorBoX8bKd9
implements LjmXEwby3D747HQ8yMDBamZ4Wtw8da73 {
    private String Field10889 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method665(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"message");
        hKyAp97OBjIOB2mZNQ64ZkkGxHZRPyNW.Field15396.Method6215(string);
    }

    private static String Method2876(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)794672253 ^ (long)794672253);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1652278575L ^ 0x627BC5D0);
            int n2 = (int)((long)-484598977 ^ (long)-484598854);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1221189521 ^ (long)-1221186522) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

