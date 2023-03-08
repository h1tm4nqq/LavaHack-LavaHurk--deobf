//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.particle.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import org.spongepowered.asm.mixin.injection.*;
import lavahack.client.*;

@Mixin({ ParticleManager.class })
public class MixinParticleManager
{
    @Inject(method = { "emitParticleAtEntity(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/EnumParticleTypes;)V" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "emitParticleAtEntity(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/EnumParticleTypes;)V" }, at = { @At("HEAD") }, cancellable = true)
    private void Method7333(final Entity entity, final EnumParticleTypes enumParticleTypes, final CallbackInfo callbackInfo) {
        if (this.Method7335(enumParticleTypes)) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "emitParticleAtEntity(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/EnumParticleTypes;I)V" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "emitParticleAtEntity(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/EnumParticleTypes;I)V" }, at = { @At("HEAD") }, cancellable = true)
    private void Method7334(final Entity entity, final EnumParticleTypes enumParticleTypes, final int n, final CallbackInfo callbackInfo) {
        if (this.Method7335(enumParticleTypes)) {
            callbackInfo.cancel();
        }
    }
    
    private boolean Method7335(final EnumParticleTypes enumParticleTypes) {
        return !o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Field16384.Method359().equalsIgnoreCase("None") && o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Method35() && (!o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Field16384.Method359().equalsIgnoreCase(o9lanP0gHU278cwDFs7XEsyWoBrJVe44.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12977.name()) || !enumParticleTypes.equals((Object)EnumParticleTypes.TOTEM));
    }
}
