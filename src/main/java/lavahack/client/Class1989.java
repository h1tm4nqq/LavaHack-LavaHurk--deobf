//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0019\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007R\u0011\u0010\u0015\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0019\u0010\u0017\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0007R\u0019\u0010\u0019\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007R\u0011\u0010\u001b\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0007R\u0019\u0010\u001d\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0007R\u0019\u0010\u001f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\b \u0010\u0007R\u0019\u0010!\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0007?\u0006&" }, d2 = { "Lcom/kisman/cc/features/module/movement/SpeedRewrite;", "Lcom/kisman/cc/features/module/Module;", "()V", "boostFactor", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "getBoostFactor", "()Lcom/kisman/cc/settings/Setting;", "boostSpeed", "getBoostSpeed", "cap", "getCap", "jumpMovementFactor", "getJumpMovementFactor", "jumpMovementFactorSpeed", "getJumpMovementFactorSpeed", "lagTime", "getLagTime", "mode", "motionXmodifier", "getMotionXmodifier", "motionZmodifier", "getMotionZmodifier", "scaleCap", "getScaleCap", "slow", "getSlow", "strafeSpeed", "getStrafeSpeed", "useMotion", "getUseMotion", "useMotionInAir", "getUseMotionInAir", "useTimer", "getUseTimer", "onEnable", "", "update", "kisman.cc" })
public final class Class1989 extends Class42
{
    private static final Class44 Field17137;
    private static final Class44 Field17138;
    @NotNull
    private static final Class44 Field17139;
    @NotNull
    private static final Class44 Field17140;
    @NotNull
    private static final Class44 Field17141;
    private static final Class44 Field17142;
    @NotNull
    private static final Class44 Field17143;
    private static final Class44 Field17144;
    @NotNull
    private static final Class44 Field17145;
    private static final Class44 Field17146;
    private static final Class44 Field17147;
    @NotNull
    private static final Class44 Field17148;
    private static final Class44 Field17149;
    @NotNull
    private static final Class44 Field17150;
    private static final Class44 Field17151;
    public static final Class1989 Field17152;
    private int Field17153;
    
