/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.Display
 */
package lavahack.client;

import com.kisman.cc.util.t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r;
import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.Display;

public class MjKkuaVRLYDQ5ez1bBjlT7tshHiy51Cp
extends FrvoqED59Mj96pmO7hxn2tEew1fZAOzj {
    private int Field11734;

    public MjKkuaVRLYDQ5ez1bBjlT7tshHiy51Cp() {
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
        Display.setTitle((String)t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r.Method7669(stringArray, (int)-1056983988L ^ 0xC0FFB44C, stringArray.length).toString());
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1894304903L ^ 0x70E8CC87;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1468094815L ^ 0x578159A0);
            int n2 = ((int)-1074015342L ^ 0xBFFBD39D) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)107141345L ^ 0x662BFF8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

