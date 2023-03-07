/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiScreen
 */
package lavahack.client;

import lavahack.client.BY2zxl1PmInW11PSdjjDrR5OfktOoUsd;
import lavahack.client.Z59nFS7fzGt9MllssMcgOsEYj1a2guaH;
import net.minecraft.client.gui.GuiScreen;

public class XlIoyHWISSQSA2pEIWKhU8KEi0CVSpD8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends BY2zxl1PmInW11PSdjjDrR5OfktOoUsd {
    private String Field15574 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public XlIoyHWISSQSA2pEIWKhU8KEi0CVSpD8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(GuiScreen guiScreen) {
        super(guiScreen, "schematica", Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7948, "schematica.config");
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-413753888L ^ 0xE7569DE0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1551366722 ^ (long)1551366845);
            int n2 = (int)((long)925435624 ^ (long)925435419);
            cArray2[n] = (char)(cArray[n] ^ ((int)881685143L ^ 0x348D2BBC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

