//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import java.io.File;
import java.io.FileWriter;
import lavahack.client.Class1291;
import lavahack.client.Class158;
import lavahack.client.Class2059;
import lavahack.client.Class460;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public class Class707
extends Class158 {
    private static final File Field11016 = new File(Minecraft.getMinecraft().gameDir + "kisman.cc/", "fmtcmd.txt");
    private String Field11017 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class707() {
        super("fmt");
        if (!Field11016.exists()) {
            Class707.Method2946(Field11016, false);
        }
        this.Method445(new Class460(this), new Class1291(this), new Class2059(this));
    }

    @Override
    public String Method447() {
        return "Format chat messages";
    }

    @Override
    public String Method448() {
        return "-fmt <fmt/config> <message to be formatted (only when used with fmt)>";
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        this.Method446(string, stringArray);
    }

    private static void Method2946(File file, boolean bl) {
        String string = System.lineSeparator();
        if (bl) {
            file.delete();
        }
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("CommandPrefix:%" + string + "QuotePrefix:Q" + string + "LookupPrefix:L" + string + "InsertPrefix:I" + string + "ContentBounders:{}");
    }

    static File Method2947() {
        return Field11016;
    }

    static void Method2948(File file, boolean bl) {
        Class707.Method2946(file, bl);
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 218;
            cArray2[n] = (char)(cArray[n] ^ (0x5761 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

