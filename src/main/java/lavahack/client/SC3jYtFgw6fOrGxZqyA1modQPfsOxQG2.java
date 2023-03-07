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
import lavahack.client.pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL20;

public class SC3jYtFgw6fOrGxZqyA1modQPfsOxQG2 {
    private static final Minecraft Field12674 = Minecraft.getMinecraft();
    private int Field12675;
    private String Field12676 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public SC3jYtFgw6fOrGxZqyA1modQPfsOxQG2(String string, String string2, String string3) {
        this.Method4309(string, string2, string3);
        if (this.Field12675 <= 0) return;
        GL20.glUseProgram((int)this.Field12675);
        GL20.glUniform1i((int)GL20.glGetUniformLocation((int)this.Field12675, (CharSequence)"texture"), (int)((int)1526897440L ^ 0x5B029B20));
        GL20.glUseProgram((int)((int)-973705167L ^ 0xC5F67031));
    }

    private void Method4309(String string, String string2, String string3) {
        if (!OpenGlHelper.shadersSupported) {
            this.Field12675 = (int)2027020898L ^ 0x78D1E262;
            return;
        }
        this.Field12675 = GL20.glCreateProgram();
        int n = this.Method4310(string, string2, (int)-1477717026L ^ 0xA7EB58EF);
        int n2 = this.Method4310(string, string3, ((int)806866622L ^ 0x3017C60D) << 4);
        if (n != 0) {
            GL20.glAttachShader((int)this.Field12675, (int)n);
        }
        if (n2 != 0) {
            GL20.glAttachShader((int)this.Field12675, (int)n2);
        }
        GL20.glLinkProgram((int)this.Field12675);
        if (GL20.glGetProgrami((int)this.Field12675, (int)((int)((long)-1927956995 ^ (long)-1927942084) << 1)) == 0) {
            pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.error("Could not link shader: {}", (Object)GL20.glGetProgramInfoLog((int)this.Field12675, (int)(((int)1600329822L ^ 0x5F63185F) << 10)));
            GL20.glDeleteProgram((int)this.Field12675);
            this.Field12675 = (int)((long)1918039233 ^ (long)1918039233);
            return;
        }
        GL20.glValidateProgram((int)this.Field12675);
        if (GL20.glGetProgrami((int)this.Field12675, (int)((int)((long)-761425593 ^ (long)-761455932))) != 0) return;
        pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.error("Could not validate shader: {}", (Object)GL20.glGetProgramInfoLog((int)this.Field12675, (int)(((int)387564048L ^ 0x1719C211) << 10)));
        GL20.glDeleteProgram((int)this.Field12675);
        this.Field12675 = (int)((long)898049563 ^ (long)898049563);
    }

    private int Method4310(String string, String string2, int n) {
        if (string2 == null) {
            return (int)((long)-982642180 ^ (long)-982642180);
        }
        int n2 = GL20.glCreateShader((int)n);
        if (n2 == 0) {
            pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.error("Could not create shader of type {} for {}: {}", (Object)n, (Object)string2, (Object)GL20.glGetProgramInfoLog((int)this.Field12675, (int)((int)((long)1334545897 ^ (long)1334545896) << 10)));
            return (int)((long)-1241325434 ^ (long)-1241325434);
        }
        String string3 = this.Method4311(new ResourceLocation(string, string2));
        if (string3 == null) {
            GL20.glDeleteShader((int)n2);
            return (int)((long)1958229732 ^ (long)1958229732);
        }
        GL20.glShaderSource((int)n2, (CharSequence)string3);
        GL20.glCompileShader((int)n2);
        if (GL20.glGetShaderi((int)n2, (int)((int)((long)45239119 ^ (long)45269198))) != 0) return n2;
        pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.error("Could not compile shader {}: {}", (Object)string2, (Object)GL20.glGetShaderInfoLog((int)this.Field12675, (int)(((int)1141241982L ^ 0x4405F87F) << 10)));
        GL20.glDeleteShader((int)n2);
        return (int)((long)-1161710682 ^ (long)-1161710682);
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
            stringBuilder.append((int)((long)190773672 ^ (long)190773677) << 1);
        }
    }

    public int Method4312() {
        return this.Field12675;
    }

    private static String Method4313(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1105031046L ^ 0xBE22907A;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1537953288 ^ (long)1537953527);
            int n2 = (int)((long)-1587939523 ^ (long)-1587939582) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-640735980 ^ (long)-640741573) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

