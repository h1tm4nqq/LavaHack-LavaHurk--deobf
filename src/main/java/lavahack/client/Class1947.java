//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.item.*;

public class Class1947
{
    public ItemStack Field16997;
    public int Field16998;
    public int Field16999;
    public int Field17000;
    private String Field17001 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1947(final ItemStack itemStack) {
        this(itemStack, 0, 0);
    }
    
    public Class1947(final ItemStack field16997, final int field16998, final int field16999) {
        this.Field16997 = field16997;
        this.Field16998 = field16998;
        this.Field16999 = field16999;
    }
    
    public String Method7229() {
        return this.Field16997.getItem().getItemStackDisplayName(this.Field16997);
    }
    
    public String Method7230() {
        return String.format("§%c%s§r/%s", (this.Field16998 < this.Field16999) ? 'c' : 'a', Method7232(this.Field16997, this.Field16998), Method7232(this.Field16997, this.Field16999));
    }
    
    public String Method7231(final String s, final String s2) {
        final int n = this.Field16999 - (this.Field17000 + this.Field16998);
        if (this.Field17000 != -1 && n > 0) {
            return String.format("§c%s: %s", s2, Method7232(this.Field16997, n));
        }
        return String.format("§a%s", s);
    }
    
    private static String Method7232(final ItemStack itemStack, final int i) {
        itemStack.getMaxStackSize();
        return String.format("%d", i);
    }
    
    private static String Method7233(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3B80 ^ 0x65));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
