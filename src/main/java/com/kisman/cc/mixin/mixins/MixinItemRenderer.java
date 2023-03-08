//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import net.minecraft.client.*;
import org.spongepowered.asm.mixin.*;
import net.minecraft.item.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.client.renderer.*;
import org.spongepowered.asm.mixin.injection.*;
import net.minecraft.client.entity.*;
import lavahack.client.*;

@Mixin(value = { ItemRenderer.class }, priority = 10000)
public class MixinItemRenderer
{
    @Shadow
    @Final
    public Minecraft Field17071;
    private float Field17072;
    private boolean Field17073;
    
    public MixinItemRenderer() {
        this.Field17072 = 0.0f;
        this.Field17073 = true;
    }
    
    @Shadow
    @Shadow
    public void Method7292(final AbstractClientPlayer abstractClientPlayer, final float n, final float n2, final EnumHand enumHand, final float n3, final ItemStack itemStack, final float n4) {
    }
    
    @Inject(method = { "rotateArm" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "rotateArm" }, at = { @At("HEAD") }, cancellable = true)
    private void Method7293(final float n, final CallbackInfo callbackInfo) {
        if (o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Method35() && o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Field16391.Method365()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "renderItemInFirstPerson(Lnet/minecraft/client/entity/AbstractClientPlayer;FFLnet/minecraft/util/EnumHand;FLnet/minecraft/item/ItemStack;F)V" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "renderItemInFirstPerson(Lnet/minecraft/client/entity/AbstractClientPlayer;FFLnet/minecraft/util/EnumHand;FLnet/minecraft/item/ItemStack;F)V" }, at = { @At("HEAD") }, cancellable = true)
    private void Method7294(final AbstractClientPlayer abstractClientPlayer, final float n, final float n2, final EnumHand enumHand, final float n3, final ItemStack itemStack, final float n4, final CallbackInfo callbackInfo) {
        if (this.Field17073) {
            if (!hzQA3yG8TeYiDewILAcxASyNr4KHoVTE.Field17421.Method35()) {
                return;
            }
            if (itemStack.isEmpty) {
                return;
            }
            callbackInfo.cancel();
            this.Field17073 = false;
            float n5;
            float n6;
            if (enumHand == EnumHand.MAIN_HAND) {
                n5 = hzQA3yG8TeYiDewILAcxASyNr4KHoVTE.Field17421.Field17417.Method368();
                n6 = hzQA3yG8TeYiDewILAcxASyNr4KHoVTE.Field17421.Field17418.Method368();
            }
            else {
                n5 = hzQA3yG8TeYiDewILAcxASyNr4KHoVTE.Field17421.Field17419.Method368();
                n6 = hzQA3yG8TeYiDewILAcxASyNr4KHoVTE.Field17421.Field17420.Method368();
            }
            this.Method7292(abstractClientPlayer, n, n2, enumHand, n3 + n5, itemStack, n4 + n6);
            this.Field17073 = true;
        }
    }
    
