//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.culling.Frustum
 *  net.minecraft.client.shader.Framebuffer
 *  net.minecraft.client.shader.Shader
 *  net.minecraft.client.shader.ShaderGroup
 *  net.minecraft.entity.Entity
 */
package lavahack.client;

import com.kisman.cc.mixin.mixins.accessor.AccessorShaderGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.DmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi;
import lavahack.client.YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro;
import lavahack.client.YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.aTJH8gVbmzVZwD56My1Z8HDGDCqTN1wK;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.Shader;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u001e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000fJ&\u0010\u0016\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000fJ\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2={"Lcom/kisman/cc/features/module/render/shader/shaders/Outline2Shader;", "", "()V", "filledAlpha", "Lcom/kisman/cc/features/module/render/shader/ShaderUtil$UniformFloat;", "mc", "Lnet/minecraft/client/Minecraft;", "kotlin.jvm.PlatformType", "outlineAlpha", "ratio", "width", "widthSq", "drawEntities", "", "partialTicks", "", "range", "drawShader", "shaderHelper", "Lcom/kisman/cc/features/module/render/shader/shaders/troll/ShaderHelper;", "frameBufferFinal", "Lnet/minecraft/client/shader/Framebuffer;", "setupUniforms", "updateUniforms", "kisman.cc"})
public final class xDQHT1wQlwfAKwg0BD01nQjmD4ltKADQ {
    private static final Minecraft Field13632;
    private static YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field13633;
    private static YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field13634;
    private static YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field13635;
    private static YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field13636;
    private static YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Field13637;
    public static final xDQHT1wQlwfAKwg0BD01nQjmD4ltKADQ Field13638;
    private String Field13639 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method4991(float f, float f2, float f3, float f4) {
        float f5;
        Field13633 = new YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("outlineAlpha", f);
        Field13634 = new YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("filledAlpha", f2);
        Field13635 = new YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("width", f3);
        float f6 = f3;
        int n = (int)((long)719909532 ^ (long)719909533) << 1;
        String string = "widthSq";
        int n2 = (int)((long)98396012 ^ (long)98396012);
        float f7 = f5 = (float)Math.pow(f6, n);
        String string2 = string;
        Field13636 = new YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(string2, f7);
        Field13637 = new YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("ratio", f4);
    }

    public final void Method4992(@NotNull @NotNull aTJH8gVbmzVZwD56My1Z8HDGDCqTN1wK aTJH8gVbmzVZwD56My1Z8HDGDCqTN1wK2, @NotNull @NotNull Framebuffer framebuffer, float f) {
        Intrinsics.checkParameterIsNotNull((Object)aTJH8gVbmzVZwD56My1Z8HDGDCqTN1wK2, (String)"shaderHelper");
        Intrinsics.checkParameterIsNotNull((Object)framebuffer, (String)"frameBufferFinal");
        DmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi.Field10581.Method2624();
        DmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi.Field10581.Method2617(((int)-306524509L ^ 0xEDBACEA2) != 0);
        GlStateManager.tryBlendFuncSeparate((int)((int)((long)1612773919 ^ (long)1612774302) << 1), (int)((int)((long)1622173248 ^ (long)1622172995)), (int)((int)-340286432L ^ 0xEBB7A421), (int)((int)-1498380408L ^ 0xA6B08788));
        ShaderGroup shaderGroup = aTJH8gVbmzVZwD56My1Z8HDGDCqTN1wK2.Method3587();
        if (shaderGroup == null) {
            Intrinsics.throwNpe();
        }
        shaderGroup.render(f);
        DmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi.Field10581.Method2617((boolean)((long)1012999541 ^ (long)1012999540));
        DmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi.Field10581.Method2620((boolean)((long)1261109328 ^ (long)1261109328));
        Minecraft minecraft = Field13632;
        Intrinsics.checkExpressionValueIsNotNull((Object)minecraft, (String)"mc");
        minecraft.getFramebuffer().bindFramebuffer(((int)-672731970L ^ 0xD7E6ECBE) != 0);
        framebuffer.framebufferRenderExt(xDQHT1wQlwfAKwg0BD01nQjmD4ltKADQ.Field13632.displayWidth, xDQHT1wQlwfAKwg0BD01nQjmD4ltKADQ.Field13632.displayHeight, (boolean)((long)-1372444931 ^ (long)-1372444931));
        DmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi.Field10581.Method2617((boolean)((long)-750178999 ^ (long)-750179000));
        DmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi.Field10581.Method2620(((int)367763339L ^ 0x15EB9F8A) != 0);
        DmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi.Field10581.Method2625();
    }

