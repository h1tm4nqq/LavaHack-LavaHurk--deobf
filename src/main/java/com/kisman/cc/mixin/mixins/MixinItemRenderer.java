//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.AbstractClientPlayer
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.ItemRenderer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.EnumHandSide
 *  net.minecraft.util.math.Vec3d
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins;

import lavahack.client.DWxN8wLIsLoeYiSaIuBiecHxwmChdruN;
import lavahack.client.PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb;
import lavahack.client.Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC;
import lavahack.client.W3C0y9394VvVcZKAtDfQSnqXm5zLQGty;
import lavahack.client.hzQA3yG8TeYiDewILAcxASyNr4KHoVTE;
import lavahack.client.iOlyf0qO2tpkluftbdahtmamFIPIkMNS;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.o9lanP0gHU278cwDFs7XEsyWoBrJVe44;
import lavahack.client.wwYgDO2V7OXSf7BO4xcQhTyAzx7Aw7Ux;
import lavahack.client.xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={ItemRenderer.class}, priority=10000)
public class MixinItemRenderer {
    @Shadow
    @Final
    public Minecraft Field17071;
    private float Field17072 = 0.0f;
    private boolean Field17073 = true;

    @Shadow
    @Shadow
    public void Method7292(AbstractClientPlayer abstractClientPlayer, float f, float f2, EnumHand enumHand, float f3, ItemStack itemStack, float f4) {
    }

