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
import lavahack.client.Class1233;
import lavahack.client.Class1419;
import lavahack.client.Class177;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/nocom/gui/NoComGui;", "Lcom/kisman/cc/gui/halq/HalqGui;", "()V", "gui", "Lcom/kisman/cc/gui/selectionbar/SelectionBar$Guis;", "kisman.cc"})
public final class Class2060
extends Class1419 {
    private String Field17416 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    @NotNull
    @NotNull
    protected Class1233 Method1220() {
        Class1233 class1233 = super.Method1220();
        Intrinsics.checkExpressionValueIsNotNull((Object)((Object)class1233), (String)"super.gui()");
        return class1233;
    }

    public Class2060() {
        super(true);
        this.ItyDJooi2U23sHYdNmIhbJFmcHy1UFNl.add(new Class177(15, 15));
    }

    private static String Method1235(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 52;
            cArray2[n] = (char)(cArray[n] ^ (0x2243 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

