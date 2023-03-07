/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb;
import org.jetbrains.annotations.NotNull;

class yExatPvqFpo99bvMEwzUlP7BkrMeaGKO$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb {
    private int Field13889;

    public yExatPvqFpo99bvMEwzUlP7BkrMeaGKO$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(@NotNull @NotNull FrvoqED59Mj96pmO7hxn2tEew1fZAOzj frvoqED59Mj96pmO7hxn2tEew1fZAOzj) {
        super("fmt", frvoqED59Mj96pmO7hxn2tEew1fZAOzj);
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505().Method1892("To be implemented");
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1750981343L ^ 0x685DDADF;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1212506539 ^ (long)-1212506454);
            int n2 = (int)((long)-770056419 ^ (long)-770056446) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1533915498 ^ (long)-1533915253) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

