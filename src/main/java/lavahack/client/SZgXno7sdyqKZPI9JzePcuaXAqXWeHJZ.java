/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.Display
 */
package lavahack.client;

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUt;
import org.lwjgl.opengl.Display;

public class SZgXno7sdyqKZPI9JzePcuaXAqXWeHJZ
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public static final SZgXno7sdyqKZPI9JzePcuaXAqXWeHJZ Field15322 = new SZgXno7sdyqKZPI9JzePcuaXAqXWeHJZ();
    private String Field15323 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private SZgXno7sdyqKZPI9JzePcuaXAqXWeHJZ() {
        super("CustomLoadingScreen", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8339);
    }

    public void Method20() {
        yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUt.Field11998.Method3868(0.0, 0.0, Display.getWidth(), Display.getHeight());
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1981101753L ^ 0x761536B9;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1641043767 ^ (long)-1641043914);
            int n2 = ((int)852117574L ^ 0x32CA4869) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1039715718L ^ 0xC207199D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

