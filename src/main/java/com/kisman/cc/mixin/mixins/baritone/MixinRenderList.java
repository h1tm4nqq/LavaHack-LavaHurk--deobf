//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderList
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package com.kisman.cc.mixin.mixins.baritone;

import baritone.Baritone;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={RenderList.class})
public class MixinRenderList {
    @Redirect(method={"renderChunkLayer"}, at=@At(value="INVOKE", target="net/minecraft/client/renderer/GlStateManager.popMatrix()V"))
    @Redirect(method={"renderChunkLayer"}, at=@At(value="INVOKE", target="net/minecraft/client/renderer/GlStateManager.popMatrix()V"))
    private void Method1966() {
        if (((Boolean)Baritone.settings().renderCachedChunks.value).booleanValue() && !Minecraft.getMinecraft().isSingleplayer()) {
            GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
        }
        GlStateManager.popMatrix();
    }
}

