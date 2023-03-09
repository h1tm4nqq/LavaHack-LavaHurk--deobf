//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.renderer.texture.TextureManager
 *  net.minecraft.client.resources.IResourceManager
 *  net.minecraft.client.shader.Framebuffer
 *  net.minecraft.client.shader.ShaderGroup
 *  net.minecraft.client.shader.ShaderLinkHelper
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.client.shader.ShaderLinkHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0019"}, d2={"Lcom/kisman/cc/features/module/render/shader/shaders/troll/ShaderHelper;", "", "shaderIn", "Lnet/minecraft/util/ResourceLocation;", "(Lnet/minecraft/util/ResourceLocation;)V", "frameBuffersInitialized", "", "mc", "Lnet/minecraft/client/Minecraft;", "kotlin.jvm.PlatformType", "oldHeight", "", "oldWidth", "shader", "Lnet/minecraft/client/shader/ShaderGroup;", "getShader", "()Lnet/minecraft/client/shader/ShaderGroup;", "getFrameBuffer", "Lnet/minecraft/client/shader/Framebuffer;", "name", "", "onTick", "", "event", "Lnet/minecraftforge/fml/common/gameevent/TickEvent$ClientTickEvent;", "kisman.cc"})
public final class Class851 {
    private final Minecraft Field11594;
    private int Field11595;
    private int Field11596;
    @Nullable
    private final ShaderGroup Field11597;
    private boolean Field11598;
    private int Field11599;

    @Nullable
    @Nullable
    public final ShaderGroup Method3587() {
        return this.Field11597;
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method3588(@NotNull @NotNull TickEvent.ClientTickEvent clientTickEvent) {
        Intrinsics.checkParameterIsNotNull((Object)clientTickEvent, (String)"event");
        if (!this.Field11598) {
            ShaderGroup shaderGroup = this.Field11597;
            if (shaderGroup != null) {
                shaderGroup.createBindFramebuffers(this.Field11594.displayWidth, this.Field11594.displayHeight);
            }
            this.Field11598 = true;
        }
        if (this.Field11595 == this.Field11594.displayWidth) {
            if (this.Field11596 == this.Field11594.displayHeight) return;
        }
        this.Field11595 = this.Field11594.displayWidth;
        this.Field11596 = this.Field11594.displayHeight;
        ShaderGroup shaderGroup = this.Field11597;
        if (shaderGroup == null) return;
        shaderGroup.createBindFramebuffers(this.Field11594.displayWidth, this.Field11594.displayHeight);
    }

    @Nullable
    @Nullable
    public final Framebuffer Method3589(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        ShaderGroup shaderGroup = this.Field11597;
        if (shaderGroup == null) return null;
        Framebuffer framebuffer = shaderGroup.getFramebufferRaw(string);
        return framebuffer;
    }

    public Class851(@NotNull @NotNull ResourceLocation resourceLocation) {
        ShaderGroup shaderGroup;
        Class851 class851;
        Intrinsics.checkParameterIsNotNull((Object)resourceLocation, (String)"shaderIn");
        this.Field11594 = Minecraft.getMinecraft();
        this.Field11595 = -1;
        this.Field11596 = -1;
        Class851 class8512 = this;
        if (!OpenGlHelper.shadersSupported) {
            String string = "Shaders are unsupported by OpenGL!";
            Class851 class8513 = class8512;
            boolean bl = false;
            System.out.println((Object)string);
            class851 = class8513;
            shaderGroup = null;
        } else {
            Class851 class8514 = class8512;
            ShaderLinkHelper.setNewStaticShaderLinkHelper();
            Minecraft minecraft = this.Field11594;
            Intrinsics.checkExpressionValueIsNotNull((Object)minecraft, (String)"mc");
            TextureManager textureManager = minecraft.getTextureManager();
            Minecraft minecraft2 = this.Field11594;
            Intrinsics.checkExpressionValueIsNotNull((Object)minecraft2, (String)"mc");
            IResourceManager iResourceManager = minecraft2.getResourceManager();
            Minecraft minecraft3 = this.Field11594;
            Intrinsics.checkExpressionValueIsNotNull((Object)minecraft3, (String)"mc");
            ShaderGroup shaderGroup2 = new ShaderGroup(textureManager, iResourceManager, minecraft3.getFramebuffer(), resourceLocation);
            Class851 class8515 = class8514;
            boolean bl = false;
            boolean bl2 = false;
            ShaderGroup shaderGroup3 = shaderGroup2;
            boolean bl3 = false;
            shaderGroup3.createBindFramebuffers(this.Field11594.displayWidth, this.Field11594.displayHeight);
            ShaderGroup shaderGroup4 = shaderGroup2;
            class851 = class8515;
            shaderGroup = shaderGroup2 = shaderGroup4;
        }
        class851.Field11597 = shaderGroup;
        MinecraftForge.EVENT_BUS.register((Object)this);
    }

    private static String Method3590(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 221;
            cArray2[n] = (char)(cArray[n] ^ (0x29E7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

