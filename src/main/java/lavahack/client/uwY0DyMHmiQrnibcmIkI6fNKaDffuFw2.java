/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.util.t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r;
import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import org.jetbrains.annotations.NotNull;

public class uwY0DyMHmiQrnibcmIkI6fNKaDffuFw2
extends FrvoqED59Mj96pmO7hxn2tEew1fZAOzj {
    public static String Field8581 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6783();
    private int Field8582;

    public uwY0DyMHmiQrnibcmIkI6fNKaDffuFw2() {
        super("clientname");
    }

    @Override
    public String Method447() {
        return "Changes the name of the client";
    }

    @Override
    public String Method448() {
        return "clientname <name>";
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        Field8581 = t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r.Method7669(stringArray, (int)((long)-84527079 ^ (long)-84527079), stringArray.length).toString();
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1584032437L ^ 0x5E6A6AB5;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1620963385 ^ (long)1620963526);
            int n2 = ((int)1848278388L ^ 0x6E2A7D23) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)274126248L ^ 0x1056EF8F) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

