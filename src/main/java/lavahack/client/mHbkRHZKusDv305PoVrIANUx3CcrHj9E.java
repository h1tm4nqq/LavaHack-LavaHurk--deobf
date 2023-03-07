//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
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
import lavahack.client.mHbkRHZKusDv305PoVrIANUx3CcrHj9E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmorStand;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001dB\u001b\b\u0012\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0017\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tB#\b\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003\u00a2\u0006\u0002\u0010\u000eR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c\u00a8\u0006\u001e"}, d2={"Lcom/kisman/cc/util/enums/SoftBlocks;", "", "list", "", "type", "Lcom/kisman/cc/util/enums/SoftBlocks$ElementType;", "(Ljava/lang/String;ILjava/util/List;Lcom/kisman/cc/util/enums/SoftBlocks$ElementType;)V", "obj", "", "(Ljava/lang/String;ILjava/lang/Object;Lcom/kisman/cc/util/enums/SoftBlocks$ElementType;)V", "items", "Lnet/minecraft/item/Item;", "blocks", "Lnet/minecraft/block/Block;", "(Ljava/lang/String;ILjava/util/List;Ljava/util/List;)V", "getBlocks", "()Ljava/util/List;", "getItems", "RedstoneWire", "Button", "Sapling", "Seed", "Banner", "String", "Lever", "Web", "RedstoneTorch", "Torch", "ArmorStand", "ElementType", "kisman.cc"})
public final class mHbkRHZKusDv305PoVrIANUx3CcrHj9E
extends Enum {
    public static final /* enum */ mHbkRHZKusDv305PoVrIANUx3CcrHj9E Field10353;
    public static final /* enum */ mHbkRHZKusDv305PoVrIANUx3CcrHj9E Field10354;
    public static final /* enum */ mHbkRHZKusDv305PoVrIANUx3CcrHj9E Field10355;
    public static final /* enum */ mHbkRHZKusDv305PoVrIANUx3CcrHj9E Field10356;
    public static final /* enum */ mHbkRHZKusDv305PoVrIANUx3CcrHj9E Field10357;
    public static final /* enum */ mHbkRHZKusDv305PoVrIANUx3CcrHj9E Field10358;
    public static final /* enum */ mHbkRHZKusDv305PoVrIANUx3CcrHj9E Field10359;
    public static final /* enum */ mHbkRHZKusDv305PoVrIANUx3CcrHj9E Field10360;
    public static final /* enum */ mHbkRHZKusDv305PoVrIANUx3CcrHj9E Field10361;
    public static final /* enum */ mHbkRHZKusDv305PoVrIANUx3CcrHj9E Field10362;
    public static final /* enum */ mHbkRHZKusDv305PoVrIANUx3CcrHj9E Field10363;
    private static final mHbkRHZKusDv305PoVrIANUx3CcrHj9E[] Field10364;
    @NotNull
    private final List Field10365;
    @NotNull
    private final List Field10366;
    private String Field10367 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        mHbkRHZKusDv305PoVrIANUx3CcrHj9E[] mHbkRHZKusDv305PoVrIANUx3CcrHj9EArray = new mHbkRHZKusDv305PoVrIANUx3CcrHj9E[(int)((long)586344625 ^ (long)586344634)];
        mHbkRHZKusDv305PoVrIANUx3CcrHj9E[] mHbkRHZKusDv305PoVrIANUx3CcrHj9EArray2 = mHbkRHZKusDv305PoVrIANUx3CcrHj9EArray;
        int n = (int)-2130272900L ^ 0x81069D7C;
        int n2 = (int)-814625268L ^ 0xCF71CE0C;
        BlockRedstoneWire blockRedstoneWire = Blocks.REDSTONE_WIRE;
        Intrinsics.checkExpressionValueIsNotNull((Object)blockRedstoneWire, (String)"Blocks.REDSTONE_WIRE");
        mHbkRHZKusDv305PoVrIANUx3CcrHj9EArray[n] = Field10353 = new mHbkRHZKusDv305PoVrIANUx3CcrHj9E("RedstoneWire", n2, (Object)blockRedstoneWire, mHbkRHZKusDv305PoVrIANUx3CcrHj9E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17006);
        Object[] objectArray = new Block[(int)((long)988170009 ^ (long)988170008) << 1];
        objectArray[(int)1934838216L ^ 0x735349C8] = Blocks.STONE_BUTTON;
        objectArray[(int)((long)-1223533972 ^ (long)-1223533971)] = Blocks.WOODEN_BUTTON;
        mHbkRHZKusDv305PoVrIANUx3CcrHj9EArray[(int)1556253764L ^ 0x5CC28C45] = Field10354 = new mHbkRHZKusDv305PoVrIANUx3CcrHj9E("Button", (int)-1820422582L ^ 0x937E8E4B, (List)CollectionsKt.arrayListOf((Object[])objectArray), mHbkRHZKusDv305PoVrIANUx3CcrHj9E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17007);
        int n3 = (int)((long)1811790664 ^ (long)1811790665) << 1;
        int n4 = ((int)234728871L ^ 0xDFDADA6) << 1;
        Block block = Blocks.SAPLING;
        Intrinsics.checkExpressionValueIsNotNull((Object)block, (String)"Blocks.SAPLING");
        mHbkRHZKusDv305PoVrIANUx3CcrHj9EArray[n3] = Field10355 = new mHbkRHZKusDv305PoVrIANUx3CcrHj9E("Sapling", n4, (Object)block, mHbkRHZKusDv305PoVrIANUx3CcrHj9E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17006);
        Object[] objectArray2 = new Item[(int)((long)-175916127 ^ (long)-175916122)];
        objectArray2[(int)-1789419659L ^ 0x95579F75] = Items.BEETROOT_SEEDS;
        objectArray2[(int)2063926037L ^ 0x7B050314] = Items.MELON_SEEDS;
        objectArray2[((int)-237499524L ^ 0xF1D80B7D) << 1] = Items.WHEAT_SEEDS;
        objectArray2[(int)569992384L ^ 0x21F964C3] = Items.PUMPKIN_SEEDS;
        objectArray2[((int)1025927310L ^ 0x3D26688F) << 2] = Items.CARROT;
        objectArray2[(int)47994581L ^ 0x2DC56D0] = Items.NETHER_WART;
        objectArray2[((int)-166571266L ^ 0xF61252FD) << 1] = Items.POTATO;
        mHbkRHZKusDv305PoVrIANUx3CcrHj9EArray[(int)-726068200L ^ 0xD4B9141B] = Field10356 = new mHbkRHZKusDv305PoVrIANUx3CcrHj9E("Seed", (int)-815296136L ^ 0xCF67917B, (List)CollectionsKt.arrayListOf((Object[])objectArray2), mHbkRHZKusDv305PoVrIANUx3CcrHj9E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17005);
        int n5 = (int)((long)-1295051565 ^ (long)-1295051566) << 2;
        int n6 = (int)((long)-1285499538 ^ (long)-1285499537) << 2;
        Item item = Items.BANNER;
        Intrinsics.checkExpressionValueIsNotNull((Object)item, (String)"Items.BANNER");
        mHbkRHZKusDv305PoVrIANUx3CcrHj9EArray[n5] = Field10357 = new mHbkRHZKusDv305PoVrIANUx3CcrHj9E("Banner", n6, (Object)item, mHbkRHZKusDv305PoVrIANUx3CcrHj9E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17004);
        int n7 = (int)((long)-1594811686 ^ (long)-1594811681);
        int n8 = (int)2031883703L ^ 0x791C15B2;
        Item item2 = Items.STRING;
        Intrinsics.checkExpressionValueIsNotNull((Object)item2, (String)"Items.STRING");
        mHbkRHZKusDv305PoVrIANUx3CcrHj9EArray[n7] = Field10358 = new mHbkRHZKusDv305PoVrIANUx3CcrHj9E("String", n8, (Object)item2, mHbkRHZKusDv305PoVrIANUx3CcrHj9E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17004);
        int n9 = (int)((long)592697873 ^ (long)592697874) << 1;
        int n10 = (int)((long)925562746 ^ (long)925562745) << 1;
        Block block2 = Blocks.LEVER;
        Intrinsics.checkExpressionValueIsNotNull((Object)block2, (String)"Blocks.LEVER");
        mHbkRHZKusDv305PoVrIANUx3CcrHj9EArray[n9] = Field10359 = new mHbkRHZKusDv305PoVrIANUx3CcrHj9E("Lever", n10, (Object)block2, mHbkRHZKusDv305PoVrIANUx3CcrHj9E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17006);
        int n11 = (int)1225813257L ^ 0x49106D0E;
        int n12 = (int)-1039021434L ^ 0xC211CA81;
        Block block3 = Blocks.WEB;
        Intrinsics.checkExpressionValueIsNotNull((Object)block3, (String)"Blocks.WEB");
        mHbkRHZKusDv305PoVrIANUx3CcrHj9EArray[n11] = Field10360 = new mHbkRHZKusDv305PoVrIANUx3CcrHj9E("Web", n12, (Object)block3, mHbkRHZKusDv305PoVrIANUx3CcrHj9E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17006);
        int n13 = (int)((long)-206819075 ^ (long)-206819076) << 3;
        int n14 = ((int)-995455999L ^ 0xC4AA8C00) << 3;
        Block block4 = Blocks.REDSTONE_TORCH;
        Intrinsics.checkExpressionValueIsNotNull((Object)block4, (String)"Blocks.REDSTONE_TORCH");
        mHbkRHZKusDv305PoVrIANUx3CcrHj9EArray[n13] = Field10361 = new mHbkRHZKusDv305PoVrIANUx3CcrHj9E("RedstoneTorch", n14, (Object)block4, mHbkRHZKusDv305PoVrIANUx3CcrHj9E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17006);
        int n15 = (int)((long)367937272 ^ (long)367937265);
        int n16 = (int)1484141824L ^ 0x58763509;
        Block block5 = Blocks.TORCH;
        Intrinsics.checkExpressionValueIsNotNull((Object)block5, (String)"Blocks.TORCH");
        mHbkRHZKusDv305PoVrIANUx3CcrHj9EArray[n15] = Field10362 = new mHbkRHZKusDv305PoVrIANUx3CcrHj9E("Torch", n16, (Object)block5, mHbkRHZKusDv305PoVrIANUx3CcrHj9E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17006);
        int n17 = ((int)-1883653251L ^ 0x8FB9BB78) << 1;
        int n18 = (int)((long)-1281056495 ^ (long)-1281056492) << 1;
        ItemArmorStand itemArmorStand = Items.ARMOR_STAND;
        Intrinsics.checkExpressionValueIsNotNull((Object)itemArmorStand, (String)"Items.ARMOR_STAND");
        mHbkRHZKusDv305PoVrIANUx3CcrHj9EArray[n17] = Field10363 = new mHbkRHZKusDv305PoVrIANUx3CcrHj9E("ArmorStand", n18, (Object)itemArmorStand, mHbkRHZKusDv305PoVrIANUx3CcrHj9E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17004);
        Field10364 = mHbkRHZKusDv305PoVrIANUx3CcrHj9EArray;
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
    private mHbkRHZKusDv305PoVrIANUx3CcrHj9E() {
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
    private mHbkRHZKusDv305PoVrIANUx3CcrHj9E() {
        void var2_-1;
        void var1_-1;
        List list3;
        List list4;
        void var3_1;
        void var4_2;
        if (var4_2 == mHbkRHZKusDv305PoVrIANUx3CcrHj9E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17005) {
            list4 = var3_1;
            if (list4 == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<net.minecraft.item.Item>");
            }
        } else {
            list4 = CollectionsKt.emptyList();
        }
        if (var4_2 == mHbkRHZKusDv305PoVrIANUx3CcrHj9E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17007) {
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
    private mHbkRHZKusDv305PoVrIANUx3CcrHj9E() {
        void var2_-1;
        void var1_-1;
        List list;
        List list2;
        void var3_1;
        void var4_2;
        if (var4_2 == mHbkRHZKusDv305PoVrIANUx3CcrHj9E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17004) {
            Object[] objectArray = new Item[(int)-1283541719L ^ 0xB37EB528];
            void v1 = var3_1;
            if (v1 == null) {
                throw new TypeCastException("null cannot be cast to non-null type net.minecraft.item.Item");
            }
            objectArray[(int)((long)422667154 ^ (long)422667154)] = (Item)v1;
            list2 = CollectionsKt.arrayListOf((Object[])objectArray);
        } else {
            list2 = CollectionsKt.emptyList();
        }
        if (var4_2 == mHbkRHZKusDv305PoVrIANUx3CcrHj9E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17006) {
            Object[] objectArray = new Block[(int)-1378515712L ^ 0xADD58501];
            void v4 = var3_1;
            if (v4 == null) {
                throw new TypeCastException("null cannot be cast to non-null type net.minecraft.block.Block");
            }
            objectArray[(int)-1203723089L ^ 0xB840A4AF] = (Block)v4;
            list = CollectionsKt.arrayListOf((Object[])objectArray);
        } else {
            list = CollectionsKt.emptyList();
        }
        this((String)var1_-1, (int)var2_-1, list2, list);
    }

    public static mHbkRHZKusDv305PoVrIANUx3CcrHj9E[] values() {
        return (mHbkRHZKusDv305PoVrIANUx3CcrHj9E[])Field10364.clone();
    }

    public static mHbkRHZKusDv305PoVrIANUx3CcrHj9E valueOf(String string) {
        return Enum.valueOf(mHbkRHZKusDv305PoVrIANUx3CcrHj9E.class, string);
    }

    private static String Method2465(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)915283997 ^ (long)915283997);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)303046989 ^ (long)303047090);
            int n2 = (int)-1271101289L ^ 0xB43C888C;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1071841958L ^ 0xC01CF9BB) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

