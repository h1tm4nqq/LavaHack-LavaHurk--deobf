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
import lavahack.client.rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1$1;
import lavahack.client.rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.tNlfAiP8efA7Qf1OOlxMRO5yjxok9wQ7;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockStateMatcher;
import net.minecraft.util.ResourceLocation;

public class rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1 {
    private final IBlockState Field17355;
    private String Field17356 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1(IBlockState iBlockState) {
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

    public static rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1 Method7524(IBlockState iBlockState) {
        return new rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1(iBlockState);
    }

    public static BlockStateMatcher Method7525(rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1$leqS0IyKEB621E1SrHdAcHHAUjScjmKi rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        BlockStateMatcher blockStateMatcher = BlockStateMatcher.forBlock((Block)rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field9040);
        Iterator iterator = rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field9041.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            blockStateMatcher.where((IProperty)entry.getKey(), (Predicate)new rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1$1(entry));
        }
        return blockStateMatcher;
    }

    public static rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Method7526(String string) throws tNlfAiP8efA7Qf1OOlxMRO5yjxok9wQ7 {
        String string2;
        String string3;
        int n = string.indexOf((int)-887166029L ^ 0xCB1EEBE8);
        int n2 = string.indexOf((int)((long)337261266 ^ (long)337261199));
        if (n > ((int)173566420L ^ 0xF5A7962B) && n2 > (int)((long)1880871592 ^ (long)-1880871593)) {
            string3 = string.substring((int)238815368L ^ 0xE3C0888, n);
            string2 = string.substring(n + ((int)1332188782L ^ 0x4F67966F), n2);
        } else {
            string3 = string;
            string2 = "";
        }
        ResourceLocation resourceLocation = new ResourceLocation(string3);
        if (!Block.REGISTRY.containsKey((Object)resourceLocation)) {
            Object[] objectArray = new Object[(int)200989957L ^ 0xBFADD04];
            objectArray[(int)((long)-1874664076 ^ (long)-1874664076)] = string3;
            throw new tNlfAiP8efA7Qf1OOlxMRO5yjxok9wQ7("schematica.message.invalidBlock", objectArray);
        }
        Block block = (Block)Block.REGISTRY.getObject((Object)resourceLocation);
        Map map = rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1.Method7527(block.getDefaultState(), string2, ((int)-1121071036L ^ 0xBD2DD045) != 0);
        return new rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(block, map);
    }

    public static Map Method7527(IBlockState iBlockState, String string, boolean bl) throws tNlfAiP8efA7Qf1OOlxMRO5yjxok9wQ7 {
        String[] stringArray;
        HashMap hashMap = new HashMap();
        if (string == null) return hashMap;
        if (string.length() == 0) {
            return hashMap;
        }
        String[] stringArray2 = stringArray = string.split(",");
        int n = stringArray2.length;
        int n2 = (int)-798504191L ^ 0xD067CB01;
        while (n2 < n) {
            String string2 = stringArray2[n2];
            String[] stringArray3 = string2.split("=");
            if (stringArray3.length != ((int)-1577107866L ^ 0xA1FF3E67) << 1) {
                Object[] objectArray = new Object[(int)471785351L ^ 0x1C1EDF86];
                objectArray[(int)((long)1964087223 ^ (long)1964087223)] = string2;
                throw new tNlfAiP8efA7Qf1OOlxMRO5yjxok9wQ7("schematica.message.invalidProperty", objectArray);
            }
            rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1.Method7528(hashMap, iBlockState, stringArray3[(int)((long)-131902709 ^ (long)-131902709)], stringArray3[(int)((long)-1660448392 ^ (long)-1660448391)], bl);
            ++n2;
        }
        return hashMap;
    }

    /*
     * Unable to fully structure code
     */
    private static boolean Method7528(Map var0, IBlockState var1_1, String var2_2, String var3_3, boolean var4_4) throws tNlfAiP8efA7Qf1OOlxMRO5yjxok9wQ7 {
        var5_5 = var1_1.getPropertyKeys().iterator();
        block0: while (true) {
            if (!var5_5.hasNext()) {
                if (var4_4 == false) return (boolean)((int)((long)1007705176 ^ (long)1007705176));
                v0 = new Object[((int)1229876576L ^ 1229876577) << 1];
                v0[(int)1419994027L ^ 1419994027] = var2_2 + "=" + var3_3;
                v0[(int)1120553823L ^ 1120553822] = Block.REGISTRY.getNameForObject((Object)var1_1.getBlock());
                throw new tNlfAiP8efA7Qf1OOlxMRO5yjxok9wQ7("schematica.message.invalidPropertyForBlock", v0);
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
        return (boolean)((int)((long)1344567222 ^ (long)1344567223));
    }

    private static String Method7529(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-208399917L ^ 0xF39411D3;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-310104212 ^ (long)-310104173);
            int n2 = (int)((long)865511817 ^ (long)865511772);
            cArray2[n] = (char)(cArray[n] ^ (((int)-1313191136L ^ 0xB1BA696B) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

