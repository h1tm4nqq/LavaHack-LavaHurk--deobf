//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.util.text.TextFormatting
 */
package lavahack.client;

import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.text.TextFormatting;

public class Class1290 {
    private String Field13888 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static IProperty Method5239(IBlockState iBlockState, String string) {
        IProperty iProperty;
        Iterator iterator = iBlockState.getPropertyKeys().iterator();
        do {
            if (!iterator.hasNext()) return null;
        } while (!(iProperty = (IProperty)iterator.next()).getName().equals(string));
        return iProperty;
    }

    public static Comparable Method5240(IBlockState iBlockState, String string) {
        IProperty iProperty = Class1290.Method5239(iBlockState, string);
        if (iProperty != null) return iBlockState.getValue(iProperty);
        throw new IllegalArgumentException(string + " does not exist in " + iBlockState);
    }

    public static List Method5241(IBlockState iBlockState) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Iterator iterator = ((ImmutableSet)iBlockState.getProperties().entrySet()).iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            IProperty iProperty = (IProperty)entry.getKey();
            Comparable comparable = (Comparable)entry.getValue();
            String string = comparable.toString();
            if (Boolean.TRUE.equals(comparable)) {
                string = TextFormatting.GREEN + string + TextFormatting.RESET;
            } else if (Boolean.FALSE.equals(comparable)) {
                string = TextFormatting.RED + string + TextFormatting.RESET;
            }
            arrayList.add(iProperty.getName() + ": " + string);
        }
        return arrayList;
    }

    public static boolean Method5242(IBlockState iBlockState, IBlockState iBlockState2) {
        Block block;
        if (iBlockState == iBlockState2) {
            return true;
        }
        Block block2 = iBlockState.getBlock();
        if (block2 != (block = iBlockState2.getBlock())) return false;
        if (block2.getMetaFromState(iBlockState) != block.getMetaFromState(iBlockState2)) return false;
        return true;
    }

    private static String Method5243(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 108;
            cArray2[n] = (char)(cArray[n] ^ (0x79FC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

