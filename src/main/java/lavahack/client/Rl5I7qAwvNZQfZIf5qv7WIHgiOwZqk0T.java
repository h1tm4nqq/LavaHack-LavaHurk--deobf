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
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.Minecraft;
import org.apache.commons.io.IOUtils;
import org.lwjgl.opengl.ARBShaderObjects;

public class Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T {
    public static Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T Field8312;
    public static Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T Field8313;
    public static Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T Field8314;
    private int Field8315;
    public static String Field8316;
    public static String Field8317;
    private String Field8318 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T(String string) {
        this.Method790(string);
    }

    public static void Method782() {
        Field8312 = new Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T("roundedrect_alpha");
        Field8313 = new Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T("roundedrect");
        Field8314 = new Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T("blur");
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
        ARBShaderObjects.glUseProgramObjectARB((int)((int)((long)-1116008438 ^ (long)-1116008438)));
    }

    private void Method790(String string) throws IOException {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(Field8316 + string + Field8317);
        if (inputStream == null) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.error("Error while initializing " + string + " shader!!!");
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
        int n2 = ARBShaderObjects.glCreateShaderObjectARB((int)(((int)514347218L ^ 0x1EA85861) << 4));
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
        int n = (int)((long)1557306814 ^ (long)1557306814);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)2046394590L ^ 0x79F98021);
            int n2 = ((int)-164538700L ^ 0xF63156BF) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1841526719 ^ (long)-1841519566) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

