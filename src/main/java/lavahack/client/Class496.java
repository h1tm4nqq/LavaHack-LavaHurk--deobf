//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.item.*;
import java.util.*;
import java.util.concurrent.*;

public class Class496 extends Class42
{
    public static final Map Field10058;
    public static final Map Field10059;
    private String Field10060 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class496() {
        super("ItemRenamer", Class97.Field8343);
    }
    
    public void Method45() {
        if (Class496.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class496.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        for (final ItemStack itemStack : Class496.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.getInventory()) {
            if (itemStack == null) {
                continue;
            }
            if (itemStack.isEmpty) {
                continue;
            }
            Class496.Field10059.computeIfAbsent(itemStack.item, Class496::Method2283);
            if (Class496.Field10058.get(itemStack.item) == null) {
                continue;
            }
            itemStack.setStackDisplayName((String)Class496.Field10058.get(itemStack.item));
        }
    }
    
    private static String Method2283(final ItemStack itemStack, final Item item) {
        return itemStack.getDisplayName();
    }
    
    static {
        Field10058 = new ConcurrentHashMap();
        Field10059 = new ConcurrentHashMap();
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2011 ^ 0x95));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
