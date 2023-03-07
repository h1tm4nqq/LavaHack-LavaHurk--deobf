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
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz;
import lavahack.client.gIvxvpNAI6XugtMxK19p7peBbgdbr5DL;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.zkRHxqWdljarNs4obH7wh2MOhqncb3In;
import net.minecraft.client.Minecraft;

@YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2={"Lcom/kisman/cc/features/module/render/MotionBlur;", "Lcom/kisman/cc/features/module/Module;", "()V", "amount", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "cachedFastRender", "Ljava/lang/reflect/Field;", "lastAmount", "", "fastRenderCheck", "", "isFastRenderEnabled", "onEnable", "", "update", "kisman.cc"})
public final class lGoOVBvmlLxRucEa9UXKtqQqSAUNDtNU
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16527 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Amount", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 1.0, Double.longBitsToDouble((long)205162779 ^ 0x401C00000C3A891BL), ((int)-325120412L ^ 0xEC9F0E65) != 0));
    private int Field16528;
    private final Field Field16529;
    private String Field16530 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        if (lGoOVBvmlLxRucEa9UXKtqQqSAUNDtNU.Method6943().player == null || lGoOVBvmlLxRucEa9UXKtqQqSAUNDtNU.Method6943().world == null || this.Method27()) {
            super.Method21((boolean)((long)1205147474 ^ (long)1205147474));
            return;
        }
        if (lGoOVBvmlLxRucEa9UXKtqQqSAUNDtNU.Method6943().entityRenderer.shaderGroup != null) {
            lGoOVBvmlLxRucEa9UXKtqQqSAUNDtNU.Method6943().entityRenderer.shaderGroup.deleteShaderGroup();
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field16527;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"amount");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method335() <= 0) return;
        String string = "{\\\"targets\\\":[\\\"swap\\\",\\\"previous\\\"],\\\"passes\\\":[{\\\"name\\\":\\\"phosphor\\\",\\\"intarget\\\":\\\"minecraft:main\\\",\\\"outtarget\\\":\\\"swap\\\",\\\"auxtargets\\\":[{\\\"name\\\":\\\"PrevSampler\\\",\\\"id\\\":\\\"previous\\\"}],\\\"uniforms\\\":[{\\\"name\\\":\\\"Phosphor\\\",\\\"values\\\":[%.2f, %.2f, %.2f]}]},{\\\"name\\\":\\\"blit\\\",\\\"intarget\\\":\\\"swap\\\",\\\"outtarget\\\":\\\"previous\\\"},{\\\"name\\\":\\\"blit\\\",\\\"intarget\\\":\\\"swap\\\",\\\"outtarget\\\":\\\"minecraft:main\\\"}]}";
        Object[] objectArray = new Object[(int)-1704282935L ^ 0x9A6AB4CA];
        int n = (int)1500811910L ^ 0x59749286;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field16527;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"amount");
        objectArray[n] = Float.valueOf(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method368());
        int n2 = (int)((long)253358360 ^ (long)0xF19F119);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field16527;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"amount");
        objectArray[n2] = Float.valueOf(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method368());
        int n3 = ((int)-1718860885L ^ 0x998C43AA) << 1;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field16527;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"amount");
        objectArray[n3] = Float.valueOf(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method368());
        Object[] objectArray2 = objectArray;
        String string2 = "motionblur";
        zkRHxqWdljarNs4obH7wh2MOhqncb3In zkRHxqWdljarNs4obH7wh2MOhqncb3In2 = zkRHxqWdljarNs4obH7wh2MOhqncb3In.Field16041;
        int n4 = (int)((long)577724104 ^ (long)577724104);
        String string3 = String.format(string, Arrays.copyOf(objectArray2, objectArray2.length));
        Intrinsics.checkExpressionValueIsNotNull((Object)string3, (String)"java.lang.String.format(this, *args)");
        String string4 = string3;
        zkRHxqWdljarNs4obH7wh2MOhqncb3In2.Method6681(string2, string4);
        gIvxvpNAI6XugtMxK19p7peBbgdbr5DL gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2 = NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5503();
        StringBuilder stringBuilder = new StringBuilder().append("Enabled motion blur with ");
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = this.Field16527;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"amount");
        gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2.Method1886(stringBuilder.append(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method335()).append(" amount!").toString());
        lGoOVBvmlLxRucEa9UXKtqQqSAUNDtNU.Method6943().entityRenderer.getShaderGroup().createBindFramebuffers(lGoOVBvmlLxRucEa9UXKtqQqSAUNDtNU.Method6943().displayWidth, lGoOVBvmlLxRucEa9UXKtqQqSAUNDtNU.Method6943().displayHeight);
    }

    @Override
    public void Method45() {
        if (lGoOVBvmlLxRucEa9UXKtqQqSAUNDtNU.Method6943().player == null || lGoOVBvmlLxRucEa9UXKtqQqSAUNDtNU.Method6943().world == null || this.Method27()) {
            super.Method21((boolean)((long)651046358 ^ (long)651046358));
            return;
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field16527;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"amount");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method335() != this.Field16528) {
            this.Method38();
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field16527;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"amount");
        this.Field16528 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method335();
    }

    private final boolean Method27() {
        if (!this.Method28()) return (int)((long)1178978758 ^ (long)1178978758) != 0;
        if (lGoOVBvmlLxRucEa9UXKtqQqSAUNDtNU.Method6943().player == null) {
            if (lGoOVBvmlLxRucEa9UXKtqQqSAUNDtNU.Method6943().world == null) return ((int)2143289985L ^ 0x7FC00280) != 0;
        }
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5504().Method1886("Motion Blur is not compatible with OptiFine's Fast Render.");
        return ((int)2143289985L ^ 0x7FC00280) != 0;
    }

    private final boolean Method28() {
        if (this.Field16529 == null) return (int)((long)1189633104 ^ (long)1189633104) != 0;
        Object object = this.Field16529.get(lGoOVBvmlLxRucEa9UXKtqQqSAUNDtNU.Method6943().gameSettings);
        if (object != null) return (Boolean)object;
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
    }

    public lGoOVBvmlLxRucEa9UXKtqQqSAUNDtNU() {
        super("MotionBlur", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
        Field field;
        lGoOVBvmlLxRucEa9UXKtqQqSAUNDtNU lGoOVBvmlLxRucEa9UXKtqQqSAUNDtNU2 = this;
        lGoOVBvmlLxRucEa9UXKtqQqSAUNDtNU2.Field16529 = field = lGoOVBvmlLxRucEa9UXKtqQqSAUNDtNU.Method6943().gameSettings.getClass().getDeclaredField("ofFastRender");
    }

    public static final Minecraft Method6943() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method6944(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-664523191L ^ 0xD8642E49;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1163072685L ^ 0xBAACEBAC);
            int n2 = (int)((long)1697908843 ^ (long)1697908836);
            cArray2[n] = (char)(cArray[n] ^ ((int)-1273618792L ^ 0xB4160D7F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

