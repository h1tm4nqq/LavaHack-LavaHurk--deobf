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
import lavahack.client.Class698;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2={"Lcom/kisman/cc/features/hud/modules/arraylist/ArrayListElement;", "", "name", "", "type", "Lcom/kisman/cc/features/hud/modules/arraylist/ElementTypes;", "(Ljava/lang/String;Lcom/kisman/cc/features/hud/modules/arraylist/ElementTypes;)V", "raw", "(Ljava/lang/String;Ljava/lang/String;Lcom/kisman/cc/features/hud/modules/arraylist/ElementTypes;)V", "getName", "()Ljava/lang/String;", "getRaw", "getType", "()Lcom/kisman/cc/features/hud/modules/arraylist/ElementTypes;", "kisman.cc"})
public final class Class83 {
    @NotNull
    private final String Field8280;
    @NotNull
    private final String Field8281;
    @NotNull
    private final Class698 Field8282;
    private int Field8283;

    @NotNull
    @NotNull
    public final String Method734() {
        return this.Field8280;
    }

    @NotNull
    @NotNull
    public final String Method735() {
        return this.Field8281;
    }

    @NotNull
    @NotNull
    public final Class698 Method736() {
        return this.Field8282;
    }

    public Class83(@NotNull @NotNull String string, @NotNull @NotNull String string2, @NotNull @NotNull Class698 class698) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"raw");
        Intrinsics.checkParameterIsNotNull((Object)((Object)class698), (String)"type");
        this.Field8280 = string;
        this.Field8281 = string2;
        this.Field8282 = class698;
    }

    public Class83(@NotNull @NotNull String string, @NotNull @NotNull Class698 class698) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        Intrinsics.checkParameterIsNotNull((Object)((Object)class698), (String)"type");
        this(string, string, class698);
    }

    private static String Method737(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 97;
            cArray2[n] = (char)(cArray[n] ^ (0xFC9 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

