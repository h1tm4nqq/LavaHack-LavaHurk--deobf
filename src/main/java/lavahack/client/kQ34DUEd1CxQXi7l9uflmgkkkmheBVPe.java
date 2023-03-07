/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.ArrayList;
import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.kQ34DUEd1CxQXi7l9uflmgkkkmheBVPe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import org.jetbrains.annotations.NotNull;

public class kQ34DUEd1CxQXi7l9uflmgkkkmheBVPe
extends FrvoqED59Mj96pmO7hxn2tEew1fZAOzj {
    private String Field12678 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public kQ34DUEd1CxQXi7l9uflmgkkkmheBVPe() {
        super("setting");
    }

    @Override
    public String Method447() {
        return null;
    }

    @Override
    public String Method448() {
        return null;
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        if (stringArray.length < (int)((long)-1305098492 ^ (long)-1305098491) << 1) {
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5504().Method1882("Not enough arguments: " + stringArray.length);
            return;
        }
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Method1162(stringArray[(int)((long)-2145142603 ^ (long)-2145142603)]);
        if (wjjBVRrUqJUKhloA7ANknrTEODhuGa0J == null) {
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5504().Method1882("Could not find module: " + stringArray[(int)1599760850L ^ 0x5F5A69D2]);
            return;
        }
        ArrayList arrayList = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258.Method7571(wjjBVRrUqJUKhloA7ANknrTEODhuGa0J);
        kQ34DUEd1CxQXi7l9uflmgkkkmheBVPe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi kQ34DUEd1CxQXi7l9uflmgkkkmheBVPe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = new kQ34DUEd1CxQXi7l9uflmgkkkmheBVPe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, arrayList);
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1132304097 ^ (long)-1132304097);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1372942898L ^ 0xAE2A8D31);
            int n2 = ((int)-844094504L ^ 0xCDB023D1) << 3;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1410589970L ^ 0xABEC3D51) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

