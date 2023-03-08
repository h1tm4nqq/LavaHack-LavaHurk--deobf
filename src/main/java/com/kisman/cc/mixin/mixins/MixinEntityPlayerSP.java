//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import net.minecraft.client.entity.*;
import org.spongepowered.asm.mixin.*;
import net.minecraft.world.*;
import com.mojang.authlib.*;
import com.kisman.cc.event.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import org.jetbrains.annotations.*;
import lavahack.client.*;
import net.minecraft.enchantment.*;
import net.minecraft.entity.*;
import net.minecraft.init.*;
import net.minecraftforge.common.*;
import net.minecraft.util.*;
import com.kisman.cc.util.*;
import net.minecraftforge.event.entity.player.*;
import baritone.api.*;
import baritone.api.event.events.type.*;
import net.minecraft.entity.player.*;
import org.spongepowered.asm.mixin.injection.*;
import net.minecraft.client.settings.*;
import baritone.api.event.events.*;
import baritone.behavior.*;

@Mixin(value = { EntityPlayerSP.class }, priority = 10000)
public class MixinEntityPlayerSP extends MixinAbstractClientPlayer implements o5s3arbQ7LWXjnlx1sQl8MhGwb7FX7LT
{
    @Shadow
    public MovementInput Field17184;
    
    public MixinEntityPlayerSP(final World world, final GameProfile gameProfile) {
        super(world, gameProfile);
    }
    
    @Shadow
    @Shadow
    protected boolean Method7409() {
        return true;
    }
    
    @Shadow
    @Shadow
    private void Method7410() {
    }
    
