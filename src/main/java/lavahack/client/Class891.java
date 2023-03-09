/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.Display
 */
package lavahack.client;

import com.kisman.cc.util.Class2131;
import lavahack.client.Class158;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.Display;

public class Class891
extends Class158 {
    private int Field11734;

    public Class891() {
        super("displaytitle");
    }

    @Override
    public String Method447() {
        return "Changes the name of the display";
    }

    @Override
    public String Method448() {
        return "displaytitle <title>";
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        Display.setTitle((String)Class2131.Method7669(stringArray, 0, stringArray.length).toString());
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 60;
            cArray2[n] = (char)(cArray[n] ^ (0x6719 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

