//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.block.state.*;
import net.minecraft.block.properties.*;
import net.minecraft.block.state.pattern.*;
import com.google.common.base.*;
import net.minecraft.util.*;
import net.minecraft.block.*;
import java.util.*;

public class Class2033
{
    private final IBlockState Field17355;
    private String Field17356 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class2033(final IBlockState field17355) {
        this.Field17355 = field17355;
    }
    
    public IBlockState Method7522(final IBlockState blockState, final Map map) {
        return this.Method7523(this.Method7523(this.Field17355, (Map)blockState.getProperties()), map);
    }
    
    private IBlockState Method7523(IBlockState withProperty, final Map map) {
        for (final Map.Entry<IProperty, V> entry : map.entrySet()) {
            withProperty = withProperty.withProperty((IProperty)entry.getKey(), (Comparable)entry.getValue());
        }
        return withProperty;
    }
    
    public static Class2033 Method7524(final IBlockState blockState) {
        return new Class2033(blockState);
    }
    
    public static BlockStateMatcher Method7525(final Class239 class239) {
        final BlockStateMatcher forBlock = BlockStateMatcher.forBlock(class239.Field9040);
        for (final Map.Entry<IProperty, V> entry : class239.Field9041.entrySet()) {
            forBlock.where((IProperty)entry.getKey(), (Predicate)new Class1625((Map.Entry)entry));
        }
        return forBlock;
    }
    
    public static Class239 Method7526(final String s) throws Class320 {
        final int index = s.indexOf(91);
        final int index2 = s.indexOf(93);
        String substring;
        String substring2;
        if (index > -1 && index2 > -1) {
            substring = s.substring(0, index);
            substring2 = s.substring(index + 1, index2);
        }
        else {
            substring = s;
            substring2 = "";
        }
        final ResourceLocation resourceLocation = new ResourceLocation(substring);
        if (!Block.REGISTRY.containsKey((Object)resourceLocation)) {
            throw new Class320("schematica.message.invalidBlock", new Object[] { substring });
        }
        final Block block = (Block)Block.REGISTRY.getObject((Object)resourceLocation);
        return new Class239(block, Method7527(block.getDefaultState(), substring2, true));
    }
    
    public static Map Method7527(final IBlockState blockState, final String s, final boolean b) throws Class320 {
        final HashMap hashMap = new HashMap();
        if (s == null || s.length() == 0) {
            return hashMap;
        }
        for (final String s2 : s.split(",")) {
            final String[] split2 = s2.split("=");
            if (split2.length != 2) {
                throw new Class320("schematica.message.invalidProperty", new Object[] { s2 });
            }
            Method7528(hashMap, blockState, split2[0], split2[1], b);
        }
        return hashMap;
    }
    
    private static boolean Method7528(final Map map, final IBlockState blockState, final String s, final String s2, final boolean b) throws Class320 {
        for (final IProperty property : blockState.getPropertyKeys()) {
            if (property.getName().equalsIgnoreCase(s)) {
                for (final Comparable obj : property.getAllowedValues()) {
                    if (String.valueOf(obj).equalsIgnoreCase(s2)) {
                        map.put(property, obj);
                        return true;
                    }
                }
            }
        }
        if (b) {
            throw new Class320("schematica.message.invalidPropertyForBlock", new Object[] { s + "=" + s2, Block.REGISTRY.getNameForObject((Object)blockState.getBlock()) });
        }
        return false;
    }
    
    private static String Method7529(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4496 ^ 0xD5));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
