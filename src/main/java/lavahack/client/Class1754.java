//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import com.kisman.cc.util.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.*;
import net.minecraft.client.renderer.texture.*;
import net.minecraft.client.resources.*;
import net.minecraft.client.shader.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006?\u0006\b" }, d2 = { "Lcom/kisman/cc/util/minecraft/EntityRendererUtil;", "", "()V", "load", "", "name", "", "shader", "kisman.cc" })
public final class Class1754
{
    public static final Class1754 Field16041;
    private int Field16042;
    
    public final void Method6681(@NotNull @NotNull final String s, @NotNull @NotNull final String s2) {
        Intrinsics.checkParameterIsNotNull((Object)s, "name");
        Intrinsics.checkParameterIsNotNull((Object)s2, "shader");
        final EntityRenderer entityRenderer = Class2142.Field17803.entityRenderer;
        final Minecraft field17803 = Class2142.Field17803;
        Intrinsics.checkExpressionValueIsNotNull((Object)field17803, "mc");
        final TextureManager getTextureManager = field17803.getTextureManager();
        Intrinsics.checkExpressionValueIsNotNull((Object)getTextureManager, "mc.textureManager");
        final IResourceManager resourceManager = Class2142.Field17803.entityRenderer.resourceManager;
        Intrinsics.checkExpressionValueIsNotNull((Object)resourceManager, "mc.entityRenderer.resourceManager");
        final Minecraft field17804 = Class2142.Field17803;
        Intrinsics.checkExpressionValueIsNotNull((Object)field17804, "mc");
        final Framebuffer getFramebuffer = field17804.getFramebuffer();
        Intrinsics.checkExpressionValueIsNotNull((Object)getFramebuffer, "mc.framebuffer");
        entityRenderer.shaderGroup = new Class634(getTextureManager, resourceManager, getFramebuffer, (ResourceLocation)new Class1465(s, s2));
        Class2142.Field17803.entityRenderer.shaderGroup.createBindFramebuffers(Class2142.Field17803.displayWidth, Class2142.Field17803.displayHeight);
        Class2142.Field17803.entityRenderer.useShader = true;
    }
    
    private Class1754() {
    }
    
    static {
        Field16041 = new Class1754();
    }
    
    private static String Method6682(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x138C ^ 0x1B));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
