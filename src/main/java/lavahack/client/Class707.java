//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import java.io.*;
import net.minecraft.client.*;

public class Class707 extends Class158
{
    private static final File Field11016;
    private String Field11017 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class707() {
        super("fmt");
        if (!Class707.Field11016.exists()) {
            Method2946(Class707.Field11016, false);
        }
        this.Method445(new Class1368[] { (Class1368)new Class460((Class158)this), (Class1368)new Class1291((Class158)this), (Class1368)new Class2059((Class158)this) });
    }
    
    public String Method447() {
        return "Format chat messages";
    }
    
    public String Method448() {
        return "-fmt <fmt/config> <message to be formatted (only when used with fmt)>";
    }
    
    public void Method443(@NotNull @NotNull final String s, @NotNull @NotNull final String[] array) {
        this.Method446(s, array);
    }
    
    private static void Method2946(final File file, final boolean b) {
        final String lineSeparator = System.lineSeparator();
        if (b) {
            file.delete();
        }
        new FileWriter(file).write("CommandPrefix:%" + lineSeparator + "QuotePrefix:Q" + lineSeparator + "LookupPrefix:L" + lineSeparator + "InsertPrefix:I" + lineSeparator + "ContentBounders:{}");
    }
    
    static File Method2947() {
        return Class707.Field11016;
    }
    
    static void Method2948(final File file, final boolean b) {
        Method2946(file, b);
    }
    
    static {
        Field11016 = new File(Minecraft.getMinecraft().gameDir + "kisman.cc/", "fmtcmd.txt");
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5761 ^ 0xDA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
