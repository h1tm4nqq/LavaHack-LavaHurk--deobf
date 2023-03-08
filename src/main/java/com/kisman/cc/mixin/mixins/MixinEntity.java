//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import lavahack.client.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(value = { Entity.class }, priority = 10000)
public class MixinEntity
{
    @Shadow
    public double Field11454;
    @Shadow
    public double Field11455;
    @Shadow
    public double Field11456;
    @Shadow
    public double Field11457;
    @Shadow
    public double Field11458;
    @Shadow
    public double Field11459;
    @Shadow
    public double Field11460;
    @Shadow
    public double Field11461;
    @Shadow
    public double Field11462;
    @Shadow
    public float Field11463;
    @Shadow
    public float Field11464;
    @Shadow
    public float Field11465;
    @Shadow
    public float Field11466;
    @Shadow
    public boolean Field11467;
    @Shadow
    public double Field11468;
    @Shadow
    public double Field11469;
    @Shadow
    public double Field11470;
    @Shadow
    public World Field11471;
    
    @Shadow
    @Shadow
    public void Method3407(final MoverType moverType, final double n, final double n2, final double n3) {
    }
    
    @Shadow
    @Shadow
    public AxisAlignedBB Method3408() {
        return null;
    }
    
    @Shadow
    @Shadow
    protected boolean Method3409(final int n) {
        return true;
    }
    
    @Shadow
    @Shadow
    public Entity Method3410() {
        return null;
    }
    
    @Inject(method = { "turn" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "turn" }, at = { @At("HEAD") }, cancellable = true)
    public void Method3411(final float n, final float n2, final CallbackInfo callbackInfo) {
        final twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl = new twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl(n, n2, this.Field11466, this.Field11465, this.Field11463, this.Field11464);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl);
        if (twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl.Method159()) {
            callbackInfo.cancel();
            this.Field11466 = twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl.Field16574;
            this.Field11465 = twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl.Field16575;
            this.Field11463 = twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl.Field16576;
            this.Field11464 = twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl.Field16577;
        }
    }
}
