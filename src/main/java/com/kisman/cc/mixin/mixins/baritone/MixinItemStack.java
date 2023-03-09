/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.accessor.IItemStack
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins.baritone;

import baritone.api.utils.accessor.IItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={ItemStack.class})
public class MixinItemStack
implements IItemStack {
    @Shadow
    @Final
    public Item Field10336;
    @Shadow
    public int Field10337;
    @Unique
    private int Field10338;

    private void recalculateHash() {
        MixinItemStack mixinItemStack = this;
        this.Field10338 = -1;
    }

    @Inject(method={"<init>*"}, at={@At(value="RETURN")})
    @Inject(method={"<init>*"}, at={@At(value="RETURN")})
    private void onInit(CallbackInfo callbackInfo) {
        this.recalculateHash();
    }

    @Inject(method={"setItemDamage"}, at={@At(value="TAIL")})
    @Inject(method={"setItemDamage"}, at={@At(value="TAIL")})
    private void onItemDamageSet(CallbackInfo callbackInfo) {
        this.recalculateHash();
    }

    public int getBaritoneHash() {
        return this.Field10338;
    }
}