    @Inject(method = { "move" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "move" }, at = { @At("HEAD") }, cancellable = true)
    public void Method7411(final MoverType moverType, final double n, final double n2, final double n3, final CallbackInfo callbackInfo) {
        final uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x = new uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x(moverType, n, n2, n3);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x);
        if (uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x.Method159()) {
            super.move(moverType, uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x.Field14103, uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x.Field14104, uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x.Field14105);
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "onUpdateWalkingPlayer" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "onUpdateWalkingPlayer" }, at = { @At("HEAD") }, cancellable = true)
    public void Method7412(final CallbackInfo callbackInfo) {
        final RG0Ef4LzpvaRaWkCktLl94QMei9n80rd rg0Ef4LzpvaRaWkCktLl94QMei9n80rd = new RG0Ef4LzpvaRaWkCktLl94QMei9n80rd(Event.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13746, this.rotationYaw, this.rotationPitch, this.posX, this.getEntityBoundingBox().minY, this.posZ, this.onGround);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)rg0Ef4LzpvaRaWkCktLl94QMei9n80rd);
        this.rotationYaw = rg0Ef4LzpvaRaWkCktLl94QMei9n80rd.Method1733();
        this.rotationPitch = rg0Ef4LzpvaRaWkCktLl94QMei9n80rd.Method1735();
        if (rg0Ef4LzpvaRaWkCktLl94QMei9n80rd.Method159()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "onUpdateWalkingPlayer" }, at = { @At("RETURN") }, cancellable = true)
    @Inject(method = { "onUpdateWalkingPlayer" }, at = { @At("RETURN") }, cancellable = true)
    public void Method7413(final CallbackInfo callbackInfo) {
        final RG0Ef4LzpvaRaWkCktLl94QMei9n80rd rg0Ef4LzpvaRaWkCktLl94QMei9n80rd = new RG0Ef4LzpvaRaWkCktLl94QMei9n80rd(Event.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13747, this.rotationYaw, this.rotationPitch, this.posX, this.getEntityBoundingBox().minY, this.posZ, this.onGround);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)rg0Ef4LzpvaRaWkCktLl94QMei9n80rd);
        if (rg0Ef4LzpvaRaWkCktLl94QMei9n80rd.Method159()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "onUpdate" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "onUpdate" }, at = { @At("HEAD") }, cancellable = true)
    public void Method7414(final CallbackInfo callbackInfo) {
        final ZzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ zzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ = new ZzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)zzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ);
        if (zzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ.Method159()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "pushOutOfBlocks(DDD)Z" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "pushOutOfBlocks(DDD)Z" }, at = { @At("HEAD") }, cancellable = true)
    public void Method7415(final double n, final double n2, final double n3, final CallbackInfoReturnable callbackInfoReturnable) {
        final jNiJm0uQgY2wVhFel4twUsWMig1Nujvc jNiJm0uQgY2wVhFel4twUsWMig1Nujvc = new jNiJm0uQgY2wVhFel4twUsWMig1Nujvc(n, n2, n3);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)jNiJm0uQgY2wVhFel4twUsWMig1Nujvc);
        if (jNiJm0uQgY2wVhFel4twUsWMig1Nujvc.Method159()) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }
    
    public void Method7416(@NotNull @NotNull final Entity entity) {
        super.attackTargetEntityWithCurrentItem(entity);
        if (((GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x)leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Method1162("MoveModifier")).Method7104().Method365() && entity.canBeAttackedWithItem() && !entity.hitByEntity((Entity)this)) {
            float n;
            if (entity instanceof EntityLivingBase) {
                n = EnchantmentHelper.getModifierForCreature(this.getHeldItemMainhand(), ((EntityLivingBase)entity).getCreatureAttribute());
            }
            else {
                n = EnchantmentHelper.getModifierForCreature(this.getHeldItemMainhand(), EnumCreatureAttribute.UNDEFINED);
            }
            final float getCooledAttackStrength = this.getCooledAttackStrength(0.5f);
            final float n2 = (float)this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * (0.2f + getCooledAttackStrength * getCooledAttackStrength * 0.8f);
            final float n3 = n * getCooledAttackStrength;
            if (n2 > 0.0f || n3 > 0.0f) {
                final CriticalHitEvent criticalHit = ForgeHooks.getCriticalHit((EntityPlayer)this, entity, !this.isSprinting() && getCooledAttackStrength > 0.9f && this.fallDistance > 0.0f && !this.onGround && !this.isOnLadder() && !this.isInWater() && !this.isPotionActive(MobEffects.BLINDNESS) && !this.isRiding() && entity instanceof EntityLivingBase, 1.0f);
                if (entity.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer)this), ((criticalHit != null) ? (n2 * criticalHit.getDamageModifier()) : n2) + n3) && EnchantmentHelper.getKnockbackModifier((EntityLivingBase)this) + ((this.isSprinting() && EnchantmentHelper.getKnockbackModifier((EntityLivingBase)this) > 0.9) ? 1 : 0) > 0) {
                    Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.setSprinting(true);
                    this.motionX = 10.0 * this.motionX / 6.0;
                    this.motionY = 10.0 * this.motionY / 6.0;
                }
            }
        }
    }
    
    @Inject(method = { "sendChatMessage" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "sendChatMessage" }, at = { @At("HEAD") }, cancellable = true)
    private void Method7417(final String s, final CallbackInfo callbackInfo) {
        final ChatEvent chatEvent = new ChatEvent(s);
        final IBaritone baritoneForPlayer = BaritoneAPI.getProvider().getBaritoneForPlayer((EntityPlayerSP)this);
        if (baritoneForPlayer == null) {
            return;
        }
        baritoneForPlayer.getGameEventHandler().onSendChatMessage(chatEvent);
        if (chatEvent.isCancelled()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "onUpdate" }, at = { @At(value = "INVOKE", target = "net/minecraft/client/entity/EntityPlayerSP.isRiding()Z", shift = At.Shift.BY, by = -3) })
    @Inject(method = { "onUpdate" }, at = { @At(value = "INVOKE", target = "net/minecraft/client/entity/EntityPlayerSP.isRiding()Z", shift = At.Shift.BY, by = -3) })
    private void Method7418(final CallbackInfo callbackInfo) {
        final IBaritone baritoneForPlayer = BaritoneAPI.getProvider().getBaritoneForPlayer((EntityPlayerSP)this);
        if (baritoneForPlayer != null) {
            baritoneForPlayer.getGameEventHandler().onPlayerUpdate(new PlayerUpdateEvent(EventState.PRE));
        }
    }
    
    @Inject(method = { "onUpdate" }, at = { @At(value = "INVOKE", target = "net/minecraft/client/entity/EntityPlayerSP.onUpdateWalkingPlayer()V", shift = At.Shift.BY, by = 2) })
    @Inject(method = { "onUpdate" }, at = { @At(value = "INVOKE", target = "net/minecraft/client/entity/EntityPlayerSP.onUpdateWalkingPlayer()V", shift = At.Shift.BY, by = 2) })
    private void Method7419(final CallbackInfo callbackInfo) {
        final IBaritone baritoneForPlayer = BaritoneAPI.getProvider().getBaritoneForPlayer((EntityPlayerSP)this);
        if (baritoneForPlayer != null) {
            baritoneForPlayer.getGameEventHandler().onPlayerUpdate(new PlayerUpdateEvent(EventState.POST));
        }
    }
    
    @Redirect(method = { "onLivingUpdate" }, at = @At(value = "FIELD", target = "net/minecraft/entity/player/PlayerCapabilities.allowFlying:Z"))
    @Redirect(method = { "onLivingUpdate" }, at = @At(value = "FIELD", target = "net/minecraft/entity/player/PlayerCapabilities.allowFlying:Z"))
    private boolean Method7420(final PlayerCapabilities playerCapabilities) {
        final IBaritone baritoneForPlayer = BaritoneAPI.getProvider().getBaritoneForPlayer((EntityPlayerSP)this);
        if (baritoneForPlayer == null) {
            return playerCapabilities.allowFlying;
        }
        return !baritoneForPlayer.getPathingBehavior().isPathing() && playerCapabilities.allowFlying;
    }
    
    @Redirect(method = { "onLivingUpdate" }, at = @At(value = "INVOKE", target = "net/minecraft/client/settings/KeyBinding.isKeyDown()Z"))
    @Redirect(method = { "onLivingUpdate" }, at = @At(value = "INVOKE", target = "net/minecraft/client/settings/KeyBinding.isKeyDown()Z"))
    private boolean Method7421(final KeyBinding keyBinding) {
        final IBaritone baritoneForPlayer = BaritoneAPI.getProvider().getBaritoneForPlayer((EntityPlayerSP)this);
        if (baritoneForPlayer == null) {
            return keyBinding.isKeyDown();
        }
        final SprintStateEvent sprintStateEvent = new SprintStateEvent();
        baritoneForPlayer.getGameEventHandler().onPlayerSprintState(sprintStateEvent);
        if (sprintStateEvent.getState() != null) {
            return sprintStateEvent.getState();
        }
        return baritoneForPlayer == BaritoneAPI.getProvider().getPrimaryBaritone() && keyBinding.isKeyDown();
    }
    
    @Inject(method = { "updateRidden" }, at = { @At("HEAD") })
    @Inject(method = { "updateRidden" }, at = { @At("HEAD") })
    private void Method7422(final CallbackInfo callbackInfo) {
        final IBaritone baritoneForPlayer = BaritoneAPI.getProvider().getBaritoneForPlayer((EntityPlayerSP)this);
        if (baritoneForPlayer != null) {
            ((LookBehavior)baritoneForPlayer.getLookBehavior()).pig();
        }
    }
    
    public void Method194() {
        this.Method7410();
    }
}
