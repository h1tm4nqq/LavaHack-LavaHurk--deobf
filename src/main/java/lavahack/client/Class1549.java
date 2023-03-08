//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.event.*;
import net.minecraft.world.*;
import net.minecraft.util.math.*;
import net.minecraft.util.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;

public class Class1549 extends Class2157
{
    private final World Field15227;
    private final BlockPos Field15228;
    private final EnumFacing Field15229;
    private final EntityPlayer Field15230;
    private final ItemStack Field15231;
    private int Field15232;
    
    public Class1549(final World field15227, final BlockPos field15228, final EnumFacing field15229, final EntityPlayer field15230, final ItemStack field15231) {
        super(new Object[0]);
        this.Field15227 = field15227;
        this.Field15228 = field15228;
        this.Field15229 = field15229;
        this.Field15230 = field15230;
        this.Field15231 = field15231;
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
