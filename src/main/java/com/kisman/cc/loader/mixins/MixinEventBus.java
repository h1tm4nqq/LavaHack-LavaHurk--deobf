/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.eventhandler.EventBus
 *  org.apache.logging.log4j.Logger
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package com.kisman.cc.loader.mixins;

import net.minecraftforge.fml.common.eventhandler.EventBus;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={EventBus.class})
public class MixinEventBus {
    private String Field11065 = "TheKisDevs & LavaHack Development owns you";

    @Redirect(remap=false, method={"register(Ljava/lang/Object;)V"}, at=@At(value="INVOKE", target="Lorg/apache/logging/log4j/Logger;error(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V"))
    @Redirect(remap=false, method={"register(Ljava/lang/Object;)V"}, at=@At(value="INVOKE", target="Lorg/apache/logging/log4j/Logger;error(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V"))
    private void Method3006(Logger logger, String string, Object object, Object object2) {
    }
}

