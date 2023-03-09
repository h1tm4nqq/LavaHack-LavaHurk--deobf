//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.ItemStack
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nonnull;
import lavahack.client.Class686;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;

public class Class1885
implements Class686 {
    private static final ItemStack Field16686 = new ItemStack((Block)Blocks.GRASS);
    private ItemStack Field16687;
    private final short[][][] Field16688;
    private final byte[][][] Field16689;
    private final List Field16690 = new ArrayList();
    private final List Field16691 = new ArrayList();
    private final int Field16692;
    private final int Field16693;
    private final int Field16694;
    private String Field16695;
    private String Field16696 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1885(ItemStack itemStack, int n, int n2, int n3) {
        this(itemStack, n, n2, n3, "");
    }

    public Class1885(ItemStack itemStack, int n, int n2, int n3, @Nonnull @Nonnull String string) {
        if (string == null) {
            throw new IllegalArgumentException("Author cannot be null");
        }
        this.Field16687 = itemStack;
        this.Field16688 = new short[n][n2][n3];
        this.Field16689 = new byte[n][n2][n3];
        this.Field16692 = n;
        this.Field16693 = n2;
        this.Field16694 = n3;
        this.Field16695 = string;
    }

    @Override
    public IBlockState Method2880(BlockPos blockPos) {
        if (!this.Method6992(blockPos)) {
            return Blocks.AIR.getDefaultState();
        }
        int n = blockPos.getX();
        int n2 = blockPos.getY();
        int n3 = blockPos.getZ();
        Block block = (Block)Block.REGISTRY.getObjectById((int)this.Field16688[n][n2][n3]);
        return block.getStateFromMeta((int)this.Field16689[n][n2][n3]);
    }

    @Override
    public boolean Method2881(BlockPos blockPos, IBlockState iBlockState) {
        if (!this.Method6992(blockPos)) {
            return false;
        }
        Block block = iBlockState.getBlock();
        int n = Block.REGISTRY.getIDForObject((Object)block);
        if (n == -1) {
            return false;
        }
        int n2 = block.getMetaFromState(iBlockState);
        int n3 = blockPos.getX();
        int n4 = blockPos.getY();
        int n5 = blockPos.getZ();
        this.Field16688[n3][n4][n5] = (short)n;
        this.Field16689[n3][n4][n5] = (byte)n2;
        return true;
    }

    @Override
    public TileEntity Method2882(BlockPos blockPos) {
        TileEntity tileEntity;
        Iterator iterator = this.Field16690.iterator();
        do {
            if (!iterator.hasNext()) return null;
        } while (!(tileEntity = (TileEntity)iterator.next()).getPos().equals((Object)blockPos));
        return tileEntity;
    }

    @Override
    public List Method2883() {
        return this.Field16690;
    }

    @Override
    public void Method2884(BlockPos blockPos, TileEntity tileEntity) {
        if (!this.Method6992(blockPos)) {
            return;
        }
        this.Method2885(blockPos);
        if (tileEntity == null) return;
        this.Field16690.add(tileEntity);
    }

    @Override
    public void Method2885(BlockPos blockPos) {
        Iterator iterator = this.Field16690.iterator();
        while (iterator.hasNext()) {
            TileEntity tileEntity = (TileEntity)iterator.next();
            if (!tileEntity.getPos().equals((Object)blockPos)) continue;
            iterator.remove();
        }
    }

    @Override
    public List Method2886() {
        return this.Field16691;
    }

    @Override
    public void Method2887(Entity entity) {
        Entity entity2;
        if (entity == null) return;
        if (entity.getUniqueID() == null) return;
        if (entity instanceof EntityPlayer) {
            return;
        }
        Iterator iterator = this.Field16691.iterator();
        do {
            if (!iterator.hasNext()) {
                this.Field16691.add(entity);
                return;
            }
            entity2 = (Entity)iterator.next();
        } while (!entity.getUniqueID().equals(entity2.getUniqueID()));
    }

    @Override
    public void Method2888(Entity entity) {
        if (entity == null) return;
        if (entity.getUniqueID() == null) {
            return;
        }
        Iterator iterator = this.Field16691.iterator();
        while (iterator.hasNext()) {
            Entity entity2 = (Entity)iterator.next();
            if (!entity.getUniqueID().equals(entity2.getUniqueID())) continue;
            iterator.remove();
        }
    }

    @Override
    public ItemStack Method2889() {
        return this.Field16687;
    }

    @Override
    public void Method2890(ItemStack itemStack) {
        if (itemStack != null) {
            this.Field16687 = itemStack;
            return;
        }
        this.Field16687 = Field16686.copy();
    }

    @Override
    public int Method2891() {
        return this.Field16692;
    }

    @Override
    public int Method2892() {
        return this.Field16694;
    }

    @Override
    public int Method2893() {
        return this.Field16693;
    }

    private boolean Method6992(BlockPos blockPos) {
        int n = blockPos.getX();
        int n2 = blockPos.getY();
        int n3 = blockPos.getZ();
        if (n < 0) return false;
        if (n2 < 0) return false;
        if (n3 < 0) return false;
        if (n >= this.Field16692) return false;
        if (n2 >= this.Field16693) return false;
        if (n3 >= this.Field16694) return false;
        return true;
    }

    @Override
    @Nonnull
    @Nonnull
    public String Method2894() {
        return this.Field16695;
    }

    @Override
    public void Method2895(@Nonnull @Nonnull String string) {
        if (string == null) {
            throw new IllegalArgumentException("Author cannot be null");
        }
        this.Field16695 = string;
    }

    private static String Method6993(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 24;
            cArray2[n] = (char)(cArray[n] ^ (0x679C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

