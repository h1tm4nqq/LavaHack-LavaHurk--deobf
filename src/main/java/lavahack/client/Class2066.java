//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.sun.javafx.geom.*;
import org.jetbrains.annotations.*;
import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t?\u0006\n" }, d2 = { "Lcom/kisman/cc/util/enums/RectSides$Companion;", "", "()V", "getRenderPos", "Lcom/kisman/cc/util/render/objects/screen/RectObject;", "start", "Lcom/sun/javafx/geom/Vec2d;", "end", "side", "Lcom/kisman/cc/util/enums/RectSides;", "kisman.cc" })
public final class Class2066
{
    private String Field17439 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class1420 Method7580(@NotNull @NotNull final Vec2d vec2d, @NotNull @NotNull final Vec2d vec2d2, @NotNull @NotNull final Class1459 class1459) {
        Intrinsics.checkParameterIsNotNull((Object)vec2d, "start");
        Intrinsics.checkParameterIsNotNull((Object)vec2d2, "end");
        Intrinsics.checkParameterIsNotNull((Object)class1459, "side");
        Class1420 class1460 = null;
        switch (Class2176.Field17954[class1459.ordinal()]) {
            case 1: {
                class1460 = new Class1420(vec2d, new Vec2d(vec2d2.x, vec2d.y));
                break;
            }
            case 2: {
                class1460 = new Class1420(new Vec2d(vec2d.x, vec2d2.y), vec2d2);
                break;
            }
            case 3: {
                class1460 = new Class1420(new Vec2d(vec2d2.x, vec2d.y), vec2d2);
                break;
            }
            case 4: {
                class1460 = new Class1420(vec2d, new Vec2d(vec2d.x, vec2d2.y));
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return class1460;
    }
    
    private Class2066() {
    }
    
    public Class2066(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
    
    private static String Method7581(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x793D ^ 0x20));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
