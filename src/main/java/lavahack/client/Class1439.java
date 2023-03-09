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
import lavahack.client.Class438;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0016\u0018\u0000*\u0010\b\u0000\u0010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\t\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\n\u00a8\u0006\u000f"}, d2={"Lcom/kisman/cc/util/render/shader/uniform/Uniform;", "T", "Lcom/kisman/cc/util/render/shader/uniform/type/Type;", "", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "t", "Lcom/kisman/cc/util/render/shader/uniform/type/Type;", "get", "()Lcom/kisman/cc/util/render/shader/uniform/type/Type;", "set", "(Lcom/kisman/cc/util/render/shader/uniform/type/Type;)Lcom/kisman/cc/util/render/shader/uniform/Uniform;", "kisman.cc"})
public class Class1439 {
    private Class438 Field14743;
    @NotNull
    private final String Field14744;
    private String Field14745 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final Class1439 Method3412(@NotNull @NotNull Class438 class438) {
        Intrinsics.checkParameterIsNotNull((Object)class438, (String)"t");
        this.Field14743 = class438;
        return this;
    }

    @NotNull
    @NotNull
    public final Class438 Method3413() {
        Class438 class438 = this.Field14743;
        if (class438 != null) return class438;
        Intrinsics.throwNpe();
        return class438;
    }

    @NotNull
    @NotNull
    public final String Method3414() {
        return this.Field14744;
    }

    public Class1439(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        this.Field14744 = string;
    }

    private static String Method3415(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 17;
            cArray2[n] = (char)(cArray[n] ^ (0xE6B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

