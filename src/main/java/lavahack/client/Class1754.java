//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.EntityRenderer
 *  net.minecraft.client.renderer.texture.TextureManager
 *  net.minecraft.client.resources.IResourceManager
 *  net.minecraft.client.shader.Framebuffer
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1465;
import lavahack.client.Class634;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.shader.Framebuffer;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u00a8\u0006\b"}, d2={"Lcom/kisman/cc/util/minecraft/EntityRendererUtil;", "", "()V", "load", "", "name", "", "shader", "kisman.cc"})
public final class Class1754 {
    public static final Class1754 Field16041;
    private int Field16042;

    public final void Method6681(@NotNull @NotNull String string, @NotNull @NotNull String string2) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"shader");
        EntityRenderer entityRenderer = Class2142.Field17803.entityRenderer;
        Minecraft minecraft = Class2142.Field17803;
        Intrinsics.checkExpressionValueIsNotNull((Object)minecraft, (String)"mc");
        TextureManager textureManager = minecraft.getTextureManager();
        Intrinsics.checkExpressionValueIsNotNull((Object)textureManager, (String)"mc.textureManager");
        IResourceManager iResourceManager = Class2142.Field17803.entityRenderer.resourceManager;
        Intrinsics.checkExpressionValueIsNotNull((Object)iResourceManager, (String)"mc.entityRenderer.resourceManager");
        Minecraft minecraft2 = Class2142.Field17803;
        Intrinsics.checkExpressionValueIsNotNull((Object)minecraft2, (String)"mc");
        Framebuffer framebuffer = minecraft2.getFramebuffer();
        Intrinsics.checkExpressionValueIsNotNull((Object)framebuffer, (String)"mc.framebuffer");
        entityRenderer.shaderGroup = new Class634(textureManager, iResourceManager, framebuffer, new Class1465(string, string2));
        Class2142.Field17803.entityRenderer.shaderGroup.createBindFramebuffers(Class2142.Field17803.displayWidth, Class2142.Field17803.displayHeight);
        Class2142.Field17803.entityRenderer.useShader = true;
    }

    private Class1754() {
    }

    static {
        Class1754 class1754;
        Field16041 = class1754 = new Class1754();
    }

    private static String Method6682(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 27;
            cArray2[n] = (char)(cArray[n] ^ (0x138C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

