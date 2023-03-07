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
import lavahack.client.eNiq4ZtBradWI9CJnlPSTLjH50L90Apv;
import org.apache.commons.io.IOUtils;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003J\b\u0010\u0018\u001a\u00020\u0016H&J\u0006\u0010\u0019\u001a\u00020\u0016J\u0006\u0010\u001a\u001a\u00020\u0016J\b\u0010\u001b\u001a\u00020\u0016H&R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR-\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\fj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006`\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2={"Lcom/kisman/cc/util/render/shader/framebuffer/Shader;", "", "fragmentShader", "", "(Ljava/lang/String;)V", "program", "", "getProgram", "()I", "setProgram", "(I)V", "uniformsRaw", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getUniformsRaw", "()Ljava/util/HashMap;", "createShader", "source", "type", "getLogInfo", "i", "setupUniform", "", "name", "setupUniforms", "startShader", "stopShader", "updateUniforms", "kisman.cc"})
public abstract class PZpKsR2HT0hxlPYyyQUpMA7nUrgViO7H {
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
        GL20.glUseProgram((int)((int)-82665463L ^ 0xFB12A009));
        GL11.glPopMatrix();
    }

    public abstract void Method917();

    public abstract void Method918();

    private final int Method919(String string, int n) {
        int n2 = (int)-226140333L ^ 0xF2855F53;
        n2 = ARBShaderObjects.glCreateShaderObjectARB((int)n);
        if (n2 == 0) {
            return (int)-1377130914L ^ 0xADEAA65E;
        }
        ARBShaderObjects.glShaderSourceARB((int)n2, (CharSequence)string);
        ARBShaderObjects.glCompileShaderARB((int)n2);
        if (ARBShaderObjects.glGetObjectParameteriARB((int)n2, (int)((int)((long)-1805029743 ^ (long)-1804999408))) != 0) return n2;
        throw (Throwable)new RuntimeException("Error creating shader: " + this.Method920(n2));
    }

    private final String Method920(int n) {
        String string = ARBShaderObjects.glGetInfoLogARB((int)n, (int)ARBShaderObjects.glGetObjectParameteriARB((int)n, (int)((int)((long)791092264 ^ (long)791101129) << 2)));
        Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"ARBShaderObjects.glGetIn\u2026tParameteriARB(i, 35716))");
        return string;
    }

    public final void Method921(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        Map map = this.Field10972;
        Integer n = GL20.glGetUniformLocation((int)this.Field10973, (CharSequence)string);
        int n2 = (int)((long)-1598768592 ^ (long)-1598768592);
        map.put(string, n);
    }

    public PZpKsR2HT0hxlPYyyQUpMA7nUrgViO7H(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"fragmentShader");
        this.Field10972 = new HashMap();
        PZpKsR2HT0hxlPYyyQUpMA7nUrgViO7H pZpKsR2HT0hxlPYyyQUpMA7nUrgViO7H = this;
        int n = (int)2105443401L ^ 0x7D7E8449;
        int n2 = (int)((long)-802186105 ^ (long)-802186105);
        PZpKsR2HT0hxlPYyyQUpMA7nUrgViO7H pZpKsR2HT0hxlPYyyQUpMA7nUrgViO7H2 = pZpKsR2HT0hxlPYyyQUpMA7nUrgViO7H;
        int n3 = (int)((long)1320676678 ^ (long)1320676678);
        int n4 = (int)((long)1138032173 ^ (long)1138032173);
        int n5 = (int)((long)1971754992 ^ (long)1971754992);
        InputStream inputStream = pZpKsR2HT0hxlPYyyQUpMA7nUrgViO7H2.getClass().getResourceAsStream(eNiq4ZtBradWI9CJnlPSTLjH50L90Apv.Method61());
        String string2 = IOUtils.toString(inputStream, Charset.defaultCharset());
        Intrinsics.checkExpressionValueIsNotNull((Object)string2, (String)"IOUtils.toString(vertexS\u2026Charset.defaultCharset())");
        n4 = pZpKsR2HT0hxlPYyyQUpMA7nUrgViO7H2.Method919(string2, (int)130026719L ^ 0x7C087EE);
        IOUtils.closeQuietly(inputStream);
        InputStream inputStream2 = pZpKsR2HT0hxlPYyyQUpMA7nUrgViO7H2.getClass().getResourceAsStream(eNiq4ZtBradWI9CJnlPSTLjH50L90Apv.Method62(string));
        String string3 = IOUtils.toString(inputStream2, Charset.defaultCharset());
        Intrinsics.checkExpressionValueIsNotNull((Object)string3, (String)"IOUtils.toString(fragmen\u2026Charset.defaultCharset())");
        n5 = pZpKsR2HT0hxlPYyyQUpMA7nUrgViO7H2.Method919(string3, (int)((long)-528877352 ^ (long)-528879509) << 4);
        IOUtils.closeQuietly(inputStream2);
        if (n4 == 0) return;
        if (n5 == 0) {
            return;
        }
        pZpKsR2HT0hxlPYyyQUpMA7nUrgViO7H2.Field10973 = ARBShaderObjects.glCreateProgramObjectARB();
        if (pZpKsR2HT0hxlPYyyQUpMA7nUrgViO7H2.Field10973 == 0) {
            return;
        }
        ARBShaderObjects.glAttachObjectARB((int)pZpKsR2HT0hxlPYyyQUpMA7nUrgViO7H2.Field10973, (int)n4);
        ARBShaderObjects.glAttachObjectARB((int)pZpKsR2HT0hxlPYyyQUpMA7nUrgViO7H2.Field10973, (int)n5);
        ARBShaderObjects.glLinkProgramARB((int)pZpKsR2HT0hxlPYyyQUpMA7nUrgViO7H2.Field10973);
        ARBShaderObjects.glValidateProgramARB((int)pZpKsR2HT0hxlPYyyQUpMA7nUrgViO7H2.Field10973);
    }

    private static String Method922(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-380708052L ^ 0xE94EDB2C;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1400868657 ^ (long)1400868814);
            int n2 = ((int)-734525346L ^ 0xD4380861) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)704491001L ^ 0x29FD8D34) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

