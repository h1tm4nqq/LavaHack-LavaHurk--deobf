/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.ResourceLocation
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/util/minecraft/ResourceLocationHandler;", "Lnet/minecraft/util/ResourceLocation;", "name", "", "shader", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getShader", "toString", "kisman.cc"})
public final class AYUeccr5wExGiEMVsRSJEFx8ctb05ddX
extends ResourceLocation {
    @NotNull
    private final String Field14847;
    @NotNull
    private final String Field14848;
    private String Field14849 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public String toString() {
        return this.Field14847;
    }

    @NotNull
    @NotNull
    public final String getName() {
        return this.Field14847;
    }

    @NotNull
    @NotNull
    public final String getShader() {
        return this.Field14848;
    }

    public AYUeccr5wExGiEMVsRSJEFx8ctb05ddX(@NotNull @NotNull String string, @NotNull @NotNull String string2) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"shader");
        super("another:resource");
        this.Field14847 = string;
        this.Field14848 = string2;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-633864224L ^ 0xDA37FFE0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-488690750 ^ (long)-488690883);
            int n2 = (int)((long)-86201153 ^ (long)-86201306);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)486433347 ^ (long)486436250) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

