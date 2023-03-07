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

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.AYUeccr5wExGiEMVsRSJEFx8ctb05ddX;
import lavahack.client.r9fG9ZGbXYsW6DIG4SutGSSTHl3vlPBv;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.shader.Framebuffer;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u00a8\u0006\b"}, d2={"Lcom/kisman/cc/util/minecraft/EntityRendererUtil;", "", "()V", "load", "", "name", "", "shader", "kisman.cc"})
public final class zkRHxqWdljarNs4obH7wh2MOhqncb3In {
    public static final zkRHxqWdljarNs4obH7wh2MOhqncb3In Field16041;
    private int Field16042;

    public final void Method6681(@NotNull @NotNull String string, @NotNull @NotNull String string2) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"shader");
        EntityRenderer entityRenderer = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.entityRenderer;
        Minecraft minecraft = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803;
        Intrinsics.checkExpressionValueIsNotNull((Object)minecraft, (String)"mc");
        TextureManager textureManager = minecraft.getTextureManager();
        Intrinsics.checkExpressionValueIsNotNull((Object)textureManager, (String)"mc.textureManager");
        IResourceManager iResourceManager = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.entityRenderer.resourceManager;
        Intrinsics.checkExpressionValueIsNotNull((Object)iResourceManager, (String)"mc.entityRenderer.resourceManager");
        Minecraft minecraft2 = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803;
        Intrinsics.checkExpressionValueIsNotNull((Object)minecraft2, (String)"mc");
        Framebuffer framebuffer = minecraft2.getFramebuffer();
        Intrinsics.checkExpressionValueIsNotNull((Object)framebuffer, (String)"mc.framebuffer");
        entityRenderer.shaderGroup = new r9fG9ZGbXYsW6DIG4SutGSSTHl3vlPBv(textureManager, iResourceManager, framebuffer, new AYUeccr5wExGiEMVsRSJEFx8ctb05ddX(string, string2));
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.entityRenderer.shaderGroup.createBindFramebuffers(Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.displayWidth, Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.displayHeight);
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.entityRenderer.useShader = (int)-1495641958L ^ 0xA6DA509B;
    }

    private zkRHxqWdljarNs4obH7wh2MOhqncb3In() {
    }

    static {
        zkRHxqWdljarNs4obH7wh2MOhqncb3In zkRHxqWdljarNs4obH7wh2MOhqncb3In2;
        Field16041 = zkRHxqWdljarNs4obH7wh2MOhqncb3In2 = new zkRHxqWdljarNs4obH7wh2MOhqncb3In();
    }

    private static String Method6682(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)577833790L ^ 0x22710B3E;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)468717844L ^ 0x1BF011EB);
            int n2 = (int)93954459L ^ 0x599A180;
            cArray2[n] = (char)(cArray[n] ^ (((int)34879715L ^ 0x2143C00) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

