//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.loader.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraftforge.fml.common.eventhandler.*;
import org.apache.logging.log4j.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ EventBus.class })
public class MixinEventBus
{
    private String Field11065 = "TheKisDevs & LavaHack Development owns you";
    
    @Redirect(remap = false, method = { "register(Ljava/lang/Object;)V" }, at = @At(value = "INVOKE", target = "Lorg/apache/logging/log4j/Logger;error(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V"))
    @Redirect(remap = false, method = { "register(Ljava/lang/Object;)V" }, at = @At(value = "INVOKE", target = "Lorg/apache/logging/log4j/Logger;error(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V"))
    private void Method3006(final Logger logger, final String s, final Object o, final Object o2) {
    }
}
