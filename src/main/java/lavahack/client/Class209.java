//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.collections.*;
import java.util.*;
import com.sun.javafx.geom.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J \u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005?\u0006\f" }, d2 = { "Lcom/kisman/cc/util/enums/ShadowRectSectorSides$Companion;", "", "()V", "findSides", "", "Lcom/kisman/cc/util/enums/ShadowRectSectorSides;", "side", "Lcom/kisman/cc/util/enums/RectSides;", "getRenderPos", "Lcom/sun/javafx/geom/Vec2d;", "start", "end", "kisman.cc" })
public final class Class209
{
    private String Field8901 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final List Method1240(@NotNull @NotNull final Class1459 class1459) {
        Intrinsics.checkParameterIsNotNull((Object)class1459, "side");
        List plus = new ArrayList();
        for (final Class293 class1460 : Class293.values()) {
            if (class1460.Method1531().contains(class1459)) {
                plus = CollectionsKt.plus((Collection)plus, (Object)class1460);
            }
        }
        return plus;
    }
    
    @Nullable
    @Nullable
    public final Vec2d Method1241(@NotNull @NotNull final Vec2d vec2d, @NotNull @NotNull final Vec2d vec2d2, @NotNull @NotNull final Class293 class293) {
        Intrinsics.checkParameterIsNotNull((Object)vec2d, "start");
        Intrinsics.checkParameterIsNotNull((Object)vec2d2, "end");
        Intrinsics.checkParameterIsNotNull((Object)class293, "side");
        final Class1370 method1532 = class293.Method1532();
        return (method1532.Method5464() == 0) ? vec2d : ((method1532.Method5464() == 90) ? new Vec2d(vec2d2.x, vec2d.y) : ((method1532.Method5464() == 180) ? vec2d2 : ((method1532.Method5464() == 270) ? new Vec2d(vec2d.x, vec2d2.y) : null)));
    }
    
    private Class209() {
    }
    
    public Class209(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
    
    private static String Method1242(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x70C ^ 0xF5));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
