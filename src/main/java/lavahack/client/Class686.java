//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import net.minecraft.block.state.*;
import net.minecraft.tileentity.*;
import java.util.*;
import net.minecraft.entity.*;
import net.minecraft.item.*;
import javax.annotation.*;

public interface Class686
{
    IBlockState Method2880(final BlockPos p0);
    
    boolean Method2881(final BlockPos p0, final IBlockState p1);
    
    TileEntity Method2882(final BlockPos p0);
    
    List Method2883();
    
    void Method2884(final BlockPos p0, final TileEntity p1);
    
    void Method2885(final BlockPos p0);
    
    List Method2886();
    
    void Method2887(final Entity p0);
    
    void Method2888(final Entity p0);
    
    ItemStack Method2889();
    
    void Method2890(final ItemStack p0);
    
    int Method2891();
    
    int Method2892();
    
    int Method2893();
    
    @Nonnull
    @Nonnull
    String Method2894();
    
    void Method2895(@Nonnull @Nonnull final String p0);
}
