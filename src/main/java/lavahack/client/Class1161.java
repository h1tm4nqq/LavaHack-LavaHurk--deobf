//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.util.EnumHandSide
 */
package lavahack.client;

import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1739;
import lavahack.client.Class1796;
import lavahack.client.Class254;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class618;
import lavahack.client.Class97;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.EnumHandSide;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0016\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2={"Lcom/kisman/cc/features/module/Debug/SwingTest;", "Lcom/kisman/cc/features/module/Module;", "()V", "handRotateX", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "handRotateY", "handRotateZ", "itemRotateX", "itemRotateY", "itemRotateZ", "offhandFix", "swing", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/EventItemRenderer;", "translateX", "translateY", "translateZ", "onDisable", "", "onEnable", "renderItems", "side", "Lnet/minecraft/util/EnumHandSide;", "progress", "", "kisman.cc"})
public final class Class1161
extends Class42 {
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
        Class1796.Field16242.Method706(Field13247);
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(Field13247);
    }

    /*
     * Unable to fully structure code
     */
    public final void Method4681(@NotNull @NotNull EnumHandSide var1_1, float var2_2) {
        Intrinsics.checkParameterIsNotNull((Object)var1_1, (String)"side");
        v0 = Class1161.Field13237;
        Intrinsics.checkExpressionValueIsNotNull((Object)v0, (String)"translateX");
        v1 = v0.Method367() * (double)var2_2;
        if (var1_1 != EnumHandSide.LEFT) ** GOTO lbl-1000
        v2 = Class1161.Field13246;
        Intrinsics.checkExpressionValueIsNotNull((Object)v2, (String)"offhandFix");
        if (v2.Method365()) {
            v3 = -1;
        } else lbl-1000:
        // 2 sources

        {
            v3 = 1;
        }
        v4 = v1 * (double)v3;
        v5 = Class1161.Field13238;
        Intrinsics.checkExpressionValueIsNotNull((Object)v5, (String)"translateY");
        v6 = v5.Method367() * (double)var2_2;
        v7 = Class1161.Field13239;
        Intrinsics.checkExpressionValueIsNotNull((Object)v7, (String)"translateZ");
        GlStateManager.translate((double)v4, (double)v6, (double)(v7.Method367() * (double)var2_2));
        v8 = Class1161.Field13240;
        Intrinsics.checkExpressionValueIsNotNull((Object)v8, (String)"itemRotateX");
        GlStateManager.rotate((float)(v8.Method368() * var2_2), (float)1.0f, (float)0.0f, (float)0.0f);
        v9 = Class1161.Field13241;
        Intrinsics.checkExpressionValueIsNotNull((Object)v9, (String)"itemRotateY");
        GlStateManager.rotate((float)(v9.Method368() * var2_2), (float)0.0f, (float)1.0f, (float)0.0f);
        v10 = Class1161.Field13242;
        Intrinsics.checkExpressionValueIsNotNull((Object)v10, (String)"itemRotateZ");
        GlStateManager.rotate((float)(v10.Method368() * var2_2), (float)0.0f, (float)0.0f, (float)1.0f);
    }

    private Class1161() {
        super("SwingTest", "I need this test because i want to make custom swing.", Class97.Field8345);
    }

    static {
        Class1161 class1161;
        Field13248 = class1161 = new Class1161();
        Field13237 = class1161.Method23(new Class44("Translate X", (Class42)class1161, 0.0, Double.longBitsToDouble(-4609434218613702656L), Double.longBitsToDouble(0x4008000000000000L), false));
        Field13238 = class1161.Method23(new Class44("Translate Y", (Class42)class1161, 0.0, Double.longBitsToDouble(-4609434218613702656L), Double.longBitsToDouble(0x4008000000000000L), false));
        Field13239 = class1161.Method23(new Class44("Translate Z", (Class42)class1161, 0.0, Double.longBitsToDouble((long)154956289 ^ 0xC0080000093C7201L), Double.longBitsToDouble(0x4008000000000000L), false));
        Field13240 = class1161.Method23(new Class44("Item Rotate X", (Class42)class1161, 0.0, Double.longBitsToDouble((long)1151914254 ^ 0xC076800044A8D10EL), Double.longBitsToDouble(4645040803167600640L), true));
        Field13241 = class1161.Method23(new Class44("Item Rotate Y", (Class42)class1161, 0.0, Double.longBitsToDouble((long)212053967 ^ 0xC07680000CA3AFCFL), Double.longBitsToDouble((long)542649116 ^ 0x4076800020582B1CL), true));
        Field13242 = class1161.Method23(new Class44("Item Rotate Z", (Class42)class1161, 0.0, Double.longBitsToDouble(-4578331233687175168L), Double.longBitsToDouble((long)1430076436 ^ 0x40768000553D3C14L), true));
        Field13243 = class1161.Method23(new Class44("Hand Rotate X", (Class42)class1161, 0.0, Double.longBitsToDouble(-4578331233687175168L), Double.longBitsToDouble(4645040803167600640L), true));
        Field13244 = class1161.Method23(new Class44("Hand Rotate Y", (Class42)class1161, 0.0, Double.longBitsToDouble(-4578331233687175168L), Double.longBitsToDouble(4645040803167600640L), true));
        Field13245 = class1161.Method23(new Class44("Hand Rotate Z", (Class42)class1161, 0.0, Double.longBitsToDouble(-4578331233687175168L), Double.longBitsToDouble(4645040803167600640L), true));
        Field13246 = class1161.Method23(new Class44("OffHand Fix", (Class42)class1161, false));
        Field13247 = new Class618((Class254)Class1739.Field15979, new Predicate[0]);
    }

    public static final Class44 Method4682(Class1161 class1161) {
        Class1161 class11612 = class1161;
        return Field13243;
    }

    public static final Class44 Method4683(Class1161 class1161) {
        Class1161 class11612 = class1161;
        return Field13244;
    }

    public static final Class44 Method4684(Class1161 class1161) {
        Class1161 class11612 = class1161;
        return Field13245;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 219;
            cArray2[n] = (char)(cArray[n] ^ (0x4E40 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

