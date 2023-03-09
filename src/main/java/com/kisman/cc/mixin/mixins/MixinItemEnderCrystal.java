//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.AgUkNNp6h0gOf2NNPecFmCotl8eelugl
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
 *  net.minecraft.item.ItemEndCrystal
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.world.World
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package com.kisman.cc.mixin.mixins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lavahack.client.AgUkNNp6h0gOf2NNPecFmCotl8eelugl;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemEndCrystal;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={ItemEndCrystal.class})
public class MixinItemEnderCrystal {
    @Redirect(method={"onItemUse"}, at=@At(value="INVOKE", target="Lnet/minecraft/world/World;getEntitiesWithinAABBExcludingEntity(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/AxisAlignedBB;)Ljava/util/List;", remap=false))
    @Redirect(method={"onItemUse"}, at=@At(value="INVOKE", target="Lnet/minecraft/world/World;getEntitiesWithinAABBExcludingEntity(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/AxisAlignedBB;)Ljava/util/List;", remap=false))
    private List Method6510(World world, Entity entity, AxisAlignedBB axisAlignedBB) {
        List list = world.getEntitiesWithinAABBExcludingEntity(entity, axisAlignedBB);
        if (!AgUkNNp6h0gOf2NNPecFmCotl8eelugl.Field9377.Method35()) return list;
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
        if (entityPlayerSP == null) {
            return list;
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Entity entity2 = (Entity)iterator.next();
            if (!entityPlayerSP.equals((Object)entity2)) return list;
        }
        return new ArrayList(0);
    }
}

