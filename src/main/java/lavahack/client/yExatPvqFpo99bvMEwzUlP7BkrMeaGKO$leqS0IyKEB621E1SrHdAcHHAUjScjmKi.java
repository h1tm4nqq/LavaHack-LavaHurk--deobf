/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.awt.Desktop;
import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb;
import lavahack.client.yExatPvqFpo99bvMEwzUlP7BkrMeaGKO;
import org.jetbrains.annotations.NotNull;

class yExatPvqFpo99bvMEwzUlP7BkrMeaGKO$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb {
    private int Field9908;

    public yExatPvqFpo99bvMEwzUlP7BkrMeaGKO$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull FrvoqED59Mj96pmO7hxn2tEew1fZAOzj frvoqED59Mj96pmO7hxn2tEew1fZAOzj) {
        super("config", frvoqED59Mj96pmO7hxn2tEew1fZAOzj);
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        if (!yExatPvqFpo99bvMEwzUlP7BkrMeaGKO.Method2947().exists()) {
            yExatPvqFpo99bvMEwzUlP7BkrMeaGKO.Method2948(yExatPvqFpo99bvMEwzUlP7BkrMeaGKO.Method2947(), ((int)536922569L ^ 0x2000C9C9) != 0);
        }
        Desktop.getDesktop().open(yExatPvqFpo99bvMEwzUlP7BkrMeaGKO.Method2947());
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-2139308768 ^ (long)-2139308768);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)533427222 ^ (long)533427433);
            int n2 = (int)-1924238550L ^ 0x8D4E73EB;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)226222278 ^ (long)226217141) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

