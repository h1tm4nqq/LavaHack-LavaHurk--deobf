//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BO\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t?\u0006\u0002\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003?\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003?\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003?\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\n\u001a\u00020\t?\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t?\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019?\u0006\u001a" }, d2 = { "Lcom/kisman/cc/util/enums/dynamic/CharmsRewriteOptionsEnum$CharmsRewriteOptions;", "", "beginIfTrue", "Lorg/cubic/dynamictask/AbstractTask;", "Ljava/lang/Void;", "beginIfFalse", "afterIfTrue", "afterIfFalse", "typeW", "Lcom/kisman/cc/util/enums/CharmsRewriteTypes;", "typeM", "(Ljava/lang/String;ILorg/cubic/dynamictask/AbstractTask;Lorg/cubic/dynamictask/AbstractTask;Lorg/cubic/dynamictask/AbstractTask;Lorg/cubic/dynamictask/AbstractTask;Lcom/kisman/cc/util/enums/CharmsRewriteTypes;Lcom/kisman/cc/util/enums/CharmsRewriteTypes;)V", "getAfterIfFalse", "()Lorg/cubic/dynamictask/AbstractTask;", "getAfterIfTrue", "getBeginIfFalse", "getBeginIfTrue", "getTypeM", "()Lcom/kisman/cc/util/enums/CharmsRewriteTypes;", "getTypeW", "Depth", "Lighting", "Culling", "Blend", "Translucent", "Texture2D", "kisman.cc" })
public enum Class362
{
    Field9509(s, n2, method7663, method7664, method7665, method7666, Class162.Field8651, Class162.Field8662), 
    Field9510(s2, n4, method7667, method7668, method7669, method7670, Class162.Field8652, Class162.Field8663), 
    Field9511(s3, n6, method7671, method7672, method7673, method7674, Class162.Field8653, Class162.Field8664), 
    Field9512(s4, n8, method7675, method7676, method7677, method7678, Class162.Field8654, Class162.Field8665), 
    Field9513(s5, n10, method7679, method7680, method7681, method7682, Class162.Field8655, Class162.Field8666), 
    Field9514(s6, n12, method7683, method7684, method7685, method7686, Class162.Field8656, Class162.Field8667);
    
    private static final Class362[] Field9515;
    @NotNull
    private final Class1763 Field9516;
    @NotNull
    private final Class1763 Field9517;
    @NotNull
    private final Class1763 Field9518;
    @NotNull
    private final Class1763 Field9519;
    @NotNull
    private final Class162 Field9520;
    @NotNull
    private final Class162 Field9521;
    private int Field9522;
    
