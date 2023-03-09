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
import lavahack.client.Class1370;
import lavahack.client.Class1459;
import lavahack.client.Class293;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J \u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/util/enums/ShadowRectSectorSides$Companion;", "", "()V", "findSides", "", "Lcom/kisman/cc/util/enums/ShadowRectSectorSides;", "side", "Lcom/kisman/cc/util/enums/RectSides;", "getRenderPos", "Lcom/sun/javafx/geom/Vec2d;", "start", "end", "kisman.cc"})
public final class Class209 {
    private String Field8901 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final List Method1240(@NotNull @NotNull Class1459 class1459) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)class1459), (String)"side");
        List list = new ArrayList();
        Class293[] class293Array = Class293.values();
        int n = class293Array.length;
        int n2 = 0;
        while (n2 < n) {
            Class293 class293 = class293Array[n2];
            if (class293.Method1531().contains((Object)class1459)) {
                list = CollectionsKt.plus((Collection)list, (Object)((Object)class293));
            }
            ++n2;
        }
        return list;
    }

    @Nullable
    @Nullable
    public final Vec2d Method1241(@NotNull @NotNull Vec2d vec2d, @NotNull @NotNull Vec2d vec2d2, @NotNull @NotNull Class293 class293) {
        Vec2d vec2d3;
        Intrinsics.checkParameterIsNotNull((Object)vec2d, (String)"start");
        Intrinsics.checkParameterIsNotNull((Object)vec2d2, (String)"end");
        Intrinsics.checkParameterIsNotNull((Object)((Object)class293), (String)"side");
        Class1370 class1370 = class293.Method1532();
        if (class1370.Method5464() == 0) {
            vec2d3 = vec2d;
            return vec2d3;
        }
        if (class1370.Method5464() == 90) {
            vec2d3 = new Vec2d(vec2d2.x, vec2d.y);
            return vec2d3;
        }
        if (class1370.Method5464() == 180) {
            vec2d3 = vec2d2;
            return vec2d3;
        }
        if (class1370.Method5464() != 270) return null;
        vec2d3 = new Vec2d(vec2d.x, vec2d2.y);
        return vec2d3;
    }

    private Class209() {
    }

    public Class209(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static String Method1242(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 245;
            cArray2[n] = (char)(cArray[n] ^ (0x70C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

