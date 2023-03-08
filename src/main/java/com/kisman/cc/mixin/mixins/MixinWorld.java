//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import net.minecraft.world.*;
import org.spongepowered.asm.mixin.*;
import net.minecraft.entity.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import lavahack.client.*;

@Mixin(value = { World.class }, priority = 10000)
public abstract class MixinWorld
{
    @Shadow
    @Shadow
    public abstract void Method7336();
    
    @Inject(method = { "onEntityAdded" }, at = { @At("HEAD") })
    @Inject(method = { "onEntityAdded" }, at = { @At("HEAD") })
    public void Method7337(final Entity entity, final CallbackInfo callbackInfo) {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)new y8U8oQnw0TUDKkVJGZnF579aaraavvia(entity));
    }
    
    @Inject(method = { "spawnEntity" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "spawnEntity" }, at = { @At("HEAD") }, cancellable = true)
    public void Method7338(final Entity entity, final CallbackInfoReturnable callbackInfoReturnable) {
        final qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6 qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6 = new qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6(entity);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6);
        if (qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6.Method159()) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }
    
    @Inject(method = { "onEntityRemoved" }, at = { @At("HEAD") })
    @Inject(method = { "onEntityRemoved" }, at = { @At("HEAD") })
    public void Method7339(final Entity entity, final CallbackInfo callbackInfo) {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)new v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13(entity.getEntityId()));
    }
}