    @Inject(method = { "renderItemInFirstPerson(Lnet/minecraft/client/entity/AbstractClientPlayer;FFLnet/minecraft/util/EnumHand;FLnet/minecraft/item/ItemStack;F)V" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;pushMatrix()V", shift = At.Shift.AFTER) })
    @Inject(method = { "renderItemInFirstPerson(Lnet/minecraft/client/entity/AbstractClientPlayer;FFLnet/minecraft/util/EnumHand;FLnet/minecraft/item/ItemStack;F)V" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;pushMatrix()V", shift = At.Shift.AFTER) })
    private void Method7295(final AbstractClientPlayer abstractClientPlayer, final float n, final float n2, final EnumHand enumHand, final float field17072, final ItemStack itemStack, final float n3, final CallbackInfo callbackInfo) {
        if (Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Method35() && Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16643.Method365()) {
            Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Method6972(enumHand.equals((Object)EnumHand.MAIN_HAND) ? abstractClientPlayer.getPrimaryHand() : abstractClientPlayer.getPrimaryHand().opposite());
        }
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)new DWxN8wLIsLoeYiSaIuBiecHxwmChdruN(enumHand.equals((Object)EnumHand.MAIN_HAND) ? abstractClientPlayer.getPrimaryHand() : abstractClientPlayer.getPrimaryHand().opposite(), field17072));
        this.Field17072 = field17072;
    }
    
    @Redirect(method = { "renderItemInFirstPerson(Lnet/minecraft/client/entity/AbstractClientPlayer;FFLnet/minecraft/util/EnumHand;FLnet/minecraft/item/ItemStack;F)V" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/ItemRenderer;transformSideFirstPerson(Lnet/minecraft/util/EnumHandSide;F)V"))
    @Redirect(method = { "renderItemInFirstPerson(Lnet/minecraft/client/entity/AbstractClientPlayer;FFLnet/minecraft/util/EnumHand;FLnet/minecraft/item/ItemStack;F)V" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/ItemRenderer;transformSideFirstPerson(Lnet/minecraft/util/EnumHandSide;F)V"))
    public void Method7296(final ItemRenderer itemRenderer, final EnumHandSide enumHandSide, final float n) {
        Vec3d vec3d = new Vec3d(((enumHandSide == EnumHandSide.RIGHT) ? 1 : -1) * 0.56, -0.52 + n * -0.6, -0.72);
        Vec3d vec3d2 = new Vec3d(0.0, 0.0, 0.0);
        Vec3d vec3d3 = new Vec3d(1.0, 1.0, 1.0);
        final boolean method6653 = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6653();
        final boolean b = null.player.swingProgress > 0.0f && wwYgDO2V7OXSf7BO4xcQhTyAzx7Aw7Ux.Field12194.Method35() && wwYgDO2V7OXSf7BO4xcQhTyAzx7Aw7Ux.Field12194.Field12195.Method359().equalsIgnoreCase("Strong");
        if (wwYgDO2V7OXSf7BO4xcQhTyAzx7Aw7Ux.Field12194.Field12199.Method365() && leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Method1162("KillAuraRewrite").Method35() && iOlyf0qO2tpkluftbdahtmamFIPIkMNS.Field13362.Method5349() != null) {
            if (enumHandSide == EnumHandSide.RIGHT && (!wwYgDO2V7OXSf7BO4xcQhTyAzx7Aw7Ux.Field12194.Field12198.Method365() || !method6653)) {}
        }
        if (Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Method35()) {
            if (enumHandSide == EnumHandSide.RIGHT) {
                if (!method6653 || Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16609.Method365()) {
                    if (Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16610.Method365()) {
                        vec3d = new Vec3d(Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16614.Method367(), Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16615.Method367(), Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16616.Method367());
                    }
                    vec3d2 = new Vec3d((double)(Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16635.Method365() ? (System.currentTimeMillis() % 22600L / 5.0f) : ((float)Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16621.Method367())), (double)(Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16636.Method365() ? (System.currentTimeMillis() % 22600L / 5.0f) : ((float)Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16622.Method367())), (double)(Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16637.Method365() ? (System.currentTimeMillis() % 22600L / 5.0f) : ((float)Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16623.Method367())));
                }
                vec3d3 = new Vec3d(Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16628.Method367(), Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16629.Method367(), Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16630.Method367());
            }
            if (enumHandSide == EnumHandSide.LEFT) {
                if (!PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6654() || Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16609.Method365()) {
                    if (Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16610.Method365()) {
                        vec3d = new Vec3d(Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16617.Method367(), Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16618.Method367(), Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16619.Method367());
                    }
                    vec3d2 = new Vec3d((double)(Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16638.Method365() ? (System.currentTimeMillis() % 22600L / 5.0f) : ((float)Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16624.Method367())), (double)(Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16639.Method365() ? (System.currentTimeMillis() % 22600L / 5.0f) : ((float)Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16625.Method367())), (double)(Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16640.Method365() ? (System.currentTimeMillis() % 22600L / 5.0f) : ((float)Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16626.Method367())));
                }
                vec3d3 = new Vec3d(Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16631.Method367(), Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16632.Method367(), Vsx7VnIROqeKBZqXejWocb0OxQ74HIeC.Field16608.Field16633.Method367());
            }
        }
        GlStateManager.translate(vec3d.x, vec3d.y, vec3d.z);
        GlStateManager.scale(vec3d3.x, vec3d3.y, vec3d3.z);
        GlStateManager.rotate((float)vec3d2.x, 1.0f, 0.0f, 0.0f);
        GlStateManager.rotate((float)vec3d2.y, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate((float)vec3d2.z, 0.0f, 0.0f, 1.0f);
        if (xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl.Field13248.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG) {
            xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl.Field13248.Method4681(enumHandSide, this.Field17072);
        }
    }
    
    @Redirect(method = { "setLightmap" }, at = @At(value = "FIELD", target = "Lnet/minecraft/client/Minecraft;player:Lnet/minecraft/client/entity/EntityPlayerSP;"))
    @Redirect(method = { "setLightmap" }, at = @At(value = "FIELD", target = "Lnet/minecraft/client/Minecraft;player:Lnet/minecraft/client/entity/EntityPlayerSP;"))
    private EntityPlayerSP Method7297(final Minecraft minecraft) {
        final W3C0y9394VvVcZKAtDfQSnqXm5zLQGty w3C0y9394VvVcZKAtDfQSnqXm5zLQGty = new W3C0y9394VvVcZKAtDfQSnqXm5zLQGty();
        w3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Field17182 = minecraft.player;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)w3C0y9394VvVcZKAtDfQSnqXm5zLQGty);
        return w3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Field17182;
    }
    
    @Redirect(method = { "rotateArm" }, at = @At(value = "FIELD", target = "Lnet/minecraft/client/Minecraft;player:Lnet/minecraft/client/entity/EntityPlayerSP;"))
    @Redirect(method = { "rotateArm" }, at = @At(value = "FIELD", target = "Lnet/minecraft/client/Minecraft;player:Lnet/minecraft/client/entity/EntityPlayerSP;"))
    private EntityPlayerSP Method7298(final Minecraft minecraft) {
        final W3C0y9394VvVcZKAtDfQSnqXm5zLQGty w3C0y9394VvVcZKAtDfQSnqXm5zLQGty = new W3C0y9394VvVcZKAtDfQSnqXm5zLQGty();
        w3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Field17182 = minecraft.player;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)w3C0y9394VvVcZKAtDfQSnqXm5zLQGty);
        return w3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Field17182;
    }
    
    @Redirect(method = { "renderItemInFirstPerson(F)V" }, at = @At(value = "FIELD", target = "Lnet/minecraft/client/Minecraft;player:Lnet/minecraft/client/entity/EntityPlayerSP;"))
    @Redirect(method = { "renderItemInFirstPerson(F)V" }, at = @At(value = "FIELD", target = "Lnet/minecraft/client/Minecraft;player:Lnet/minecraft/client/entity/EntityPlayerSP;"))
    private EntityPlayerSP Method7299(final Minecraft minecraft) {
        final W3C0y9394VvVcZKAtDfQSnqXm5zLQGty w3C0y9394VvVcZKAtDfQSnqXm5zLQGty = new W3C0y9394VvVcZKAtDfQSnqXm5zLQGty();
        w3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Field17182 = minecraft.player;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)w3C0y9394VvVcZKAtDfQSnqXm5zLQGty);
        return w3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Field17182;
    }
    
    @Redirect(method = { "renderOverlays" }, at = @At(value = "FIELD", target = "Lnet/minecraft/client/Minecraft;player:Lnet/minecraft/client/entity/EntityPlayerSP;"))
    @Redirect(method = { "renderOverlays" }, at = @At(value = "FIELD", target = "Lnet/minecraft/client/Minecraft;player:Lnet/minecraft/client/entity/EntityPlayerSP;"))
    private EntityPlayerSP Method7300(final Minecraft minecraft) {
        final W3C0y9394VvVcZKAtDfQSnqXm5zLQGty w3C0y9394VvVcZKAtDfQSnqXm5zLQGty = new W3C0y9394VvVcZKAtDfQSnqXm5zLQGty();
        w3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Field17182 = minecraft.player;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)w3C0y9394VvVcZKAtDfQSnqXm5zLQGty);
        return w3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Field17182;
    }
}
