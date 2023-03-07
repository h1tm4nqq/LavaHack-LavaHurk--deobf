/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.particle.ParticleManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.EnumParticleTypes
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins;

import lavahack.client.o9lanP0gHU278cwDFs7XEsyWoBrJVe44;
import lavahack.client.o9lanP0gHU278cwDFs7XEsyWoBrJVe44$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumParticleTypes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={ParticleManager.class})
public class MixinParticleManager {
    @Inject(method={"emitParticleAtEntity(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/EnumParticleTypes;)V"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"emitParticleAtEntity(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/EnumParticleTypes;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method7333(Entity entity, EnumParticleTypes enumParticleTypes, CallbackInfo callbackInfo) {
        if (!this.Method7335(enumParticleTypes)) return;
        callbackInfo.cancel();
    }

    @Inject(method={"emitParticleAtEntity(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/EnumParticleTypes;I)V"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"emitParticleAtEntity(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/EnumParticleTypes;I)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method7334(Entity entity, EnumParticleTypes enumParticleTypes, int n, CallbackInfo callbackInfo) {
        if (!this.Method7335(enumParticleTypes)) return;
        callbackInfo.cancel();
    }

    private boolean Method7335(EnumParticleTypes enumParticleTypes) {
        if (o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Field16384.Method359().equalsIgnoreCase("None")) return false;
        if (!o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Method35()) {
            return false;
        }
        if (!o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Field16384.Method359().equalsIgnoreCase(o9lanP0gHU278cwDFs7XEsyWoBrJVe44$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12977.name())) return true;
        if (!enumParticleTypes.equals((Object)EnumParticleTypes.TOTEM)) return true;
        return false;
    }
}

