//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.lang.reflect.*;
import kotlin.jvm.internal.*;
import java.util.*;
import kotlin.*;
import net.minecraft.client.*;

@Class1887
@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e?\u0006\u0002\n\u0000?\u0006\u0010" }, d2 = { "Lcom/kisman/cc/features/module/render/MotionBlur;", "Lcom/kisman/cc/features/module/Module;", "()V", "amount", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "cachedFastRender", "Ljava/lang/reflect/Field;", "lastAmount", "", "fastRenderCheck", "", "isFastRenderEnabled", "onEnable", "", "update", "kisman.cc" })
public final class Class1850 extends Class42
{
    private final Class44 Field16527;
    private int Field16528;
    private final Field Field16529;
    private String Field16530 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method38() {
        if (Method6943().player == null || Method6943().world == null || this.Method27()) {
            super.Method21(false);
            return;
        }
        if (Method6943().entityRenderer.shaderGroup != null) {
            Method6943().entityRenderer.shaderGroup.deleteShaderGroup();
        }
        final Class44 field16527 = this.Field16527;
        Intrinsics.checkExpressionValueIsNotNull((Object)field16527, "amount");
        if (field16527.Method335() > 0) {
            final Class1754 field16528 = Class1754.Field16041;
            final String s = "motionblur";
            final String s2 = "{\\\"targets\\\":[\\\"swap\\\",\\\"previous\\\"],\\\"passes\\\":[{\\\"name\\\":\\\"phosphor\\\",\\\"intarget\\\":\\\"minecraft:main\\\",\\\"outtarget\\\":\\\"swap\\\",\\\"auxtargets\\\":[{\\\"name\\\":\\\"PrevSampler\\\",\\\"id\\\":\\\"previous\\\"}],\\\"uniforms\\\":[{\\\"name\\\":\\\"Phosphor\\\",\\\"values\\\":[%.2f, %.2f, %.2f]}]},{\\\"name\\\":\\\"blit\\\",\\\"intarget\\\":\\\"swap\\\",\\\"outtarget\\\":\\\"previous\\\"},{\\\"name\\\":\\\"blit\\\",\\\"intarget\\\":\\\"swap\\\",\\\"outtarget\\\":\\\"minecraft:main\\\"}]}";
            final Object[] array = new Object[3];
            final int n = 0;
            final Class44 field16529 = this.Field16527;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16529, "amount");
            array[n] = field16529.Method368();
            final int n2 = 1;
            final Class44 field16530 = this.Field16527;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16530, "amount");
            array[n2] = field16530.Method368();
            final int n3 = 2;
            final Class44 field16531 = this.Field16527;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16531, "amount");
            array[n3] = field16531.Method368();
            final Object[] array2 = array;
            final String s3 = s;
            final Class1754 class1754 = field16528;
            final String format = s2;
            final Object[] original = array2;
            final String format2 = String.format(format, Arrays.copyOf(original, original.length));
            Intrinsics.checkExpressionValueIsNotNull((Object)format2, "java.lang.String.format(this, *args)");
            class1754.Method6681(s3, format2);
            final Class1740 method5503 = Class1393.Method5503();
            final StringBuilder append = new StringBuilder().append("Enabled motion blur with ");
            final Class44 field16532 = this.Field16527;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16532, "amount");
            method5503.Method1886(append.append(field16532.Method335()).append(" amount!").toString());
            Method6943().entityRenderer.getShaderGroup().createBindFramebuffers(Method6943().displayWidth, Method6943().displayHeight);
        }
    }
    
    @Override
    public void Method45() {
        if (Method6943().player == null || Method6943().world == null || this.Method27()) {
            super.Method21(false);
            return;
        }
        final Class44 field16527 = this.Field16527;
        Intrinsics.checkExpressionValueIsNotNull((Object)field16527, "amount");
        if (field16527.Method335() != this.Field16528) {
            this.Method38();
        }
        final Class44 field16528 = this.Field16527;
        Intrinsics.checkExpressionValueIsNotNull((Object)field16528, "amount");
        this.Field16528 = field16528.Method335();
    }
    
    private final boolean Method27() {
        if (this.Method28()) {
            if (Method6943().player != null || Method6943().world != null) {
                Class1393.Method5504().Method1886("Motion Blur is not compatible with OptiFine's Fast Render.");
            }
            return true;
        }
        return false;
    }
    
    private final boolean Method28() {
        if (this.Field16529 == null) {
            return false;
        }
        final Object value = this.Field16529.get(Method6943().gameSettings);
        if (value == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
        }
        return (boolean)value;
    }
    
    public Class1850() {
        super("MotionBlur", Class97.Field8342);
        this.Field16527 = this.Method23(new Class44("Amount", this, 1.0, 1.0, Double.longBitsToDouble((long)205162779 ^ 0x401C00000C3A891BL), true));
        this.Field16529 = Method6943().gameSettings.getClass().getDeclaredField("ofFastRender");
    }
    
    public static final Minecraft Method6943() {
        return Class42.Field8052;
    }
    
    public static final void Method6944(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x13E7 ^ 0xF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
