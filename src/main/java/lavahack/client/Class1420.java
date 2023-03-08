//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.sun.javafx.geom.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003?\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007?\u0006\t" }, d2 = { "Lcom/kisman/cc/util/render/objects/screen/RectObject;", "", "start", "Lcom/sun/javafx/geom/Vec2d;", "end", "(Lcom/sun/javafx/geom/Vec2d;Lcom/sun/javafx/geom/Vec2d;)V", "getEnd", "()Lcom/sun/javafx/geom/Vec2d;", "getStart", "kisman.cc" })
public final class Class1420
{
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
    
    public Class1420(@NotNull @NotNull final Vec2d field14614, @NotNull @NotNull final Vec2d field14615) {
        Intrinsics.checkParameterIsNotNull((Object)field14614, "start");
        Intrinsics.checkParameterIsNotNull((Object)field14615, "end");
        this.Field14614 = field14614;
        this.Field14615 = field14615;
    }
    
    private static String Method5675(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6DE2 ^ 0x3D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
