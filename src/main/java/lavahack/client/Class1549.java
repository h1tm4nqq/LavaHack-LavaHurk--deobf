/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 */
package lavahack.client;

import com.kisman.cc.event.Class2157;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class1549
extends Class2157 {
    private final World Field15227;
    private final BlockPos Field15228;
    private final EnumFacing Field15229;
    private final EntityPlayer Field15230;
    private final ItemStack Field15231;
    private int Field15232;

    public Class1549(World world, BlockPos blockPos, EnumFacing enumFacing, EntityPlayer entityPlayer, ItemStack itemStack) {
        super(new Object[0]);
        this.Field15227 = world;
        this.Field15228 = blockPos;
        this.Field15229 = enumFacing;
        this.Field15230 = entityPlayer;
        this.Field15231 = itemStack;
    }

    public World Method6116() {
        return this.Field15227;
    }

    public BlockPos Method6117() {
        return this.Field15228;
    }

    public EnumFacing Method6118() {
        return this.Field15229;
    }

    public EntityPlayer Method6119() {
        return this.Field15230;
    }

    public ItemStack Method6120() {
        return this.Field15231;
    }
}

