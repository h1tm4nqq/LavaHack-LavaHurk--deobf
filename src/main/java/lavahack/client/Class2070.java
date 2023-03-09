/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1459;
import lavahack.client.Class211;
import lavahack.client.Class293;
import lavahack.client.Class753;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B7\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nB/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\u000bB=\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0002\u0010\u000fBK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0002\u0010\u0012J\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0010\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016\u00a8\u0006\u001d"}, d2={"Lcom/kisman/cc/util/render/objects/screen/ShadowRectObject;", "", "x1", "", "y1", "x2", "y2", "color", "Lcom/kisman/cc/util/Colour;", "radius", "(DDDDLcom/kisman/cc/util/Colour;D)V", "(DDDDLcom/kisman/cc/util/Colour;)V", "excludedSides", "", "Lcom/kisman/cc/util/enums/RectSides;", "(DDDDLcom/kisman/cc/util/Colour;Ljava/util/List;)V", "color1", "color2", "(DDDDLcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/Colour;DLjava/util/List;)V", "excludedSectorSides", "Lcom/kisman/cc/util/enums/ShadowRectSectorSides;", "getRadius", "()D", "getX1", "getX2", "getY1", "getY2", "draw", "", "kisman.cc"})
public final class Class2070 {
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
        if (!this.Field17455.contains((Object)Class1459.Field14825)) {
            Class211.drawGradientRect(this.Field17448, this.Field17449 - this.Field17454, this.Field17450, this.Field17449, false, true, this.Field17452.Method3626(), this.Field17453.Method3626());
        }
        if (!this.Field17455.contains((Object)Class1459.Field14826)) {
            Class211.drawGradientRect(this.Field17448, this.Field17451, this.Field17450, this.Field17451 + this.Field17454, false, false, this.Field17452.Method3626(), this.Field17453.Method3626());
        }
        if (!this.Field17455.contains((Object)Class1459.Field14828)) {
            Class211.drawGradientRect(this.Field17448 - this.Field17454, this.Field17449, this.Field17448, this.Field17451, true, true, this.Field17452.Method3626(), this.Field17453.Method3626());
        }
        if (!this.Field17455.contains((Object)Class1459.Field14827)) {
            Class211.drawGradientRect(this.Field17450, this.Field17449, this.Field17450 + this.Field17454, this.Field17451, true, false, this.Field17452.Method3626(), this.Field17453.Method3626());
        }
        if (!this.Field17447.contains((Object)Class293.Field9250)) {
            Class753.drawPolygonPart(this.Field17448, this.Field17449, (int)this.Field17454, 0, this.Field17452.Method3626(), this.Field17453.Method3626());
        }
        if (!this.Field17447.contains((Object)Class293.Field9251)) {
            Class753.drawPolygonPart(this.Field17450, this.Field17449, (int)this.Field17454, 1, this.Field17452.Method3626(), this.Field17453.Method3626());
        }
        if (!this.Field17447.contains((Object)Class293.Field9253)) {
            Class753.drawPolygonPart(this.Field17448, this.Field17451, (int)this.Field17454, 2, this.Field17452.Method3626(), this.Field17453.Method3626());
        }
        if (this.Field17447.contains((Object)Class293.Field9252)) return;
        Class753.drawPolygonPart(this.Field17450, this.Field17451, (int)this.Field17454, 3, this.Field17452.Method3626(), this.Field17453.Method3626());
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

    public Class2070(double d, double d2, double d3, double d4, @NotNull @NotNull Class2027 class2027, @NotNull @NotNull Class2027 class20272, double d5, @NotNull @NotNull List list) {
        List list2;
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"color1");
        Intrinsics.checkParameterIsNotNull((Object)class20272, (String)"color2");
        Intrinsics.checkParameterIsNotNull((Object)list, (String)"excludedSides");
        this.Field17448 = d;
        this.Field17449 = d2;
        this.Field17450 = d3;
        this.Field17451 = d4;
        this.Field17452 = class2027;
        this.Field17453 = class20272;
        this.Field17454 = d5;
        this.Field17455 = list;
        Class2070 class2070 = this;
        boolean bl = false;
        class2070.Field17447 = list2 = CollectionsKt.emptyList();
        Collection collection = this.Field17455;
        boolean bl2 = false;
        if (collection.isEmpty()) return;
    }

    public Class2070(double d, double d2, double d3, double d4, @NotNull @NotNull Class2027 class2027, double d5) {
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"color");
        this(d, d2, d3, d4, class2027, class2027, d5, new ArrayList());
    }

    public Class2070(double d, double d2, double d3, double d4, @NotNull @NotNull Class2027 class2027) {
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"color");
        this(d, d2, d3, d4, class2027, Double.longBitsToDouble(0x4014000000000000L));
    }

    public Class2070(double d, double d2, double d3, double d4, @NotNull @NotNull Class2027 class2027, @NotNull @NotNull List list) {
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"color");
        Intrinsics.checkParameterIsNotNull((Object)list, (String)"excludedSides");
        this(d, d2, d3, d4, class2027, class2027, Double.longBitsToDouble(0x4014000000000000L), list);
    }

    private static String Method7591(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 215;
            cArray2[n] = (char)(cArray[n] ^ (0x66F5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

