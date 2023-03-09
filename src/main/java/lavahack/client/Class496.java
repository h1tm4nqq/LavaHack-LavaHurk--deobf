//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 */
package lavahack.client;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lavahack.client.Class42;
import lavahack.client.Class97;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Class496
extends Class42 {
    public static final Map Field10058 = new ConcurrentHashMap();
    public static final Map Field10059 = new ConcurrentHashMap();
    private String Field10060 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class496() {
        super("ItemRenamer", Class97.Field8343);
    }

    @Override
    public void Method45() {
        if (Class496.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class496.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Iterator iterator = Class496.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.getInventory().iterator();
        while (iterator.hasNext()) {
            ItemStack itemStack = (ItemStack)iterator.next();
            if (itemStack == null || itemStack.isEmpty) continue;
            Field10059.computeIfAbsent(itemStack.item, arg_0 -> Class496.Method2283(itemStack, arg_0));
            if (Field10058.get(itemStack.item) == null) continue;
            itemStack.setStackDisplayName((String)Field10058.get(itemStack.item));
        }
    }

    private static String Method2283(ItemStack itemStack, Item item) {
        return itemStack.getDisplayName();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 149;
            cArray2[n] = (char)(cArray[n] ^ (0x2011 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

