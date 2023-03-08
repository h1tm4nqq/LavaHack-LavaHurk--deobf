//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.lwjgl.opengl.*;
import java.nio.charset.*;
import org.apache.commons.io.*;
import java.io.*;
import net.minecraft.client.*;

public class Class92
{
    public static Class92 Field8312;
    public static Class92 Field8313;
    public static Class92 Field8314;
    private int Field8315;
    public static String Field8316;
    public static String Field8317;
    private String Field8318 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class92(final String s) {
        this.Method790(s);
    }
    
    public static void Method782() {
        Class92.Field8312 = new Class92("roundedrect_alpha");
        Class92.Field8313 = new Class92("roundedrect");
        Class92.Field8314 = new Class92("blur");
    }
    
    public void Method783() {
        ARBShaderObjects.glUseProgramObjectARB(this.Field8315);
    }
    
    public void Method784(final String s, final int n) {
        ARBShaderObjects.glUniform1iARB(ARBShaderObjects.glGetUniformLocationARB(this.Field8315, (CharSequence)s), n);
    }
    
    public void Method785(final String s, final float n) {
        ARBShaderObjects.glUniform1fARB(ARBShaderObjects.glGetUniformLocationARB(this.Field8315, (CharSequence)s), n);
    }
    
    public void Method786(final String s, final float n, final float n2) {
        ARBShaderObjects.glUniform2fARB(ARBShaderObjects.glGetUniformLocationARB(this.Field8315, (CharSequence)s), n, n2);
    }
    
    public void Method787(final String s, final float n, final float n2, final float n3) {
        ARBShaderObjects.glUniform3fARB(ARBShaderObjects.glGetUniformLocationARB(this.Field8315, (CharSequence)s), n, n2, n3);
    }
    
    public void Method788(final String s, final float n, final float n2, final float n3, final float n4) {
        ARBShaderObjects.glUniform4fARB(ARBShaderObjects.glGetUniformLocationARB(this.Field8315, (CharSequence)s), n, n2, n3, n4);
    }
    
    public void Method789() {
        ARBShaderObjects.glUseProgramObjectARB(0);
    }
    
    private void Method790(final String s) throws IOException {
        final InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream(Class92.Field8316 + s + Class92.Field8317);
        if (resourceAsStream == null) {
            Class1796.Field16243.error("Error while initializing " + s + " shader!!!");
            return;
        }
        this.Method791(IOUtils.toString(resourceAsStream, Charset.defaultCharset()));
    }
    
    void Method791(final String s) {
        final int glCreateProgramObjectARB = ARBShaderObjects.glCreateProgramObjectARB();
        if (glCreateProgramObjectARB == 0) {
            System.out.println("PC Issued");
            Minecraft.getMinecraft().shutdown();
            return;
        }
        final int glCreateShaderObjectARB = ARBShaderObjects.glCreateShaderObjectARB(35632);
        ARBShaderObjects.glShaderSourceARB(glCreateShaderObjectARB, (CharSequence)s);
        ARBShaderObjects.glCompileShaderARB(glCreateShaderObjectARB);
        ARBShaderObjects.glAttachObjectARB(glCreateProgramObjectARB, glCreateShaderObjectARB);
        ARBShaderObjects.glLinkProgramARB(glCreateProgramObjectARB);
        this.Field8315 = glCreateProgramObjectARB;
    }
    
    static {
        Class92.Field8316 = "assets/kismancc/shader/fragment/";
        Class92.Field8317 = ".shader";
    }
    
    private static String Method792(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x58E6 ^ 0x58));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
