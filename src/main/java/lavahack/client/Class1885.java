//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.item.*;
import javax.annotation.*;
import net.minecraft.util.math.*;
import net.minecraft.block.state.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import net.minecraft.tileentity.*;
import java.util.*;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;

public class Class1885 implements Class686
{
    private static final ItemStack Field16686;
    private ItemStack Field16687;
    private final short[][][] Field16688;
    private final byte[][][] Field16689;
    private final List Field16690;
    private final List Field16691;
    private final int Field16692;
    private final int Field16693;
    private final int Field16694;
    private String Field16695;
    private String Field16696 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1885(final ItemStack itemStack, final int n, final int n2, final int n3) {
        this(itemStack, n, n2, n3, "");
    }
    
    public Class1885(final ItemStack field16687, final int field16688, final int field16689, final int field16690, @Nonnull @Nonnull final String field16691) {
        this.Field16690 = new ArrayList();
        this.Field16691 = new ArrayList();
        if (field16691 == null) {
            throw new IllegalArgumentException("Author cannot be null");
        }
        this.Field16687 = field16687;
        this.Field16688 = new short[field16688][field16689][field16690];
        this.Field16689 = new byte[field16688][field16689][field16690];
        this.Field16692 = field16688;
        this.Field16693 = field16689;
        this.Field16694 = field16690;
        this.Field16695 = field16691;
    }
    
    @Override
    public IBlockState Method2880(final BlockPos blockPos) {
        if (!this.Method6992(blockPos)) {
            return Blocks.AIR.getDefaultState();
        }
        final int getX = blockPos.getX();
        final int getY = blockPos.getY();
        final int getZ = blockPos.getZ();
        return ((Block)Block.REGISTRY.getObjectById((int)this.Field16688[getX][getY][getZ])).getStateFromMeta((int)this.Field16689[getX][getY][getZ]);
    }
    
    @Override
    public boolean Method2881(final BlockPos blockPos, final IBlockState blockState) {
        if (!this.Method6992(blockPos)) {
            return false;
        }
        final Block getBlock = blockState.getBlock();
        final int getIDForObject = Block.REGISTRY.getIDForObject((Object)getBlock);
        if (getIDForObject == -1) {
            return false;
        }
        final int getMetaFromState = getBlock.getMetaFromState(blockState);
        final int getX = blockPos.getX();
        final int getY = blockPos.getY();
        final int getZ = blockPos.getZ();
        this.Field16688[getX][getY][getZ] = (short)getIDForObject;
        this.Field16689[getX][getY][getZ] = (byte)getMetaFromState;
        return true;
    }
    
    @Override
    public TileEntity Method2882(final BlockPos blockPos) {
        for (final TileEntity tileEntity : this.Field16690) {
            if (tileEntity.getPos().equals((Object)blockPos)) {
                return tileEntity;
            }
        }
        return null;
    }
    
    @Override
    public List Method2883() {
        return this.Field16690;
    }
    
    @Override
    public void Method2884(final BlockPos blockPos, final TileEntity tileEntity) {
        if (!this.Method6992(blockPos)) {
            return;
        }
        this.Method2885(blockPos);
        if (tileEntity != null) {
            this.Field16690.add(tileEntity);
        }
    }
    
    @Override
    public void Method2885(final BlockPos blockPos) {
        final Iterator<TileEntity> iterator = (Iterator<TileEntity>)this.Field16690.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getPos().equals((Object)blockPos)) {
                iterator.remove();
            }
        }
    }
    
    @Override
    public List Method2886() {
        return this.Field16691;
    }
    
    @Override
    public void Method2887(final Entity entity) {
        if (entity == null || entity.getUniqueID() == null || entity instanceof EntityPlayer) {
            return;
        }
        final Iterator<Entity> iterator = this.Field16691.iterator();
        while (iterator.hasNext()) {
            if (entity.getUniqueID().equals(iterator.next().getUniqueID())) {
                return;
            }
        }
        this.Field16691.add(entity);
    }
    
    @Override
    public void Method2888(final Entity entity) {
        if (entity == null || entity.getUniqueID() == null) {
            return;
        }
        final Iterator<Entity> iterator = (Iterator<Entity>)this.Field16691.iterator();
        while (iterator.hasNext()) {
            if (entity.getUniqueID().equals(iterator.next().getUniqueID())) {
                iterator.remove();
            }
        }
    }
    
    @Override
    public ItemStack Method2889() {
        return this.Field16687;
    }
    
    @Override
    public void Method2890(final ItemStack field16687) {
        if (field16687 != null) {
            this.Field16687 = field16687;
        }
        else {
            this.Field16687 = Class1885.Field16686.copy();
        }
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
    
    private boolean Method6992(final BlockPos blockPos) {
        final int getX = blockPos.getX();
        final int getY = blockPos.getY();
        final int getZ = blockPos.getZ();
        return getX >= 0 && getY >= 0 && getZ >= 0 && getX < this.Field16692 && getY < this.Field16693 && getZ < this.Field16694;
    }
    
    @Nonnull
    @Nonnull
    @Override
    public String Method2894() {
        return this.Field16695;
    }
    
    @Override
    public void Method2895(@Nonnull @Nonnull final String field16695) {
        if (field16695 == null) {
            throw new IllegalArgumentException("Author cannot be null");
        }
        this.Field16695 = field16695;
    }
    
    static {
        Field16686 = new ItemStack((Block)Blocks.GRASS);
    }
    
    private static String Method6993(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x679C ^ 0x18));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
