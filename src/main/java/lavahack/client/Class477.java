/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBShaderObjects
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public abstract class Class477 {
    public int Field9988;
    public Map Field9989;
    private int Field9990;

    public Class477(String string, String string2) {
        InputStream inputStream = this.getClass().getResourceAsStream("/assets/kismancc/shader/fragment/future/" + string2 + "/vertex.glsl");
        int n = this.Method1707(IOUtils.toString(inputStream, Charset.defaultCharset()), 35633);
        IOUtils.closeQuietly(inputStream);
        InputStream inputStream2 = this.getClass().getResourceAsStream("/assets/kismancc/shader/fragment/future/" + string2 + "/" + string + "glsl");
        int n2 = this.Method1707(IOUtils.toString(inputStream2, Charset.defaultCharset()), 35632);
        IOUtils.closeQuietly(inputStream2);
        if (n == 0) return;
        if (n2 == 0) {
            return;
        }
        this.Field9988 = ARBShaderObjects.glCreateProgramObjectARB();
        if (this.Field9988 == 0) {
            return;
        }
        ARBShaderObjects.glAttachObjectARB((int)this.Field9988, (int)n);
        ARBShaderObjects.glAttachObjectARB((int)this.Field9988, (int)n2);
        ARBShaderObjects.glLinkProgramARB((int)this.Field9988);
        ARBShaderObjects.glValidateProgramARB((int)this.Field9988);
    }

    public void Method1703() {
        GL11.glPushMatrix();
        GL20.glUseProgram((int)this.Field9988);
        if (this.Field9989 == null) {
            this.Field9989 = new HashMap();
            this.Method1705();
        }
        this.Method1706();
    }

    public void Method1704() {
        GL20.glUseProgram((int)0);
        GL11.glPopMatrix();
    }

    public void Method1705() {
    }

    public void Method1706() {
    }

    public int Method1707(String string, int n) {
        int n2 = 0;
        n2 = ARBShaderObjects.glCreateShaderObjectARB((int)n);
        if (n2 == 0) {
            return 0;
        }
        ARBShaderObjects.glShaderSourceARB((int)n2, (CharSequence)string);
        ARBShaderObjects.glCompileShaderARB((int)n2);
        if (ARBShaderObjects.glGetObjectParameteriARB((int)n2, (int)35713) != 0) return n2;
        throw new RuntimeException("Error creating shader: " + this.Method1708(n2));
    }

    public String Method1708(int n) {
        return ARBShaderObjects.glGetInfoLogARB((int)n, (int)ARBShaderObjects.glGetObjectParameteriARB((int)n, (int)35716));
    }

    public void Method1709(String string, int n) {
        this.Field9989.put(string, n);
    }

    public void Method1710(String string) {
        this.Method1709(string, GL20.glGetUniformLocation((int)this.Field9988, (CharSequence)string));
    }

    public int Method1711(String string) {
        return (Integer)this.Field9989.get(string);
    }

    public int Method1712() {
        return this.Field9988;
    }

    private static String Method1713(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 98;
            cArray2[n] = (char)(cArray[n] ^ (0x47D0 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

