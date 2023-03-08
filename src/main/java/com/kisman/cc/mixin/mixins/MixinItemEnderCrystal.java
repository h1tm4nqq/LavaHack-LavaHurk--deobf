//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import lavahack.client.*;
import net.minecraft.client.*;
import net.minecraft.client.entity.*;
import java.util.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ ItemEndCrystal.class })
public class MixinItemEnderCrystal
{
    @Redirect(method = { "onItemUse" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;getEntitiesWithinAABBExcludingEntity(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/AxisAlignedBB;)Ljava/util/List;", remap = false))
    @Redirect(method = { "onItemUse" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;getEntitiesWithinAABBExcludingEntity(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/AxisAlignedBB;)Ljava/util/List;", remap = false))
    private List Method6510(final World world, final Entity entity, final AxisAlignedBB axisAlignedBB) {
        final List getEntitiesWithinAABBExcludingEntity = world.getEntitiesWithinAABBExcludingEntity(entity, axisAlignedBB);
        if (!AgUkNNp6h0gOf2NNPecFmCotl8eelugl.Field9377.Method35()) {
            return getEntitiesWithinAABBExcludingEntity;
        }
        final EntityPlayerSP player = Minecraft.getMinecraft().player;
        if (player == null) {
            return getEntitiesWithinAABBExcludingEntity;
        }
        final Iterator<Entity> iterator = getEntitiesWithinAABBExcludingEntity.iterator();
        while (iterator.hasNext()) {
            if (((Entity)player).equals((Object)iterator.next())) {
                continue;
            }
            return getEntitiesWithinAABBExcludingEntity;
        }
        return new ArrayList(0);
    }
}
