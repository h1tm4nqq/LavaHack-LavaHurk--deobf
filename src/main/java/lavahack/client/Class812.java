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
import lavahack.client.Class1439;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\u0018\u0000*\u0010\b\u0000\u0010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B'\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tB\u001f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010\u0010\u001a\u00020\u0011R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0012"}, d2={"Lcom/kisman/cc/settings/util/shaders/ShaderCharmsRewriteUniform;", "T", "Lcom/kisman/cc/util/render/shader/uniform/type/Type;", "Lcom/kisman/cc/util/render/shader/uniform/Uniform;", "settingName", "", "uniform", "index", "", "(Ljava/lang/String;Lcom/kisman/cc/util/render/shader/uniform/Uniform;I)V", "name", "(Ljava/lang/String;Ljava/lang/String;I)V", "getIndex", "()I", "getSettingName", "()Ljava/lang/String;", "radius", "", "kisman.cc"})
public final class Class812
extends Class1439 {
    @Nullable
    private final String Field11473;
    private final int Field11474;
    private int Field11475;

    public final boolean Method3416() {
        return Intrinsics.areEqual((Object)this.Method3414(), (Object)"radius");
    }

    @Nullable
    @Nullable
    public final String Method3417() {
        return this.Field11473;
    }

    public final int Method3418() {
        return this.Field11474;
    }

    public Class812(@Nullable @Nullable String string, @NotNull @NotNull String string2, int n) {
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"name");
        super(string2);
        this.Field11473 = string;
        this.Field11474 = n;
    }

    public Class812(@Nullable @Nullable String string, @NotNull @NotNull Class1439 class1439, int n) {
        Intrinsics.checkParameterIsNotNull((Object)class1439, (String)"uniform");
        this(string, class1439.Method3414(), n);
        this.Method3412(class1439.Method3413());
    }

    private static String Method3415(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 136;
            cArray2[n] = (char)(cArray[n] ^ (0x5BD0 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

