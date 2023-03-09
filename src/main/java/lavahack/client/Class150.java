/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.util.Class2131;
import lavahack.client.Class158;
import lavahack.client.Class1796;
import org.jetbrains.annotations.NotNull;

public class Class150
extends Class158 {
    public static String Field8581 = Class1796.Method6783();
    private int Field8582;

    public Class150() {
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
        Field8581 = Class2131.Method7669(stringArray, 0, stringArray.length).toString();
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 174;
            cArray2[n] = (char)(cArray[n] ^ (0x744E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

