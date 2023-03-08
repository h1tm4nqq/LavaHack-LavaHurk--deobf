//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import java.util.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.*;
import kotlin.jvm.internal.*;
import java.nio.charset.*;
import org.apache.commons.io.*;
import java.io.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003J\b\u0010\u0018\u001a\u00020\u0016H&J\u0006\u0010\u0019\u001a\u00020\u0016J\u0006\u0010\u001a\u001a\u00020\u0016J\b\u0010\u001b\u001a\u00020\u0016H&R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR-\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\fj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006`\r?\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f?\u0006\u001c" }, d2 = { "Lcom/kisman/cc/util/render/shader/framebuffer/Shader;", "", "fragmentShader", "", "(Ljava/lang/String;)V", "program", "", "getProgram", "()I", "setProgram", "(I)V", "uniformsRaw", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getUniformsRaw", "()Ljava/util/HashMap;", "createShader", "source", "type", "getLogInfo", "i", "setupUniform", "", "name", "setupUniforms", "startShader", "stopShader", "updateUniforms", "kisman.cc" })
public abstract class Class701
{
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
    
    public final void Method914(final int field10973) {
        this.Field10973 = field10973;
    }
    
    public final void Method915() {
        GL11.glPushMatrix();
        GL20.glUseProgram(this.Field10973);
        this.Field10972.clear();
        this.Method917();
        this.Method918();
    }
    
    public final void Method916() {
        GL20.glUseProgram(0);
        GL11.glPopMatrix();
    }
    
    public abstract void Method917();
    
    public abstract void Method918();
    
    private final int Method919(final String s, final int n) {
        final int glCreateShaderObjectARB = ARBShaderObjects.glCreateShaderObjectARB(n);
        if (glCreateShaderObjectARB == 0) {
            return 0;
        }
        ARBShaderObjects.glShaderSourceARB(glCreateShaderObjectARB, (CharSequence)s);
        ARBShaderObjects.glCompileShaderARB(glCreateShaderObjectARB);
        if (ARBShaderObjects.glGetObjectParameteriARB(glCreateShaderObjectARB, 35713) == 0) {
            throw new RuntimeException("Error creating shader: " + this.Method920(glCreateShaderObjectARB));
        }
        return glCreateShaderObjectARB;
    }
    
    private final String Method920(final int n) {
        final String glGetInfoLogARB = ARBShaderObjects.glGetInfoLogARB(n, ARBShaderObjects.glGetObjectParameteriARB(n, 35716));
        Intrinsics.checkExpressionValueIsNotNull((Object)glGetInfoLogARB, "ARBShaderObjects.glGetIn\u2026tParameteriARB(i, 35716))");
        return glGetInfoLogARB;
    }
    
    public final void Method921(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "name");
        this.Field10972.put(s, GL20.glGetUniformLocation(this.Field10973, (CharSequence)s));
    }
    
    public Class701(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "fragmentShader");
        this.Field10972 = new HashMap();
        final Class701 class701 = this;
        final InputStream resourceAsStream = class701.getClass().getResourceAsStream(Class3.Method61());
        final Class701 class702 = class701;
        final String string = IOUtils.toString(resourceAsStream, Charset.defaultCharset());
        Intrinsics.checkExpressionValueIsNotNull((Object)string, "IOUtils.toString(vertexS\u2026Charset.defaultCharset())");
        final int method919 = class702.Method919(string, 35633);
        IOUtils.closeQuietly(resourceAsStream);
        final InputStream resourceAsStream2 = class701.getClass().getResourceAsStream(Class3.Method62(s));
        final Class701 class703 = class701;
        final String string2 = IOUtils.toString(resourceAsStream2, Charset.defaultCharset());
        Intrinsics.checkExpressionValueIsNotNull((Object)string2, "IOUtils.toString(fragmen\u2026Charset.defaultCharset())");
        final int method920 = class703.Method919(string2, 35632);
        IOUtils.closeQuietly(resourceAsStream2);
        if (method919 != 0 && method920 != 0) {
            class701.Field10973 = ARBShaderObjects.glCreateProgramObjectARB();
            if (class701.Field10973 != 0) {
                ARBShaderObjects.glAttachObjectARB(class701.Field10973, method919);
                ARBShaderObjects.glAttachObjectARB(class701.Field10973, method920);
                ARBShaderObjects.glLinkProgramARB(class701.Field10973);
                ARBShaderObjects.glValidateProgramARB(class701.Field10973);
            }
        }
    }
    
    private static String Method922(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x419A ^ 0xFC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
