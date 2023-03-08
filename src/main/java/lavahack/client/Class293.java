//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import java.util.*;
import org.jetbrains.annotations.*;
import kotlin.collections.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u001d\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006?\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003?\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f?\u0006\u0011" }, d2 = { "Lcom/kisman/cc/util/enums/ShadowRectSectorSides;", "", "parentSides", "", "Lcom/kisman/cc/util/enums/RectSides;", "corner", "Lcom/kisman/cc/util/render/objects/screen/CornerObject;", "(Ljava/lang/String;ILjava/util/List;Lcom/kisman/cc/util/render/objects/screen/CornerObject;)V", "getCorner", "()Lcom/kisman/cc/util/render/objects/screen/CornerObject;", "getParentSides", "()Ljava/util/List;", "LeftTop", "RightTop", "RightBottom", "LeftBottom", "Companion", "kisman.cc" })
public enum Class293
{
    Field9250("LeftTop", 0, CollectionsKt.listOf((Object[])new Class1459[] { Class1459.Field14828, Class1459.Field14825 }), new Class1370(0, 90)), 
    Field9251("RightTop", 1, CollectionsKt.listOf((Object[])new Class1459[] { Class1459.Field14827, Class1459.Field14825 }), new Class1370(90, 180)), 
    Field9252("RightBottom", 2, CollectionsKt.listOf((Object[])new Class1459[] { Class1459.Field14827, Class1459.Field14826 }), new Class1370(180, 270)), 
    Field9253("LeftBottom", 3, CollectionsKt.listOf((Object[])new Class1459[] { Class1459.Field14828, Class1459.Field14826 }), new Class1370(270, 360));
    
    private static final Class293[] Field9254;
    @NotNull
    private final List Field9255;
    @NotNull
    private final Class1370 Field9256;
    public static final Class209 Field9257;
    private int Field9258;
    
    static {
        Field9257 = new Class209((DefaultConstructorMarker)null);
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
    
    private Class293(final String name, final int ordinal, final List field9255, final Class1370 field9256) {
        this.Field9255 = field9255;
        this.Field9256 = field9256;
    }
    
    private static String Method1533(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4221 ^ 0x23));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
