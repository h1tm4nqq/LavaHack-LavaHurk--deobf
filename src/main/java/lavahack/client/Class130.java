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
import lavahack.client.Class1160;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/features/module/render/shader/ShaderUtil$UniformFloat;", "Lcom/kisman/cc/features/module/render/shader/ShaderUtil$Uniform;", "name", "", "value", "", "(Ljava/lang/String;F)V", "getName", "()Ljava/lang/String;", "getValue", "()F", "kisman.cc"})
public final class Class130
extends Class1160 {
    @NotNull
    private final String Field8445;
    private final float Field8446;
    private int Field8447;

    @NotNull
    @NotNull
    public final String Method864() {
        return this.Field8445;
    }

    public final float Method865() {
        return this.Field8446;
    }

    public Class130(@NotNull @NotNull String string, float f) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        this.Field8445 = string;
        this.Field8446 = f;
    }

    private static String Method866(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 66;
            cArray2[n] = (char)(cArray[n] ^ (0xBEB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

