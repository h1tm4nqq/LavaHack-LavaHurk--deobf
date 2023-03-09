/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.lwjgl.opengl.ARBShaderObjects
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class3;
import org.apache.commons.io.IOUtils;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003J\b\u0010\u0018\u001a\u00020\u0016H&J\u0006\u0010\u0019\u001a\u00020\u0016J\u0006\u0010\u001a\u001a\u00020\u0016J\b\u0010\u001b\u001a\u00020\u0016H&R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR-\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\fj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006`\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2={"Lcom/kisman/cc/util/render/shader/framebuffer/Shader;", "", "fragmentShader", "", "(Ljava/lang/String;)V", "program", "", "getProgram", "()I", "setProgram", "(I)V", "uniformsRaw", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getUniformsRaw", "()Ljava/util/HashMap;", "createShader", "source", "type", "getLogInfo", "i", "setupUniform", "", "name", "setupUniforms", "startShader", "stopShader", "updateUniforms", "kisman.cc"})
public abstract class Class701 {
    @NotNull
    private final HashMap Field10972;
    private int Field10973;
    private String Field10974 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final HashMap Method912() {
        return this.Field10972;
    }

    public final int Method913() {
        return this.Field10973;
    }

    public final void Method914(int n) {
        this.Field10973 = n;
    }

    public final void Method915() {
        GL11.glPushMatrix();
        GL20.glUseProgram((int)this.Field10973);
        this.Field10972.clear();
        this.Method917();
        this.Method918();
    }

    public final void Method916() {
        GL20.glUseProgram((int)0);
        GL11.glPopMatrix();
    }

    public abstract void Method917();

    public abstract void Method918();

    private final int Method919(String string, int n) {
        int n2 = 0;
        n2 = ARBShaderObjects.glCreateShaderObjectARB((int)n);
        if (n2 == 0) {
            return 0;
        }
        ARBShaderObjects.glShaderSourceARB((int)n2, (CharSequence)string);
        ARBShaderObjects.glCompileShaderARB((int)n2);
        if (ARBShaderObjects.glGetObjectParameteriARB((int)n2, (int)35713) != 0) return n2;
        throw (Throwable)new RuntimeException("Error creating shader: " + this.Method920(n2));
    }

    private final String Method920(int n) {
        String string = ARBShaderObjects.glGetInfoLogARB((int)n, (int)ARBShaderObjects.glGetObjectParameteriARB((int)n, (int)35716));
        Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"ARBShaderObjects.glGetIn\u2026tParameteriARB(i, 35716))");
        return string;
    }

    public final void Method921(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        Map map = this.Field10972;
        Integer n = GL20.glGetUniformLocation((int)this.Field10973, (CharSequence)string);
        boolean bl = false;
        map.put(string, n);
    }

    public Class701(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"fragmentShader");
        this.Field10972 = new HashMap();
        Class701 class701 = this;
        boolean bl = false;
        boolean bl2 = false;
        Class701 class7012 = class701;
        boolean bl3 = false;
        int n = 0;
        int n2 = 0;
        InputStream inputStream = class7012.getClass().getResourceAsStream(Class3.Method61());
        String string2 = IOUtils.toString(inputStream, Charset.defaultCharset());
        Intrinsics.checkExpressionValueIsNotNull((Object)string2, (String)"IOUtils.toString(vertexS\u2026Charset.defaultCharset())");
        n = class7012.Method919(string2, 35633);
        IOUtils.closeQuietly(inputStream);
        InputStream inputStream2 = class7012.getClass().getResourceAsStream(Class3.Method62(string));
        String string3 = IOUtils.toString(inputStream2, Charset.defaultCharset());
        Intrinsics.checkExpressionValueIsNotNull((Object)string3, (String)"IOUtils.toString(fragmen\u2026Charset.defaultCharset())");
        n2 = class7012.Method919(string3, 35632);
        IOUtils.closeQuietly(inputStream2);
        if (n == 0) return;
        if (n2 == 0) {
            return;
        }
        class7012.Field10973 = ARBShaderObjects.glCreateProgramObjectARB();
        if (class7012.Field10973 == 0) {
            return;
        }
        ARBShaderObjects.glAttachObjectARB((int)class7012.Field10973, (int)n);
        ARBShaderObjects.glAttachObjectARB((int)class7012.Field10973, (int)n2);
        ARBShaderObjects.glLinkProgramARB((int)class7012.Field10973);
        ARBShaderObjects.glValidateProgramARB((int)class7012.Field10973);
    }

    private static String Method922(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 252;
            cArray2[n] = (char)(cArray[n] ^ (0x419A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

