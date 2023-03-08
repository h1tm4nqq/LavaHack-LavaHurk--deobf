//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;
import kotlin.collections.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import net.minecraft.item.*;
import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001dB\u001b\b\u0012\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006B\u0017\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\tB#\b\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003?\u0006\u0002\u0010\u000eR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003?\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c?\u0006\u001e" }, d2 = { "Lcom/kisman/cc/util/enums/SoftBlocks;", "", "list", "", "type", "Lcom/kisman/cc/util/enums/SoftBlocks$ElementType;", "(Ljava/lang/String;ILjava/util/List;Lcom/kisman/cc/util/enums/SoftBlocks$ElementType;)V", "obj", "", "(Ljava/lang/String;ILjava/lang/Object;Lcom/kisman/cc/util/enums/SoftBlocks$ElementType;)V", "items", "Lnet/minecraft/item/Item;", "blocks", "Lnet/minecraft/block/Block;", "(Ljava/lang/String;ILjava/util/List;Ljava/util/List;)V", "getBlocks", "()Ljava/util/List;", "getItems", "RedstoneWire", "Button", "Sapling", "Seed", "Banner", "String", "Lever", "Web", "RedstoneTorch", "Torch", "ArmorStand", "ElementType", "kisman.cc" })
public enum Class555
{
    Field10353(s, n2, (Object)REDSTONE_WIRE, Class1949.Field17006), 
    Field10354("Button", 1, (List)CollectionsKt.arrayListOf((Object[])new Block[] { Blocks.STONE_BUTTON, Blocks.WOODEN_BUTTON }), Class1949.Field17007), 
    Field10355(s2, n4, (Object)SAPLING, Class1949.Field17006), 
    Field10356("Seed", 3, (List)CollectionsKt.arrayListOf((Object[])new Item[] { Items.BEETROOT_SEEDS, Items.MELON_SEEDS, Items.WHEAT_SEEDS, Items.PUMPKIN_SEEDS, Items.CARROT, Items.NETHER_WART, Items.POTATO }), Class1949.Field17005), 
    Field10357(s3, n6, (Object)BANNER, Class1949.Field17004), 
    Field10358(s4, n8, (Object)STRING, Class1949.Field17004), 
    Field10359(s5, n10, (Object)LEVER, Class1949.Field17006), 
    Field10360(s6, n12, (Object)WEB, Class1949.Field17006), 
    Field10361(s7, n14, (Object)REDSTONE_TORCH, Class1949.Field17006), 
    Field10362(s8, n16, (Object)TORCH, Class1949.Field17006), 
    Field10363(s9, n18, (Object)ARMOR_STAND, Class1949.Field17004);
    
    private static final Class555[] Field10364;
    @NotNull
    private final List Field10365;
    @NotNull
    private final List Field10366;
    private String Field10367 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    static {
        final Class555[] field10364 = new Class555[11];
        final int n = 0;
        final String s = "RedstoneWire";
        final int n2 = 0;
        final BlockRedstoneWire REDSTONE_WIRE = Blocks.REDSTONE_WIRE;
        Intrinsics.checkExpressionValueIsNotNull((Object)REDSTONE_WIRE, "Blocks.REDSTONE_WIRE");
        final int n3 = 2;
        final String s2 = "Sapling";
        final int n4 = 2;
        final Block SAPLING = Blocks.SAPLING;
        Intrinsics.checkExpressionValueIsNotNull((Object)SAPLING, "Blocks.SAPLING");
        final int n5 = 4;
        final String s3 = "Banner";
        final int n6 = 4;
        final Item BANNER = Items.BANNER;
        Intrinsics.checkExpressionValueIsNotNull((Object)BANNER, "Items.BANNER");
        final int n7 = 5;
        final String s4 = "String";
        final int n8 = 5;
        final Item STRING = Items.STRING;
        Intrinsics.checkExpressionValueIsNotNull((Object)STRING, "Items.STRING");
        final int n9 = 6;
        final String s5 = "Lever";
        final int n10 = 6;
        final Block LEVER = Blocks.LEVER;
        Intrinsics.checkExpressionValueIsNotNull((Object)LEVER, "Blocks.LEVER");
        final int n11 = 7;
        final String s6 = "Web";
        final int n12 = 7;
        final Block WEB = Blocks.WEB;
        Intrinsics.checkExpressionValueIsNotNull((Object)WEB, "Blocks.WEB");
        final int n13 = 8;
        final String s7 = "RedstoneTorch";
        final int n14 = 8;
        final Block REDSTONE_TORCH = Blocks.REDSTONE_TORCH;
        Intrinsics.checkExpressionValueIsNotNull((Object)REDSTONE_TORCH, "Blocks.REDSTONE_TORCH");
        final int n15 = 9;
        final String s8 = "Torch";
        final int n16 = 9;
        final Block TORCH = Blocks.TORCH;
        Intrinsics.checkExpressionValueIsNotNull((Object)TORCH, "Blocks.TORCH");
        final int n17 = 10;
        final String s9 = "ArmorStand";
        final int n18 = 10;
        final ItemArmorStand ARMOR_STAND = Items.ARMOR_STAND;
        Intrinsics.checkExpressionValueIsNotNull((Object)ARMOR_STAND, "Items.ARMOR_STAND");
        Field10364 = field10364;
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
    
    private Class555(final String name, final int ordinal, final List field10365, final List field10366) {
        this.Field10365 = field10365;
        this.Field10366 = field10366;
    }
    
    private Class555(final String s, final int n, final List list, final Class1949 class1949) {
        List emptyList;
        if (class1949 == Class1949.Field17005) {
            if ((emptyList = list) == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<net.minecraft.item.Item>");
            }
        }
        else {
            emptyList = CollectionsKt.emptyList();
        }
        List emptyList2;
        if (class1949 == Class1949.Field17007) {
            if ((emptyList2 = list) == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<net.minecraft.block.Block>");
            }
        }
        else {
            emptyList2 = CollectionsKt.emptyList();
        }
        this(s, n, emptyList, emptyList2);
    }
    
    private Class555(final String s, final int n, final Object o, final Class1949 class1949) {
        List emptyList;
        if (class1949 == Class1949.Field17004) {
            final Item[] array = { null };
            final int n2 = 0;
            if (o == null) {
                throw new TypeCastException("null cannot be cast to non-null type net.minecraft.item.Item");
            }
            array[n2] = (Item)o;
            emptyList = CollectionsKt.arrayListOf((Object[])array);
        }
        else {
            emptyList = CollectionsKt.emptyList();
        }
        List emptyList2;
        if (class1949 == Class1949.Field17006) {
            final Block[] array2 = { null };
            final int n3 = 0;
            if (o == null) {
                throw new TypeCastException("null cannot be cast to non-null type net.minecraft.block.Block");
            }
            array2[n3] = (Block)o;
            emptyList2 = CollectionsKt.arrayListOf((Object[])array2);
        }
        else {
            emptyList2 = CollectionsKt.emptyList();
        }
        this(s, n, emptyList, emptyList2);
    }
    
    private static String Method2465(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x9C2 ^ 0x1B));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