    public final Class44 Method7376() {
        return Class1989.Field17138;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method7377() {
        return Class1989.Field17139;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method7378() {
        return Class1989.Field17140;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method7379() {
        return Class1989.Field17141;
    }
    
    public final Class44 Method7380() {
        return Class1989.Field17142;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method7381() {
        return Class1989.Field17143;
    }
    
    public final Class44 Method7382() {
        return Class1989.Field17144;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method7383() {
        return Class1989.Field17145;
    }
    
    public final Class44 Method7384() {
        return Class1989.Field17146;
    }
    
    public final Class44 Method7385() {
        return Class1989.Field17147;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method7386() {
        return Class1989.Field17148;
    }
    
    public final Class44 Method7387() {
        return Class1989.Field17149;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method7388() {
        return Class1989.Field17150;
    }
    
    public final Class44 Method7389() {
        return Class1989.Field17151;
    }
    
    @Override
    public void Method38() {
        super.Method38();
        if (Method7390().player == null || Method7390().world == null) {
            return;
        }
        final Class44 field17137 = Class1989.Field17137;
        Intrinsics.checkExpressionValueIsNotNull((Object)field17137, "mode");
        final Enum method341 = field17137.Method341();
        if (method341 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.movement.speed.SpeedModes");
        }
        ((Class961)method341).Method3949().Method6529();
    }
    
    @Override
    public void Method45() {
        if (Method7390().player == null || Method7390().world == null) {
            return;
        }
        final Class44 field17137 = Class1989.Field17137;
        Intrinsics.checkExpressionValueIsNotNull((Object)field17137, "mode");
        final Enum method341 = field17137.Method341();
        if (method341 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.movement.speed.SpeedModes");
        }
        ((Class961)method341).Method3949().Method6530();
    }
    
    private Class1989() {
        super("SpeedRewrite", "Logic-rewrite version of Speed.", Class97.Field8340);
    }
    
    static {
        final Class1989 class1989 = Field17152 = new Class1989();
        Field17137 = class1989.Method23(new Class44("Mode", class1989, Class961.Field12092));
        Field17138 = class1989.Method23(new Class44("Use Timer", class1989, false));
        final Class44 method23 = class1989.Method23(new Class44("Motion X Modifier", class1989, 0.0, 0.0, Double.longBitsToDouble(4602678819172646912L), false));
        Intrinsics.checkExpressionValueIsNotNull((Object)method23, "register(Setting(\"Motion\u2026s, 0.0, 0.0, 0.5, false))");
        Field17139 = method23;
        final Class44 method24 = class1989.Method23(new Class44("Motion Z Modifier", class1989, 0.0, 0.0, Double.longBitsToDouble(4602678819172646912L), false));
        Intrinsics.checkExpressionValueIsNotNull((Object)method24, "register(Setting(\"Motion\u2026s, 0.0, 0.0, 0.5, false))");
        Field17140 = method24;
        final Class44 method25 = class1989.Method23(new Class44("Strafe Speed", class1989, Double.longBitsToDouble(4598847156609680094L), Double.longBitsToDouble(4591870180066957722L), 1.0, false));
        Intrinsics.checkExpressionValueIsNotNull((Object)method25, "register(Setting(\"Strafe\u20260.2873, 0.1, 1.0, false))");
        Field17141 = method25;
        Field17142 = class1989.Method23(new Class44("Slow", class1989, false));
        final Class44 method26 = class1989.Method23(new Class44("Cap", class1989, Double.longBitsToDouble(4621819117588971520L), 0.0, Double.longBitsToDouble((long)51976590 ^ 0x402400000319198EL), false));
        Intrinsics.checkExpressionValueIsNotNull((Object)method26, "register(Setting(\"Cap\", \u2026 10.0, 0.0, 10.0, false))");
        Field17143 = method26;
        Field17144 = class1989.Method23(new Class44("Scale Cap", class1989, false));
        final Class44 method27 = class1989.Method23(new Class44("Lag Time", class1989, Double.longBitsToDouble(4647503709213818880L), 0.0, Double.longBitsToDouble(4652007308841189376L), Class467.Field9943));
        Intrinsics.checkExpressionValueIsNotNull((Object)method27, "register(Setting(\"Lag Ti\u20261000.0, NumberType.TIME))");
        Field17145 = method27;
        Field17146 = class1989.Method23(new Class44("Use Motion", class1989, false));
        Field17147 = class1989.Method23(new Class44("Use Motion In Air", class1989, false));
        final Class44 method28 = class1989.Method23(new Class44("Jump Movement Factor Speed", class1989, Double.longBitsToDouble(4598445435522918646L), Double.longBitsToDouble(4576918229304087675L), Double.longBitsToDouble(4621819117588971520L), false));
        Intrinsics.checkExpressionValueIsNotNull((Object)method28, "register(Setting(\"Jump M\u2026.265, 0.01, 10.0, false))");
        Field17148 = method28;
        Field17149 = class1989.Method23(new Class44("Jump Movement Factor", class1989, false));
        final Class44 method29 = class1989.Method23(new Class44("Boost Speed", class1989, Double.longBitsToDouble(4598445435522918646L), Double.longBitsToDouble((long)529705243 ^ 0x3F847AE1583CBD60L), Double.longBitsToDouble((long)1646652901 ^ 0x402400006225EDE5L), false));
        Intrinsics.checkExpressionValueIsNotNull((Object)method29, "register(Setting(\"Boost \u2026.265, 0.01, 10.0, false))");
        Field17150 = method29;
        Field17151 = class1989.Method23(new Class44("Boost Factor", class1989, false));
    }
    
    public static final Minecraft Method7390() {
        return Class42.Field8052;
    }
    
    public static final void Method7391(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3AD6 ^ 0x17));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
