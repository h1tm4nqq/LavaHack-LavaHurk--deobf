//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import net.minecraft.world.gen.*;
import net.minecraft.world.gen.structure.*;
import org.spongepowered.asm.mixin.*;
import net.minecraft.world.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import lavahack.client.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ ChunkGeneratorOverworld.class })
public class MixinChunkGeneratorOverworld
{
    @Shadow
    private MapGenStronghold Field11329;
    
    @Inject(method = { "<init>" }, at = { @At("RETURN") })
    @Inject(method = { "<init>" }, at = { @At("RETURN") })
    public void Method3278(final World world, final long n, final boolean b, final String s, final CallbackInfo callbackInfo) {
        VwUAM5BP3f9hRWxA7Cgi90LOO1UdJV1h.Field12169 = null;
    }
}
