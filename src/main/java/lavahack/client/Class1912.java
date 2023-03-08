//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.item.*;
import org.jetbrains.annotations.*;
import net.minecraft.init.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003?\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b?\u0006\f" }, d2 = { "Lcom/kisman/cc/features/module/combat/HandRewrite$Modes;", "", "item", "Lnet/minecraft/item/Item;", "(Ljava/lang/String;ILnet/minecraft/item/Item;)V", "getItem", "()Lnet/minecraft/item/Item;", "None", "Crystal", "Gap", "Totem", "Exp", "kisman.cc" })
public enum Class1912
{
    Field16825("None", 0, (Item)null), 
    Field16826("Crystal", 1, Items.END_CRYSTAL), 
    Field16827("Gap", 2, Items.GOLDEN_APPLE), 
    Field16828("Totem", 3, Items.TOTEM_OF_UNDYING), 
    Field16829("Exp", 4, Items.EXPERIENCE_BOTTLE);
    
    private static final Class1912[] Field16830;
    @Nullable
    private final Item Field16831;
    private String Field16832 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Nullable
    @Nullable
    public final Item Method7099() {
        return this.Field16831;
    }
    
    private Class1912(final String name, final int ordinal, final Item field16831) {
        this.Field16831 = field16831;
    }
    
    private static String Method7100(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1C4F ^ 0xD3));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
