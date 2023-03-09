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

public abstract class Class1297 {
    public String Field13927;
    public int Field13928;
    public Map Field13929;
    private String Field13930 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1297(String string) {
        this.Field13927 = string;
        int n = 0;
        int n2 = 0;
        InputStream inputStream = this.getClass().getResourceAsStream("/assets/kismancc/shader/vertex.vert");
        if (inputStream != null) {
            n = this.Method234(IOUtils.toString(inputStream, Charset.defaultCharset()), 35633);
        }
        IOUtils.closeQuietly(inputStream);
        InputStream inputStream2 = this.getClass().getResourceAsStream("/assets/kismancc/shader/fragment/" + string);
        if (inputStream2 != null) {
            n2 = this.Method234(IOUtils.toString(inputStream2, Charset.defaultCharset()), 35632);
        }
        IOUtils.closeQuietly(inputStream2);
    }

    public void Method230() {
        GL11.glPushMatrix();
        GL20.glUseProgram((int)this.Field13928);
        if (this.Field13929 == null) {
            this.Field13929 = new HashMap();
            this.Method232();
        }
        this.Method233();
    }

    public void Method231() {
        GL20.glUseProgram((int)0);
        GL11.glPopMatrix();
    }

    public void Method232() {
    }

    public void Method233() {
    }

    public int Method234(String string, int n) {
        int n2 = 0;
        n2 = ARBShaderObjects.glCreateShaderObjectARB((int)n);
        if (n2 == 0) {
            return 0;
        }
        ARBShaderObjects.glShaderSourceARB((int)n2, (CharSequence)string);
        ARBShaderObjects.glCompileShaderARB((int)n2);
        if (ARBShaderObjects.glGetObjectParameteriARB((int)n2, (int)35713) != 0) return n2;
        throw new RuntimeException("Error creating shader: " + this.Method235(n2));
    }

    public String Method235(int n) {
        return ARBShaderObjects.glGetInfoLogARB((int)n, (int)ARBShaderObjects.glGetObjectParameteriARB((int)n, (int)35716));
    }

    public void Method236(String string, int n) {
        this.Field13929.put(string, n);
    }

    public void Method237(String string) {
        this.Method236(string, GL20.glGetUniformLocation((int)this.Field13928, (CharSequence)string));
    }

    public int Method238(String string) {
        return (Integer)this.Field13929.get(string);
    }

    public int Method239() {
        return this.Field13928;
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 60;
            cArray2[n] = (char)(cArray[n] ^ (0x594 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

