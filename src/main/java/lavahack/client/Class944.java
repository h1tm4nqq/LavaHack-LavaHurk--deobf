/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.item.Item
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1520;
import net.minecraft.item.Item;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\r"}, d2={"Lcom/kisman/cc/gui/other/search/components/ItemButton;", "Lcom/kisman/cc/gui/api/Component;", "item", "Lnet/minecraft/item/Item;", "x_", "", "y_", "(Lnet/minecraft/item/Item;II)V", "getItem", "()Lnet/minecraft/item/Item;", "getX_", "()I", "getY_", "kisman.cc"})
public final class Class944
implements Class1520 {
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

    public Class944(@NotNull @NotNull Item item, int n, int n2) {
        Intrinsics.checkParameterIsNotNull((Object)item, (String)"item");
        this.Field12028 = item;
        this.Field12029 = n;
        this.Field12030 = n2;
    }

    private static String Method3901(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 47;
            cArray2[n] = (char)(cArray[n] ^ (0xFD3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

