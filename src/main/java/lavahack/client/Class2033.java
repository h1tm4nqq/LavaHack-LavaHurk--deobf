//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.block.state.pattern.BlockStateMatcher
 *  net.minecraft.util.ResourceLocation
 */
package lavahack.client;

import com.google.common.base.Predicate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import lavahack.client.Class1625;
import lavahack.client.Class239;
import lavahack.client.Class320;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockStateMatcher;
import net.minecraft.util.ResourceLocation;

public class Class2033 {
    private final IBlockState Field17355;
    private String Field17356 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Class2033(IBlockState iBlockState) {
        this.Field17355 = iBlockState;
    }

    public IBlockState Method7522(IBlockState iBlockState, Map map) {
        IBlockState iBlockState2 = this.Field17355;
        iBlockState2 = this.Method7523(iBlockState2, iBlockState.getProperties());
        return this.Method7523(iBlockState2, map);
    }

    private IBlockState Method7523(IBlockState iBlockState, Map map) {
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            iBlockState = iBlockState.withProperty((IProperty)entry.getKey(), (Comparable)entry.getValue());
        }
        return iBlockState;
    }

    public static Class2033 Method7524(IBlockState iBlockState) {
        return new Class2033(iBlockState);
    }

    public static BlockStateMatcher Method7525(Class239 class239) {
        BlockStateMatcher blockStateMatcher = BlockStateMatcher.forBlock((Block)class239.Field9040);
        Iterator iterator = class239.Field9041.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            blockStateMatcher.where((IProperty)entry.getKey(), (Predicate)new Class1625(entry));
        }
        return blockStateMatcher;
    }

    public static Class239 Method7526(String string) throws Class320 {
        String string2;
        String string3;
        int n = string.indexOf(91);
        int n2 = string.indexOf(93);
        if (n > -1 && n2 > -1) {
            string3 = string.substring(0, n);
            string2 = string.substring(n + 1, n2);
        } else {
            string3 = string;
            string2 = "";
        }
        ResourceLocation resourceLocation = new ResourceLocation(string3);
        if (!Block.REGISTRY.containsKey((Object)resourceLocation)) {
            throw new Class320("schematica.message.invalidBlock", string3);
        }
        Block block = (Block)Block.REGISTRY.getObject((Object)resourceLocation);
        Map map = Class2033.Method7527(block.getDefaultState(), string2, true);
        return new Class239(block, map);
    }

    public static Map Method7527(IBlockState iBlockState, String string, boolean bl) throws Class320 {
        String[] stringArray;
        HashMap hashMap = new HashMap();
        if (string == null) return hashMap;
        if (string.length() == 0) {
            return hashMap;
        }
        String[] stringArray2 = stringArray = string.split(",");
        int n = stringArray2.length;
        int n2 = 0;
        while (n2 < n) {
            String string2 = stringArray2[n2];
            String[] stringArray3 = string2.split("=");
            if (stringArray3.length != 2) {
                throw new Class320("schematica.message.invalidProperty", string2);
            }
            Class2033.Method7528(hashMap, iBlockState, stringArray3[0], stringArray3[1], bl);
            ++n2;
        }
        return hashMap;
    }

    /*
     * Unable to fully structure code
     */
    private static boolean Method7528(Map var0, IBlockState var1_1, String var2_2, String var3_3, boolean var4_4) throws Class320 {
        var5_5 = var1_1.getPropertyKeys().iterator();
        block0: while (true) {
            if (!var5_5.hasNext()) {
                if (var4_4 == false) return false;
                throw new Class320("schematica.message.invalidPropertyForBlock", new Object[]{var2_2 + "=" + var3_3, Block.REGISTRY.getNameForObject((Object)var1_1.getBlock())});
            }
            var6_6 = (IProperty)var5_5.next();
            if (!var6_6.getName().equalsIgnoreCase(var2_2)) continue;
            var7_7 = var6_6.getAllowedValues();
            var8_8 = var7_7.iterator();
            do {
                if (var8_8.hasNext()) ** break;
                continue block0;
            } while (!String.valueOf(var9_9 = (Comparable)var8_8.next()).equalsIgnoreCase(var3_3));
            break;
        }
        var0.put(var6_6, var9_9);
        return true;
    }

    private static String Method7529(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 213;
            cArray2[n] = (char)(cArray[n] ^ (0x4496 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

