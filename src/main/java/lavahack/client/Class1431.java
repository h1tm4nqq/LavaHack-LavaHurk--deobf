/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.rQ5lrztQK8V9kw3Btd6Tv2vQoIi5o18Z
 *  net.minecraft.tileentity.TileEntityChest
 *  net.minecraft.tileentity.TileEntityDispenser
 *  net.minecraft.tileentity.TileEntityDropper
 *  net.minecraft.tileentity.TileEntityEnderChest
 *  net.minecraft.tileentity.TileEntityFlowerPot
 *  net.minecraft.tileentity.TileEntityFurnace
 *  net.minecraft.tileentity.TileEntityHopper
 *  net.minecraft.tileentity.TileEntityShulkerBox
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Class1680;
import lavahack.client.rQ5lrztQK8V9kw3Btd6Tv2vQoIi5o18Z;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityDispenser;
import net.minecraft.tileentity.TileEntityDropper;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.tileentity.TileEntityFlowerPot;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.tileentity.TileEntityHopper;
import net.minecraft.tileentity.TileEntityShulkerBox;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0017\b\u0002\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011\u00a8\u0006\u0013"}, d2={"Lcom/kisman/cc/util/enums/StorageESPTileEntities;", "", "clazz", "Ljava/lang/Class;", "Lnet/minecraft/tileentity/TileEntity;", "(Ljava/lang/String;ILjava/lang/Class;)V", "validator", "Lcom/kisman/cc/util/enums/StorageESPTileEntities$Validator;", "getValidator", "()Lcom/kisman/cc/util/enums/StorageESPTileEntities$Validator;", "Chest", "EnderChest", "Furnace", "FlowerPot", "Dispenser", "Dropper", "Hopper", "Shulker", "Validator", "kisman.cc"})
public final class Class1431
extends Enum {
    public static final /* enum */ Class1431 Field14685;
    public static final /* enum */ Class1431 Field14686;
    public static final /* enum */ Class1431 Field14687;
    public static final /* enum */ Class1431 Field14688;
    public static final /* enum */ Class1431 Field14689;
    public static final /* enum */ Class1431 Field14690;
    public static final /* enum */ Class1431 Field14691;
    public static final /* enum */ Class1431 Field14692;
    private static final Class1431[] Field14693;
    @NotNull
    private final Class1680 Field14694;
    private String Field14695 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1431[] class1431Array = new Class1431[8];
        Class1431[] class1431Array2 = class1431Array;
        class1431Array[0] = Field14685 = new Class1431("Chest", 0, TileEntityChest.class);
        class1431Array[1] = Field14686 = new Class1431("EnderChest", 1, TileEntityEnderChest.class);
        class1431Array[2] = Field14687 = new Class1431("Furnace", 2, TileEntityFurnace.class);
        class1431Array[3] = Field14688 = new Class1431("FlowerPot", 3, TileEntityFlowerPot.class);
        class1431Array[4] = Field14689 = new Class1431("Dispenser", 4, TileEntityDispenser.class);
        class1431Array[5] = Field14690 = new Class1431("Dropper", 5, TileEntityDropper.class);
        class1431Array[6] = Field14691 = new Class1431("Hopper", 6, TileEntityHopper.class);
        class1431Array[7] = Field14692 = new Class1431("Shulker", 7, TileEntityShulkerBox.class);
        Field14693 = class1431Array;
    }

    @NotNull
    @NotNull
    public final Class1680 Method5718() {
        return this.Field14694;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1431() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field14694 = new Class1680((Class)var3_1);
    }

    public static Class1431[] values() {
        return (rQ5lrztQK8V9kw3Btd6Tv2vQoIi5o18Z[])Field14693.clone();
    }

    public static Class1431 valueOf(String string) {
        return Enum.valueOf(Class1431.class, string);
    }

    private static String Method5719(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 128;
            cArray2[n] = (char)(cArray[n] ^ (0xF02 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

