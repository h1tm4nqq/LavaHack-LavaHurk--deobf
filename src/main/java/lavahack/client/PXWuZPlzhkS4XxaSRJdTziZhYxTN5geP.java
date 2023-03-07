/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.RbKbhAXnZQkQqL8TiliRZ8uAfC3fffUO;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/features/module/render/CharmsRewrite;", "Lcom/kisman/cc/features/module/Module;", "()V", "pattern", "Lcom/kisman/cc/settings/util/CharmsRewriteRendererPattern;", "getPattern", "()Lcom/kisman/cc/settings/util/CharmsRewriteRendererPattern;", "kisman.cc"})
public final class PXWuZPlzhkS4XxaSRJdTziZhYxTN5geP
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    @NotNull
    private static final RbKbhAXnZQkQqL8TiliRZ8uAfC3fffUO Field14112;
    public static final PXWuZPlzhkS4XxaSRJdTziZhYxTN5geP Field14113;
    private String Field14114 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final RbKbhAXnZQkQqL8TiliRZ8uAfC3fffUO Method5388() {
        return Field14112;
    }

    private PXWuZPlzhkS4XxaSRJdTziZhYxTN5geP() {
        super("CharmsRewrite", "Modify entity renderer.", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
    }

    static {
        PXWuZPlzhkS4XxaSRJdTziZhYxTN5geP pXWuZPlzhkS4XxaSRJdTziZhYxTN5geP;
        Field14113 = pXWuZPlzhkS4XxaSRJdTziZhYxTN5geP = new PXWuZPlzhkS4XxaSRJdTziZhYxTN5geP();
        Field14112 = new RbKbhAXnZQkQqL8TiliRZ8uAfC3fffUO(pXWuZPlzhkS4XxaSRJdTziZhYxTN5geP);
        Field14112.Method4772();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1294665097L ^ 0xB2D4FA77;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)26601331 ^ (long)26601356);
            int n2 = ((int)1020213004L ^ 0x3CCF370B) << 5;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-2107486974 ^ (long)-2107482131) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