    static {
        final Class362[] field9515 = new Class362[6];
        final int n = 0;
        final String s = "Depth";
        final int n2 = 0;
        final Class1763 method7663 = Class369.Method1820().Method7663((Class1471)Class1399.Field14328);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7663, "task.task {\n            \u2026n@task null\n            }");
        final Class1763 method7664 = Class369.Method1820().Method7663((Class1471)Class393.Field9652);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7664, "task.task {\n            \u2026n@task null\n            }");
        final Class1763 method7665 = Class369.Method1820().Method7663((Class1471)Class402.Field9677);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7665, "task.task {\n            \u2026n@task null\n            }");
        final Class1763 method7666 = Class369.Method1820().Method7663((Class1471)Class401.Field9675);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7666, "task.task {\n            \u2026n@task null\n            }");
        final int n3 = 1;
        final String s2 = "Lighting";
        final int n4 = 1;
        final Class1763 method7667 = Class369.Method1820().Method7663((Class1471)Class408.Field9694);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7667, "task.task {\n            \u2026n@task null\n            }");
        final Class1763 method7668 = Class369.Method1820().Method7663((Class1471)Class407.Field9692);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7668, "task.task {\n            \u2026n@task null\n            }");
        final Class1763 method7669 = Class369.Method1820().Method7663((Class1471)Class406.Field9690);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7669, "task.task {\n            \u2026n@task null\n            }");
        final Class1763 method7670 = Class369.Method1820().Method7663((Class1471)Class382.Field9605);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7670, "task.task {\n            \u2026n@task null\n            }");
        final int n5 = 2;
        final String s3 = "Culling";
        final int n6 = 2;
        final Class1763 method7671 = Class369.Method1820().Method7663((Class1471)Class381.Field9603);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7671, "task.task {\n            \u2026n@task null\n            }");
        final Class1763 method7672 = Class369.Method1820().Method7663((Class1471)Class1398.Field14326);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7672, "task.task {\n            \u2026n@task null\n            }");
        final Class1763 method7673 = Class369.Method1820().Method7663((Class1471)Class1395.Field14323);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7673, "task.task {\n            \u2026n@task null\n            }");
        final Class1763 method7674 = Class369.Method1820().Method7663((Class1471)Class1394.Field14321);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7674, "task.task {\n            \u2026n@task null\n            }");
        final int n7 = 3;
        final String s4 = "Blend";
        final int n8 = 3;
        final Class1763 method7675 = Class369.Method1820().Method7663((Class1471)Class1392.Field14311);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7675, "task.task {\n            \u2026n@task null\n            }");
        final Class1763 method7676 = Class369.Method1820().Method7663((Class1471)Class1384.Field14267);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7676, "task.task {\n            \u2026n@task null\n            }");
        final Class1763 method7677 = Class369.Method1820().Method7663((Class1471)Class1382.Field14264);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7677, "task.task {\n            \u2026n@task null\n            }");
        final Class1763 method7678 = Class369.Method1820().Method7663((Class1471)Class1380.Field14256);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7678, "task.task {\n            \u2026n@task null\n            }");
        final int n9 = 4;
        final String s5 = "Translucent";
        final int n10 = 4;
        final Class1763 method7679 = Class369.Method1820().Method7663((Class1471)Class1378.Field14252);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7679, "task.task {\n            \u2026n@task null\n            }");
        final Class1763 method7680 = Class369.Method1821();
        Intrinsics.checkExpressionValueIsNotNull((Object)method7680, "voidTask");
        final Class1763 method7681 = Class369.Method1821();
        Intrinsics.checkExpressionValueIsNotNull((Object)method7681, "voidTask");
        final Class1763 method7682 = Class369.Method1821();
        Intrinsics.checkExpressionValueIsNotNull((Object)method7682, "voidTask");
        final int n11 = 5;
        final String s6 = "Texture2D";
        final int n12 = 5;
        final Class1763 method7683 = Class369.Method1820().Method7663((Class1471)Class397.Field9662);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7683, "task.task {\n            \u2026n@task null\n            }");
        final Class1763 method7684 = Class369.Method1820().Method7663((Class1471)Class396.Field9660);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7684, "task.task {\n            \u2026n@task null\n            }");
        final Class1763 method7685 = Class369.Method1820().Method7663((Class1471)Class405.Field9688);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7685, "task.task {\n            \u2026n@task null\n            }");
        final Class1763 method7686 = Class369.Method1820().Method7663((Class1471)Class404.Field9686);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7686, "task.task {\n            \u2026n@task null\n            }");
        Field9515 = field9515;
    }
    
    @NotNull
    @NotNull
    public final Class1763 Method1807() {
        return this.Field9516;
    }
    
    @NotNull
    @NotNull
    public final Class1763 Method1808() {
        return this.Field9517;
    }
    
    @NotNull
    @NotNull
    public final Class1763 Method1809() {
        return this.Field9518;
    }
    
    @NotNull
    @NotNull
    public final Class1763 Method1810() {
        return this.Field9519;
    }
    
    @NotNull
    @NotNull
    public final Class162 Method1811() {
        return this.Field9520;
    }
    
    @NotNull
    @NotNull
    public final Class162 Method1812() {
        return this.Field9521;
    }
    
    private Class362(final String name, final int ordinal, final Class1763 field9516, final Class1763 field9517, final Class1763 field9518, final Class1763 field9519, final Class162 field9520, final Class162 field9521) {
        this.Field9516 = field9516;
        this.Field9517 = field9517;
        this.Field9518 = field9518;
        this.Field9519 = field9519;
        this.Field9520 = field9520;
        this.Field9521 = field9521;
    }
    
    private static String Method1813(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x79F6 ^ 0xE7));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
