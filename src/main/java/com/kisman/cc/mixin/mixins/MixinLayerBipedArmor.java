//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.renderer.entity.layers.*;
import net.minecraft.client.model.*;
import net.minecraft.inventory.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import lavahack.client.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(value = { LayerBipedArmor.class }, priority = 10000)
public class MixinLayerBipedArmor
{
    @Inject(method = { "setModelSlotVisible*" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "setModelSlotVisible*" }, at = { @At("HEAD") }, cancellable = true)
    protected void Method2162(final ModelBiped modelBiped, final EntityEquipmentSlot entityEquipmentSlot, final CallbackInfo callbackInfo) {
        if (o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Method35() && o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Field16377.Method365()) {
            callbackInfo.cancel();
            switch (MixinLayerBipedArmor$1.Field14759[entityEquipmentSlot.ordinal()]) {
                case 1: {
                    modelBiped.bipedHead.showModel = false;
                    modelBiped.bipedHeadwear.showModel = false;
                }
                case 2: {
                    modelBiped.bipedBody.showModel = false;
                    modelBiped.bipedRightArm.showModel = false;
                    modelBiped.bipedLeftArm.showModel = false;
                }
                case 3: {
                    modelBiped.bipedBody.showModel = false;
                    modelBiped.bipedRightLeg.showModel = false;
                    modelBiped.bipedLeftLeg.showModel = false;
                }
                case 4: {
                    modelBiped.bipedRightLeg.showModel = false;
                    modelBiped.bipedLeftLeg.showModel = false;
                    break;
                }
            }
        }
    }
}
