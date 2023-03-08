//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.block.*;
import net.minecraft.init.*;
import kotlin.jvm.internal.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u001b\b\u0002\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004?\u0006\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007?\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010?\u0006\u0012" }, d2 = { "Lcom/kisman/cc/util/enums/XRayBlocks;", "", "blocks", "", "Lnet/minecraft/block/Block;", "(Ljava/lang/String;I[Lnet/minecraft/block/Block;)V", "validator", "Lcom/kisman/cc/util/enums/XRayBlocks$Validator;", "getValidator", "()Lcom/kisman/cc/util/enums/XRayBlocks$Validator;", "Coal", "Iron", "Gold", "Lapis", "Redstone", "Diamond", "Emerald", "Validator", "kisman.cc" })
public enum Class693
{
    Field10925(s, n2, array), 
    Field10926(s2, n5, array2), 
    Field10927(s3, n8, array3), 
    Field10928(s4, n11, array4), 
    Field10929(s5, n14, array5), 
    Field10930(s6, n18, array6), 
    Field10931(s7, n21, array7);
    
    private static final Class693[] Field10932;
    @NotNull
    private final Class1761 Field10933;
    private String Field10934 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    static {
        final Class693[] field10932 = new Class693[7];
        final int n = 0;
        final String s = "Coal";
        final int n2 = 0;
        final Block[] array = { null };
        final int n3 = 0;
        final Block COAL_ORE = Blocks.COAL_ORE;
        Intrinsics.checkExpressionValueIsNotNull((Object)COAL_ORE, "Blocks.COAL_ORE");
        array[n3] = COAL_ORE;
        final int n4 = 1;
        final String s2 = "Iron";
        final int n5 = 1;
        final Block[] array2 = { null };
        final int n6 = 0;
        final Block IRON_ORE = Blocks.IRON_ORE;
        Intrinsics.checkExpressionValueIsNotNull((Object)IRON_ORE, "Blocks.IRON_ORE");
        array2[n6] = IRON_ORE;
        final int n7 = 2;
        final String s3 = "Gold";
        final int n8 = 2;
        final Block[] array3 = { null };
        final int n9 = 0;
        final Block GOLD_ORE = Blocks.GOLD_ORE;
        Intrinsics.checkExpressionValueIsNotNull((Object)GOLD_ORE, "Blocks.GOLD_ORE");
        array3[n9] = GOLD_ORE;
        final int n10 = 3;
        final String s4 = "Lapis";
        final int n11 = 3;
        final Block[] array4 = { null };
        final int n12 = 0;
        final Block LAPIS_ORE = Blocks.LAPIS_ORE;
        Intrinsics.checkExpressionValueIsNotNull((Object)LAPIS_ORE, "Blocks.LAPIS_ORE");
        array4[n12] = LAPIS_ORE;
        final int n13 = 4;
        final String s5 = "Redstone";
        final int n14 = 4;
        final Block[] array5 = new Block[2];
        final int n15 = 0;
        final Block REDSTONE_ORE = Blocks.REDSTONE_ORE;
        Intrinsics.checkExpressionValueIsNotNull((Object)REDSTONE_ORE, "Blocks.REDSTONE_ORE");
        array5[n15] = REDSTONE_ORE;
        final int n16 = 1;
        final Block LIT_REDSTONE_ORE = Blocks.LIT_REDSTONE_ORE;
        Intrinsics.checkExpressionValueIsNotNull((Object)LIT_REDSTONE_ORE, "Blocks.LIT_REDSTONE_ORE");
        array5[n16] = LIT_REDSTONE_ORE;
        final int n17 = 5;
        final String s6 = "Diamond";
        final int n18 = 5;
        final Block[] array6 = { null };
        final int n19 = 0;
        final Block DIAMOND_ORE = Blocks.DIAMOND_ORE;
        Intrinsics.checkExpressionValueIsNotNull((Object)DIAMOND_ORE, "Blocks.DIAMOND_ORE");
        array6[n19] = DIAMOND_ORE;
        final int n20 = 6;
        final String s7 = "Emerald";
        final int n21 = 6;
        final Block[] array7 = { null };
        final int n22 = 0;
        final Block EMERALD_BLOCK = Blocks.EMERALD_BLOCK;
        Intrinsics.checkExpressionValueIsNotNull((Object)EMERALD_BLOCK, "Blocks.EMERALD_BLOCK");
        array7[n22] = EMERALD_BLOCK;
        Field10932 = field10932;
    }
    
    @NotNull
    @NotNull
    public final Class1761 Method2906() {
        return this.Field10933;
    }
    
    private Class693(final String name, final int ordinal, final Block... original) {
        this.Field10933 = new Class1761((Block[])Arrays.copyOf(original, original.length));
    }
    
    private static String Method2907(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x51BD ^ 0x95));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
