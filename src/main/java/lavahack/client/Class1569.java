/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.Display
 */
package lavahack.client;

import lavahack.client.Class42;
import lavahack.client.Class936;
import lavahack.client.Class97;
import org.lwjgl.opengl.Display;

public class Class1569
extends Class42 {
    public static final Class1569 Field15322 = new Class1569();
    private String Field15323 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Class1569() {
        super("CustomLoadingScreen", Class97.Field8339);
    }

    public void Method20() {
        Class936.Field11998.Method3868(0.0, 0.0, Display.getWidth(), Display.getHeight());
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 94;
            cArray2[n] = (char)(cArray[n] ^ (0x2BE7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

