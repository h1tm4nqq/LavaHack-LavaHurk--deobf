//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.util.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.renderer.*;
import java.util.function.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0016\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u001a" }, d2 = { "Lcom/kisman/cc/features/module/Debug/SwingTest;", "Lcom/kisman/cc/features/module/Module;", "()V", "handRotateX", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "handRotateY", "handRotateZ", "itemRotateX", "itemRotateY", "itemRotateZ", "offhandFix", "swing", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/EventItemRenderer;", "translateX", "translateY", "translateZ", "onDisable", "", "onEnable", "renderItems", "side", "Lnet/minecraft/util/EnumHandSide;", "progress", "", "kisman.cc" })
public final class Class1161 extends Class42
{
    private static final Class44 Field13237;
    private static final Class44 Field13238;
    private static final Class44 Field13239;
    private static final Class44 Field13240;
    private static final Class44 Field13241;
    private static final Class44 Field13242;
    private static final Class44 Field13243;
    private static final Class44 Field13244;
    private static final Class44 Field13245;
    private static final Class44 Field13246;
    private static final Class618 Field13247;
    public static final Class1161 Field13248;
    private int Field13249;
    
    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(Class1161.Field13247);
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(Class1161.Field13247);
    }
    
    public final void Method4681(@NotNull @NotNull final EnumHandSide enumHandSide, final float n) {
        Intrinsics.checkParameterIsNotNull((Object)enumHandSide, "side");
        final Class44 field13237 = Class1161.Field13237;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13237, "translateX");
        final double n2 = field13237.Method367() * n;
        int n3 = 0;
        Label_0048: {
            if (enumHandSide == EnumHandSide.LEFT) {
                final Class44 field13238 = Class1161.Field13246;
                Intrinsics.checkExpressionValueIsNotNull((Object)field13238, "offhandFix");
                if (field13238.Method365()) {
                    n3 = -1;
                    break Label_0048;
                }
            }
            n3 = 1;
        }
        final double n4 = n2 * n3;
        final Class44 field13239 = Class1161.Field13238;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13239, "translateY");
        final double n5 = field13239.Method367() * n;
        final Class44 field13240 = Class1161.Field13239;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13240, "translateZ");
        GlStateManager.translate(n4, n5, field13240.Method367() * n);
        final Class44 field13241 = Class1161.Field13240;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13241, "itemRotateX");
        GlStateManager.rotate(field13241.Method368() * n, 1.0f, 0.0f, 0.0f);
        final Class44 field13242 = Class1161.Field13241;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13242, "itemRotateY");
        GlStateManager.rotate(field13242.Method368() * n, 0.0f, 1.0f, 0.0f);
        final Class44 field13243 = Class1161.Field13242;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13243, "itemRotateZ");
        GlStateManager.rotate(field13243.Method368() * n, 0.0f, 0.0f, 1.0f);
    }
    
    private Class1161() {
        super("SwingTest", "I need this test because i want to make custom swing.", Class97.Field8345);
    }
    
    static {
        final Class1161 class1161 = Field13248 = new Class1161();
        Field13237 = class1161.Method23(new Class44("Translate X", class1161, 0.0, Double.longBitsToDouble(-4609434218613702656L), Double.longBitsToDouble(4613937818241073152L), false));
        Field13238 = class1161.Method23(new Class44("Translate Y", class1161, 0.0, Double.longBitsToDouble(-4609434218613702656L), Double.longBitsToDouble(4613937818241073152L), false));
        Field13239 = class1161.Method23(new Class44("Translate Z", class1161, 0.0, Double.longBitsToDouble((long)154956289 ^ 0xC0080000093C7201L), Double.longBitsToDouble(4613937818241073152L), false));
        Field13240 = class1161.Method23(new Class44("Item Rotate X", class1161, 0.0, Double.longBitsToDouble((long)1151914254 ^ 0xC076800044A8D10EL), Double.longBitsToDouble(4645040803167600640L), true));
        Field13241 = class1161.Method23(new Class44("Item Rotate Y", class1161, 0.0, Double.longBitsToDouble((long)212053967 ^ 0xC07680000CA3AFCFL), Double.longBitsToDouble((long)542649116 ^ 0x4076800020582B1CL), true));
        Field13242 = class1161.Method23(new Class44("Item Rotate Z", class1161, 0.0, Double.longBitsToDouble(-4578331233687175168L), Double.longBitsToDouble((long)1430076436 ^ 0x40768000553D3C14L), true));
        Field13243 = class1161.Method23(new Class44("Hand Rotate X", class1161, 0.0, Double.longBitsToDouble(-4578331233687175168L), Double.longBitsToDouble(4645040803167600640L), true));
        Field13244 = class1161.Method23(new Class44("Hand Rotate Y", class1161, 0.0, Double.longBitsToDouble(-4578331233687175168L), Double.longBitsToDouble(4645040803167600640L), true));
        Field13245 = class1161.Method23(new Class44("Hand Rotate Z", class1161, 0.0, Double.longBitsToDouble(-4578331233687175168L), Double.longBitsToDouble(4645040803167600640L), true));
        Field13246 = class1161.Method23(new Class44("OffHand Fix", class1161, false));
        Field13247 = new Class618(Class1739.Field15979, new Predicate[0]);
    }
    
    public static final Class44 Method4682(final Class1161 class1161) {
        return Class1161.Field13243;
    }
    
    public static final Class44 Method4683(final Class1161 class1161) {
        return Class1161.Field13244;
    }
    
    public static final Class44 Method4684(final Class1161 class1161) {
        return Class1161.Field13245;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4E40 ^ 0xDB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
