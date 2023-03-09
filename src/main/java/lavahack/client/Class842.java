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
import lavahack.client.Class135;
import lavahack.client.Class1471;
import lavahack.client.Class424;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"<anonymous>", "", "arg", "Lorg/cubic/dynamictask/ArgumentFetcher;", "call"})
final class Class842
implements Class1471 {
    public static final Class842 Field11571 = new Class842();
    private String Field11572 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public Object Method1564(Class424 class424) {
        return this.Method3571(class424);
    }

    @Nullable
    @Nullable
    public final Void Method3571(@NotNull @NotNull Class424 class424) {
        Intrinsics.checkParameterIsNotNull((Object)class424, (String)"arg");
        Class135.Field8500.Method929().Method1726(class424.Method2054(0), class424.Method2054(1));
        Class135.Field8501.Method929().Method1726(class424.Method2054(0), class424.Method2054(1));
        return null;
    }

    Class842() {
    }

    private static String Method3572(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 165;
            cArray2[n] = (char)(cArray[n] ^ (0x185D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

