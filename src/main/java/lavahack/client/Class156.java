//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.item.*;
import net.minecraft.block.*;

public class Class156
{
    private final String Field8612;
    private final ItemStack Field8613;
    private final boolean Field8614;
    private int Field8615;
    
    public Class156(final String s, final ItemStack itemStack, final boolean b) {
        this(s, itemStack.getItem(), itemStack.getItemDamage(), b);
    }
    
    public Class156(final String field8612, final Item item, final int n, final boolean field8613) {
        this.Field8612 = field8612;
        this.Field8614 = field8613;
        this.Field8613 = new ItemStack(item, 1, n);
    }
    
    public Class156(final String field8612, final Block block, final int n, final boolean field8613) {
        this.Field8612 = field8612;
        this.Field8614 = field8613;
        this.Field8613 = new ItemStack(block, 1, n);
    }
    
    public String Method1049() {
        return this.Field8612;
    }
    
    public Item Method1050() {
        return this.Field8613.getItem();
    }
    
    public int Method1051() {
        return this.Field8613.getItemDamage();
    }
    
    public boolean Method1052() {
        return this.Field8614;
    }
    
    public ItemStack Method1053() {
        return this.Field8613;
    }
}
