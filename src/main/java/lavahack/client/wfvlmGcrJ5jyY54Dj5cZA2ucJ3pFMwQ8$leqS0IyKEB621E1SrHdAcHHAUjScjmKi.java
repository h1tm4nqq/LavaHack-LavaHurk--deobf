/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.tileentity.TileEntity
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.wfvlmGcrJ5jyY54Dj5cZA2ucJ3pFMwQ8;
import net.minecraft.tileentity.TileEntity;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/event/events/RenderTileEntityEvent$Post;", "Lcom/kisman/cc/event/events/RenderTileEntityEvent;", "tileEntity", "Lnet/minecraft/tileentity/TileEntity;", "(Lnet/minecraft/tileentity/TileEntity;)V", "kisman.cc"})
public final class wfvlmGcrJ5jyY54Dj5cZA2ucJ3pFMwQ8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends wfvlmGcrJ5jyY54Dj5cZA2ucJ3pFMwQ8 {
    private int Field9187;

    public wfvlmGcrJ5jyY54Dj5cZA2ucJ3pFMwQ8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull TileEntity tileEntity) {
        Intrinsics.checkParameterIsNotNull((Object)tileEntity, (String)"tileEntity");
        super(tileEntity);
    }

    private static String Method170(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)458542177 ^ (long)458542177);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)2022453071L ^ 0x788C2FB0);
            int n2 = ((int)-2131764882L ^ 0x80EFD967) << 4;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1754437209 ^ (long)1754434100) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

