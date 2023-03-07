//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.ItemStack
 */
package lavahack.client;

import net.minecraft.item.ItemStack;

public class vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    public ItemStack Field16997;
    public int Field16998;
    public int Field16999;
    public int Field17000;
    private String Field17001 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(ItemStack itemStack) {
        this(itemStack, (int)2052761433L ^ 0x7A5AA759, (int)((long)-1637342677 ^ (long)-1637342677));
    }

    public vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(ItemStack itemStack, int n, int n2) {
        this.Field16997 = itemStack;
        this.Field16998 = n;
        this.Field16999 = n2;
    }

    public String Method7229() {
        return this.Field16997.getItem().getItemStackDisplayName(this.Field16997);
    }

    public String Method7230() {
        int n = this.Field16998 < this.Field16999 ? (int)772418341L ^ 0x2E0A2B46 : (int)-1225592306L ^ 0xB6F2F26F;
        Object[] objectArray = new Object[(int)-346679353L ^ 0xEB5617C4];
        objectArray[(int)-982278219L ^ 0xC5739FB5] = Character.valueOf((char)n);
        objectArray[(int)((long)550907955 ^ (long)550907954)] = vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7232(this.Field16997, this.Field16998);
        objectArray[((int)-364292931L ^ 0xEA4954BC) << 1] = vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7232(this.Field16997, this.Field16999);
        return String.format("\u00a7%c%s\u00a7r/%s", objectArray);
    }

    public String Method7231(String string, String string2) {
        int n = this.Field16999 - (this.Field17000 + this.Field16998);
        if (this.Field17000 != ((int)-1388800591L ^ 0x52C76A4E) && n > 0) {
            Object[] objectArray = new Object[(int)((long)-663517671 ^ (long)-663517672) << 1];
            objectArray[(int)((long)273643113 ^ (long)273643113)] = string2;
            objectArray[(int)421570050L ^ 0x1920A603] = vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7232(this.Field16997, n);
            return String.format("\u00a7c%s: %s", objectArray);
        }
        Object[] objectArray = new Object[(int)753119060L ^ 0x2CE3AF55];
        objectArray[(int)((long)-1335290890 ^ (long)-1335290890)] = string;
        return String.format("\u00a7a%s", objectArray);
    }

    private static String Method7232(ItemStack itemStack, int n) {
        int n2 = itemStack.getMaxStackSize();
        Object[] objectArray = new Object[(int)((long)-2118989050 ^ (long)-2118989049)];
        objectArray[(int)((long)-2096364969 ^ (long)-2096364969)] = n;
        return String.format("%d", objectArray);
    }

    private static String Method7233(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-133584574L ^ 0xF809A942;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)781074675L ^ 0x2E8E400C);
            int n2 = (int)-653037656L ^ 0xD9136FCD;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1249591229 ^ (long)1249591242) << 7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

