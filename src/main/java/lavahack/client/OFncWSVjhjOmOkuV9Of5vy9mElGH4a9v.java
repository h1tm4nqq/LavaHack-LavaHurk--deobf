/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.OFncWSVjhjOmOkuV9Of5vy9mElGH4a9v$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2={"Lcom/kisman/cc/util/manager/file/FileManager;", "", "()V", "Companion", "kisman.cc"})
public final class OFncWSVjhjOmOkuV9Of5vy9mElGH4a9v {
    @NotNull
    public static final String Field11941 = "image";
    public static final OFncWSVjhjOmOkuV9Of5vy9mElGH4a9v$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field11942 = new OFncWSVjhjOmOkuV9Of5vy9mElGH4a9v$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(null);
    private String Field11943 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method3866(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)2023176901L ^ 0x78973AC5;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-294512658 ^ (long)-294512879);
            int n2 = ((int)-1333532191L ^ 0xB083E9B6) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)1003869108L ^ 0x3BD5C69D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

