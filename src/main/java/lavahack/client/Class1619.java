/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiScreen
 */
package lavahack.client;

import lavahack.client.Class32;
import lavahack.client.Class627;
import net.minecraft.client.gui.GuiScreen;

public class Class1619
extends Class627 {
    private String Field15574 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1619(GuiScreen guiScreen) {
        super(guiScreen, "schematica", Class32.Field7948, "schematica.config");
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 243;
            cArray2[n] = (char)(cArray[n] ^ (0x592B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

