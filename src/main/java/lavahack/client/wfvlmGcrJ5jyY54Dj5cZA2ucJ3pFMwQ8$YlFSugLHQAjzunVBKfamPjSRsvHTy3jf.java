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

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/event/events/RenderTileEntityEvent$Pre;", "Lcom/kisman/cc/event/events/RenderTileEntityEvent;", "tileEntity", "Lnet/minecraft/tileentity/TileEntity;", "(Lnet/minecraft/tileentity/TileEntity;)V", "kisman.cc"})
public final class wfvlmGcrJ5jyY54Dj5cZA2ucJ3pFMwQ8$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends wfvlmGcrJ5jyY54Dj5cZA2ucJ3pFMwQ8 {
    private String Field10400 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public wfvlmGcrJ5jyY54Dj5cZA2ucJ3pFMwQ8$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(@NotNull @NotNull TileEntity tileEntity) {
        Intrinsics.checkParameterIsNotNull((Object)tileEntity, (String)"tileEntity");
        super(tileEntity);
    }

    private static String Method170(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1051215713L ^ 0x3EA84761;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1390490031L ^ 0x52E13150);
            int n2 = (int)((long)2105384760 ^ (long)2105384721) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1335318552L ^ 0xB068A62F) << 6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

