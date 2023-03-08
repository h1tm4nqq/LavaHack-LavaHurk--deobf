//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.*;

@Class794
@Class2012
@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\b\u0010\u000b\u001a\u00020\tH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\f" }, d2 = { "Lcom/kisman/cc/features/module/client/NoSpoof;", "Lcom/kisman/cc/features/module/Module;", "()V", "ground", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "position", "rotation", "noGround", "", "noPosition", "noRotation", "kisman.cc" })
public final class Class1534 extends Class42
{
    private static final Class44 Field15166;
    private static final Class44 Field15167;
    private static final Class44 Field15168;
    public static final Class1534 Field15169;
    private String Field15170 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @JvmStatic
    @JvmStatic
    public static final boolean Method6081() {
        final Class44 field15166 = Class1534.Field15166;
        Intrinsics.checkExpressionValueIsNotNull((Object)field15166, "position");
        return field15166.Method365();
    }
    
    @JvmStatic
    @JvmStatic
    public static final boolean Method27() {
        final Class44 field15167 = Class1534.Field15167;
        Intrinsics.checkExpressionValueIsNotNull((Object)field15167, "rotation");
        return field15167.Method365();
    }
    
    @JvmStatic
    @JvmStatic
    public static final boolean Method28() {
        final Class44 field15168 = Class1534.Field15168;
        Intrinsics.checkExpressionValueIsNotNull((Object)field15168, "ground");
        return field15168.Method365();
    }
    
    private Class1534() {
        super("NoSpoof", "PingBypass stuff", Class97.Field8339);
    }
    
    static {
        final Class1534 class1534 = Field15169 = new Class1534();
        Field15166 = class1534.Method23(new Class44("Position", class1534, false));
        Field15167 = class1534.Method23(new Class44("Rotation", class1534, false));
        Field15168 = class1534.Method23(new Class44("Ground", class1534, false));
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3A1D ^ 0x62));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
