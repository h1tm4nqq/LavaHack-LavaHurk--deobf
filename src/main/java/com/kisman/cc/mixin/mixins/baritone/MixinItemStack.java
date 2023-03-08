//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.baritone;

import baritone.api.utils.accessor.*;
import net.minecraft.item.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ ItemStack.class })
public class MixinItemStack implements IItemStack
{
    @Shadow
    @Final
    public Item Field10336;
    @Shadow
    public int Field10337;
    @Unique
    private int Field10338;
    
    private void recalculateHash() {
        this.Field10338 = -1;
    }
    
    @Inject(method = { "<init>*" }, at = { @At("RETURN") })
    @Inject(method = { "<init>*" }, at = { @At("RETURN") })
    private void onInit(final CallbackInfo callbackInfo) {
        this.recalculateHash();
    }
    
    @Inject(method = { "setItemDamage" }, at = { @At("TAIL") })
    @Inject(method = { "setItemDamage" }, at = { @At("TAIL") })
    private void onItemDamageSet(final CallbackInfo callbackInfo) {
        this.recalculateHash();
    }
    
    public int getBaritoneHash() {
        return this.Field10338;
    }
}
