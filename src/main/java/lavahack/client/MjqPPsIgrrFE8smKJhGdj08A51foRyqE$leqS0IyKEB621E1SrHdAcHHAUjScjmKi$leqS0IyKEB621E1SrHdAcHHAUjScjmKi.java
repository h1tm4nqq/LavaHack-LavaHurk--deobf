/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.entity.Entity
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.MjqPPsIgrrFE8smKJhGdj08A51foRyqE$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/event/events/RenderEntityEvent$All$Post;", "Lcom/kisman/cc/event/events/RenderEntityEvent$All;", "entity", "Lnet/minecraft/entity/Entity;", "x", "", "y", "z", "yaw", "", "partialTicks", "(Lnet/minecraft/entity/Entity;DDDFF)V", "kisman.cc"})
public final class MjqPPsIgrrFE8smKJhGdj08A51foRyqE$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends MjqPPsIgrrFE8smKJhGdj08A51foRyqE$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    private String Field10044 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public MjqPPsIgrrFE8smKJhGdj08A51foRyqE$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull Entity entity, double d, double d2, double d3, float f, float f2) {
        Intrinsics.checkParameterIsNotNull((Object)entity, (String)"entity");
        super(entity, d, d2, d3, f, f2, null);
    }

    private static String Method170(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1582707565L ^ 0x5E56336D;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1253693444L ^ 0x4AB9D8FB);
            int n2 = (int)((long)-480502284 ^ (long)-480502327);
            cArray2[n] = (char)(cArray[n] ^ (((int)-772658927L ^ 0xD1F201E8) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}
