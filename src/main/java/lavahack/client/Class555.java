//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  lavahack.client.mHbkRHZKusDv305PoVrIANUx3CcrHj9E
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockRedstoneWire
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemArmorStand
 */
package lavahack.client;

import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1949;
import lavahack.client.mHbkRHZKusDv305PoVrIANUx3CcrHj9E;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmorStand;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001dB\u001b\b\u0012\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0017\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tB#\b\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003\u00a2\u0006\u0002\u0010\u000eR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c\u00a8\u0006\u001e"}, d2={"Lcom/kisman/cc/util/enums/SoftBlocks;", "", "list", "", "type", "Lcom/kisman/cc/util/enums/SoftBlocks$ElementType;", "(Ljava/lang/String;ILjava/util/List;Lcom/kisman/cc/util/enums/SoftBlocks$ElementType;)V", "obj", "", "(Ljava/lang/String;ILjava/lang/Object;Lcom/kisman/cc/util/enums/SoftBlocks$ElementType;)V", "items", "Lnet/minecraft/item/Item;", "blocks", "Lnet/minecraft/block/Block;", "(Ljava/lang/String;ILjava/util/List;Ljava/util/List;)V", "getBlocks", "()Ljava/util/List;", "getItems", "RedstoneWire", "Button", "Sapling", "Seed", "Banner", "String", "Lever", "Web", "RedstoneTorch", "Torch", "ArmorStand", "ElementType", "kisman.cc"})
public final class Class555
extends Enum {
    public static final /* enum */ Class555 Field10353;
    public static final /* enum */ Class555 Field10354;
    public static final /* enum */ Class555 Field10355;
    public static final /* enum */ Class555 Field10356;
    public static final /* enum */ Class555 Field10357;
    public static final /* enum */ Class555 Field10358;
    public static final /* enum */ Class555 Field10359;
    public static final /* enum */ Class555 Field10360;
    public static final /* enum */ Class555 Field10361;
    public static final /* enum */ Class555 Field10362;
    public static final /* enum */ Class555 Field10363;
    private static final Class555[] Field10364;
    @NotNull
    private final List Field10365;
    @NotNull
    private final List Field10366;
    private String Field10367 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class555[] class555Array = new Class555[11];
        Class555[] class555Array2 = class555Array;
        BlockRedstoneWire blockRedstoneWire = Blocks.REDSTONE_WIRE;
        Intrinsics.checkExpressionValueIsNotNull((Object)blockRedstoneWire, (String)"Blocks.REDSTONE_WIRE");
        class555Array[0] = Field10353 = new Class555("RedstoneWire", 0, (Object)blockRedstoneWire, Class1949.Field17006);
        class555Array[1] = Field10354 = new Class555("Button", 1, (List)CollectionsKt.arrayListOf((Object[])new Block[]{Blocks.STONE_BUTTON, Blocks.WOODEN_BUTTON}), Class1949.Field17007);
        Block block = Blocks.SAPLING;
        Intrinsics.checkExpressionValueIsNotNull((Object)block, (String)"Blocks.SAPLING");
        class555Array[2] = Field10355 = new Class555("Sapling", 2, (Object)block, Class1949.Field17006);
        class555Array[3] = Field10356 = new Class555("Seed", 3, (List)CollectionsKt.arrayListOf((Object[])new Item[]{Items.BEETROOT_SEEDS, Items.MELON_SEEDS, Items.WHEAT_SEEDS, Items.PUMPKIN_SEEDS, Items.CARROT, Items.NETHER_WART, Items.POTATO}), Class1949.Field17005);
        Item item = Items.BANNER;
        Intrinsics.checkExpressionValueIsNotNull((Object)item, (String)"Items.BANNER");
        class555Array[4] = Field10357 = new Class555("Banner", 4, (Object)item, Class1949.Field17004);
        Item item2 = Items.STRING;
        Intrinsics.checkExpressionValueIsNotNull((Object)item2, (String)"Items.STRING");
        class555Array[5] = Field10358 = new Class555("String", 5, (Object)item2, Class1949.Field17004);
        Block block2 = Blocks.LEVER;
        Intrinsics.checkExpressionValueIsNotNull((Object)block2, (String)"Blocks.LEVER");
        class555Array[6] = Field10359 = new Class555("Lever", 6, (Object)block2, Class1949.Field17006);
        Block block3 = Blocks.WEB;
        Intrinsics.checkExpressionValueIsNotNull((Object)block3, (String)"Blocks.WEB");
        class555Array[7] = Field10360 = new Class555("Web", 7, (Object)block3, Class1949.Field17006);
        Block block4 = Blocks.REDSTONE_TORCH;
        Intrinsics.checkExpressionValueIsNotNull((Object)block4, (String)"Blocks.REDSTONE_TORCH");
        class555Array[8] = Field10361 = new Class555("RedstoneTorch", 8, (Object)block4, Class1949.Field17006);
        Block block5 = Blocks.TORCH;
        Intrinsics.checkExpressionValueIsNotNull((Object)block5, (String)"Blocks.TORCH");
        class555Array[9] = Field10362 = new Class555("Torch", 9, (Object)block5, Class1949.Field17006);
        ItemArmorStand itemArmorStand = Items.ARMOR_STAND;
        Intrinsics.checkExpressionValueIsNotNull((Object)itemArmorStand, (String)"Items.ARMOR_STAND");
        class555Array[10] = Field10363 = new Class555("ArmorStand", 10, (Object)itemArmorStand, Class1949.Field17004);
        Field10364 = class555Array;
    }

    @NotNull
    @NotNull
    public final List Method2463() {
        return this.Field10365;
    }

    @NotNull
    @NotNull
    public final List Method2464() {
        return this.Field10366;
    }

    /*
     * WARNING - void declaration
     */
    private Class555() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field10365 = var3_1;
        this.Field10366 = var4_2;
    }

    /*
     * WARNING - void declaration
     */
    private Class555() {
        void var2_-1;
        void var1_-1;
        List list3;
        List list4;
        void var3_1;
        void var4_2;
        if (var4_2 == Class1949.Field17005) {
            list4 = var3_1;
            if (list4 == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<net.minecraft.item.Item>");
            }
        } else {
            list4 = CollectionsKt.emptyList();
        }
        if (var4_2 == Class1949.Field17007) {
            list3 = var3_1;
            if (list3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<net.minecraft.block.Block>");
            }
        } else {
            list3 = CollectionsKt.emptyList();
        }
        this((String)var1_-1, (int)var2_-1, list4, list3);
    }

    /*
     * WARNING - void declaration
     */
    private Class555() {
        void var2_-1;
        void var1_-1;
        List list;
        List list2;
        void var3_1;
        void var4_2;
        if (var4_2 == Class1949.Field17004) {
            Object[] objectArray = new Item[1];
            void v1 = var3_1;
            if (v1 == null) {
                throw new TypeCastException("null cannot be cast to non-null type net.minecraft.item.Item");
            }
            objectArray[0] = (Item)v1;
            list2 = CollectionsKt.arrayListOf((Object[])objectArray);
        } else {
            list2 = CollectionsKt.emptyList();
        }
        if (var4_2 == Class1949.Field17006) {
            Object[] objectArray = new Block[1];
            void v4 = var3_1;
            if (v4 == null) {
                throw new TypeCastException("null cannot be cast to non-null type net.minecraft.block.Block");
            }
            objectArray[0] = (Block)v4;
            list = CollectionsKt.arrayListOf((Object[])objectArray);
        } else {
            list = CollectionsKt.emptyList();
        }
        this((String)var1_-1, (int)var2_-1, list2, list);
    }

    public static Class555[] values() {
        return (mHbkRHZKusDv305PoVrIANUx3CcrHj9E[])Field10364.clone();
    }

    public static Class555 valueOf(String string) {
        return Enum.valueOf(Class555.class, string);
    }

    private static String Method2465(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 27;
            cArray2[n] = (char)(cArray[n] ^ (0x9C2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

