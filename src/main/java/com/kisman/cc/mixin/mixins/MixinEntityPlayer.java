//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.MoverType
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.util.EnumHandSide
 *  net.minecraft.world.World
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Overwrite
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.kisman.cc.mixin.mixins;

import lavahack.client.DH1H695Ac7tbIgJH29mL6vYZdjYnf9BH;
import lavahack.client.DsAaAHmL7Yq0IkjnWsKfUDurp0luEZxB;
import lavahack.client.ItyDJooi2U23sHYdNmIhbJFmcHy1UFNl;
import lavahack.client.RIhfMBGyAK9DkxAEjgwAXL20KiC6veIl;
import lavahack.client.fWLM1xYQAvLvszZ46JEibQwGmnGO0DeQ;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.util.EnumHandSide;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={EntityPlayer.class}, priority=0x7FFFFFFF)
public abstract class MixinEntityPlayer
extends EntityLivingBase
implements DH1H695Ac7tbIgJH29mL6vYZdjYnf9BH {
    @Shadow
    @Final
    protected static DataParameter Field9861;
    public RIhfMBGyAK9DkxAEjgwAXL20KiC6veIl Field9862;

    public MixinEntityPlayer(World world) {
        super(world);
    }

    @Shadow
    @Shadow
    protected void doWaterSplashEffect() {
    }

    @Shadow
    @Shadow
    @NotNull
    @NotNull
    public String getName() {
        return "";
    }

    @Inject(method={"jump"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"jump"}, at={@At(value="HEAD")}, cancellable=true)
    private void onJump(CallbackInfo callbackInfo) {
        if (!Minecraft.getMinecraft().player.getName().equals(this.getName())) return;
        ItyDJooi2U23sHYdNmIhbJFmcHy1UFNl ityDJooi2U23sHYdNmIhbJFmcHy1UFNl = new ItyDJooi2U23sHYdNmIhbJFmcHy1UFNl((Entity)this);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(ityDJooi2U23sHYdNmIhbJFmcHy1UFNl);
        if (!ityDJooi2U23sHYdNmIhbJFmcHy1UFNl.Method159()) return;
        callbackInfo.cancel();
    }

    @Inject(method={"travel"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"travel"}, at={@At(value="HEAD")}, cancellable=true)
    private void onTravel(float f, float f2, float f3, CallbackInfo callbackInfo) {
        fWLM1xYQAvLvszZ46JEibQwGmnGO0DeQ fWLM1xYQAvLvszZ46JEibQwGmnGO0DeQ2 = new fWLM1xYQAvLvszZ46JEibQwGmnGO0DeQ(f, f2, f3);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(fWLM1xYQAvLvszZ46JEibQwGmnGO0DeQ2);
        if (!fWLM1xYQAvLvszZ46JEibQwGmnGO0DeQ2.Method159()) return;
        this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
        callbackInfo.cancel();
    }

    @Inject(method={"applyEntityCollision"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"applyEntityCollision"}, at={@At(value="HEAD")}, cancellable=true)
    private void applyEntityCollision(Entity entity, CallbackInfo callbackInfo) {
        u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ2 = new u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ(entity);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ2);
        if (!u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ2.Method159()) return;
        callbackInfo.cancel();
    }

    @Inject(method={"isPushedByWater()Z"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"isPushedByWater()Z"}, at={@At(value="HEAD")}, cancellable=true)
    private void isPushedByWater(CallbackInfoReturnable callbackInfoReturnable) {
        DsAaAHmL7Yq0IkjnWsKfUDurp0luEZxB dsAaAHmL7Yq0IkjnWsKfUDurp0luEZxB = new DsAaAHmL7Yq0IkjnWsKfUDurp0luEZxB();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(dsAaAHmL7Yq0IkjnWsKfUDurp0luEZxB);
        if (!dsAaAHmL7Yq0IkjnWsKfUDurp0luEZxB.Method159()) return;
        callbackInfoReturnable.setReturnValue((Object)false);
    }

    @Overwrite
    @Overwrite
    @NotNull
    @NotNull
    public EnumHandSide getPrimaryHand() {
        EnumHandSide enumHandSide;
        if ((Byte)this.dataManager.get(null) == 0) {
            enumHandSide = EnumHandSide.LEFT;
            return enumHandSide;
        }
        enumHandSide = EnumHandSide.RIGHT;
        return enumHandSide;
    }

    @Override
    public void Method2144(RIhfMBGyAK9DkxAEjgwAXL20KiC6veIl rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl) {
        this.Field9862 = rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl;
    }

    @Override
    public RIhfMBGyAK9DkxAEjgwAXL20KiC6veIl Method2145() {
        return this.Field9862;
    }
}

