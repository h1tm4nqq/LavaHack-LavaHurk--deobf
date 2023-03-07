/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.loader;

import java.awt.Font;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/loader/gui/utils/LoaderFont;", "", "name", "", "font", "Ljava/awt/Font;", "(Ljava/lang/String;Ljava/awt/Font;)V", "getFont", "()Ljava/awt/Font;", "toString", "kisman.cc"})
public final class IBONRcQCNUBg2NBpVpVQf61ykmVfU03E {
    private final String Field13743;
    @NotNull
    private final Font Field13744;
    private String Field13745 = "TheKisDevs & LavaHack Development owns you";

    @NotNull
    @NotNull
    public String toString() {
        return this.Field13743;
    }

    @NotNull
    @NotNull
    public final Font Method5105() {
        return this.Field13744;
    }

    public IBONRcQCNUBg2NBpVpVQf61ykmVfU03E(@NotNull @NotNull String string, @NotNull @NotNull Font font) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        Intrinsics.checkParameterIsNotNull((Object)font, (String)"font");
        this.Field13743 = string;
        this.Field13744 = font;
    }

    private static String Method5106(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-25603072L ^ 0xFE795400;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1355400672 ^ (long)1355400479);
            int n2 = (int)((long)3674498 ^ (long)3674587);
            cArray2[n] = (char)(cArray[n] ^ (((int)645422763L ^ 0x26785EEE) << 5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

