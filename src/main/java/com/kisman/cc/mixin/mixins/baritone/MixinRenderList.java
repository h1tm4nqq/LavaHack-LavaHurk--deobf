//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.baritone;

import org.spongepowered.asm.mixin.*;
import baritone.*;
import net.minecraft.client.*;
import net.minecraft.client.renderer.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ RenderList.class })
public class MixinRenderList
{
    @Redirect(method = { "renderChunkLayer" }, at = @At(value = "INVOKE", target = "net/minecraft/client/renderer/GlStateManager.popMatrix()V"))
    @Redirect(method = { "renderChunkLayer" }, at = @At(value = "INVOKE", target = "net/minecraft/client/renderer/GlStateManager.popMatrix()V"))
    private void Method1966() {
        if ((boolean)Baritone.settings().renderCachedChunks.value && !Minecraft.getMinecraft().isSingleplayer()) {
            GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        }
        GlStateManager.popMatrix();
    }
}
