//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.block.*;
import net.minecraft.init.*;

public enum Class613
{
    Field10609("Obsidian", 0, Class1309.Method5340().Method7663(class424 -> Blocks.OBSIDIAN)), 
    Field10610("EnderChest", 1, Class1309.Method5340().Method7663(class424 -> Blocks.ENDER_CHEST));
    
    private final Class1763 Field10611;
    private static final Class613[] Field10612;
    private String Field10613 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class613(final String name, final int ordinal, final Class1763 field10611) {
        this.Field10611 = field10611;
    }
    
    public Class1763 Method2630() {
        return this.Field10611;
    }
    
    static {
        Field10612 = new Class613[] { Class613.Field10609, Class613.Field10610 };
    }
    
    private static String Method2633(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7E94 ^ 0xED));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
