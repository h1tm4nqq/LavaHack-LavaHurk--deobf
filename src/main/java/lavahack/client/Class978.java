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
import lavahack.client.Class147;
import lavahack.client.Class1890;
import lavahack.client.Class2067;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/features/catlua/lua/utils/LuaNet;", "", "()V", "getPasteBinAPI", "Lcom/kisman/cc/util/net/URLReader;", "url", "", "ping", "", "Companion", "kisman.cc"})
public final class Class978 {
    @NotNull
    private static Class978 Field12182;
    public static final Class147 Field12183;
    private int Field12184;

    @NotNull
    @NotNull
    public final Class1890 Method3979(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"url");
        return new Class1890(string);
    }

    public final boolean Method3980(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"url");
        return Class2067.Method7582(string);
    }

    static {
        Field12183 = new Class147(null);
        Field12182 = new Class978();
    }

    public static final Class978 Method3981() {
        return Field12182;
    }

    public static final void Method3982(Class978 class978) {
        Field12182 = class978;
    }

    private static String Method3983(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 10;
            cArray2[n] = (char)(cArray[n] ^ (0x6FDC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

