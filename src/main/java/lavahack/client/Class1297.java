//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.nio.charset.*;
import org.apache.commons.io.*;
import java.io.*;
import java.util.*;
import org.lwjgl.opengl.*;

public abstract class Class1297
{
    public String Field13927;
    public int Field13928;
    public Map Field13929;
    private String Field13930 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1297(final String s) {
        this.Field13927 = s;
        final InputStream resourceAsStream = this.getClass().getResourceAsStream("/assets/kismancc/shader/vertex.vert");
        if (resourceAsStream != null) {
            this.Method234(IOUtils.toString(resourceAsStream, Charset.defaultCharset()), 35633);
        }
        IOUtils.closeQuietly(resourceAsStream);
        final InputStream resourceAsStream2 = this.getClass().getResourceAsStream("/assets/kismancc/shader/fragment/" + s);
        if (resourceAsStream2 != null) {
            this.Method234(IOUtils.toString(resourceAsStream2, Charset.defaultCharset()), 35632);
        }
        IOUtils.closeQuietly(resourceAsStream2);
    }
    
    public void Method230() {
        GL11.glPushMatrix();
        GL20.glUseProgram(this.Field13928);
        if (this.Field13929 == null) {
            this.Field13929 = new HashMap();
            this.Method232();
        }
        this.Method233();
    }
    
    public void Method231() {
        GL20.glUseProgram(0);
        GL11.glPopMatrix();
    }
    
    public void Method232() {
    }
    
    public void Method233() {
    }
    
    public int Method234(final String s, final int n) {
        final int glCreateShaderObjectARB = ARBShaderObjects.glCreateShaderObjectARB(n);
        if (glCreateShaderObjectARB == 0) {
            return 0;
        }
        ARBShaderObjects.glShaderSourceARB(glCreateShaderObjectARB, (CharSequence)s);
        ARBShaderObjects.glCompileShaderARB(glCreateShaderObjectARB);
        if (ARBShaderObjects.glGetObjectParameteriARB(glCreateShaderObjectARB, 35713) == 0) {
            throw new RuntimeException("Error creating shader: " + this.Method235(glCreateShaderObjectARB));
        }
        return glCreateShaderObjectARB;
    }
    
    public String Method235(final int n) {
        return ARBShaderObjects.glGetInfoLogARB(n, ARBShaderObjects.glGetObjectParameteriARB(n, 35716));
    }
    
    public void Method236(final String s, final int i) {
        this.Field13929.put(s, i);
    }
    
    public void Method237(final String s) {
        this.Method236(s, GL20.glGetUniformLocation(this.Field13928, (CharSequence)s));
    }
    
    public int Method238(final String s) {
        return this.Field13929.get(s);
    }
    
    public int Method239() {
        return this.Field13928;
    }
    
    private static String Method240(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x594 ^ 0x3C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
