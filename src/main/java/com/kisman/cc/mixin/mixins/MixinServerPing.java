//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.network.*;
import net.minecraft.client.multiplayer.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import lavahack.client.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ ServerPinger.class })
public class MixinServerPing
{
    @Inject(method = { "ping" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "ping" }, at = { @At("HEAD") }, cancellable = true)
    public void Method6997(final ServerData serverData, final CallbackInfo callbackInfo) {
        final A50mpNcG9Jr7zq65VRTWW1xeYXIz5VEB.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf ylFSugLHQAjzunVBKfamPjSRsvHTy3jf = new A50mpNcG9Jr7zq65VRTWW1xeYXIz5VEB.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(serverData);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)ylFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        if (ylFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method159()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "tryCompatibilityPing" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "tryCompatibilityPing" }, at = { @At("HEAD") }, cancellable = true)
    public void Method6998(final ServerData serverData, final CallbackInfo callbackInfo) {
        final A50mpNcG9Jr7zq65VRTWW1xeYXIz5VEB.leqS0IyKEB621E1SrHdAcHHAUjScjmKi leqS0IyKEB621E1SrHdAcHHAUjScjmKi = new A50mpNcG9Jr7zq65VRTWW1xeYXIz5VEB.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(serverData);
        lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
        if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method159()) {
            callbackInfo.cancel();
        }
    }
}
