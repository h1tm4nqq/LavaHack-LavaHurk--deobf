//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0013\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0012\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003?\u0006\u0002\u0010\u0005B#\b\u0012\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003?\u0006\u0002\u0010\u0007B?\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003?\u0006\u0002\u0010\u000bR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003?\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003?\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003?\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b?\u0006\u001c" }, d2 = { "Lcom/kisman/cc/util/enums/dynamic/RotationEnum$Rotation;", "", "taskR", "Lorg/cubic/dynamictask/AbstractTask;", "Ljava/lang/Void;", "(Ljava/lang/String;ILorg/cubic/dynamictask/AbstractTask;)V", "taskRFromSaver", "(Ljava/lang/String;ILorg/cubic/dynamictask/AbstractTask;Lorg/cubic/dynamictask/AbstractTask;)V", "taskCEntity", "", "taskCBlock", "(Ljava/lang/String;ILorg/cubic/dynamictask/AbstractTask;Lorg/cubic/dynamictask/AbstractTask;Lorg/cubic/dynamictask/AbstractTask;Lorg/cubic/dynamictask/AbstractTask;)V", "getTaskCBlock", "()Lorg/cubic/dynamictask/AbstractTask;", "getTaskCEntity", "getTaskR", "getTaskRFromSaver", "None", "Client", "ClientFull", "Packet", "PacketClient", "PacketClientFull", "ClientSilent", "ClientFullSilent", "PacketSilent", "PacketClientSilent", "PacketClientFullSilent", "kisman.cc" })
public enum Class135
{
    Field8498(s, n2, method7663, method7664, method7665, method7666), 
    Field8499(s2, n4, method7667, method7668, method7669, method7670), 
    Field8500(s3, n6, method7671, method7672), 
    Field8501(s4, n8, method7673, method7674), 
    Field8502(s5, n10, method7675, method7676), 
    Field8503(s6, n12, method7677, method7678), 
    Field8504(s7, n14, method7679, method7680), 
    Field8505(s8, n16, method7681, method7682), 
    Field8506(s9, n18, method7683, method7684), 
    Field8507(s10, n20, method7685, method7686), 
    Field8508(s11, n22, method7687, method7688);
    
    private static final Class135[] Field8509;
    @NotNull
    private final Class1763 Field8510;
    @NotNull
    private final Class1763 Field8511;
    @NotNull
    private final Class1763 Field8512;
    @NotNull
    private final Class1763 Field8513;
    private int Field8514;
    
