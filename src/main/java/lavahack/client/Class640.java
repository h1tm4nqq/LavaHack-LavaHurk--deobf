/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.text.TextFormatting
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class372;
import net.minecraft.util.text.TextFormatting;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0010"}, d2={"Lcom/kisman/cc/util/minecraft/Formatter;", "", "original", "Lnet/minecraft/util/text/TextFormatting;", "display", "", "type", "Lcom/kisman/cc/util/minecraft/FormatterType;", "(Lnet/minecraft/util/text/TextFormatting;Ljava/lang/String;Lcom/kisman/cc/util/minecraft/FormatterType;)V", "getDisplay", "()Ljava/lang/String;", "getOriginal", "()Lnet/minecraft/util/text/TextFormatting;", "getType", "()Lcom/kisman/cc/util/minecraft/FormatterType;", "toString", "kisman.cc"})
public final class Class640 {
    @NotNull
    private final TextFormatting Field10761;
    @NotNull
    private final String Field10762;
    @NotNull
    private final Class372 Field10763;
    private int Field10764;

    @NotNull
    @NotNull
    public String toString() {
        return this.Field10762;
    }

    @NotNull
    @NotNull
    public final TextFormatting Method2769() {
        return this.Field10761;
    }

    @NotNull
    @NotNull
    public final String Method2770() {
        return this.Field10762;
    }

    @NotNull
    @NotNull
    public final Class372 Method2771() {
        return this.Field10763;
    }

    public Class640(@NotNull @NotNull TextFormatting textFormatting, @NotNull @NotNull String string, @NotNull @NotNull Class372 class372) {
        Intrinsics.checkParameterIsNotNull((Object)textFormatting, (String)"original");
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"display");
        Intrinsics.checkParameterIsNotNull((Object)((Object)class372), (String)"type");
        this.Field10761 = textFormatting;
        this.Field10762 = string;
        this.Field10763 = class372;
    }

    private static String Method2772(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 239;
            cArray2[n] = (char)(cArray[n] ^ (0x3048 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

