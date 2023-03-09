//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E
 *  lavahack.client.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  lavahack.client.Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC
 *  lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  lavahack.client.o9lanP0gHU278cwDFs7XEsyWoBrJVe44
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderItem
 *  net.minecraft.client.renderer.block.model.IBakedModel
 *  net.minecraft.item.ItemStack
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Overwrite
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 */
package com.kisman.cc.mixin.mixins;

import java.awt.Color;
import lavahack.client.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import lavahack.client.Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.o9lanP0gHU278cwDFs7XEsyWoBrJVe44;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(value={RenderItem.class}, priority=10)
public class MixinRenderItem {
    @Shadow
    @Shadow
    private void Method6479(IBakedModel iBakedModel, int n, ItemStack itemStack) {
    }

    @Shadow
    @Shadow
    private void Method6480(IBakedModel iBakedModel) {
    }

    @ModifyArg(method={"renderEffect"}, at=@At(value="INVOKE", target="net/minecraft/client/renderer/RenderItem.renderModel(Lnet/minecraft/client/renderer/block/model/IBakedModel;I)V"), index=1)
    @ModifyArg(method={"renderEffect"}, at=@At(value="INVOKE", target="net/minecraft/client/renderer/RenderItem.renderModel(Lnet/minecraft/client/renderer/block/model/IBakedModel;I)V"), index=1)
    private int Method6481(int n) {
        IBONRcQCNUBg2NBpVpVQf61ykmVfU03E iBONRcQCNUBg2NBpVpVQf61ykmVfU03E = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E(IBONRcQCNUBg2NBpVpVQf61ykmVfU03E.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16489, new Color(n, true));
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)iBONRcQCNUBg2NBpVpVQf61ykmVfU03E);
        if (iBONRcQCNUBg2NBpVpVQf61ykmVfU03E.Method159()) {
            return iBONRcQCNUBg2NBpVpVQf61ykmVfU03E.Method5370().getRGB();
        }
        Color color = iBONRcQCNUBg2NBpVpVQf61ykmVfU03E.Method5370();
        if (!Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Method35()) return color.getRGB();
        if (!Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16662.Method365()) return color.getRGB();
        color = new Color(color.getRed(), color.getGreen(), color.getBlue(), Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16663.Method335());
        return color.getRGB();
    }

    @Overwrite
    @Overwrite
    public void Method6482(ItemStack itemStack, IBakedModel iBakedModel) {
        if (itemStack.isEmpty()) return;
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)-0.5f, (float)-0.5f, (float)-0.5f);
        if (iBakedModel.isBuiltInRenderer()) {
            if (Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Method35() && Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16662.Method365()) {
                GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)(Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16663.Method368() / 255.0f));
            } else {
                GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            }
            GlStateManager.enableRescaleNormal();
            itemStack.getItem().getTileEntityItemStackRenderer().renderByItem(itemStack);
        } else {
            this.Method6479(iBakedModel, Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Method35() && Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16662.Method365() ? new Color(255, 255, 255, Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16663.Method335()).getRGB() : -1, itemStack);
            if (!(!itemStack.hasEffect() || o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Method35() && o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Field16389.Method365())) {
                this.Method6480(iBakedModel);
            }
        }
        GlStateManager.popMatrix();
    }
}

