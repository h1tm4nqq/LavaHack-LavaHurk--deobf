/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.tileentity.TileEntity
 */
package lavahack.client;

import com.kisman.cc.event.Event;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.tileentity.TileEntity;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0007\bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2={"Lcom/kisman/cc/event/events/RenderTileEntityEvent;", "Lcom/kisman/cc/event/Event;", "tileEntity", "Lnet/minecraft/tileentity/TileEntity;", "(Lnet/minecraft/tileentity/TileEntity;)V", "getTileEntity", "()Lnet/minecraft/tileentity/TileEntity;", "Post", "Pre", "kisman.cc"})
public class wfvlmGcrJ5jyY54Dj5cZA2ucJ3pFMwQ8
extends Event {
    @NotNull
    private final TileEntity Field15066;
    private String Field15067 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final TileEntity Method1440() {
        return this.Field15066;
    }

    public wfvlmGcrJ5jyY54Dj5cZA2ucJ3pFMwQ8(@NotNull @NotNull TileEntity tileEntity) {
        Intrinsics.checkParameterIsNotNull((Object)tileEntity, (String)"tileEntity");
        super(new Object[(int)((long)-1402355609 ^ (long)-1402355609)]);
        this.Field15066 = tileEntity;
    }

    private static String Method170(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-56410750 ^ (long)-56410750);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1416762630 ^ (long)1416762873);
            int n2 = (int)((long)-296769749 ^ (long)-296769704);
            cArray2[n] = (char)(cArray[n] ^ ((int)1777831852L ^ 0x69F7ED5F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

