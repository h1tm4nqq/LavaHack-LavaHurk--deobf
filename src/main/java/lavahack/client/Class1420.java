/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.javafx.geom.Vec2d
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import com.sun.javafx.geom.Vec2d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\t"}, d2={"Lcom/kisman/cc/util/render/objects/screen/RectObject;", "", "start", "Lcom/sun/javafx/geom/Vec2d;", "end", "(Lcom/sun/javafx/geom/Vec2d;Lcom/sun/javafx/geom/Vec2d;)V", "getEnd", "()Lcom/sun/javafx/geom/Vec2d;", "getStart", "kisman.cc"})
public final class Class1420 {
    @NotNull
    private final Vec2d Field14614;
    @NotNull
    private final Vec2d Field14615;
    private String Field14616 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final Vec2d Method5673() {
        return this.Field14614;
    }

    @NotNull
    @NotNull
    public final Vec2d Method5674() {
        return this.Field14615;
    }

    public Class1420(@NotNull @NotNull Vec2d vec2d, @NotNull @NotNull Vec2d vec2d2) {
        Intrinsics.checkParameterIsNotNull((Object)vec2d, (String)"start");
        Intrinsics.checkParameterIsNotNull((Object)vec2d2, (String)"end");
        this.Field14614 = vec2d;
        this.Field14615 = vec2d2;
    }

    private static String Method5675(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 61;
            cArray2[n] = (char)(cArray[n] ^ (0x6DE2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

