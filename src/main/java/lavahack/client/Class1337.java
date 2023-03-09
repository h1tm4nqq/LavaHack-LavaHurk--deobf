/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Class1186;
import lavahack.client.Class42;
import lavahack.client.Class97;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/features/module/render/CharmsRewrite;", "Lcom/kisman/cc/features/module/Module;", "()V", "pattern", "Lcom/kisman/cc/settings/util/CharmsRewriteRendererPattern;", "getPattern", "()Lcom/kisman/cc/settings/util/CharmsRewriteRendererPattern;", "kisman.cc"})
public final class Class1337
extends Class42 {
    @NotNull
    private static final Class1186 Field14112;
    public static final Class1337 Field14113;
    private String Field14114 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final Class1186 Method5388() {
        return Field14112;
    }

    private Class1337() {
        super("CharmsRewrite", "Modify entity renderer.", Class97.Field8342);
    }

    static {
        Class1337 class1337;
        Field14113 = class1337 = new Class1337();
        Field14112 = new Class1186(class1337);
        Field14112.Method4772();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 224;
            cArray2[n] = (char)(cArray[n] ^ (0x12EF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

