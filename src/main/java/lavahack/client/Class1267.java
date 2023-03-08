//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.apache.logging.log4j.*;

public class Class1267
{
    public static Class1267 Field13723;
    private String Field13724 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method5100() {
        Class14.Field7890 = LogManager.getLogger("LavaHack Lunatrius Core");
    }
    
    static {
        Class1267.Field13723 = new Class1267();
    }
    
    private static String Method5101(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1DE9 ^ 0x36));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
