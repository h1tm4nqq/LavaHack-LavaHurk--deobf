//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import net.minecraft.entity.player.*;
import net.minecraft.network.datasync.*;
import net.minecraft.world.*;
import org.jetbrains.annotations.*;
import net.minecraft.client.*;
import org.spongepowered.asm.mixin.injection.*;
import net.minecraft.entity.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import lavahack.client.*;
import net.minecraft.util.*;
import org.spongepowered.asm.mixin.*;

@Mixin(value = { EntityPlayer.class }, priority = Integer.MAX_VALUE)
public abstract class MixinEntityPlayer extends EntityLivingBase implements DH1H695Ac7tbIgJH29mL6vYZdjYnf9BH
{
    @Shadow
    @Final
    protected static DataParameter Field9861;
    public RIhfMBGyAK9DkxAEjgwAXL20KiC6veIl Field9862;
    
    public MixinEntityPlayer(final World world) {
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
    
    @Inject(method = { "jump" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "jump" }, at = { @At("HEAD") }, cancellable = true)
    private void onJump(final CallbackInfo callbackInfo) {
        if (Minecraft.getMinecraft().player.getName().equals(this.getName())) {
            final ItyDJooi2U23sHYdNmIhbJFmcHy1UFNl ityDJooi2U23sHYdNmIhbJFmcHy1UFNl = new ItyDJooi2U23sHYdNmIhbJFmcHy1UFNl((Entity)this);
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)ityDJooi2U23sHYdNmIhbJFmcHy1UFNl);
            if (ityDJooi2U23sHYdNmIhbJFmcHy1UFNl.Method159()) {
                callbackInfo.cancel();
            }
        }
    }
    
    @Inject(method = { "travel" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "travel" }, at = { @At("HEAD") }, cancellable = true)
    private void onTravel(final float n, final float n2, final float n3, final CallbackInfo callbackInfo) {
        final fWLM1xYQAvLvszZ46JEibQwGmnGO0DeQ fwlm1xYQAvLvszZ46JEibQwGmnGO0DeQ = new fWLM1xYQAvLvszZ46JEibQwGmnGO0DeQ(n, n2, n3);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)fwlm1xYQAvLvszZ46JEibQwGmnGO0DeQ);
        if (fwlm1xYQAvLvszZ46JEibQwGmnGO0DeQ.Method159()) {
            this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "applyEntityCollision" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "applyEntityCollision" }, at = { @At("HEAD") }, cancellable = true)
    private void applyEntityCollision(final Entity entity, final CallbackInfo callbackInfo) {
        final u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ = new u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ(entity);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ);
        if (u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ.Method159()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "isPushedByWater()Z" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "isPushedByWater()Z" }, at = { @At("HEAD") }, cancellable = true)
    private void isPushedByWater(final CallbackInfoReturnable callbackInfoReturnable) {
        final DsAaAHmL7Yq0IkjnWsKfUDurp0luEZxB dsAaAHmL7Yq0IkjnWsKfUDurp0luEZxB = new DsAaAHmL7Yq0IkjnWsKfUDurp0luEZxB();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)dsAaAHmL7Yq0IkjnWsKfUDurp0luEZxB);
        if (dsAaAHmL7Yq0IkjnWsKfUDurp0luEZxB.Method159()) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }
    
    @Overwrite
    @Overwrite
    @NotNull
    @NotNull
    public EnumHandSide getPrimaryHand() {
        return ((byte)this.dataManager.get((DataParameter)null) == 0) ? EnumHandSide.LEFT : EnumHandSide.RIGHT;
    }
    
    public void Method2144(final RIhfMBGyAK9DkxAEjgwAXL20KiC6veIl field9862) {
        this.Field9862 = field9862;
    }
    
    public RIhfMBGyAK9DkxAEjgwAXL20KiC6veIl Method2145() {
        return this.Field9862;
    }
}
