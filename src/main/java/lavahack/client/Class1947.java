//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.ItemStack
 */
package lavahack.client;

import net.minecraft.item.ItemStack;

public class Class1947 {
    public ItemStack Field16997;
    public int Field16998;
    public int Field16999;
    public int Field17000;
    private String Field17001 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1947(ItemStack itemStack) {
        this(itemStack, 0, 0);
    }

    public Class1947(ItemStack itemStack, int n, int n2) {
        this.Field16997 = itemStack;
        this.Field16998 = n;
        this.Field16999 = n2;
    }

    public String Method7229() {
        return this.Field16997.getItem().getItemStackDisplayName(this.Field16997);
    }

    public String Method7230() {
        char c = this.Field16998 < this.Field16999 ? (char)'c' : 'a';
        return String.format("\u00a7%c%s\u00a7r/%s", Character.valueOf(c), Class1947.Method7232(this.Field16997, this.Field16998), Class1947.Method7232(this.Field16997, this.Field16999));
    }

    public String Method7231(String string, String string2) {
        int n = this.Field16999 - (this.Field17000 + this.Field16998);
        if (this.Field17000 == -1 || n <= 0) return String.format("\u00a7a%s", string);
        return String.format("\u00a7c%s: %s", string2, Class1947.Method7232(this.Field16997, n));
    }

    private static String Method7232(ItemStack itemStack, int n) {
        int n2 = itemStack.getMaxStackSize();
        return String.format("%d", n);
    }

    private static String Method7233(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 101;
            cArray2[n] = (char)(cArray[n] ^ (0x3B80 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

