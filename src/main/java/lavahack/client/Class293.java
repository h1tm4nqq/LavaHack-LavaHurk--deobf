/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  lavahack.client.tp5GqONVTU6TJFgPZLDspYi2AlFtCgah
 */
package lavahack.client;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import lavahack.client.Class1370;
import lavahack.client.Class1459;
import lavahack.client.Class209;
import lavahack.client.tp5GqONVTU6TJFgPZLDspYi2AlFtCgah;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u001d\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f\u00a8\u0006\u0011"}, d2={"Lcom/kisman/cc/util/enums/ShadowRectSectorSides;", "", "parentSides", "", "Lcom/kisman/cc/util/enums/RectSides;", "corner", "Lcom/kisman/cc/util/render/objects/screen/CornerObject;", "(Ljava/lang/String;ILjava/util/List;Lcom/kisman/cc/util/render/objects/screen/CornerObject;)V", "getCorner", "()Lcom/kisman/cc/util/render/objects/screen/CornerObject;", "getParentSides", "()Ljava/util/List;", "LeftTop", "RightTop", "RightBottom", "LeftBottom", "Companion", "kisman.cc"})
public final class Class293
extends Enum {
    public static final /* enum */ Class293 Field9250;
    public static final /* enum */ Class293 Field9251;
    public static final /* enum */ Class293 Field9252;
    public static final /* enum */ Class293 Field9253;
    private static final Class293[] Field9254;
    @NotNull
    private final List Field9255;
    @NotNull
    private final Class1370 Field9256;
    public static final Class209 Field9257;
    private int Field9258;

    static {
        Class293[] class293Array = new Class293[4];
        Class293[] class293Array2 = class293Array;
        class293Array[0] = Field9250 = new Class293("LeftTop", 0, CollectionsKt.listOf((Object[])new Class1459[]{Class1459.Field14828, Class1459.Field14825}), new Class1370(0, 90));
        class293Array[1] = Field9251 = new Class293("RightTop", 1, CollectionsKt.listOf((Object[])new Class1459[]{Class1459.Field14827, Class1459.Field14825}), new Class1370(90, 180));
        class293Array[2] = Field9252 = new Class293("RightBottom", 2, CollectionsKt.listOf((Object[])new Class1459[]{Class1459.Field14827, Class1459.Field14826}), new Class1370(180, 270));
        class293Array[3] = Field9253 = new Class293("LeftBottom", 3, CollectionsKt.listOf((Object[])new Class1459[]{Class1459.Field14828, Class1459.Field14826}), new Class1370(270, 360));
        Field9254 = class293Array;
        Field9257 = new Class209(null);
    }

    @NotNull
    @NotNull
    public final List Method1531() {
        return this.Field9255;
    }

    @NotNull
    @NotNull
    public final Class1370 Method1532() {
        return this.Field9256;
    }

    /*
     * WARNING - void declaration
     */
    private Class293() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field9255 = var3_1;
        this.Field9256 = var4_2;
    }

    public static Class293[] values() {
        return (tp5GqONVTU6TJFgPZLDspYi2AlFtCgah[])Field9254.clone();
    }

    public static Class293 valueOf(String string) {
        return Enum.valueOf(Class293.class, string);
    }

    private static String Method1533(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 35;
            cArray2[n] = (char)(cArray[n] ^ (0x4221 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

