//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.o9lanP0gHU278cwDFs7XEsyWoBrJVe44
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.client.renderer.entity.layers.LayerBipedArmor
 *  net.minecraft.inventory.EntityEquipmentSlot
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins;

import lavahack.client.o9lanP0gHU278cwDFs7XEsyWoBrJVe44;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.inventory.EntityEquipmentSlot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={LayerBipedArmor.class}, priority=10000)
public class MixinLayerBipedArmor {
    @Inject(method={"setModelSlotVisible*"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"setModelSlotVisible*"}, at={@At(value="HEAD")}, cancellable=true)
    protected void Method2162(ModelBiped modelBiped, EntityEquipmentSlot entityEquipmentSlot, CallbackInfo callbackInfo) {
        if (!o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Method35()) return;
        if (!o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Field16377.Method365()) return;
        callbackInfo.cancel();
        switch (1.Field14759[entityEquipmentSlot.ordinal()]) {
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
                return;
            }
        }
    }
}