    public final void Method4993(float f, float f2) {
        double d;
        DmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi.Field10581.Method2621(((int)1543011732L ^ 0x5BF87D95) != 0);
        DmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi.Field10581.Method2616((boolean)((long)856876221 ^ (long)856876220));
        DmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi.Field10581.Method2620((boolean)((long)-1969678766 ^ (long)-1969678765));
        GlStateManager.depthMask(((int)199155957L ^ 0xBDEE0F4) != 0);
        Frustum frustum = new Frustum();
        Entity entity = xDQHT1wQlwfAKwg0BD01nQjmD4ltKADQ.Field13632.renderViewEntity;
        if (entity == null) {
            entity = (Entity)xDQHT1wQlwfAKwg0BD01nQjmD4ltKADQ.Field13632.player;
        }
        Entity entity2 = entity;
        double d2 = d = (double)f;
        double d3 = entity2.posX;
        double d4 = entity2.lastTickPosX;
        return (void)(d4 + (d3 - d4) * d2);
    }

    public final void Method4994(@NotNull @NotNull aTJH8gVbmzVZwD56My1Z8HDGDCqTN1wK aTJH8gVbmzVZwD56My1Z8HDGDCqTN1wK2) {
        Intrinsics.checkParameterIsNotNull((Object)aTJH8gVbmzVZwD56My1Z8HDGDCqTN1wK2, (String)"shaderHelper");
        ShaderGroup shaderGroup = aTJH8gVbmzVZwD56My1Z8HDGDCqTN1wK2.Method3587();
        if (shaderGroup == null) return;
        ShaderGroup shaderGroup2 = shaderGroup;
        int n = (int)-1782690045L ^ 0x95BE4F03;
        int n2 = (int)((long)-71641149 ^ (long)-71641149);
        ShaderGroup shaderGroup3 = shaderGroup2;
        int n3 = (int)((long)1399607697 ^ (long)1399607697);
        ShaderGroup shaderGroup4 = shaderGroup3;
        if (shaderGroup4 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorShaderGroup");
        }
        Iterator iterator = ((AccessorShaderGroup)shaderGroup4).Method5561().iterator();
        while (iterator.hasNext()) {
            Shader shader;
            Shader shader2 = shader = (Shader)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)shader2, (String)"shader");
            YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[(int)1832245024L ^ 0x6D35D725];
            int n4 = (int)244026662L ^ 0xE8B8D26;
            YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = Field13633;
            if (yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV == null) {
                Intrinsics.throwNpe();
            }
            yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[n4] = yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
            int n5 = (int)((long)949445773 ^ (long)949445772);
            YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2 = Field13634;
            if (yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2 == null) {
                Intrinsics.throwNpe();
            }
            yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[n5] = yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2;
            int n6 = (int)((long)1808954761 ^ (long)1808954760) << 1;
            YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV3 = Field13635;
            if (yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV3 == null) {
                Intrinsics.throwNpe();
            }
            yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[n6] = yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV3;
            int n7 = (int)((long)594695601 ^ (long)594695602);
            YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV4 = Field13636;
            if (yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV4 == null) {
                Intrinsics.throwNpe();
            }
            yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[n7] = yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV4;
            int n8 = (int)((long)774048079 ^ (long)774048078) << 2;
            YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV5 = Field13637;
            if (yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV5 == null) {
                Intrinsics.throwNpe();
            }
            yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[n8] = yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV5;
            YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro.Field11592.Method1585(shader2, yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray);
        }
    }

    private xDQHT1wQlwfAKwg0BD01nQjmD4ltKADQ() {
    }

    static {
        xDQHT1wQlwfAKwg0BD01nQjmD4ltKADQ xDQHT1wQlwfAKwg0BD01nQjmD4ltKADQ2;
        Field13638 = xDQHT1wQlwfAKwg0BD01nQjmD4ltKADQ2 = new xDQHT1wQlwfAKwg0BD01nQjmD4ltKADQ();
        Field13632 = Minecraft.getMinecraft();
    }

    private static String Method4995(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1753484006L ^ 0x977BF51A;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1236575615L ^ 0x49B4A580);
            int n2 = (int)((long)-1526281201 ^ (long)-1526281214) << 4;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-873286768 ^ (long)-873294689) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

