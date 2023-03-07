/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.loader;

import com.kisman.cc.loader.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\u0002\u0010\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002\u00a8\u0006\b"}, d2={"getVersions", "", "", "()[Ljava/lang/String;", "onLogin", "", "key", "version", "kisman.cc"})
public final class Ljc0gDTN8WkwPRHY480HpEkScGALG41A {
    private int Field12050;

    public static final void Method3914(@NotNull @NotNull String string, @NotNull @NotNull String string2) {
        int n;
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"key");
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"version");
        CharSequence charSequence = string;
        int n2 = (int)1637394118L ^ 0x6198A6C6;
        if (charSequence.length() > 0) {
            n = (int)((long)248527231 ^ (long)248527230);
            return;
        }
        n = (int)-1577722399L ^ 0xA1F5DDE1;
    }

    @NotNull
    @NotNull
    public static final String[] Method3915() {
        return leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4839();
    }

    private static String Method3916(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1672692293L ^ 0x63B34245;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1084637156 ^ (long)-1084636957);
            int n2 = (int)464113238L ^ 0x1BA9CEF1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-769327049L ^ 0xD22509E8) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

