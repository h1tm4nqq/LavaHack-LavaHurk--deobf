//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.item.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005?\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b?\u0006\r" }, d2 = { "Lcom/kisman/cc/gui/other/search/components/ItemButton;", "Lcom/kisman/cc/gui/api/Component;", "item", "Lnet/minecraft/item/Item;", "x_", "", "y_", "(Lnet/minecraft/item/Item;II)V", "getItem", "()Lnet/minecraft/item/Item;", "getX_", "()I", "getY_", "kisman.cc" })
public final class Class944 implements Class1520
{
    @NotNull
    private final Item Field12028;
    private final int Field12029;
    private final int Field12030;
    private int Field12031;
    
    @NotNull
    @NotNull
    public final Item Method3898() {
        return this.Field12028;
    }
    
    public final int Method3899() {
        return this.Field12029;
    }
    
    public final int Method3900() {
        return this.Field12030;
    }
    
    public Class944(@NotNull @NotNull final Item field12028, final int field12029, final int field12030) {
        Intrinsics.checkParameterIsNotNull((Object)field12028, "item");
        this.Field12028 = field12028;
        this.Field12029 = field12029;
        this.Field12030 = field12030;
    }
    
    private static String Method3901(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xFD3 ^ 0x2F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
