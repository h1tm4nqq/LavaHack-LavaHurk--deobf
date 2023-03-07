/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb;
import lavahack.client.yExatPvqFpo99bvMEwzUlP7BkrMeaGKO;
import org.jetbrains.annotations.NotNull;

class yExatPvqFpo99bvMEwzUlP7BkrMeaGKO$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
extends hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb {
    private String Field17415 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public yExatPvqFpo99bvMEwzUlP7BkrMeaGKO$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(@NotNull @NotNull FrvoqED59Mj96pmO7hxn2tEew1fZAOzj frvoqED59Mj96pmO7hxn2tEew1fZAOzj) {
        super("resetconfig", frvoqED59Mj96pmO7hxn2tEew1fZAOzj);
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        yExatPvqFpo99bvMEwzUlP7BkrMeaGKO.Method2948(yExatPvqFpo99bvMEwzUlP7BkrMeaGKO.Method2947(), yExatPvqFpo99bvMEwzUlP7BkrMeaGKO.Method2947().exists());
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1454112979 ^ (long)1454112979);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)944047757 ^ (long)944047730);
            int n2 = (int)((long)-239071179 ^ (long)-239071144);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)123741318 ^ (long)123748271) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

