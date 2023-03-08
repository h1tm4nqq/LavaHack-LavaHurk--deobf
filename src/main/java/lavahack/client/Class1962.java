//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import java.awt.*;
import java.awt.datatransfer.*;

public class Class1962 extends Class158
{
    private int Field17036;
    
    public Class1962() {
        super("getuuid");
    }
    
    public void Method443(@NotNull @NotNull final String s, @NotNull @NotNull final String[] array) {
        if (array.length < 2) {
            this.Method438("Too few arguments");
            return;
        }
        long long1 = -1L;
        if (array.length >= 3) {
            long1 = Long.parseLong(array[2]);
        }
        final boolean equalsIgnoreCase = array[0].split(":")[1].equalsIgnoreCase("true");
        final String s2 = array[1];
        Long.compare(long1, 0L);
        final String method7559 = Class2044.Method7559(s2);
        if (method7559 == null) {
            this.Method438("The player " + s2 + " does not exist");
            return;
        }
        if (method7559.equals("error")) {
            this.Method438("Request timed out");
            return;
        }
        if (equalsIgnoreCase) {
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(method7559), null);
        }
        this.Method437("The UUID of " + s2 + " is " + method7559);
    }
    
    public String Method447() {
        return "gets the uuid of the specified player";
    }
    
    public String Method448() {
        return "getuuid copy:<true/false> <player> <timeOutMillis(Optional)>";
    }
    
    private static String Method7282(final String s) throws Exception {
        return Class2044.Method7559(s);
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4C06 ^ 0xDA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
