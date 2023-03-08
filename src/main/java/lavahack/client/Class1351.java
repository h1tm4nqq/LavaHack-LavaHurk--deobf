//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.item.*;
import org.jetbrains.annotations.*;
import net.minecraft.init.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f?\u0006\r" }, d2 = { "Lcom/kisman/cc/util/enums/OffhandItems;", "", "item", "Lnet/minecraft/item/Item;", "(Ljava/lang/String;ILnet/minecraft/item/Item;)V", "getItem", "()Lnet/minecraft/item/Item;", "Crystal", "Gap", "Pearl", "Chorus", "Shield", "Totem", "kisman.cc" })
public enum Class1351
{
    Field14140(s, n2, END_CRYSTAL), 
    Field14141(s2, n4, GOLDEN_APPLE), 
    Field14142(s3, n6, ENDER_PEARL), 
    Field14143(s4, n8, CHORUS_FRUIT), 
    Field14144(s5, n10, SHIELD), 
    Field14145(s6, n12, TOTEM_OF_UNDYING);
    
    private static final Class1351[] Field14146;
    @NotNull
    private final Item Field14147;
    private int Field14148;
    
    static {
        final Class1351[] field14146 = new Class1351[6];
        final int n = 0;
        final String s = "Crystal";
        final int n2 = 0;
        final Item END_CRYSTAL = Items.END_CRYSTAL;
        Intrinsics.checkExpressionValueIsNotNull((Object)END_CRYSTAL, "Items.END_CRYSTAL");
        final int n3 = 1;
        final String s2 = "Gap";
        final int n4 = 1;
        final Item GOLDEN_APPLE = Items.GOLDEN_APPLE;
        Intrinsics.checkExpressionValueIsNotNull((Object)GOLDEN_APPLE, "Items.GOLDEN_APPLE");
        final int n5 = 2;
        final String s3 = "Pearl";
        final int n6 = 2;
        final Item ENDER_PEARL = Items.ENDER_PEARL;
        Intrinsics.checkExpressionValueIsNotNull((Object)ENDER_PEARL, "Items.ENDER_PEARL");
        final int n7 = 3;
        final String s4 = "Chorus";
        final int n8 = 3;
        final Item CHORUS_FRUIT = Items.CHORUS_FRUIT;
        Intrinsics.checkExpressionValueIsNotNull((Object)CHORUS_FRUIT, "Items.CHORUS_FRUIT");
        final int n9 = 4;
        final String s5 = "Shield";
        final int n10 = 4;
        final Item SHIELD = Items.SHIELD;
        Intrinsics.checkExpressionValueIsNotNull((Object)SHIELD, "Items.SHIELD");
        final int n11 = 5;
        final String s6 = "Totem";
        final int n12 = 5;
        final Item TOTEM_OF_UNDYING = Items.TOTEM_OF_UNDYING;
        Intrinsics.checkExpressionValueIsNotNull((Object)TOTEM_OF_UNDYING, "Items.TOTEM_OF_UNDYING");
        Field14146 = field14146;
    }
    
    @NotNull
    @NotNull
    public final Item Method5415() {
        return this.Field14147;
    }
    
    private Class1351(final String name, final int ordinal, final Item field14147) {
        this.Field14147 = field14147;
    }
    
    private static String Method5416(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6DC0 ^ 0x55));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
