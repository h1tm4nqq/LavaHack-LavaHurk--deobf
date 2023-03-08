//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.nio.charset.*;
import org.apache.commons.io.*;
import java.io.*;
import org.lwjgl.opengl.*;
import java.util.*;

public abstract class Class477
{
    public int Field9988;
    public Map Field9989;
    private int Field9990;
    
    public Class477(final String str, final String s) {
        final InputStream resourceAsStream = this.getClass().getResourceAsStream("/assets/kismancc/shader/fragment/future/" + s + "/vertex.glsl");
        final int method1707 = this.Method1707(IOUtils.toString(resourceAsStream, Charset.defaultCharset()), 35633);
        IOUtils.closeQuietly(resourceAsStream);
        final InputStream resourceAsStream2 = this.getClass().getResourceAsStream("/assets/kismancc/shader/fragment/future/" + s + "/" + str + "glsl");
        final int method1708 = this.Method1707(IOUtils.toString(resourceAsStream2, Charset.defaultCharset()), 35632);
        IOUtils.closeQuietly(resourceAsStream2);
        if (method1707 == 0 || method1708 == 0) {
            return;
        }
        this.Field9988 = ARBShaderObjects.glCreateProgramObjectARB();
        if (this.Field9988 == 0) {
            return;
        }
        ARBShaderObjects.glAttachObjectARB(this.Field9988, method1707);
        ARBShaderObjects.glAttachObjectARB(this.Field9988, method1708);
        ARBShaderObjects.glLinkProgramARB(this.Field9988);
        ARBShaderObjects.glValidateProgramARB(this.Field9988);
    }
    
    public void Method1703() {
        GL11.glPushMatrix();
        GL20.glUseProgram(this.Field9988);
        if (this.Field9989 == null) {
            this.Field9989 = new HashMap();
            this.Method1705();
        }
        this.Method1706();
    }
    
    public void Method1704() {
        GL20.glUseProgram(0);
        GL11.glPopMatrix();
    }
    
    public void Method1705() {
    }
    
    public void Method1706() {
    }
    
    public int Method1707(final String s, final int n) {
        final int glCreateShaderObjectARB = ARBShaderObjects.glCreateShaderObjectARB(n);
        if (glCreateShaderObjectARB == 0) {
            return 0;
        }
        ARBShaderObjects.glShaderSourceARB(glCreateShaderObjectARB, (CharSequence)s);
        ARBShaderObjects.glCompileShaderARB(glCreateShaderObjectARB);
        if (ARBShaderObjects.glGetObjectParameteriARB(glCreateShaderObjectARB, 35713) == 0) {
            throw new RuntimeException("Error creating shader: " + this.Method1708(glCreateShaderObjectARB));
        }
        return glCreateShaderObjectARB;
    }
    
    public String Method1708(final int n) {
        return ARBShaderObjects.glGetInfoLogARB(n, ARBShaderObjects.glGetObjectParameteriARB(n, 35716));
    }
    
    public void Method1709(final String s, final int i) {
        this.Field9989.put(s, i);
    }
    
    public void Method1710(final String s) {
        this.Method1709(s, GL20.glGetUniformLocation(this.Field9988, (CharSequence)s));
    }
    
    public int Method1711(final String s) {
        return this.Field9989.get(s);
    }
    
    public int Method1712() {
        return this.Field9988;
    }
    
    private static String Method1713(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x47D0 ^ 0x62));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
