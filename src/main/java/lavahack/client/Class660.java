/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import java.net.URL;
import kotlin.Metadata;
import lavahack.client.Class1006;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class Class660
implements Runnable {
    final Class1006 Field10812;
    private int Field10813;

    @Override
    public final void run() {
        Class1006.Method4049(this.Field10812, this.Field10812.Method4047(new URL("https://2bqueue.info/*"), "regular"));
        Class1006.Method4051(this.Field10812, this.Field10812.Method4047(new URL("https://2bqueue.info/*"), "prio"));
    }

    Class660(Class1006 class1006) {
        this.Field10812 = class1006;
    }

    private static String Method2837(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 238;
            cArray2[n] = (char)(cArray[n] ^ (0x5FC6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

