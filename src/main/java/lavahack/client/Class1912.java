//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.adxKLRUfKrz15cz62FrIMLBHho9GUWzV$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.adxKLRUfKrz15cz62FrIMLBHho9GUWzV;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/features/module/combat/HandRewrite$Modes;", "", "item", "Lnet/minecraft/item/Item;", "(Ljava/lang/String;ILnet/minecraft/item/Item;)V", "getItem", "()Lnet/minecraft/item/Item;", "None", "Crystal", "Gap", "Totem", "Exp", "kisman.cc"})
public final class Class1912
extends Enum {
    public static final /* enum */ Class1912 Field16825;
    public static final /* enum */ Class1912 Field16826;
    public static final /* enum */ Class1912 Field16827;
    public static final /* enum */ Class1912 Field16828;
    public static final /* enum */ Class1912 Field16829;
    private static final Class1912[] Field16830;
    @Nullable
    private final Item Field16831;
    private String Field16832 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1912[] class1912Array = new Class1912[5];
        Class1912[] class1912Array2 = class1912Array;
        class1912Array[0] = Field16825 = new Class1912("None", 0, null);
        class1912Array[1] = Field16826 = new Class1912("Crystal", 1, Items.END_CRYSTAL);
        class1912Array[2] = Field16827 = new Class1912("Gap", 2, Items.GOLDEN_APPLE);
        class1912Array[3] = Field16828 = new Class1912("Totem", 3, Items.TOTEM_OF_UNDYING);
        class1912Array[4] = Field16829 = new Class1912("Exp", 4, Items.EXPERIENCE_BOTTLE);
        Field16830 = class1912Array;
    }

    @Nullable
    @Nullable
    public final Item Method7099() {
        return this.Field16831;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1912() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field16831 = var3_1;
    }

    public static Class1912[] values() {
        return (adxKLRUfKrz15cz62FrIMLBHho9GUWzV.leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field16830.clone();
    }

    public static Class1912 valueOf(String string) {
        return Enum.valueOf(Class1912.class, string);
    }

    private static String Method7100(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 211;
            cArray2[n] = (char)(cArray[n] ^ (0x1C4F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

