/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.javafx.geom.Vec2d
 *  kotlin.Metadata
 *  kotlin.NoWhenBranchMatchedException
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import com.sun.javafx.geom.Vec2d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1420;
import lavahack.client.Class1459;
import lavahack.client.Class2176;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/util/enums/RectSides$Companion;", "", "()V", "getRenderPos", "Lcom/kisman/cc/util/render/objects/screen/RectObject;", "start", "Lcom/sun/javafx/geom/Vec2d;", "end", "side", "Lcom/kisman/cc/util/enums/RectSides;", "kisman.cc"})
public final class Class2066 {
    private String Field17439 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final Class1420 Method7580(@NotNull @NotNull Vec2d vec2d, @NotNull @NotNull Vec2d vec2d2, @NotNull @NotNull Class1459 class1459) {
        Intrinsics.checkParameterIsNotNull((Object)vec2d, (String)"start");
        Intrinsics.checkParameterIsNotNull((Object)vec2d2, (String)"end");
        Intrinsics.checkParameterIsNotNull((Object)((Object)class1459), (String)"side");
        switch (Class2176.Field17954[class1459.ordinal()]) {
            case 1: {
                Class1420 class1420 = new Class1420(vec2d, new Vec2d(vec2d2.x, vec2d.y));
                return class1420;
            }
            case 2: {
                Class1420 class1420 = new Class1420(new Vec2d(vec2d.x, vec2d2.y), vec2d2);
                return class1420;
            }
            case 3: {
                Class1420 class1420 = new Class1420(new Vec2d(vec2d2.x, vec2d.y), vec2d2);
                return class1420;
            }
            case 4: {
                Class1420 class1420 = new Class1420(vec2d, new Vec2d(vec2d.x, vec2d2.y));
                return class1420;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    private Class2066() {
    }

    public Class2066(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static String Method7581(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 32;
            cArray2[n] = (char)(cArray[n] ^ (0x793D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

