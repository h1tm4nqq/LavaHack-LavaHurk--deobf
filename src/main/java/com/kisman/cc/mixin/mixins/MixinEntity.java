/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  lavahack.client.twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.MoverType
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.world.World
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins;

import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MoverType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={Entity.class}, priority=10000)
public class MixinEntity {
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
    public void Method3407(MoverType moverType, double d, double d2, double d3) {
    }

    @Shadow
    @Shadow
    public AxisAlignedBB Method3408() {
        return null;
    }

    @Shadow
    @Shadow
    protected boolean Method3409(int n) {
        return true;
    }

    @Shadow
    @Shadow
    public Entity Method3410() {
        return null;
    }

    @Inject(method={"turn"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"turn"}, at={@At(value="HEAD")}, cancellable=true)
    public void Method3411(float f, float f2, CallbackInfo callbackInfo) {
        twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2 = new twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl(f, f2, this.Field11466, this.Field11465, this.Field11463, this.Field11464);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2);
        if (!twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Method159()) return;
        callbackInfo.cancel();
        this.Field11466 = twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Field16574;
        this.Field11465 = twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Field16575;
        this.Field11463 = twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Field16576;
        this.Field11464 = twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Field16577;
    }
}

