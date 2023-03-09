//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 */
package lavahack.client;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Class156 {
    private final String Field8612;
    private final ItemStack Field8613;
    private final boolean Field8614;
    private int Field8615;

    public Class156(String string, ItemStack itemStack, boolean bl) {
        this(string, itemStack.getItem(), itemStack.getItemDamage(), bl);
    }

    public Class156(String string, Item item, int n, boolean bl) {
        this.Field8612 = string;
        this.Field8614 = bl;
        this.Field8613 = new ItemStack(item, 1, n);
    }

    public Class156(String string, Block block, int n, boolean bl) {
        this.Field8612 = string;
        this.Field8614 = bl;
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

