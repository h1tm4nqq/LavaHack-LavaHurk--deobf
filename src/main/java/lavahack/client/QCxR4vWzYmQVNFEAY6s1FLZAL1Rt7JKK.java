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
import lavahack.client.NqWNVNIyOFu8AI0kc32OmQDv1nhz0oIu;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/features/command/exceptions/SimilarCommandNamesException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "command1", "Lcom/kisman/cc/features/command/ICommand;", "command2", "(Lcom/kisman/cc/features/command/ICommand;Lcom/kisman/cc/features/command/ICommand;)V", "kisman.cc"})
public final class QCxR4vWzYmQVNFEAY6s1FLZAL1Rt7JKK
extends RuntimeException {
    private String Field8961 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public QCxR4vWzYmQVNFEAY6s1FLZAL1Rt7JKK(@NotNull @NotNull NqWNVNIyOFu8AI0kc32OmQDv1nhz0oIu nqWNVNIyOFu8AI0kc32OmQDv1nhz0oIu, @NotNull @NotNull NqWNVNIyOFu8AI0kc32OmQDv1nhz0oIu nqWNVNIyOFu8AI0kc32OmQDv1nhz0oIu2) {
        Intrinsics.checkParameterIsNotNull((Object)nqWNVNIyOFu8AI0kc32OmQDv1nhz0oIu, (String)"command1");
        Intrinsics.checkParameterIsNotNull((Object)nqWNVNIyOFu8AI0kc32OmQDv1nhz0oIu2, (String)"command2");
        super("Similar names of " + nqWNVNIyOFu8AI0kc32OmQDv1nhz0oIu.getClass().getName() + " and " + nqWNVNIyOFu8AI0kc32OmQDv1nhz0oIu2.getClass().getName() + (char)((int)-391438582L ^ 0xE8AB1F2B));
    }

    private static String Method1272(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-2117008199 ^ (long)-2117008199);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1134077101 ^ (long)-1134077012);
            int n2 = (int)((long)0x79937377 ^ (long)2039706488) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)974463887 ^ (long)974464422) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

