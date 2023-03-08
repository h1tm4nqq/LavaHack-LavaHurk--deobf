//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.client.*;
import net.minecraftforge.fml.common.gameevent.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.shader.*;
import net.minecraftforge.common.*;
import net.minecraft.client.renderer.texture.*;
import net.minecraft.client.resources.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e?\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010?\u0006\u0019" }, d2 = { "Lcom/kisman/cc/features/module/render/shader/shaders/troll/ShaderHelper;", "", "shaderIn", "Lnet/minecraft/util/ResourceLocation;", "(Lnet/minecraft/util/ResourceLocation;)V", "frameBuffersInitialized", "", "mc", "Lnet/minecraft/client/Minecraft;", "kotlin.jvm.PlatformType", "oldHeight", "", "oldWidth", "shader", "Lnet/minecraft/client/shader/ShaderGroup;", "getShader", "()Lnet/minecraft/client/shader/ShaderGroup;", "getFrameBuffer", "Lnet/minecraft/client/shader/Framebuffer;", "name", "", "onTick", "", "event", "Lnet/minecraftforge/fml/common/gameevent/TickEvent$ClientTickEvent;", "kisman.cc" })
public final class Class851
{
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
    public final void Method3588(@NotNull @NotNull final TickEvent$ClientTickEvent tickEvent$ClientTickEvent) {
        Intrinsics.checkParameterIsNotNull((Object)tickEvent$ClientTickEvent, "event");
        if (!this.Field11598) {
            final ShaderGroup field11597 = this.Field11597;
            if (field11597 != null) {
                field11597.createBindFramebuffers(this.Field11594.displayWidth, this.Field11594.displayHeight);
            }
            this.Field11598 = true;
        }
        if (this.Field11595 != this.Field11594.displayWidth || this.Field11596 != this.Field11594.displayHeight) {
            this.Field11595 = this.Field11594.displayWidth;
            this.Field11596 = this.Field11594.displayHeight;
            final ShaderGroup field11598 = this.Field11597;
            if (field11598 != null) {
                field11598.createBindFramebuffers(this.Field11594.displayWidth, this.Field11594.displayHeight);
            }
        }
    }
    
    @Nullable
    @Nullable
    public final Framebuffer Method3589(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "name");
        final ShaderGroup field11597 = this.Field11597;
        return (field11597 != null) ? field11597.getFramebufferRaw(s) : null;
    }
    
    public Class851(@NotNull @NotNull final ResourceLocation resourceLocation) {
        Intrinsics.checkParameterIsNotNull((Object)resourceLocation, "shaderIn");
        this.Field11594 = Minecraft.getMinecraft();
        this.Field11595 = -1;
        this.Field11596 = -1;
        Class851 class851;
        ShaderGroup field11597;
        if (!OpenGlHelper.shadersSupported) {
            System.out.println((Object)"Shaders are unsupported by OpenGL!");
            class851 = this;
            field11597 = null;
        }
        else {
            ShaderLinkHelper.setNewStaticShaderLinkHelper();
            final Minecraft field11598 = this.Field11594;
            Intrinsics.checkExpressionValueIsNotNull((Object)field11598, "mc");
            final TextureManager getTextureManager = field11598.getTextureManager();
            final Minecraft field11599 = this.Field11594;
            Intrinsics.checkExpressionValueIsNotNull((Object)field11599, "mc");
            final IResourceManager getResourceManager = field11599.getResourceManager();
            final Minecraft field11600 = this.Field11594;
            Intrinsics.checkExpressionValueIsNotNull((Object)field11600, "mc");
            final ShaderGroup shaderGroup = new ShaderGroup(getTextureManager, getResourceManager, field11600.getFramebuffer(), resourceLocation);
            shaderGroup.createBindFramebuffers(this.Field11594.displayWidth, this.Field11594.displayHeight);
            final ShaderGroup shaderGroup2 = shaderGroup;
            class851 = this;
            field11597 = shaderGroup2;
        }
        class851.Field11597 = field11597;
        MinecraftForge.EVENT_BUS.register((Object)this);
    }
    
    private static String Method3590(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x29E7 ^ 0xDD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
