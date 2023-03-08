//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import net.minecraft.entity.*;
import net.minecraft.util.*;
import org.spongepowered.asm.mixin.*;
import net.minecraft.item.*;
import baritone.api.event.events.*;
import net.minecraft.potion.*;
import net.minecraft.nbt.*;
import net.minecraft.world.*;
import net.minecraft.init.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.*;
import net.minecraftforge.common.*;
import baritone.api.*;
import org.spongepowered.asm.mixin.injection.*;
import net.minecraft.util.math.*;
import net.minecraft.enchantment.*;
import lavahack.client.*;

@Mixin(value = { EntityLivingBase.class }, priority = 10000)
public abstract class MixinEntityLivingBase extends Entity
{
    @Shadow
    public EnumHand Field13295;
    @Shadow
    public ItemStack Field13296;
    @Shadow
    public float Field13297;
    @Shadow
    public float Field13298;
    @Shadow
    public float Field13299;
    @Shadow
    public float Field13300;
    @Shadow
    public int Field13301;
    private RotationMoveEvent Field13302;
    
    @Shadow
    @Shadow
    protected void jump() {
    }
    
    @Shadow
    @Shadow
    public boolean isElytraFlying() {
        return true;
    }
    
    @Shadow
    @Shadow
    public boolean isPotionActive(final Potion potion) {
        return false;
    }
    
    @Shadow
    @Shadow
    public PotionEffect getActivePotionEffect(final Potion potion) {
        return null;
    }
    
    @Shadow
    @Shadow
    protected void entityInit() {
    }
    
    @Shadow
    @Shadow
    public void readEntityFromNBT(final NBTTagCompound nbtTagCompound) {
    }
    
    @Shadow
    @Shadow
    public void writeEntityToNBT(final NBTTagCompound nbtTagCompound) {
    }
    
    @Shadow
    @Shadow
    protected float getJumpUpwardsMotion() {
        return 0.0f;
    }
    
    public MixinEntityLivingBase(final World world) {
        super(world);
    }
    
    @Inject(method = { "getArmSwingAnimationEnd" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "getArmSwingAnimationEnd" }, at = { @At("HEAD") }, cancellable = true)
    private void yesido(final CallbackInfoReturnable callbackInfoReturnable) {
        int n;
        if (this.isPotionActive(MobEffects.HASTE)) {
            n = 6 - (1 + this.getActivePotionEffect(MobEffects.HASTE).getAmplifier());
        }
        else {
            n = (this.isPotionActive(MobEffects.MINING_FATIGUE) ? (6 + (1 + this.getActivePotionEffect(MobEffects.MINING_FATIGUE).getAmplifier()) * 2) : 6);
        }
        final ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS = new ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS(n);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS);
        callbackInfoReturnable.setReturnValue((Object)ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method1670());
        callbackInfoReturnable.cancel();
    }
    
    public MixinEntityLivingBase(final World world, final RotationMoveEvent field13302) {
        super(world);
        this.Field13302 = field13302;
    }
    
    @Inject(method = { "jump" }, at = { @At("HEAD") })
    @Inject(method = { "jump" }, at = { @At("HEAD") })
    private void preMoveRelative(final CallbackInfo callbackInfo) {
        if (EntityPlayerSP.class.isInstance(this)) {
            final IBaritone baritoneForPlayer = BaritoneAPI.getProvider().getBaritoneForPlayer((EntityPlayerSP)this);
            if (baritoneForPlayer != null) {
                this.Field13302 = new RotationMoveEvent(RotationMoveEvent.Type.JUMP, this.rotationYaw);
                baritoneForPlayer.getGameEventHandler().onPlayerRotationMove(this.Field13302);
            }
        }
        if (j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM.Field10181.Field10175.Method365() && Minecraft.getMinecraft().player.getName().equals(this.getName())) {
            this.motionY = this.getJumpUpwardsMotion() + (this.isPotionActive(MobEffects.JUMP_BOOST) ? ((this.getActivePotionEffect(MobEffects.JUMP_BOOST).getAmplifier() + 1) * 0.1f) : 0.0f);
            this.isAirBorne = true;
            ForgeHooks.onLivingJump((EntityLivingBase)this);
            callbackInfo.cancel();
        }
    }
    
    @Redirect(method = { "jump" }, at = @At(value = "FIELD", opcode = 180, target = "net/minecraft/entity/EntityLivingBase.rotationYaw:F"))
    @Redirect(method = { "jump" }, at = @At(value = "FIELD", opcode = 180, target = "net/minecraft/entity/EntityLivingBase.rotationYaw:F"))
    private float overrideYaw(final EntityLivingBase entityLivingBase) {
        if (entityLivingBase instanceof EntityPlayerSP && BaritoneAPI.getProvider().getBaritoneForPlayer((EntityPlayerSP)this) != null) {
            return this.Field13302.getYaw();
        }
        return entityLivingBase.rotationYaw;
    }
    
    @Redirect(method = { "travel" }, at = @At(value = "INVOKE", target = "net/minecraft/entity/EntityLivingBase.moveRelative(FFFF)V"))
    @Redirect(method = { "travel" }, at = @At(value = "INVOKE", target = "net/minecraft/entity/EntityLivingBase.moveRelative(FFFF)V"))
    private void travel(final EntityLivingBase entityLivingBase, final float n, final float n2, final float n3, final float n4) {
        if (!EntityPlayerSP.class.isInstance(this) || BaritoneAPI.getProvider().getBaritoneForPlayer((EntityPlayerSP)this) == null) {
            this.moveRelative(n, n2, n3, n4);
            return;
        }
        final RotationMoveEvent rotationMoveEvent = new RotationMoveEvent(RotationMoveEvent.Type.MOTION_UPDATE, this.rotationYaw);
        BaritoneAPI.getProvider().getBaritoneForPlayer((EntityPlayerSP)this).getGameEventHandler().onPlayerRotationMove(rotationMoveEvent);
        final float rotationYaw = this.rotationYaw;
        this.rotationYaw = rotationMoveEvent.getYaw();
        this.moveRelative(n, n2, n3, n4);
        this.rotationYaw = rotationYaw;
    }
    
    @Inject(method = { "frostWalk" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "frostWalk" }, at = { @At("HEAD") }, cancellable = true)
    public void frostWalk(final BlockPos blockPos, final CallbackInfo callbackInfo) {
        if (!h0AuVBZmEkUBaAj9F9SkgGEp9yp1wdfP.Field9826.Method35()) {
            return;
        }
        EnchantmentFrostWalker.freezeNearby((EntityLivingBase)Minecraft.getMinecraft().player, this.world, blockPos, h0AuVBZmEkUBaAj9F9SkgGEp9yp1wdfP.Field9826.Field9825.Method335());
        callbackInfo.cancel();
    }
    
    @Inject(method = { "updateArmSwingProgress" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "updateArmSwingProgress" }, at = { @At("HEAD") }, cancellable = true)
    public void updateArmSwingProgress(final CallbackInfo callbackInfo) {
        if (!XHh6LxzsMsYojVdsucnzK8xgAxxpPHHM.Field16334.Method35()) {
            return;
        }
        this.Field13301 = XHh6LxzsMsYojVdsucnzK8xgAxxpPHHM.Field16334.Field16333.Method335();
        this.Field13300 = this.Field13301 / 6.0f;
        callbackInfo.cancel();
    }
}
