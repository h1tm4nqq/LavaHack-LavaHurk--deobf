//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import net.minecraft.client.renderer.block.model.*;
import net.minecraft.item.*;
import java.awt.*;
import org.spongepowered.asm.mixin.injection.*;
import net.minecraft.client.renderer.*;
import lavahack.client.*;
import org.spongepowered.asm.mixin.*;

@Mixin(value = { RenderItem.class }, priority = 10)
public class MixinRenderItem
{
    @Shadow
    @Shadow
    private void Method6479(final IBakedModel bakedModel, final int n, final ItemStack itemStack) {
    }
    
    @Shadow
    @Shadow
    private void Method6480(final IBakedModel bakedModel) {
    }
    
    @ModifyArg(method = { "renderEffect" }, at = @At(value = "INVOKE", target = "net/minecraft/client/renderer/RenderItem.renderModel(Lnet/minecraft/client/renderer/block/model/IBakedModel;I)V"), index = 1)
    @ModifyArg(method = { "renderEffect" }, at = @At(value = "INVOKE", target = "net/minecraft/client/renderer/RenderItem.renderModel(Lnet/minecraft/client/renderer/block/model/IBakedModel;I)V"), index = 1)
    private int Method6481(final int rgba) {
        final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E ibonRcQCNUBg2NBpVpVQf61ykmVfU03E = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E(IBONRcQCNUBg2NBpVpVQf61ykmVfU03E.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16489, new Color(rgba, true));
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)ibonRcQCNUBg2NBpVpVQf61ykmVfU03E);
        if (ibonRcQCNUBg2NBpVpVQf61ykmVfU03E.Method159()) {
            return ibonRcQCNUBg2NBpVpVQf61ykmVfU03E.Method5370().getRGB();
        }
        Color method5370 = ibonRcQCNUBg2NBpVpVQf61ykmVfU03E.Method5370();
        if (Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Method35() && Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16662.Method365()) {
            method5370 = new Color(method5370.getRed(), method5370.getGreen(), method5370.getBlue(), Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16663.Method335());
        }
        return method5370.getRGB();
    }
    
    @Overwrite
    @Overwrite
    public void Method6482(final ItemStack itemStack, final IBakedModel bakedModel) {
        if (!itemStack.isEmpty()) {
            GlStateManager.pushMatrix();
            GlStateManager.translate(-0.5f, -0.5f, -0.5f);
            if (bakedModel.isBuiltInRenderer()) {
                if (Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Method35() && Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16662.Method365()) {
                    GlStateManager.color(1.0f, 1.0f, 1.0f, Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16663.Method368() / 255.0f);
                }
                else {
                    GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
                }
                GlStateManager.enableRescaleNormal();
                itemStack.getItem().getTileEntityItemStackRenderer().renderByItem(itemStack);
            }
            else {
                this.Method6479(bakedModel, (Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Method35() && Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16662.Method365()) ? new Color(255, 255, 255, Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16663.Method335()).getRGB() : -1, itemStack);
                if (itemStack.hasEffect() && (!o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Method35() || !o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Field16389.Method365())) {
                    this.Method6480(bakedModel);
                }
            }
            GlStateManager.popMatrix();
        }
    }
}
