//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B7\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003?\u0006\u0002\u0010\nB/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b?\u0006\u0002\u0010\u000bB=\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r?\u0006\u0002\u0010\u000fBK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r?\u0006\u0002\u0010\u0012J\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0010\u001a\u00020\bX\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\rX\u0082\u000e?\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004?\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016?\u0006\u001d" }, d2 = { "Lcom/kisman/cc/util/render/objects/screen/ShadowRectObject;", "", "x1", "", "y1", "x2", "y2", "color", "Lcom/kisman/cc/util/Colour;", "radius", "(DDDDLcom/kisman/cc/util/Colour;D)V", "(DDDDLcom/kisman/cc/util/Colour;)V", "excludedSides", "", "Lcom/kisman/cc/util/enums/RectSides;", "(DDDDLcom/kisman/cc/util/Colour;Ljava/util/List;)V", "color1", "color2", "(DDDDLcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/Colour;DLjava/util/List;)V", "excludedSectorSides", "Lcom/kisman/cc/util/enums/ShadowRectSectorSides;", "getRadius", "()D", "getX1", "getX2", "getY1", "getY2", "draw", "", "kisman.cc" })
public final class Class2070
{
    private List Field17447;
    private final double Field17448;
    private final double Field17449;
    private final double Field17450;
    private final double Field17451;
    private final Class2027 Field17452;
    private final Class2027 Field17453;
    private final double Field17454;
    private final List Field17455;
    private int Field17456;
    
    public final void Method7585() {
        Class753.drawRect(this.Field17448, this.Field17449, this.Field17450, this.Field17451, this.Field17452.Method3626());
        if (!this.Field17455.contains(Class1459.Field14825)) {
            Class211.drawGradientRect(this.Field17448, this.Field17449 - this.Field17454, this.Field17450, this.Field17449, false, true, this.Field17452.Method3626(), this.Field17453.Method3626());
        }
        if (!this.Field17455.contains(Class1459.Field14826)) {
            Class211.drawGradientRect(this.Field17448, this.Field17451, this.Field17450, this.Field17451 + this.Field17454, false, false, this.Field17452.Method3626(), this.Field17453.Method3626());
        }
        if (!this.Field17455.contains(Class1459.Field14828)) {
            Class211.drawGradientRect(this.Field17448 - this.Field17454, this.Field17449, this.Field17448, this.Field17451, true, true, this.Field17452.Method3626(), this.Field17453.Method3626());
        }
        if (!this.Field17455.contains(Class1459.Field14827)) {
            Class211.drawGradientRect(this.Field17450, this.Field17449, this.Field17450 + this.Field17454, this.Field17451, true, false, this.Field17452.Method3626(), this.Field17453.Method3626());
        }
        if (!this.Field17447.contains(Class293.Field9250)) {
            Class753.drawPolygonPart(this.Field17448, this.Field17449, (int)this.Field17454, 0, this.Field17452.Method3626(), this.Field17453.Method3626());
        }
        if (!this.Field17447.contains(Class293.Field9251)) {
            Class753.drawPolygonPart(this.Field17450, this.Field17449, (int)this.Field17454, 1, this.Field17452.Method3626(), this.Field17453.Method3626());
        }
        if (!this.Field17447.contains(Class293.Field9253)) {
            Class753.drawPolygonPart(this.Field17448, this.Field17451, (int)this.Field17454, 2, this.Field17452.Method3626(), this.Field17453.Method3626());
        }
        if (!this.Field17447.contains(Class293.Field9252)) {
            Class753.drawPolygonPart(this.Field17450, this.Field17451, (int)this.Field17454, 3, this.Field17452.Method3626(), this.Field17453.Method3626());
        }
    }
    
    public final double Method7586() {
        return this.Field17448;
    }
    
    public final double Method7587() {
        return this.Field17449;
    }
    
    public final double Method7588() {
        return this.Field17450;
    }
    
    public final double Method7589() {
        return this.Field17451;
    }
    
    public final double Method7590() {
        return this.Field17454;
    }
    
    public Class2070(final double field17448, final double field17449, final double field17450, final double field17451, @NotNull @NotNull final Class2027 field17452, @NotNull @NotNull final Class2027 field17453, final double field17454, @NotNull @NotNull final List field17455) {
        Intrinsics.checkParameterIsNotNull((Object)field17452, "color1");
        Intrinsics.checkParameterIsNotNull((Object)field17453, "color2");
        Intrinsics.checkParameterIsNotNull((Object)field17455, "excludedSides");
        this.Field17448 = field17448;
        this.Field17449 = field17449;
        this.Field17450 = field17450;
        this.Field17451 = field17451;
        this.Field17452 = field17452;
        this.Field17453 = field17453;
        this.Field17454 = field17454;
        this.Field17455 = field17455;
        this.Field17447 = CollectionsKt.emptyList();
        if (!this.Field17455.isEmpty()) {}
    }
    
    public Class2070(final double n, final double n2, final double n3, final double n4, @NotNull @NotNull final Class2027 class2027, final double n5) {
        Intrinsics.checkParameterIsNotNull((Object)class2027, "color");
        this(n, n2, n3, n4, class2027, class2027, n5, new ArrayList());
    }
    
    public Class2070(final double n, final double n2, final double n3, final double n4, @NotNull @NotNull final Class2027 class2027) {
        Intrinsics.checkParameterIsNotNull((Object)class2027, "color");
        this(n, n2, n3, n4, class2027, Double.longBitsToDouble(4617315517961601024L));
    }
    
    public Class2070(final double n, final double n2, final double n3, final double n4, @NotNull @NotNull final Class2027 class2027, @NotNull @NotNull final List list) {
        Intrinsics.checkParameterIsNotNull((Object)class2027, "color");
        Intrinsics.checkParameterIsNotNull((Object)list, "excludedSides");
        this(n, n2, n3, n4, class2027, class2027, Double.longBitsToDouble(4617315517961601024L), list);
    }
    
    private static String Method7591(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x66F5 ^ 0xD7));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
