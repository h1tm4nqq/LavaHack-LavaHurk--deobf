//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import java.lang.reflect.Field;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1393;
import lavahack.client.Class1740;
import lavahack.client.Class1754;
import lavahack.client.Class1887;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;

@Class1887
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2={"Lcom/kisman/cc/features/module/render/MotionBlur;", "Lcom/kisman/cc/features/module/Module;", "()V", "amount", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "cachedFastRender", "Ljava/lang/reflect/Field;", "lastAmount", "", "fastRenderCheck", "", "isFastRenderEnabled", "onEnable", "", "update", "kisman.cc"})
public final class Class1850
extends Class42 {
    private final Class44 Field16527 = this.Method23(new Class44("Amount", (Class42)this, 1.0, 1.0, Double.longBitsToDouble((long)205162779 ^ 0x401C00000C3A891BL), true));
    private int Field16528;
    private final Field Field16529;
    private String Field16530 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        if (Class1850.Method6943().player == null || Class1850.Method6943().world == null || this.Method27()) {
            super.Method21(false);
            return;
        }
        if (Class1850.Method6943().entityRenderer.shaderGroup != null) {
            Class1850.Method6943().entityRenderer.shaderGroup.deleteShaderGroup();
        }
        Class44 class44 = this.Field16527;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"amount");
        if (class44.Method335() <= 0) return;
        String string = "{\\\"targets\\\":[\\\"swap\\\",\\\"previous\\\"],\\\"passes\\\":[{\\\"name\\\":\\\"phosphor\\\",\\\"intarget\\\":\\\"minecraft:main\\\",\\\"outtarget\\\":\\\"swap\\\",\\\"auxtargets\\\":[{\\\"name\\\":\\\"PrevSampler\\\",\\\"id\\\":\\\"previous\\\"}],\\\"uniforms\\\":[{\\\"name\\\":\\\"Phosphor\\\",\\\"values\\\":[%.2f, %.2f, %.2f]}]},{\\\"name\\\":\\\"blit\\\",\\\"intarget\\\":\\\"swap\\\",\\\"outtarget\\\":\\\"previous\\\"},{\\\"name\\\":\\\"blit\\\",\\\"intarget\\\":\\\"swap\\\",\\\"outtarget\\\":\\\"minecraft:main\\\"}]}";
        Object[] objectArray = new Object[3];
        Class44 class442 = this.Field16527;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"amount");
        objectArray[0] = Float.valueOf(class442.Method368());
        Class44 class443 = this.Field16527;
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"amount");
        objectArray[1] = Float.valueOf(class443.Method368());
        Class44 class444 = this.Field16527;
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"amount");
        objectArray[2] = Float.valueOf(class444.Method368());
        Object[] objectArray2 = objectArray;
        String string2 = "motionblur";
        Class1754 class1754 = Class1754.Field16041;
        boolean bl = false;
        String string3 = String.format(string, Arrays.copyOf(objectArray2, objectArray2.length));
        Intrinsics.checkExpressionValueIsNotNull((Object)string3, (String)"java.lang.String.format(this, *args)");
        String string4 = string3;
        class1754.Method6681(string2, string4);
        Class1740 class1740 = Class1393.Method5503();
        StringBuilder stringBuilder = new StringBuilder().append("Enabled motion blur with ");
        Class44 class445 = this.Field16527;
        Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"amount");
        class1740.Method1886(stringBuilder.append(class445.Method335()).append(" amount!").toString());
        Class1850.Method6943().entityRenderer.getShaderGroup().createBindFramebuffers(Class1850.Method6943().displayWidth, Class1850.Method6943().displayHeight);
    }

    @Override
    public void Method45() {
        if (Class1850.Method6943().player == null || Class1850.Method6943().world == null || this.Method27()) {
            super.Method21(false);
            return;
        }
        Class44 class44 = this.Field16527;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"amount");
        if (class44.Method335() != this.Field16528) {
            this.Method38();
        }
        Class44 class442 = this.Field16527;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"amount");
        this.Field16528 = class442.Method335();
    }

    private final boolean Method27() {
        if (!this.Method28()) return false;
        if (Class1850.Method6943().player == null) {
            if (Class1850.Method6943().world == null) return true;
        }
        Class1393.Method5504().Method1886("Motion Blur is not compatible with OptiFine's Fast Render.");
        return true;
    }

    private final boolean Method28() {
        if (this.Field16529 == null) return false;
        Object object = this.Field16529.get(Class1850.Method6943().gameSettings);
        if (object != null) return (Boolean)object;
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
    }

    public Class1850() {
        super("MotionBlur", Class97.Field8342);
        Field field;
        Class1850 class1850 = this;
        class1850.Field16529 = field = Class1850.Method6943().gameSettings.getClass().getDeclaredField("ofFastRender");
    }

    public static final Minecraft Method6943() {
        return Class42.Field8052;
    }

    public static final void Method6944(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 15;
            cArray2[n] = (char)(cArray[n] ^ (0x13E7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

