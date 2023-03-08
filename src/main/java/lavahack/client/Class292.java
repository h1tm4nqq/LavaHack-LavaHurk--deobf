//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.nbt.*;
import java.io.*;
import net.minecraft.util.*;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.init.*;

public final class Class292
{
    public static final ItemStack Field9248;
    private String Field9249 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static NBTTagCompound Method1526(final File file) throws IOException {
        return CompressedStreamTools.readCompressed((InputStream)new FileInputStream(file));
    }
    
    public static ItemStack Method1527(final String s) {
        Object o = null;
        int int1 = 0;
        final String[] split = s.split(",");
        if (split.length >= 1) {
            o = new ResourceLocation(split[0]);
            if (split.length >= 2) {
                int1 = Integer.parseInt(split[1]);
            }
        }
        if (o == null) {
            return Class292.Field9248.copy();
        }
        final ItemStack itemStack = new ItemStack((Block)Block.REGISTRY.getObject(o), 1, int1);
        if (!itemStack.isEmpty()) {
            return itemStack;
        }
        final ItemStack itemStack2 = new ItemStack((Item)Item.REGISTRY.getObject(o), 1, int1);
        if (!itemStack2.isEmpty()) {
            return itemStack2;
        }
        return Class292.Field9248.copy();
    }
    
    public static ItemStack Method1528(final NBTTagCompound nbtTagCompound) {
        ItemStack itemStack = Class292.Field9248.copy();
        if (nbtTagCompound != null && nbtTagCompound.hasKey("Icon")) {
            itemStack.deserializeNBT(nbtTagCompound.getCompoundTag("Icon"));
            if (itemStack.isEmpty()) {
                itemStack = Class292.Field9248.copy();
            }
        }
        return itemStack;
    }
    
    public static ItemStack Method1529(final File file) {
        return Method1528(Method1526(file));
    }
    
    static {
        Field9248 = new ItemStack((Block)Blocks.GRASS);
    }
    
    private static String Method1530(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2327 ^ 0x76));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
