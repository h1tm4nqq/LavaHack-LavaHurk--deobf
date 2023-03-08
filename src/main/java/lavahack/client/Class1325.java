//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.client.*;
import kotlin.jvm.internal.*;
import net.minecraft.util.math.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005?\u0006\u0002\u0010\u0002?\u0006\u0005" }, d2 = { "Lcom/kisman/cc/util/enums/dynamic/RotationEnum;", "", "()V", "Companion", "Rotation", "kisman.cc" })
public final class Class1325
{
    private static final Class2124 Field14070;
    private static final Class2124 Field14071;
    private static final Class2124 Field14072;
    private static final Class2124 Field14073;
    private static final Minecraft Field14074;
    public static final Class1498 Field14075;
    private int Field14076;
    
    static {
        Field14075 = new Class1498(null);
        final Class2124 method1727 = Class1763.Method1727(Void.class, float[].class, Boolean.class);
        Intrinsics.checkExpressionValueIsNotNull((Object)method1727, "AbstractTask.types(\n    \u2026ss.java//Silent\n        )");
        Field14070 = method1727;
        final Class2124 method1728 = Class1763.Method1727(Void.class, Class2160.class, Boolean.class);
        Intrinsics.checkExpressionValueIsNotNull((Object)method1728, "AbstractTask.types(\n    \u2026ss.java//Silent\n        )");
        Field14071 = method1728;
        final Class2124 method1729 = Class1763.Method1727(float[].class, Integer.class, Class1048.class);
        Intrinsics.checkExpressionValueIsNotNull((Object)method1729, "AbstractTask.types(\n    \u2026/Rotation logic\n        )");
        Field14072 = method1729;
        final Class2124 method1730 = Class1763.Method1727(float[].class, BlockPos.class);
        Intrinsics.checkExpressionValueIsNotNull((Object)method1730, "AbstractTask.types(\n    \u2026ass.java//block\n        )");
        Field14073 = method1730;
        Field14074 = Minecraft.getMinecraft();
    }
    
    public static final Class2124 Method5363() {
        return Class1325.Field14070;
    }
    
    public static final Class2124 Method5364() {
        return Class1325.Field14071;
    }
    
    public static final Class2124 Method5365() {
        return Class1325.Field14072;
    }
    
    public static final Class2124 Method5366() {
        return Class1325.Field14073;
    }
    
    public static final Minecraft Method5367() {
        return Class1325.Field14074;
    }
    
    private static String Method5368(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6583 ^ 0xC9));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
