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
final class Class327
implements Class1471 {
    public static final Class327 Field9369 = new Class327();
    private int Field9370;

    @Override
    public Object Method1564(Class424 class424) {
        return this.Method1644(class424);
    }

    @Nullable
    @Nullable
    public final Void Method1644(@NotNull @NotNull Class424 class424) {
        Intrinsics.checkParameterIsNotNull((Object)class424, (String)"arg");
        Class135.Field8500.Method930().Method1726(class424.Method2054(0), false);
        return null;
    }

    Class327() {
    }

    private static String Method1645(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 130;
            cArray2[n] = (char)(cArray[n] ^ (0x11BB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

