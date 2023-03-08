//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.*;
import net.minecraft.util.*;
import java.io.*;

public class Class1057
{
    private static final Minecraft Field12674;
    private int Field12675;
    private String Field12676 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1057(final String s, final String s2, final String s3) {
        this.Method4309(s, s2, s3);
        if (this.Field12675 > 0) {
            GL20.glUseProgram(this.Field12675);
            GL20.glUniform1i(GL20.glGetUniformLocation(this.Field12675, (CharSequence)"texture"), 0);
            GL20.glUseProgram(0);
        }
    }
    
    private void Method4309(final String s, final String s2, final String s3) {
        if (!OpenGlHelper.shadersSupported) {
            this.Field12675 = 0;
            return;
        }
        this.Field12675 = GL20.glCreateProgram();
        final int method4310 = this.Method4310(s, s2, 35633);
        final int method4311 = this.Method4310(s, s3, 35632);
        if (method4310 != 0) {
            GL20.glAttachShader(this.Field12675, method4310);
        }
        if (method4311 != 0) {
            GL20.glAttachShader(this.Field12675, method4311);
        }
        GL20.glLinkProgram(this.Field12675);
        if (GL20.glGetProgrami(this.Field12675, 35714) == 0) {
            Class542.Field10314.error("Could not link shader: {}", (Object)GL20.glGetProgramInfoLog(this.Field12675, 1024));
            GL20.glDeleteProgram(this.Field12675);
            this.Field12675 = 0;
            return;
        }
        GL20.glValidateProgram(this.Field12675);
        if (GL20.glGetProgrami(this.Field12675, 35715) == 0) {
            Class542.Field10314.error("Could not validate shader: {}", (Object)GL20.glGetProgramInfoLog(this.Field12675, 1024));
            GL20.glDeleteProgram(this.Field12675);
            this.Field12675 = 0;
        }
    }
    
    private int Method4310(final String s, final String s2, final int i) {
        if (s2 == null) {
            return 0;
        }
        final int glCreateShader = GL20.glCreateShader(i);
        if (glCreateShader == 0) {
            Class542.Field10314.error("Could not create shader of type {} for {}: {}", (Object)i, (Object)s2, (Object)GL20.glGetProgramInfoLog(this.Field12675, 1024));
            return 0;
        }
        final String method4311 = this.Method4311(new ResourceLocation(s, s2));
        if (method4311 == null) {
            GL20.glDeleteShader(glCreateShader);
            return 0;
        }
        GL20.glShaderSource(glCreateShader, (CharSequence)method4311);
        GL20.glCompileShader(glCreateShader);
        if (GL20.glGetShaderi(glCreateShader, 35713) == 0) {
            Class542.Field10314.error("Could not compile shader {}: {}", (Object)s2, (Object)GL20.glGetShaderInfoLog(this.Field12675, 1024));
            GL20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }
    
    private String Method4311(final ResourceLocation resourceLocation) {
        final StringBuilder sb = new StringBuilder();
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Class1057.Field12674.getResourceManager().getResource(resourceLocation).getInputStream()));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            sb.append(line);
            sb.append('\n');
        }
        bufferedReader.close();
        return sb.toString();
    }
    
    public int Method4312() {
        return this.Field12675;
    }
    
    static {
        Field12674 = Minecraft.getMinecraft();
    }
    
    private static String Method4313(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2A2F ^ 0xFC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
