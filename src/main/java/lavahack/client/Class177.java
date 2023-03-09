/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import java.util.Iterator;
import kotlin.Metadata;
import lavahack.client.Class1013;
import lavahack.client.Class1419;
import lavahack.client.Class1429;
import lavahack.client.Class1796;
import lavahack.client.Class354;
import lavahack.client.Class42;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/features/nocom/gui/NoComModulesFrame;", "Lcom/kisman/cc/gui/halq/Frame;", "x", "", "y", "(II)V", "kisman.cc"})
public final class Class177
extends Class354 {
    private String Field8786 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class177(int n, int n2) {
        super(null, n, n2, true, "Modules");
        int n3 = 0;
        Class1796 class1796 = Class1796.Field16241;
        Iterator iterator = ((Iterable)((Class1013)null).Method4122()).iterator();
        while (iterator.hasNext()) {
            Class42 class42 = (Class42)iterator.next();
            this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.add(new Class1429(class42, n, n2, (n3 + 1) * Class1419.Field14604, n3 + 1));
            ++n3;
        }
    }

    private static String Method74(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 80;
            cArray2[n] = (char)(cArray[n] ^ (0x677E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