    @Inject(method={"rotateArm"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"rotateArm"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method7293(float f, CallbackInfo callbackInfo) {
        if (!o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Method35()) return;
        if (!o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Field16391.Method365()) return;
        callbackInfo.cancel();
    }

    @Inject(method={"renderItemInFirstPerson(Lnet/minecraft/client/entity/AbstractClientPlayer;FFLnet/minecraft/util/EnumHand;FLnet/minecraft/item/ItemStack;F)V"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"renderItemInFirstPerson(Lnet/minecraft/client/entity/AbstractClientPlayer;FFLnet/minecraft/util/EnumHand;FLnet/minecraft/item/ItemStack;F)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method7294(AbstractClientPlayer abstractClientPlayer, float f, float f2, EnumHand enumHand, float f3, ItemStack itemStack, float f4, CallbackInfo callbackInfo) {
        float f5;
        float f6;
        if (!this.Field17073) return;
        if (!hzQA3yG8TeYiDewILAcxASyNr4KHoVTE.Field17421.Method35()) {
            return;
        }
        if (itemStack.isEmpty) {
            return;
        }
        callbackInfo.cancel();
        this.Field17073 = false;
        if (enumHand == EnumHand.MAIN_HAND) {
            f6 = hzQA3yG8TeYiDewILAcxASyNr4KHoVTE.Field17421.Field17417.Method368();
            f5 = hzQA3yG8TeYiDewILAcxASyNr4KHoVTE.Field17421.Field17418.Method368();
        } else {
            f6 = hzQA3yG8TeYiDewILAcxASyNr4KHoVTE.Field17421.Field17419.Method368();
            f5 = hzQA3yG8TeYiDewILAcxASyNr4KHoVTE.Field17421.Field17420.Method368();
        }
        this.Method7292(abstractClientPlayer, f, f2, enumHand, f3 + f6, itemStack, f4 + f5);
        this.Field17073 = true;
    }

    @Inject(method={"renderItemInFirstPerson(Lnet/minecraft/client/entity/AbstractClientPlayer;FFLnet/minecraft/util/EnumHand;FLnet/minecraft/item/ItemStack;F)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/renderer/GlStateManager;pushMatrix()V", shift=At.Shift.AFTER)})
    @Inject(method={"renderItemInFirstPerson(Lnet/minecraft/client/entity/AbstractClientPlayer;FFLnet/minecraft/util/EnumHand;FLnet/minecraft/item/ItemStack;F)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/renderer/GlStateManager;pushMatrix()V", shift=At.Shift.AFTER)})
    private void Method7295(AbstractClientPlayer abstractClientPlayer, float f, float f2, EnumHand enumHand, float f3, ItemStack itemStack, float f4, CallbackInfo callbackInfo) {
        if (Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Method35() && Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16643.Method365()) {
            Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Method6972(enumHand.equals((Object)EnumHand.MAIN_HAND) ? abstractClientPlayer.getPrimaryHand() : abstractClientPlayer.getPrimaryHand().opposite());
        }
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(new DWxN8wLIsLoeYiSaIuBiecHxwmChdruN(enumHand.equals((Object)EnumHand.MAIN_HAND) ? abstractClientPlayer.getPrimaryHand() : abstractClientPlayer.getPrimaryHand().opposite(), f3));
        this.Field17072 = f3;
    }

    /*
     * Unable to fully structure code
     */
    @Redirect(method={"renderItemInFirstPerson(Lnet/minecraft/client/entity/AbstractClientPlayer;FFLnet/minecraft/util/EnumHand;FLnet/minecraft/item/ItemStack;F)V"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/renderer/ItemRenderer;transformSideFirstPerson(Lnet/minecraft/util/EnumHandSide;F)V"))
    @Redirect(method={"renderItemInFirstPerson(Lnet/minecraft/client/entity/AbstractClientPlayer;FFLnet/minecraft/util/EnumHand;FLnet/minecraft/item/ItemStack;F)V"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/renderer/ItemRenderer;transformSideFirstPerson(Lnet/minecraft/util/EnumHandSide;F)V"))
    public void Method7296(ItemRenderer var1_1, EnumHandSide var2_2, float var3_3) {
        block9: {
            var4_4 = new Vec3d((double)(var2_2 == EnumHandSide.RIGHT ? 1 : -1) * 0.56, -0.52 + (double)var3_3 * -0.6, -0.72);
            var5_5 = new Vec3d(0.0, 0.0, 0.0);
            var6_6 = new Vec3d(1.0, 1.0, 1.0);
            var7_7 = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6653();
            v0 = this;
            v1 = var8_8 = null.player.swingProgress > 0.0f && wwYgDO2V7OXSf7BO4xcQhTyAzx7Aw7Ux.Field12194.Method35() != false && wwYgDO2V7OXSf7BO4xcQhTyAzx7Aw7Ux.Field12194.Field12195.Method359().equalsIgnoreCase("Strong") != false;
            if (!wwYgDO2V7OXSf7BO4xcQhTyAzx7Aw7Ux.Field12194.Field12199.Method365() || !leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Method1162("KillAuraRewrite").Method35()) ** GOTO lbl-1000
            if (iOlyf0qO2tpkluftbdahtmamFIPIkMNS.Field13362.Method5349() != null) break block9;
            ** GOTO lbl-1000
        }
        if (!(var2_2 != EnumHandSide.RIGHT || wwYgDO2V7OXSf7BO4xcQhTyAzx7Aw7Ux.Field12194.Field12198.Method365() && var7_7)) {
            v2 = true;
        } else lbl-1000:
        // 3 sources

        {
            v2 = var9_9 = false;
        }
        if (Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Method35()) {
            if (var2_2 == EnumHandSide.RIGHT) {
                if (!var7_7 || Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16609.Method365()) {
                    if (Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16610.Method365()) {
                        var4_4 = new Vec3d(Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16614.Method367(), Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16615.Method367(), Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16616.Method367());
                    }
                    var5_5 = new Vec3d((double)(Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16635.Method365() == false ? (float)Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16621.Method367() : (float)(System.currentTimeMillis() % 22600L) / 5.0f), (double)(Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16636.Method365() == false ? (float)Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16622.Method367() : (float)(System.currentTimeMillis() % 22600L) / 5.0f), (double)(Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16637.Method365() == false ? (float)Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16623.Method367() : (float)(System.currentTimeMillis() % 22600L) / 5.0f));
                }
                var6_6 = new Vec3d(Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16628.Method367(), Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16629.Method367(), Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16630.Method367());
            }
            if (var2_2 == EnumHandSide.LEFT) {
                if (!PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6654() || Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16609.Method365()) {
                    if (Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16610.Method365()) {
                        var4_4 = new Vec3d(Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16617.Method367(), Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16618.Method367(), Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16619.Method367());
                    }
                    var5_5 = new Vec3d((double)(Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16638.Method365() == false ? (float)Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16624.Method367() : (float)(System.currentTimeMillis() % 22600L) / 5.0f), (double)(Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16639.Method365() == false ? (float)Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16625.Method367() : (float)(System.currentTimeMillis() % 22600L) / 5.0f), (double)(Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16640.Method365() == false ? (float)Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16626.Method367() : (float)(System.currentTimeMillis() % 22600L) / 5.0f));
                }
                var6_6 = new Vec3d(Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16631.Method367(), Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16632.Method367(), Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16633.Method367());
            }
        }
        GlStateManager.translate((double)var4_4.x, (double)var4_4.y, (double)var4_4.z);
        GlStateManager.scale((double)var6_6.x, (double)var6_6.y, (double)var6_6.z);
        GlStateManager.rotate((float)((float)var5_5.x), (float)1.0f, (float)0.0f, (float)0.0f);
        GlStateManager.rotate((float)((float)var5_5.y), (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.rotate((float)((float)var5_5.z), (float)0.0f, (float)0.0f, (float)1.0f);
        if (xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl.Field13248.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG == false) return;
        xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl.Field13248.Method4681(var2_2, this.Field17072);
    }

    @Redirect(method={"setLightmap"}, at=@At(value="FIELD", target="Lnet/minecraft/client/Minecraft;player:Lnet/minecraft/client/entity/EntityPlayerSP;"))
    @Redirect(method={"setLightmap"}, at=@At(value="FIELD", target="Lnet/minecraft/client/Minecraft;player:Lnet/minecraft/client/entity/EntityPlayerSP;"))
    private EntityPlayerSP Method7297(Minecraft minecraft) {
        W3C0y9394VvVcZKAtDfQSnqXm5zLQGty w3C0y9394VvVcZKAtDfQSnqXm5zLQGty = new W3C0y9394VvVcZKAtDfQSnqXm5zLQGty();
        w3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Field17182 = minecraft.player;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(w3C0y9394VvVcZKAtDfQSnqXm5zLQGty);
        return w3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Field17182;
    }

    @Redirect(method={"rotateArm"}, at=@At(value="FIELD", target="Lnet/minecraft/client/Minecraft;player:Lnet/minecraft/client/entity/EntityPlayerSP;"))
    @Redirect(method={"rotateArm"}, at=@At(value="FIELD", target="Lnet/minecraft/client/Minecraft;player:Lnet/minecraft/client/entity/EntityPlayerSP;"))
    private EntityPlayerSP Method7298(Minecraft minecraft) {
        W3C0y9394VvVcZKAtDfQSnqXm5zLQGty w3C0y9394VvVcZKAtDfQSnqXm5zLQGty = new W3C0y9394VvVcZKAtDfQSnqXm5zLQGty();
        w3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Field17182 = minecraft.player;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(w3C0y9394VvVcZKAtDfQSnqXm5zLQGty);
        return w3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Field17182;
    }

    @Redirect(method={"renderItemInFirstPerson(F)V"}, at=@At(value="FIELD", target="Lnet/minecraft/client/Minecraft;player:Lnet/minecraft/client/entity/EntityPlayerSP;"))
    @Redirect(method={"renderItemInFirstPerson(F)V"}, at=@At(value="FIELD", target="Lnet/minecraft/client/Minecraft;player:Lnet/minecraft/client/entity/EntityPlayerSP;"))
    private EntityPlayerSP Method7299(Minecraft minecraft) {
        W3C0y9394VvVcZKAtDfQSnqXm5zLQGty w3C0y9394VvVcZKAtDfQSnqXm5zLQGty = new W3C0y9394VvVcZKAtDfQSnqXm5zLQGty();
        w3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Field17182 = minecraft.player;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(w3C0y9394VvVcZKAtDfQSnqXm5zLQGty);
        return w3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Field17182;
    }

    @Redirect(method={"renderOverlays"}, at=@At(value="FIELD", target="Lnet/minecraft/client/Minecraft;player:Lnet/minecraft/client/entity/EntityPlayerSP;"))
    @Redirect(method={"renderOverlays"}, at=@At(value="FIELD", target="Lnet/minecraft/client/Minecraft;player:Lnet/minecraft/client/entity/EntityPlayerSP;"))
    private EntityPlayerSP Method7300(Minecraft minecraft) {
        W3C0y9394VvVcZKAtDfQSnqXm5zLQGty w3C0y9394VvVcZKAtDfQSnqXm5zLQGty = new W3C0y9394VvVcZKAtDfQSnqXm5zLQGty();
        w3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Field17182 = minecraft.player;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(w3C0y9394VvVcZKAtDfQSnqXm5zLQGty);
        return w3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Field17182;
    }
}

