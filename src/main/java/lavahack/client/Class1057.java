//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import lavahack.client.Class542;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL20;

public class Class1057 {
    private static final Minecraft Field12674 = Minecraft.getMinecraft();
    private int Field12675;
    private String Field12676 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1057(String string, String string2, String string3) {
        this.Method4309(string, string2, string3);
        if (this.Field12675 <= 0) return;
        GL20.glUseProgram((int)this.Field12675);
        GL20.glUniform1i((int)GL20.glGetUniformLocation((int)this.Field12675, (CharSequence)"texture"), (int)0);
        GL20.glUseProgram((int)0);
    }

    private void Method4309(String string, String string2, String string3) {
        if (!OpenGlHelper.shadersSupported) {
            this.Field12675 = 0;
            return;
        }
        this.Field12675 = GL20.glCreateProgram();
        int n = this.Method4310(string, string2, 35633);
        int n2 = this.Method4310(string, string3, 35632);
        if (n != 0) {
            GL20.glAttachShader((int)this.Field12675, (int)n);
        }
        if (n2 != 0) {
            GL20.glAttachShader((int)this.Field12675, (int)n2);
        }
        GL20.glLinkProgram((int)this.Field12675);
        if (GL20.glGetProgrami((int)this.Field12675, (int)35714) == 0) {
            Class542.Field10314.error("Could not link shader: {}", (Object)GL20.glGetProgramInfoLog((int)this.Field12675, (int)1024));
            GL20.glDeleteProgram((int)this.Field12675);
            this.Field12675 = 0;
            return;
        }
        GL20.glValidateProgram((int)this.Field12675);
        if (GL20.glGetProgrami((int)this.Field12675, (int)35715) != 0) return;
        Class542.Field10314.error("Could not validate shader: {}", (Object)GL20.glGetProgramInfoLog((int)this.Field12675, (int)1024));
        GL20.glDeleteProgram((int)this.Field12675);
        this.Field12675 = 0;
    }

    private int Method4310(String string, String string2, int n) {
        if (string2 == null) {
            return 0;
        }
        int n2 = GL20.glCreateShader((int)n);
        if (n2 == 0) {
            Class542.Field10314.error("Could not create shader of type {} for {}: {}", (Object)n, (Object)string2, (Object)GL20.glGetProgramInfoLog((int)this.Field12675, (int)1024));
            return 0;
        }
        String string3 = this.Method4311(new ResourceLocation(string, string2));
        if (string3 == null) {
            GL20.glDeleteShader((int)n2);
            return 0;
        }
        GL20.glShaderSource((int)n2, (CharSequence)string3);
        GL20.glCompileShader((int)n2);
        if (GL20.glGetShaderi((int)n2, (int)35713) != 0) return n2;
        Class542.Field10314.error("Could not compile shader {}: {}", (Object)string2, (Object)GL20.glGetShaderInfoLog((int)this.Field12675, (int)1024));
        GL20.glDeleteShader((int)n2);
        return 0;
    }

    private String Method4311(ResourceLocation resourceLocation) {
        StringBuilder stringBuilder = new StringBuilder();
        InputStream inputStream = Field12674.getResourceManager().getResource(resourceLocation).getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            String string;
            if ((string = bufferedReader.readLine()) == null) {
                bufferedReader.close();
                return stringBuilder.toString();
            }
            stringBuilder.append(string);
            stringBuilder.append('\n');
        }
    }

    public int Method4312() {
        return this.Field12675;
    }

    private static String Method4313(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 252;
            cArray2[n] = (char)(cArray[n] ^ (0x2A2F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

