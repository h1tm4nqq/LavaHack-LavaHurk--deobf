//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.culling.Frustum
 *  net.minecraft.client.shader.Framebuffer
 *  net.minecraft.client.shader.ShaderGroup
 *  net.minecraft.entity.Entity
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.DmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi;
import lavahack.client.aTJH8gVbmzVZwD56My1Z8HDGDCqTN1wK;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tJ\u0006\u0010\u0011\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2={"Lcom/kisman/cc/features/module/render/shader/shaders/InertiaOutlineShader;", "", "()V", "mc", "Lnet/minecraft/client/Minecraft;", "kotlin.jvm.PlatformType", "drawEntities", "", "partialTicks", "", "range", "drawShader", "shaderHelper", "Lcom/kisman/cc/features/module/render/shader/shaders/troll/ShaderHelper;", "frameBufferFinal", "Lnet/minecraft/client/shader/Framebuffer;", "ticks", "setupUniforms", "updateUniforms", "kisman.cc"})
public final class xZnh68gOyvOTExWxMQUH0oqtDBoKq3dl {
    private static final Minecraft Field9195;
    public static final xZnh68gOyvOTExWxMQUH0oqtDBoKq3dl Field9196;
    private int Field9197;

    public final void Method1445(@NotNull @NotNull aTJH8gVbmzVZwD56My1Z8HDGDCqTN1wK aTJH8gVbmzVZwD56My1Z8HDGDCqTN1wK2, @NotNull @NotNull Framebuffer framebuffer, float f) {
        Intrinsics.checkParameterIsNotNull((Object)aTJH8gVbmzVZwD56My1Z8HDGDCqTN1wK2, (String)"shaderHelper");
        Intrinsics.checkParameterIsNotNull((Object)framebuffer, (String)"frameBufferFinal");
        DmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi.Field10581.Method2624();
        DmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi.Field10581.Method2617((boolean)((long)-1938292906 ^ (long)-1938292905));
        GlStateManager.tryBlendFuncSeparate((int)((int)((long)654563512 ^ (long)654563641) << 1), (int)((int)((long)1263994602 ^ (long)1263994345)), (int)((int)2024201195L ^ 0x78A6DBEA), (int)((int)1300905868L ^ 0x4D8A3F8C));
        ShaderGroup shaderGroup = aTJH8gVbmzVZwD56My1Z8HDGDCqTN1wK2.Method3587();
        if (shaderGroup == null) {
            Intrinsics.throwNpe();
        }
        shaderGroup.render(f);
        DmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi.Field10581.Method2617(((int)421197347L ^ 0x191AF622) != 0);
        DmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi.Field10581.Method2620((boolean)((long)-470526400 ^ (long)-470526400));
        Minecraft minecraft = Field9195;
        Intrinsics.checkExpressionValueIsNotNull((Object)minecraft, (String)"mc");
        minecraft.getFramebuffer().bindFramebuffer(((int)-965226382L ^ 0xC677D072) != 0);
        framebuffer.framebufferRenderExt(xZnh68gOyvOTExWxMQUH0oqtDBoKq3dl.Field9195.displayWidth, xZnh68gOyvOTExWxMQUH0oqtDBoKq3dl.Field9195.displayHeight, (boolean)((long)2098945562 ^ (long)2098945562));
        DmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi.Field10581.Method2617((boolean)((long)-1860837313 ^ (long)-1860837314));
        DmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi.Field10581.Method2620(((int)1336061174L ^ 0x4FA2ACF7) != 0);
        DmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi.Field10581.Method2625();
    }

    public final void Method1446(float f, float f2) {
        double d;
        DmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi.Field10581.Method2621(((int)-1922585111L ^ 0x8D67ADE8) != 0);
        DmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi.Field10581.Method2616(((int)-1622497684L ^ 0x9F4AA66D) != 0);
        DmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi.Field10581.Method2620(((int)1120359457L ^ 0x42C75420) != 0);
        GlStateManager.depthMask((boolean)((long)794182836 ^ (long)794182837));
        Frustum frustum = new Frustum();
        Entity entity = xZnh68gOyvOTExWxMQUH0oqtDBoKq3dl.Field9195.renderViewEntity;
        if (entity == null) {
            entity = (Entity)xZnh68gOyvOTExWxMQUH0oqtDBoKq3dl.Field9195.player;
        }
        Entity entity2 = entity;
        double d2 = d = (double)f;
        double d3 = entity2.posX;
        double d4 = entity2.lastTickPosX;
        return (void)(d4 + (d3 - d4) * d2);
    }

    public final void Method1447() {
    }

    public final void Method1448(@NotNull @NotNull aTJH8gVbmzVZwD56My1Z8HDGDCqTN1wK aTJH8gVbmzVZwD56My1Z8HDGDCqTN1wK2) {
        Intrinsics.checkParameterIsNotNull((Object)aTJH8gVbmzVZwD56My1Z8HDGDCqTN1wK2, (String)"shaderHelper");
    }

    private xZnh68gOyvOTExWxMQUH0oqtDBoKq3dl() {
    }

    static {
        xZnh68gOyvOTExWxMQUH0oqtDBoKq3dl xZnh68gOyvOTExWxMQUH0oqtDBoKq3dl2;
        Field9196 = xZnh68gOyvOTExWxMQUH0oqtDBoKq3dl2 = new xZnh68gOyvOTExWxMQUH0oqtDBoKq3dl();
        Field9195 = Minecraft.getMinecraft();
    }

    private static String Method1449(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-453329580L ^ 0xE4FABD54;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1149848708L ^ 0xBB76B383);
            int n2 = (int)-1064012600L ^ 0xC09474FB;
            cArray2[n] = (char)(cArray[n] ^ (((int)735716638L ^ 0x2BDA19D9) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

