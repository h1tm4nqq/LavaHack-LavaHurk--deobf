//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  lavahack.client.x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk
 *  net.minecraft.client.entity.AbstractClientPlayer
 *  net.minecraft.client.network.NetworkPlayerInfo
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.world.World
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.kisman.cc.mixin.mixins;

import com.mojang.authlib.GameProfile;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={AbstractClientPlayer.class}, priority=10000)
public class MixinAbstractClientPlayer
extends EntityPlayer {
    @Shadow
    public NetworkPlayerInfo Field16206;

    public MixinAbstractClientPlayer(World world, GameProfile gameProfile) {
        super(world, gameProfile);
    }

    @Shadow
    @Shadow
    public boolean isSpectator() {
        return true;
    }

    @Shadow
    @Shadow
    public boolean isCreative() {
        return false;
    }

    @Inject(method={"getLocationCape"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"getLocationCape"}, at={@At(value="HEAD")}, cancellable=true)
    private void getLocationCape(CallbackInfoReturnable callbackInfoReturnable) {
        x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk2;
        x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk3;
        x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk4 = x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk3;
        this(null);
        x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk5 = x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk2 = x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk3;
        this.Method6029(null);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk2);
        callbackInfoReturnable.setReturnValue((Object)x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk2.Method6028());
    }
}

