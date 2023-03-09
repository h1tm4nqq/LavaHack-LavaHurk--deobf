//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  org.lwjgl.opengl.ARBShaderObjects
 */
package lavahack.client;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import lavahack.client.Class1796;
import net.minecraft.client.Minecraft;
import org.apache.commons.io.IOUtils;
import org.lwjgl.opengl.ARBShaderObjects;

public class Class92 {
    public static Class92 Field8312;
    public static Class92 Field8313;
    public static Class92 Field8314;
    private int Field8315;
    public static String Field8316;
    public static String Field8317;
    private String Field8318 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class92(String string) {
        this.Method790(string);
    }

    public static void Method782() {
        Field8312 = new Class92("roundedrect_alpha");
        Field8313 = new Class92("roundedrect");
        Field8314 = new Class92("blur");
    }

    public void Method783() {
        ARBShaderObjects.glUseProgramObjectARB((int)this.Field8315);
    }

    public void Method784(String string, int n) {
        ARBShaderObjects.glUniform1iARB((int)ARBShaderObjects.glGetUniformLocationARB((int)this.Field8315, (CharSequence)string), (int)n);
    }

    public void Method785(String string, float f) {
        ARBShaderObjects.glUniform1fARB((int)ARBShaderObjects.glGetUniformLocationARB((int)this.Field8315, (CharSequence)string), (float)f);
    }

    public void Method786(String string, float f, float f2) {
        ARBShaderObjects.glUniform2fARB((int)ARBShaderObjects.glGetUniformLocationARB((int)this.Field8315, (CharSequence)string), (float)f, (float)f2);
    }

    public void Method787(String string, float f, float f2, float f3) {
        ARBShaderObjects.glUniform3fARB((int)ARBShaderObjects.glGetUniformLocationARB((int)this.Field8315, (CharSequence)string), (float)f, (float)f2, (float)f3);
    }

    public void Method788(String string, float f, float f2, float f3, float f4) {
        ARBShaderObjects.glUniform4fARB((int)ARBShaderObjects.glGetUniformLocationARB((int)this.Field8315, (CharSequence)string), (float)f, (float)f2, (float)f3, (float)f4);
    }

    public void Method789() {
        ARBShaderObjects.glUseProgramObjectARB((int)0);
    }

    private void Method790(String string) throws IOException {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(Field8316 + string + Field8317);
        if (inputStream == null) {
            Class1796.Field16243.error("Error while initializing " + string + " shader!!!");
            return;
        }
        this.Method791(IOUtils.toString(inputStream, Charset.defaultCharset()));
    }

    void Method791(String string) {
        int n = ARBShaderObjects.glCreateProgramObjectARB();
        if (n == 0) {
            System.out.println("PC Issued");
            Minecraft.getMinecraft().shutdown();
            return;
        }
        int n2 = ARBShaderObjects.glCreateShaderObjectARB((int)35632);
        ARBShaderObjects.glShaderSourceARB((int)n2, (CharSequence)string);
        ARBShaderObjects.glCompileShaderARB((int)n2);
        ARBShaderObjects.glAttachObjectARB((int)n, (int)n2);
        ARBShaderObjects.glLinkProgramARB((int)n);
        this.Field8315 = n;
    }

    static {
        Field8316 = "assets/kismancc/shader/fragment/";
        Field8317 = ".shader";
    }

    private static String Method792(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 88;
            cArray2[n] = (char)(cArray[n] ^ (0x58E6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

