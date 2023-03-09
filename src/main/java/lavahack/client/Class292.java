//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.CompressedStreamTools
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.ResourceLocation
 */
package lavahack.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;

public final class Class292 {
    public static final ItemStack Field9248 = new ItemStack((Block)Blocks.GRASS);
    private String Field9249 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static NBTTagCompound Method1526(File file) throws IOException {
        return CompressedStreamTools.readCompressed((InputStream)new FileInputStream(file));
    }

    public static ItemStack Method1527(String string) {
        ResourceLocation resourceLocation = null;
        int n = 0;
        String[] stringArray = string.split(",");
        if (stringArray.length >= 1) {
            resourceLocation = new ResourceLocation(stringArray[0]);
            if (stringArray.length >= 2) {
                n = Integer.parseInt(stringArray[1]);
            }
        }
        if (resourceLocation == null) {
            return Field9248.copy();
        }
        ItemStack itemStack = new ItemStack((Block)Block.REGISTRY.getObject((Object)resourceLocation), 1, n);
        if (!itemStack.isEmpty()) {
            return itemStack;
        }
        ItemStack itemStack2 = new ItemStack((Item)Item.REGISTRY.getObject((Object)resourceLocation), 1, n);
        if (itemStack2.isEmpty()) return Field9248.copy();
        return itemStack2;
    }

    public static ItemStack Method1528(NBTTagCompound nBTTagCompound) {
        ItemStack itemStack = Field9248.copy();
        if (nBTTagCompound == null) return itemStack;
        if (!nBTTagCompound.hasKey("Icon")) return itemStack;
        itemStack.deserializeNBT(nBTTagCompound.getCompoundTag("Icon"));
        if (!itemStack.isEmpty()) return itemStack;
        return Field9248.copy();
    }

    public static ItemStack Method1529(File file) {
        return Class292.Method1528(Class292.Method1526(file));
    }

    private static String Method1530(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 118;
            cArray2[n] = (char)(cArray[n] ^ (0x2327 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

