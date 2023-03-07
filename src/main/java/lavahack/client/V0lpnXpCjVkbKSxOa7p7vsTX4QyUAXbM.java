/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import java.util.Iterator;
import kotlin.Metadata;
import lavahack.client.NSewz7oiMYR6VaaGbKeUqvXMcw4Xz6sx;
import lavahack.client.SaFAdkXnAH4UyheTd3e2CmA7eDc0whTK;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.ohP0orxdq2P1v9VESBaGP1easnqKGTCb;
import lavahack.client.zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/features/nocom/gui/NoComModulesFrame;", "Lcom/kisman/cc/gui/halq/Frame;", "x", "", "y", "(II)V", "kisman.cc"})
public final class V0lpnXpCjVkbKSxOa7p7vsTX4QyUAXbM
extends ohP0orxdq2P1v9VESBaGP1easnqKGTCb {
    private String Field8786 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public V0lpnXpCjVkbKSxOa7p7vsTX4QyUAXbM(int n, int n2) {
        super(null, n, n2, (boolean)((long)1575761149 ^ (long)1575761148), "Modules");
        int n3 = (int)((long)-604069442 ^ (long)-604069442);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi leqS0IyKEB621E1SrHdAcHHAUjScjmKi2 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241;
        Iterator iterator = ((Iterable)((NSewz7oiMYR6VaaGbKeUqvXMcw4Xz6sx)null).Method4122()).iterator();
        while (iterator.hasNext()) {
            WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J = (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)iterator.next();
            this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.add(new SaFAdkXnAH4UyheTd3e2CmA7eDc0whTK(wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, n, n2, (n3 + ((int)-540533887L ^ 0xDFC81B80)) * zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604, n3 + ((int)635706240L ^ 0x25E41B81)));
            ++n3;
        }
    }

    private static String Method74(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)18651035L ^ 0x11C979B;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-694288220 ^ (long)-694288293);
            int n2 = (int)((long)1041391754 ^ (long)1041391759) << 4;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1724551246L ^ 0x99355C0D) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

