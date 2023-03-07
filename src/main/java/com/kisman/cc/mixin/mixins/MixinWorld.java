//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.world.World
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.kisman.cc.mixin.mixins;

import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6;
import lavahack.client.v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13;
import lavahack.client.y8U8oQnw0TUDKkVJGZnF579aaraavvia;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={World.class}, priority=10000)
public abstract class MixinWorld {
    @Shadow
    @Shadow
    public abstract void Method7336();

    @Inject(method={"onEntityAdded"}, at={@At(value="HEAD")})
    @Inject(method={"onEntityAdded"}, at={@At(value="HEAD")})
    public void Method7337(Entity entity, CallbackInfo callbackInfo) {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(new y8U8oQnw0TUDKkVJGZnF579aaraavvia(entity));
    }

    @Inject(method={"spawnEntity"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"spawnEntity"}, at={@At(value="HEAD")}, cancellable=true)
    public void Method7338(Entity entity, CallbackInfoReturnable callbackInfoReturnable) {
        qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6 qch99jTc1BY9W3FpbWqv6Giw1AFyzSS62 = new qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6(entity);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(qch99jTc1BY9W3FpbWqv6Giw1AFyzSS62);
        if (!qch99jTc1BY9W3FpbWqv6Giw1AFyzSS62.Method159()) return;
        callbackInfoReturnable.setReturnValue((Object)false);
    }

    @Inject(method={"onEntityRemoved"}, at={@At(value="HEAD")})
    @Inject(method={"onEntityRemoved"}, at={@At(value="HEAD")})
    public void Method7339(Entity entity, CallbackInfo callbackInfo) {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(new v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13(entity.getEntityId()));
    }
}

