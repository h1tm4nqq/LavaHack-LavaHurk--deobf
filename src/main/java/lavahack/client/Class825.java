//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.sun.javafx.geom.*;
import org.jetbrains.annotations.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0017B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n?\u0006\u0002\u0010\u000bJ\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004?\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004?\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004?\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014?\u0006\u0018" }, d2 = { "Lcom/kisman/cc/util/render/objects/screen/AbstractCircle;", "", "pos", "Lcom/sun/javafx/geom/Vec2d;", "radius", "", "color1", "Lcom/kisman/cc/util/Colour;", "color2", "corner", "Lcom/kisman/cc/util/render/objects/screen/CornerObject;", "(Lcom/sun/javafx/geom/Vec2d;ILcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/render/objects/screen/CornerObject;)V", "getColor1", "()Lcom/kisman/cc/util/Colour;", "getColor2", "getCorner", "()Lcom/kisman/cc/util/render/objects/screen/CornerObject;", "getPos", "()Lcom/sun/javafx/geom/Vec2d;", "getRadius", "()I", "draw", "", "Shadow", "kisman.cc" })
public class Class825
{
    @NotNull
    private final Vec2d Field11514;
    private final int Field11515;
    @NotNull
    private final Class2027 Field11516;
    @NotNull
    private final Class2027 Field11517;
    @NotNull
    private final Class1370 Field11518;
    private String Field11519 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method3528() {
    }
    
    @NotNull
    @NotNull
    public Vec2d Method3529() {
        return this.Field11514;
    }
    
    public int Method3530() {
        return this.Field11515;
    }
    
    @NotNull
    @NotNull
    public Class2027 Method3531() {
        return this.Field11516;
    }
    
    @NotNull
    @NotNull
    public Class2027 Method3532() {
        return this.Field11517;
    }
    
    @NotNull
    @NotNull
    public Class1370 Method3533() {
        return this.Field11518;
    }
    
    public Class825(@NotNull @NotNull final Vec2d field11514, final int field11515, @NotNull @NotNull final Class2027 field11516, @NotNull @NotNull final Class2027 field11517, @NotNull @NotNull final Class1370 field11518) {
        Intrinsics.checkParameterIsNotNull((Object)field11514, "pos");
        Intrinsics.checkParameterIsNotNull((Object)field11516, "color1");
        Intrinsics.checkParameterIsNotNull((Object)field11517, "color2");
        Intrinsics.checkParameterIsNotNull((Object)field11518, "corner");
        this.Field11514 = field11514;
        this.Field11515 = field11515;
        this.Field11516 = field11516;
        this.Field11517 = field11517;
        this.Field11518 = field11518;
    }
    
    private static String Method3534(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6295 ^ 0x9E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
