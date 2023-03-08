//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.lwjgl.opengl.*;

public class Class1569 extends Class42
{
    public static final Class1569 Field15322;
    private String Field15323 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1569() {
        super("CustomLoadingScreen", Class97.Field8339);
    }
    
    public void Method20() {
        Class936.Field11998.Method3868(0.0, 0.0, Display.getWidth(), Display.getHeight());
    }
    
    static {
        Field15322 = new Class1569();
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2BE7 ^ 0x5E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
