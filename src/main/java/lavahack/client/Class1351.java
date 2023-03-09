//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  lavahack.client.Hw9qa6LkgOgrAJYU8Uj3cK0TIvfwflWZ
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Hw9qa6LkgOgrAJYU8Uj3cK0TIvfwflWZ;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2={"Lcom/kisman/cc/util/enums/OffhandItems;", "", "item", "Lnet/minecraft/item/Item;", "(Ljava/lang/String;ILnet/minecraft/item/Item;)V", "getItem", "()Lnet/minecraft/item/Item;", "Crystal", "Gap", "Pearl", "Chorus", "Shield", "Totem", "kisman.cc"})
public final class Class1351
extends Enum {
    public static final /* enum */ Class1351 Field14140;
    public static final /* enum */ Class1351 Field14141;
    public static final /* enum */ Class1351 Field14142;
    public static final /* enum */ Class1351 Field14143;
    public static final /* enum */ Class1351 Field14144;
    public static final /* enum */ Class1351 Field14145;
    private static final Class1351[] Field14146;
    @NotNull
    private final Item Field14147;
    private int Field14148;

    static {
        Class1351[] class1351Array = new Class1351[6];
        Class1351[] class1351Array2 = class1351Array;
        Item item = Items.END_CRYSTAL;
        Intrinsics.checkExpressionValueIsNotNull((Object)item, (String)"Items.END_CRYSTAL");
        class1351Array[0] = Field14140 = new Class1351("Crystal", 0, item);
        Item item2 = Items.GOLDEN_APPLE;
        Intrinsics.checkExpressionValueIsNotNull((Object)item2, (String)"Items.GOLDEN_APPLE");
        class1351Array[1] = Field14141 = new Class1351("Gap", 1, item2);
        Item item3 = Items.ENDER_PEARL;
        Intrinsics.checkExpressionValueIsNotNull((Object)item3, (String)"Items.ENDER_PEARL");
        class1351Array[2] = Field14142 = new Class1351("Pearl", 2, item3);
        Item item4 = Items.CHORUS_FRUIT;
        Intrinsics.checkExpressionValueIsNotNull((Object)item4, (String)"Items.CHORUS_FRUIT");
        class1351Array[3] = Field14143 = new Class1351("Chorus", 3, item4);
        Item item5 = Items.SHIELD;
        Intrinsics.checkExpressionValueIsNotNull((Object)item5, (String)"Items.SHIELD");
        class1351Array[4] = Field14144 = new Class1351("Shield", 4, item5);
        Item item6 = Items.TOTEM_OF_UNDYING;
        Intrinsics.checkExpressionValueIsNotNull((Object)item6, (String)"Items.TOTEM_OF_UNDYING");
        class1351Array[5] = Field14145 = new Class1351("Totem", 5, item6);
        Field14146 = class1351Array;
    }

    @NotNull
    @NotNull
    public final Item Method5415() {
        return this.Field14147;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1351() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field14147 = var3_1;
    }

    public static Class1351[] values() {
        return (Hw9qa6LkgOgrAJYU8Uj3cK0TIvfwflWZ[])Field14146.clone();
    }

    public static Class1351 valueOf(String string) {
        return Enum.valueOf(Class1351.class, string);
    }

    private static String Method5416(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 85;
            cArray2[n] = (char)(cArray[n] ^ (0x6DC0 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

