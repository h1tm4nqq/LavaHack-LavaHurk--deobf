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

public final class kQ72jH1kluusFFUnlWwOgQ64UIYIqb8r {
    public static final ItemStack Field9248 = new ItemStack((Block)Blocks.GRASS);
    private String Field9249 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static NBTTagCompound Method1526(File file) throws IOException {
        return CompressedStreamTools.readCompressed((InputStream)new FileInputStream(file));
    }

    public static ItemStack Method1527(String string) {
        ResourceLocation resourceLocation = null;
        int n = (int)((long)-1460851900 ^ (long)-1460851900);
        String[] stringArray = string.split(",");
        if (stringArray.length >= (int)((long)1146814584 ^ (long)1146814585)) {
            resourceLocation = new ResourceLocation(stringArray[(int)-711150641L ^ 0xD59CB3CF]);
            if (stringArray.length >= (int)((long)116006987 ^ (long)116006986) << 1) {
                n = Integer.parseInt(stringArray[(int)((long)729283162 ^ (long)729283163)]);
            }
        }
        if (resourceLocation == null) {
            return Field9248.copy();
        }
        ItemStack itemStack = new ItemStack((Block)Block.REGISTRY.getObject(resourceLocation), (int)1274832973L ^ 0x4BFC684C, n);
        if (!itemStack.isEmpty()) {
            return itemStack;
        }
        ItemStack itemStack2 = new ItemStack((Item)Item.REGISTRY.getObject((Object)resourceLocation), (int)((long)1637921173 ^ (long)1637921172), n);
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
        return kQ72jH1kluusFFUnlWwOgQ64UIYIqb8r.Method1528(kQ72jH1kluusFFUnlWwOgQ64UIYIqb8r.Method1526(file));
    }

    private static String Method1530(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-197806734 ^ (long)-197806734);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1256692348L ^ 0xB518657B);
            int n2 = ((int)1237958308L ^ 0x49C9BE9F) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)495155605L ^ 0x1D835AB2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

