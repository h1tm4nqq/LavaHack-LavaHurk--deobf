/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.util.t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r;
import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import org.jetbrains.annotations.NotNull;

public class RWhrVDQwy83CLOUIW2fF3DRYf5Rta8Ne
extends FrvoqED59Mj96pmO7hxn2tEew1fZAOzj {
    public static String Field8528 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6785();
    private String Field8529 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public RWhrVDQwy83CLOUIW2fF3DRYf5Rta8Ne() {
        super("clientversion");
    }

    @Override
    public String Method447() {
        return "Changes the version of the client";
    }

    @Override
    public String Method448() {
        return "clientversion <version>";
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        Field8528 = t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r.Method7669(stringArray, (int)442662387L ^ 0x1A627DF3, stringArray.length).toString();
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-590426405 ^ (long)-590426405);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-136541259L ^ 0xF7DC8B4A);
            int n2 = (int)((long)-1180636515 ^ (long)-1180636454) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1405441183L ^ 0xAC3ABDFC) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

