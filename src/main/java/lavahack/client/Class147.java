/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class978;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/features/catlua/lua/utils/LuaNet$Companion;", "", "()V", "instance", "Lcom/kisman/cc/features/catlua/lua/utils/LuaNet;", "getInstance", "()Lcom/kisman/cc/features/catlua/lua/utils/LuaNet;", "setInstance", "(Lcom/kisman/cc/features/catlua/lua/utils/LuaNet;)V", "getDefault", "kisman.cc"})
public final class Class147 {
    private int Field8574;

    @NotNull
    @NotNull
    public final Class978 Method983() {
        return Class978.Method3981();
    }

    public final void Method984(@NotNull @NotNull Class978 class978) {
        Intrinsics.checkParameterIsNotNull((Object)class978, (String)"<set-?>");
        Class978.Method3982(class978);
    }

    @NotNull
    @NotNull
    public final Class978 Method985() {
        if (this.Method983() != null) return this.Method983();
        this.Method984(new Class978());
        return this.Method983();
    }

    private Class147() {
    }

    public Class147(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static String Method986(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 143;
            cArray2[n] = (char)(cArray[n] ^ (0xCD4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