    static {
        final Class135[] field8509 = new Class135[11];
        final int n = 0;
        final String s = "None";
        final int n2 = 0;
        final Class1763 method7663 = Class1325.Method5363().Method7663(Class846.Field11579);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7663, "taskR.task {\n           \u2026n@task null\n            }");
        final Class1763 method7664 = Class1325.Method5364().Method7663(Class329.Field9373);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7664, "taskRFromSaver.task {\n  \u2026n@task null\n            }");
        final Class1763 method7665 = Class1325.Method5365().Method7663(Class301.Field9301);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7665, "taskCEntity.task {\n     \u2026oatArray(0)\n            }");
        final Class1763 method7666 = Class1325.Method5366().Method7663(Class300.Field9299);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7666, "taskCBlock.task {\n      \u2026oatArray(0)\n            }");
        final int n3 = 1;
        final String s2 = "Client";
        final int n4 = 1;
        final Class1763 method7667 = Class1325.Method5363().Method7663(Class299.Field9297);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7667, "taskR.task { arg : Argum\u2026n@task null\n            }");
        final Class1763 method7668 = Class1325.Method5364().Method7663(Class307.Field9313);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7668, "taskRFromSaver.task { ar\u2026n@task null\n            }");
        final Class1763 method7669 = Class1325.Method5365().Method7663(Class306.Field9311);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7669, "taskCEntity.task { arg: \u2026          )\n            }");
        final Class1763 method7670 = Class1325.Method5366().Method7663(Class305.Field9309);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7670, "taskCBlock.task { arg: A\u2026e() + 0.5))\n            }");
        final int n5 = 2;
        final String s3 = "ClientFull";
        final int n6 = 2;
        final Class1763 method7671 = Class1325.Method5363().Method7663(Class304.Field9307);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7671, "taskR.task { arg : Argum\u2026n@task null\n            }");
        final Class1763 method7672 = Class1325.Method5364().Method7663(Class847.Field11581);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7672, "taskRFromSaver.task { ar\u2026n@task null\n            }");
        final int n7 = 3;
        final String s4 = "Packet";
        final int n8 = 3;
        final Class1763 method7673 = Class1325.Method5363().Method7663(Class835.Field11553);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7673, "taskR.task { arg : Argum\u2026n@task null\n            }");
        final Class1763 method7674 = Class1325.Method5364().Method7663(Class836.Field11555);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7674, "taskRFromSaver.task { ar\u2026n@task null\n            }");
        final int n9 = 4;
        final String s5 = "PacketClient";
        final int n10 = 4;
        final Class1763 method7675 = Class1325.Method5363().Method7663(Class832.Field11547);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7675, "taskR.task { arg : Argum\u2026n@task null\n            }");
        final Class1763 method7676 = Class1325.Method5364().Method7663(Class834.Field11551);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7676, "taskRFromSaver.task { ar\u2026n@task null\n            }");
        final int n11 = 5;
        final String s6 = "PacketClientFull";
        final int n12 = 5;
        final Class1763 method7677 = Class1325.Method5363().Method7663(Class842.Field11571);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7677, "taskR.task { arg : Argum\u2026n@task null\n            }");
        final Class1763 method7678 = Class1325.Method5364().Method7663(Class844.Field11576);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7678, "taskRFromSaver.task { ar\u2026n@task null\n            }");
        final int n13 = 6;
        final String s7 = "ClientSilent";
        final int n14 = 6;
        final Class1763 method7679 = Class1325.Method5363().Method7663(Class838.Field11560);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7679, "taskR.task { arg : Argum\u2026n@task null\n            }");
        final Class1763 method7680 = Class1325.Method5364().Method7663(Class322.Field9362);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7680, "taskRFromSaver.task { ar\u2026n@task null\n            }");
        final int n15 = 7;
        final String s8 = "ClientFullSilent";
        final int n16 = 7;
        final Class1763 method7681 = Class1325.Method5363().Method7663(Class321.Field9360);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7681, "taskR.task { arg : Argum\u2026n@task null\n            }");
        final Class1763 method7682 = Class1325.Method5364().Method7663(Class327.Field9369);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7682, "taskRFromSaver.task { ar\u2026n@task null\n            }");
        final int n17 = 8;
        final String s9 = "PacketSilent";
        final int n18 = 8;
        final Class1763 method7683 = Class1325.Method5363().Method7663(Class326.Field9367);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7683, "taskR.task { arg : Argum\u2026n@task null\n            }");
        final Class1763 method7684 = Class1325.Method5364().Method7663(Class325.Field9365);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7684, "taskRFromSaver.task { ar\u2026n@task null\n            }");
        final int n19 = 9;
        final String s10 = "PacketClientSilent";
        final int n20 = 9;
        final Class1763 method7685 = Class1325.Method5363().Method7663(Class335.Field9391);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7685, "taskR.task { arg : Argum\u2026n@task null\n            }");
        final Class1763 method7686 = Class1325.Method5364().Method7663(Class333.Field9387);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7686, "taskRFromSaver.task { ar\u2026n@task null\n            }");
        final int n21 = 10;
        final String s11 = "PacketClientFullSilent";
        final int n22 = 10;
        final Class1763 method7687 = Class1325.Method5363().Method7663(Class332.Field9385);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7687, "taskR.task { arg : Argum\u2026n@task null\n            }");
        final Class1763 method7688 = Class1325.Method5364().Method7663(Class330.Field9375);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7688, "taskRFromSaver.task { ar\u2026n@task null\n            }");
        Field8509 = field8509;
    }
    
    @NotNull
    @NotNull
    public final Class1763 Method929() {
        return this.Field8510;
    }
    
    @NotNull
    @NotNull
    public final Class1763 Method930() {
        return this.Field8511;
    }
    
    @NotNull
    @NotNull
    public final Class1763 Method931() {
        return this.Field8512;
    }
    
    @NotNull
    @NotNull
    public final Class1763 Method932() {
        return this.Field8513;
    }
    
    private Class135(final String name, final int ordinal, final Class1763 field8510, final Class1763 field8511, final Class1763 field8512, final Class1763 field8513) {
        this.Field8510 = field8510;
        this.Field8511 = field8511;
        this.Field8512 = field8512;
        this.Field8513 = field8513;
    }
    
    private Class135(final String s, final int n, final Class1763 class1763) {
        this(s, n, class1763, Class135.Field8499.Field8511, Class135.Field8499.Field8512, Class135.Field8499.Field8513);
    }
    
    private Class135(final String s, final int n, final Class1763 class1763, final Class1763 class1764) {
        this(s, n, class1763, class1764, Class135.Field8499.Field8512, Class135.Field8499.Field8513);
    }
    
    private static String Method933(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x414F ^ 0x4B));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
