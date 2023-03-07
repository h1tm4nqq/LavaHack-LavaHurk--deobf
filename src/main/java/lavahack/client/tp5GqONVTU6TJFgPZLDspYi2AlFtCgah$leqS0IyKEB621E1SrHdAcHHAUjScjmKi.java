/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.javafx.geom.Vec2d
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import com.sun.javafx.geom.Vec2d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.tp5GqONVTU6TJFgPZLDspYi2AlFtCgah;
import lavahack.client.xDVjz84eKZzlmDouYVlr9YsaGkTlDzkh;
import lavahack.client.xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J \u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/util/enums/ShadowRectSectorSides$Companion;", "", "()V", "findSides", "", "Lcom/kisman/cc/util/enums/ShadowRectSectorSides;", "side", "Lcom/kisman/cc/util/enums/RectSides;", "getRenderPos", "Lcom/sun/javafx/geom/Vec2d;", "start", "end", "kisman.cc"})
public final class tp5GqONVTU6TJFgPZLDspYi2AlFtCgah$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    private String Field8901 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final List Method1240(@NotNull @NotNull xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j2) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j2), (String)"side");
        List list = new ArrayList();
        tp5GqONVTU6TJFgPZLDspYi2AlFtCgah[] tp5GqONVTU6TJFgPZLDspYi2AlFtCgahArray = tp5GqONVTU6TJFgPZLDspYi2AlFtCgah.values();
        int n = tp5GqONVTU6TJFgPZLDspYi2AlFtCgahArray.length;
        int n2 = (int)((long)-1303864116 ^ (long)-1303864116);
        while (n2 < n) {
            tp5GqONVTU6TJFgPZLDspYi2AlFtCgah tp5GqONVTU6TJFgPZLDspYi2AlFtCgah2 = tp5GqONVTU6TJFgPZLDspYi2AlFtCgahArray[n2];
            if (tp5GqONVTU6TJFgPZLDspYi2AlFtCgah2.Method1531().contains((Object)xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j2)) {
                list = CollectionsKt.plus((Collection)list, (Object)((Object)tp5GqONVTU6TJFgPZLDspYi2AlFtCgah2));
            }
            ++n2;
        }
        return list;
    }

    @Nullable
    @Nullable
    public final Vec2d Method1241(@NotNull @NotNull Vec2d vec2d, @NotNull @NotNull Vec2d vec2d2, @NotNull @NotNull tp5GqONVTU6TJFgPZLDspYi2AlFtCgah tp5GqONVTU6TJFgPZLDspYi2AlFtCgah2) {
        Vec2d vec2d3;
        Intrinsics.checkParameterIsNotNull((Object)vec2d, (String)"start");
        Intrinsics.checkParameterIsNotNull((Object)vec2d2, (String)"end");
        Intrinsics.checkParameterIsNotNull((Object)((Object)tp5GqONVTU6TJFgPZLDspYi2AlFtCgah2), (String)"side");
        xDVjz84eKZzlmDouYVlr9YsaGkTlDzkh xDVjz84eKZzlmDouYVlr9YsaGkTlDzkh2 = tp5GqONVTU6TJFgPZLDspYi2AlFtCgah2.Method1532();
        if (xDVjz84eKZzlmDouYVlr9YsaGkTlDzkh2.Method5464() == 0) {
            vec2d3 = vec2d;
            return vec2d3;
        }
        if (xDVjz84eKZzlmDouYVlr9YsaGkTlDzkh2.Method5464() == (int)((long)-587546927 ^ (long)-587546884) << 1) {
            vec2d3 = new Vec2d(vec2d2.x, vec2d.y);
            return vec2d3;
        }
        if (xDVjz84eKZzlmDouYVlr9YsaGkTlDzkh2.Method5464() == (int)((long)92829735 ^ (long)92829706) << 2) {
            vec2d3 = vec2d2;
            return vec2d3;
        }
        if (xDVjz84eKZzlmDouYVlr9YsaGkTlDzkh2.Method5464() != ((int)1740452940L ^ 0x67BD34CB) << 1) return null;
        vec2d3 = new Vec2d(vec2d.x, vec2d2.y);
        return vec2d3;
    }

    private tp5GqONVTU6TJFgPZLDspYi2AlFtCgah$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
    }

    public tp5GqONVTU6TJFgPZLDspYi2AlFtCgah$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static String Method1242(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)155590747L ^ 0x946205B;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)214367452 ^ (long)214367267);
            int n2 = (int)((long)56921323 ^ (long)56921118);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1008994224 ^ (long)-1008993901) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

