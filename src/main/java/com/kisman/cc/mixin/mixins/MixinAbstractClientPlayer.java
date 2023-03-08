//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import net.minecraft.entity.player.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.network.*;
import org.spongepowered.asm.mixin.*;
import net.minecraft.world.*;
import com.mojang.authlib.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import net.minecraft.util.*;
import lavahack.client.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(value = { AbstractClientPlayer.class }, priority = 10000)
public class MixinAbstractClientPlayer extends EntityPlayer
{
    @Shadow
    public NetworkPlayerInfo Field16206;
    
    public MixinAbstractClientPlayer(final World world, final GameProfile gameProfile) {
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
    
    @Inject(method = { "getLocationCape" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "getLocationCape" }, at = { @At("HEAD") }, cancellable = true)
    private void getLocationCape(final CallbackInfoReturnable callbackInfoReturnable) {
        final x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk = new(lavahack.client.x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk.class);
        super((NetworkPlayerInfo)null);
        final x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk2 = x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk;
        ((x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk)this).Method6029((ResourceLocation)null);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk2);
        callbackInfoReturnable.setReturnValue((Object)x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk2.Method6028());
    }
}
