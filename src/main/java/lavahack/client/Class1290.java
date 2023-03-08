//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.block.state.*;
import net.minecraft.block.properties.*;
import java.util.*;
import net.minecraft.util.text.*;
import com.google.common.collect.*;
import net.minecraft.block.*;

public class Class1290
{
    private String Field13888 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static IProperty Method5239(final IBlockState blockState, final String anObject) {
        for (final IProperty property : blockState.getPropertyKeys()) {
            if (property.getName().equals(anObject)) {
                return property;
            }
        }
        return null;
    }
    
    public static Comparable Method5240(final IBlockState obj, final String str) {
        final IProperty method5239 = Method5239(obj, str);
        if (method5239 == null) {
            throw new IllegalArgumentException(str + " does not exist in " + obj);
        }
        return obj.getValue(method5239);
    }
    
    public static List Method5241(final IBlockState blockState) {
        final ArrayList<String> list = new ArrayList<String>();
        for (final Map.Entry<IProperty, V> entry : blockState.getProperties().entrySet()) {
            final IProperty property = entry.getKey();
            final Comparable comparable = (Comparable)entry.getValue();
            String str = comparable.toString();
            if (Boolean.TRUE.equals(comparable)) {
                str = TextFormatting.GREEN + str + TextFormatting.RESET;
            }
            else if (Boolean.FALSE.equals(comparable)) {
                str = TextFormatting.RED + str + TextFormatting.RESET;
            }
            list.add(property.getName() + ": " + str);
        }
        return list;
    }
    
    public static boolean Method5242(final IBlockState blockState, final IBlockState blockState2) {
        if (blockState == blockState2) {
            return true;
        }
        final Block getBlock = blockState.getBlock();
        final Block getBlock2 = blockState2.getBlock();
        return getBlock == getBlock2 && getBlock.getMetaFromState(blockState) == getBlock2.getMetaFromState(blockState2);
    }
    
    private static String Method5243(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x79FC ^ 0x6C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
