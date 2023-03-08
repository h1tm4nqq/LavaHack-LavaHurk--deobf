//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002?\u0006\u0003" }, d2 = { "Lcom/kisman/cc/features/module/Debug/futureshader/shaders/filled/FilledColorShader;", "Lcom/kisman/cc/features/module/Debug/futureshader/FramebufferShader;", "()V", "kisman.cc" })
public final class Class1183 extends Class2058
{
    public static final Class1183 Field13367;
    private String Field13368 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1183() {
        super("color", "filled");
    }
    
    static {
        Field13367 = new Class1183();
    }
    
    private static String Method1713(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5D7 ^ 0xCE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
