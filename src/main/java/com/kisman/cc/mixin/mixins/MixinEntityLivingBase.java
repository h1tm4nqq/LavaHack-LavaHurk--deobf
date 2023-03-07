//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  baritone.api.event.events.RotationMoveEvent
 *  baritone.api.event.events.RotationMoveEvent$Type
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.enchantment.EnchantmentFrostWalker
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.init.MobEffects
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.potion.Potion
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 *  net.minecraftforge.common.ForgeHooks
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.kisman.cc.mixin.mixins;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.event.events.RotationMoveEvent;
import lavahack.client.XHh6LxzsMsYojVdsucnzK8xgAxxpPHHM;
import lavahack.client.h0AuVBZmEkUBaAj9F9SkgGEp9yp1wdfP;
import lavahack.client.j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.enchantment.EnchantmentFrostWalker;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={EntityLivingBase.class}, priority=10000)
public abstract class MixinEntityLivingBase
extends Entity {
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
    public boolean isPotionActive(Potion potion) {
        return false;
    }

    @Shadow
    @Shadow
    public PotionEffect getActivePotionEffect(Potion potion) {
        return null;
    }

    @Shadow
    @Shadow
    protected void entityInit() {
    }

    @Shadow
    @Shadow
    public void readEntityFromNBT(NBTTagCompound nBTTagCompound) {
    }

    @Shadow
    @Shadow
    public void writeEntityToNBT(NBTTagCompound nBTTagCompound) {
    }

    @Shadow
    @Shadow
    protected float getJumpUpwardsMotion() {
        return 0.0f;
    }

    public MixinEntityLivingBase(World world) {
        super(world);
    }

    @Inject(method={"getArmSwingAnimationEnd"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"getArmSwingAnimationEnd"}, at={@At(value="HEAD")}, cancellable=true)
    private void yesido(CallbackInfoReturnable callbackInfoReturnable) {
        int n = this.isPotionActive(MobEffects.HASTE) ? 6 - (1 + this.getActivePotionEffect(MobEffects.HASTE).getAmplifier()) : (this.isPotionActive(MobEffects.MINING_FATIGUE) ? 6 + (1 + this.getActivePotionEffect(MobEffects.MINING_FATIGUE).getAmplifier()) * 2 : 6);
        ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS2 = new ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS(n);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS2);
        callbackInfoReturnable.setReturnValue((Object)ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS2.Method1670());
        callbackInfoReturnable.cancel();
    }

    public MixinEntityLivingBase(World world, RotationMoveEvent rotationMoveEvent) {
        super(world);
        this.Field13302 = rotationMoveEvent;
    }

    @Inject(method={"jump"}, at={@At(value="HEAD")})
    @Inject(method={"jump"}, at={@At(value="HEAD")})
    private void preMoveRelative(CallbackInfo callbackInfo) {
        IBaritone iBaritone;
        if (EntityPlayerSP.class.isInstance((Object)this) && (iBaritone = BaritoneAPI.getProvider().getBaritoneForPlayer((EntityPlayerSP)this)) != null) {
            this.Field13302 = new RotationMoveEvent(RotationMoveEvent.Type.JUMP, this.rotationYaw);
            iBaritone.getGameEventHandler().onPlayerRotationMove(this.Field13302);
        }
        if (!j6wqRI5NCmTxusQdstfOqgOEsdgvYIZM.Field10181.Field10175.Method365()) return;
        if (!Minecraft.getMinecraft().player.getName().equals(this.getName())) return;
        this.motionY = this.getJumpUpwardsMotion() + (this.isPotionActive(MobEffects.JUMP_BOOST) ? (float)(this.getActivePotionEffect(MobEffects.JUMP_BOOST).getAmplifier() + 1) * 0.1f : 0.0f);
        this.isAirBorne = true;
        ForgeHooks.onLivingJump((EntityLivingBase)((EntityLivingBase)this));
        callbackInfo.cancel();
    }

    @Redirect(method={"jump"}, at=@At(value="FIELD", opcode=180, target="net/minecraft/entity/EntityLivingBase.rotationYaw:F"))
    @Redirect(method={"jump"}, at=@At(value="FIELD", opcode=180, target="net/minecraft/entity/EntityLivingBase.rotationYaw:F"))
    private float overrideYaw(EntityLivingBase entityLivingBase) {
        if (!(entityLivingBase instanceof EntityPlayerSP)) return entityLivingBase.rotationYaw;
        if (BaritoneAPI.getProvider().getBaritoneForPlayer((EntityPlayerSP)this) == null) return entityLivingBase.rotationYaw;
        return this.Field13302.getYaw();
    }

    @Redirect(method={"travel"}, at=@At(value="INVOKE", target="net/minecraft/entity/EntityLivingBase.moveRelative(FFFF)V"))
    @Redirect(method={"travel"}, at=@At(value="INVOKE", target="net/minecraft/entity/EntityLivingBase.moveRelative(FFFF)V"))
    private void travel(EntityLivingBase entityLivingBase, float f, float f2, float f3, float f4) {
        if (EntityPlayerSP.class.isInstance((Object)this) && BaritoneAPI.getProvider().getBaritoneForPlayer((EntityPlayerSP)this) != null) {
            RotationMoveEvent rotationMoveEvent = new RotationMoveEvent(RotationMoveEvent.Type.MOTION_UPDATE, this.rotationYaw);
            BaritoneAPI.getProvider().getBaritoneForPlayer((EntityPlayerSP)this).getGameEventHandler().onPlayerRotationMove(rotationMoveEvent);
            float f5 = this.rotationYaw;
            this.rotationYaw = rotationMoveEvent.getYaw();
            this.moveRelative(f, f2, f3, f4);
            this.rotationYaw = f5;
            return;
        }
        this.moveRelative(f, f2, f3, f4);
    }

    @Inject(method={"frostWalk"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"frostWalk"}, at={@At(value="HEAD")}, cancellable=true)
    public void frostWalk(BlockPos blockPos, CallbackInfo callbackInfo) {
        if (!h0AuVBZmEkUBaAj9F9SkgGEp9yp1wdfP.Field9826.Method35()) {
            return;
        }
        EnchantmentFrostWalker.freezeNearby((EntityLivingBase)Minecraft.getMinecraft().player, (World)this.world, (BlockPos)blockPos, (int)h0AuVBZmEkUBaAj9F9SkgGEp9yp1wdfP.Field9826.Field9825.Method335());
        callbackInfo.cancel();
    }

    @Inject(method={"updateArmSwingProgress"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"updateArmSwingProgress"}, at={@At(value="HEAD")}, cancellable=true)
    public void updateArmSwingProgress(CallbackInfo callbackInfo) {
        if (!XHh6LxzsMsYojVdsucnzK8xgAxxpPHHM.Field16334.Method35()) {
            return;
        }
        this.Field13301 = XHh6LxzsMsYojVdsucnzK8xgAxxpPHHM.Field16334.Field16333.Method335();
        this.Field13300 = (float)this.Field13301 / 6.0f;
        callbackInfo.cancel();
    }
}

