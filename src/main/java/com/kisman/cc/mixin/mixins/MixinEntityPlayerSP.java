//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  baritone.api.event.events.ChatEvent
 *  baritone.api.event.events.PlayerUpdateEvent
 *  baritone.api.event.events.SprintStateEvent
 *  baritone.api.event.events.type.EventState
 *  baritone.behavior.LookBehavior
 *  com.kisman.cc.event.Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A
 *  com.mojang.authlib.GameProfile
 *  lavahack.client.GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x
 *  lavahack.client.RG0Ef4LzpvaRaWkCktLl94QMei9n80rd
 *  lavahack.client.ZzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ
 *  lavahack.client.jNiJm0uQgY2wVhFel4twUsWMig1Nujvc
 *  lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  lavahack.client.o5s3arbQ7LWXjnlx1sQl8MhGwb7FX7LT
 *  lavahack.client.uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.EnumCreatureAttribute
 *  net.minecraft.entity.MoverType
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.PlayerCapabilities
 *  net.minecraft.init.MobEffects
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.MovementInput
 *  net.minecraft.world.World
 *  net.minecraftforge.common.ForgeHooks
 *  net.minecraftforge.event.entity.player.CriticalHitEvent
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.kisman.cc.mixin.mixins;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.event.events.ChatEvent;
import baritone.api.event.events.PlayerUpdateEvent;
import baritone.api.event.events.SprintStateEvent;
import baritone.api.event.events.type.EventState;
import baritone.behavior.LookBehavior;
import com.kisman.cc.event.Event;
import com.kisman.cc.mixin.mixins.MixinAbstractClientPlayer;
import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import com.mojang.authlib.GameProfile;
import lavahack.client.GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x;
import lavahack.client.RG0Ef4LzpvaRaWkCktLl94QMei9n80rd;
import lavahack.client.ZzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ;
import lavahack.client.jNiJm0uQgY2wVhFel4twUsWMig1Nujvc;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.o5s3arbQ7LWXjnlx1sQl8MhGwb7FX7LT;
import lavahack.client.uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovementInput;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.event.entity.player.CriticalHitEvent;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={EntityPlayerSP.class}, priority=10000)
public class MixinEntityPlayerSP
extends MixinAbstractClientPlayer
implements o5s3arbQ7LWXjnlx1sQl8MhGwb7FX7LT {
    @Shadow
    public MovementInput Field17184;

    public MixinEntityPlayerSP(World world, GameProfile gameProfile) {
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

    @Inject(method={"move"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"move"}, at={@At(value="HEAD")}, cancellable=true)
    public void Method7411(MoverType moverType, double d, double d2, double d3, CallbackInfo callbackInfo) {
        uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2 = new uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x(moverType, d, d2, d3);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2);
        if (!uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Method159()) return;
        super.move(moverType, uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Field14103, uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Field14104, uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Field14105);
        callbackInfo.cancel();
    }

    @Inject(method={"onUpdateWalkingPlayer"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"onUpdateWalkingPlayer"}, at={@At(value="HEAD")}, cancellable=true)
    public void Method7412(CallbackInfo callbackInfo) {
        RG0Ef4LzpvaRaWkCktLl94QMei9n80rd rG0Ef4LzpvaRaWkCktLl94QMei9n80rd = new RG0Ef4LzpvaRaWkCktLl94QMei9n80rd(Event.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13746, this.rotationYaw, this.rotationPitch, this.posX, this.getEntityBoundingBox().minY, this.posZ, this.onGround);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)rG0Ef4LzpvaRaWkCktLl94QMei9n80rd);
        this.rotationYaw = rG0Ef4LzpvaRaWkCktLl94QMei9n80rd.Method1733();
        this.rotationPitch = rG0Ef4LzpvaRaWkCktLl94QMei9n80rd.Method1735();
        if (!rG0Ef4LzpvaRaWkCktLl94QMei9n80rd.Method159()) return;
        callbackInfo.cancel();
    }

    @Inject(method={"onUpdateWalkingPlayer"}, at={@At(value="RETURN")}, cancellable=true)
    @Inject(method={"onUpdateWalkingPlayer"}, at={@At(value="RETURN")}, cancellable=true)
    public void Method7413(CallbackInfo callbackInfo) {
        RG0Ef4LzpvaRaWkCktLl94QMei9n80rd rG0Ef4LzpvaRaWkCktLl94QMei9n80rd = new RG0Ef4LzpvaRaWkCktLl94QMei9n80rd(Event.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13747, this.rotationYaw, this.rotationPitch, this.posX, this.getEntityBoundingBox().minY, this.posZ, this.onGround);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)rG0Ef4LzpvaRaWkCktLl94QMei9n80rd);
        if (!rG0Ef4LzpvaRaWkCktLl94QMei9n80rd.Method159()) return;
        callbackInfo.cancel();
    }

    @Inject(method={"onUpdate"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"onUpdate"}, at={@At(value="HEAD")}, cancellable=true)
    public void Method7414(CallbackInfo callbackInfo) {
        ZzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ zzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ = new ZzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)zzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ);
        if (!zzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ.Method159()) return;
        callbackInfo.cancel();
    }

    @Inject(method={"pushOutOfBlocks(DDD)Z"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"pushOutOfBlocks(DDD)Z"}, at={@At(value="HEAD")}, cancellable=true)
    public void Method7415(double d, double d2, double d3, CallbackInfoReturnable callbackInfoReturnable) {
        jNiJm0uQgY2wVhFel4twUsWMig1Nujvc jNiJm0uQgY2wVhFel4twUsWMig1Nujvc2 = new jNiJm0uQgY2wVhFel4twUsWMig1Nujvc(d, d2, d3);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)jNiJm0uQgY2wVhFel4twUsWMig1Nujvc2);
        if (!jNiJm0uQgY2wVhFel4twUsWMig1Nujvc2.Method159()) return;
        callbackInfoReturnable.setReturnValue((Object)false);
    }

    public void Method7416(@NotNull @NotNull Entity entity) {
        super.attackTargetEntityWithCurrentItem(entity);
        if (!((GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x)leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Method1162("MoveModifier")).Method7104().Method365()) return;
        if (!entity.canBeAttackedWithItem()) return;
        if (entity.hitByEntity((Entity)this)) return;
        float f = entity instanceof EntityLivingBase ? EnchantmentHelper.getModifierForCreature((ItemStack)this.getHeldItemMainhand(), (EnumCreatureAttribute)((EntityLivingBase)entity).getCreatureAttribute()) : EnchantmentHelper.getModifierForCreature((ItemStack)this.getHeldItemMainhand(), (EnumCreatureAttribute)EnumCreatureAttribute.UNDEFINED);
        float f2 = this.getCooledAttackStrength(0.5f);
        float f3 = (float)this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * (0.2f + f2 * f2 * 0.8f);
        f *= f2;
        if (!(f3 > 0.0f)) {
            if (!(f > 0.0f)) return;
        }
        boolean bl = !this.isSprinting() && f2 > 0.9f && this.fallDistance > 0.0f && !this.onGround && !this.isOnLadder() && !this.isInWater() && !this.isPotionActive(MobEffects.BLINDNESS) && !this.isRiding() && entity instanceof EntityLivingBase;
        CriticalHitEvent criticalHitEvent = ForgeHooks.getCriticalHit((EntityPlayer)this, (Entity)entity, (boolean)bl, (float)1.0f);
        if (!entity.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer)this), (criticalHitEvent != null ? f3 * criticalHitEvent.getDamageModifier() : f3) + f)) return;
        if (EnchantmentHelper.getKnockbackModifier((EntityLivingBase)this) + (this.isSprinting() && (double)EnchantmentHelper.getKnockbackModifier((EntityLivingBase)this) > 0.9 ? 1 : 0) <= 0) return;
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.setSprinting(true);
        this.motionX = 10.0 * this.motionX / 6.0;
        this.motionY = 10.0 * this.motionY / 6.0;
    }

    @Inject(method={"sendChatMessage"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"sendChatMessage"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method7417(String string, CallbackInfo callbackInfo) {
        ChatEvent chatEvent = new ChatEvent(string);
        IBaritone iBaritone = BaritoneAPI.getProvider().getBaritoneForPlayer((EntityPlayerSP)this);
        if (iBaritone == null) {
            return;
        }
        iBaritone.getGameEventHandler().onSendChatMessage(chatEvent);
        if (!chatEvent.isCancelled()) return;
        callbackInfo.cancel();
    }

    @Inject(method={"onUpdate"}, at={@At(value="INVOKE", target="net/minecraft/client/entity/EntityPlayerSP.isRiding()Z", shift=At.Shift.BY, by=-3)})
    @Inject(method={"onUpdate"}, at={@At(value="INVOKE", target="net/minecraft/client/entity/EntityPlayerSP.isRiding()Z", shift=At.Shift.BY, by=-3)})
    private void Method7418(CallbackInfo callbackInfo) {
        IBaritone iBaritone = BaritoneAPI.getProvider().getBaritoneForPlayer((EntityPlayerSP)this);
        if (iBaritone == null) return;
        iBaritone.getGameEventHandler().onPlayerUpdate(new PlayerUpdateEvent(EventState.PRE));
    }

    @Inject(method={"onUpdate"}, at={@At(value="INVOKE", target="net/minecraft/client/entity/EntityPlayerSP.onUpdateWalkingPlayer()V", shift=At.Shift.BY, by=2)})
    @Inject(method={"onUpdate"}, at={@At(value="INVOKE", target="net/minecraft/client/entity/EntityPlayerSP.onUpdateWalkingPlayer()V", shift=At.Shift.BY, by=2)})
    private void Method7419(CallbackInfo callbackInfo) {
        IBaritone iBaritone = BaritoneAPI.getProvider().getBaritoneForPlayer((EntityPlayerSP)this);
        if (iBaritone == null) return;
        iBaritone.getGameEventHandler().onPlayerUpdate(new PlayerUpdateEvent(EventState.POST));
    }

    @Redirect(method={"onLivingUpdate"}, at=@At(value="FIELD", target="net/minecraft/entity/player/PlayerCapabilities.allowFlying:Z"))
    @Redirect(method={"onLivingUpdate"}, at=@At(value="FIELD", target="net/minecraft/entity/player/PlayerCapabilities.allowFlying:Z"))
    private boolean Method7420(PlayerCapabilities playerCapabilities) {
        IBaritone iBaritone = BaritoneAPI.getProvider().getBaritoneForPlayer((EntityPlayerSP)this);
        if (iBaritone == null) {
            return playerCapabilities.allowFlying;
        }
        if (iBaritone.getPathingBehavior().isPathing()) return false;
        if (!playerCapabilities.allowFlying) return false;
        return true;
    }

    @Redirect(method={"onLivingUpdate"}, at=@At(value="INVOKE", target="net/minecraft/client/settings/KeyBinding.isKeyDown()Z"))
    @Redirect(method={"onLivingUpdate"}, at=@At(value="INVOKE", target="net/minecraft/client/settings/KeyBinding.isKeyDown()Z"))
    private boolean Method7421(KeyBinding keyBinding) {
        IBaritone iBaritone = BaritoneAPI.getProvider().getBaritoneForPlayer((EntityPlayerSP)this);
        if (iBaritone == null) {
            return keyBinding.isKeyDown();
        }
        SprintStateEvent sprintStateEvent = new SprintStateEvent();
        iBaritone.getGameEventHandler().onPlayerSprintState(sprintStateEvent);
        if (sprintStateEvent.getState() != null) {
            return sprintStateEvent.getState();
        }
        if (iBaritone == BaritoneAPI.getProvider().getPrimaryBaritone()) return keyBinding.isKeyDown();
        return false;
    }

    @Inject(method={"updateRidden"}, at={@At(value="HEAD")})
    @Inject(method={"updateRidden"}, at={@At(value="HEAD")})
    private void Method7422(CallbackInfo callbackInfo) {
        IBaritone iBaritone = BaritoneAPI.getProvider().getBaritoneForPlayer((EntityPlayerSP)this);
        if (iBaritone == null) return;
        ((LookBehavior)iBaritone.getLookBehavior()).pig();
    }

    public void Method194() {
        this.Method7410();
    }
}

