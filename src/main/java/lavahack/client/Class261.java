/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class2075;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/util/enums/GradientModes$Companion;", "", "()V", "getColor", "", "gradient", "Lcom/kisman/cc/util/enums/GradientModes;", "color", "Lcom/kisman/cc/util/Colour;", "diff", "", "kisman.cc"})
public final class Class261 {
    private String Field9163 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method1426(@NotNull @NotNull Class2075 class2075, @NotNull @NotNull Class2027 class2027, int n) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)class2075), (String)"gradient");
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"color");
    }

    private Class261() {
    }

    public Class261(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static String Method1427(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 156;
            cArray2[n] = (char)(cArray[n] ^ (0x1C5A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

