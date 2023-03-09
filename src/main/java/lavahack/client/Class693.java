//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  lavahack.client.CJgIA7TB8tBzfi0mBL2u6P69hVSyW45I
 *  net.minecraft.block.Block
 *  net.minecraft.init.Blocks
 */
package lavahack.client;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.CJgIA7TB8tBzfi0mBL2u6P69hVSyW45I;
import lavahack.client.Class1761;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u001b\b\u0002\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010\u00a8\u0006\u0012"}, d2={"Lcom/kisman/cc/util/enums/XRayBlocks;", "", "blocks", "", "Lnet/minecraft/block/Block;", "(Ljava/lang/String;I[Lnet/minecraft/block/Block;)V", "validator", "Lcom/kisman/cc/util/enums/XRayBlocks$Validator;", "getValidator", "()Lcom/kisman/cc/util/enums/XRayBlocks$Validator;", "Coal", "Iron", "Gold", "Lapis", "Redstone", "Diamond", "Emerald", "Validator", "kisman.cc"})
public final class Class693
extends Enum {
    public static final /* enum */ Class693 Field10925;
    public static final /* enum */ Class693 Field10926;
    public static final /* enum */ Class693 Field10927;
    public static final /* enum */ Class693 Field10928;
    public static final /* enum */ Class693 Field10929;
    public static final /* enum */ Class693 Field10930;
    public static final /* enum */ Class693 Field10931;
    private static final Class693[] Field10932;
    @NotNull
    private final Class1761 Field10933;
    private String Field10934 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class693[] class693Array = new Class693[7];
        Class693[] class693Array2 = class693Array;
        Block[] blockArray = new Block[1];
        Block block = Blocks.COAL_ORE;
        Intrinsics.checkExpressionValueIsNotNull((Object)block, (String)"Blocks.COAL_ORE");
        blockArray[0] = block;
        class693Array[0] = Field10925 = new Class693("Coal", 0, blockArray);
        Block[] blockArray2 = new Block[1];
        Block block2 = Blocks.IRON_ORE;
        Intrinsics.checkExpressionValueIsNotNull((Object)block2, (String)"Blocks.IRON_ORE");
        blockArray2[0] = block2;
        class693Array[1] = Field10926 = new Class693("Iron", 1, blockArray2);
        Block[] blockArray3 = new Block[1];
        Block block3 = Blocks.GOLD_ORE;
        Intrinsics.checkExpressionValueIsNotNull((Object)block3, (String)"Blocks.GOLD_ORE");
        blockArray3[0] = block3;
        class693Array[2] = Field10927 = new Class693("Gold", 2, blockArray3);
        Block[] blockArray4 = new Block[1];
        Block block4 = Blocks.LAPIS_ORE;
        Intrinsics.checkExpressionValueIsNotNull((Object)block4, (String)"Blocks.LAPIS_ORE");
        blockArray4[0] = block4;
        class693Array[3] = Field10928 = new Class693("Lapis", 3, blockArray4);
        Block[] blockArray5 = new Block[2];
        Block block5 = Blocks.REDSTONE_ORE;
        Intrinsics.checkExpressionValueIsNotNull((Object)block5, (String)"Blocks.REDSTONE_ORE");
        blockArray5[0] = block5;
        Block block6 = Blocks.LIT_REDSTONE_ORE;
        Intrinsics.checkExpressionValueIsNotNull((Object)block6, (String)"Blocks.LIT_REDSTONE_ORE");
        blockArray5[1] = block6;
        class693Array[4] = Field10929 = new Class693("Redstone", 4, blockArray5);
        Block[] blockArray6 = new Block[1];
        Block block7 = Blocks.DIAMOND_ORE;
        Intrinsics.checkExpressionValueIsNotNull((Object)block7, (String)"Blocks.DIAMOND_ORE");
        blockArray6[0] = block7;
        class693Array[5] = Field10930 = new Class693("Diamond", 5, blockArray6);
        Block[] blockArray7 = new Block[1];
        Block block8 = Blocks.EMERALD_BLOCK;
        Intrinsics.checkExpressionValueIsNotNull((Object)block8, (String)"Blocks.EMERALD_BLOCK");
        blockArray7[0] = block8;
        class693Array[6] = Field10931 = new Class693("Emerald", 6, blockArray7);
        Field10932 = class693Array;
    }

    @NotNull
    @NotNull
    public final Class1761 Method2906() {
        return this.Field10933;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class693() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        void v0 = var3_1;
        this.Field10933 = new Class1761((Block[])Arrays.copyOf(v0, ((void)v0).length));
    }

    public static Class693[] values() {
        return (CJgIA7TB8tBzfi0mBL2u6P69hVSyW45I[])Field10932.clone();
    }

    public static Class693 valueOf(String string) {
        return Enum.valueOf(Class693.class, string);
    }

    private static String Method2907(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 149;
            cArray2[n] = (char)(cArray[n] ^ (0x51BD ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

