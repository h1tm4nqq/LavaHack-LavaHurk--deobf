//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.Vec3d
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class760;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011J\u001e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eJ\u0016\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001c"}, d2={"Lcom/kisman/cc/util/render/objects/world/Abstract3dObject;", "", "()V", "color", "Lcom/kisman/cc/util/Colour;", "getColor", "()Lcom/kisman/cc/util/Colour;", "type", "Lcom/kisman/cc/util/enums/Object3dTypes;", "getType", "()Lcom/kisman/cc/util/enums/Object3dTypes;", "draw", "", "ticks", "", "glBillboard", "vec", "Lnet/minecraft/util/math/Vec3d;", "glBillboardDistanceScaled", "player", "Lnet/minecraft/entity/player/EntityPlayer;", "scale", "prepare", "depth", "", "alpha", "release", "CubicRendering", "kisman.cc"})
public abstract class Class199 {
    private String Field8878 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public abstract Class760 Method1184();

    @NotNull
    @NotNull
    public abstract Class2027 Method1185();

    public abstract void Method1186(float var1);

    public final void Method1187(boolean bl, boolean bl2) {
        GL11.glPushAttrib((int)1048575);
        GL11.glHint((int)3154, (int)4354);
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)0, (int)1);
        GlStateManager.shadeModel((int)7425);
        GlStateManager.depthMask((boolean)false);
        GlStateManager.enableBlend();
        if (!bl) {
            GlStateManager.disableDepth();
        }
        GlStateManager.disableTexture2D();
        GlStateManager.disableLighting();
        GlStateManager.disableCull();
        if (bl2) {
            GlStateManager.enableAlpha();
        }
        GL11.glEnable((int)2848);
        GL11.glEnable((int)34383);
    }

    public final void Method1188(boolean bl) {
        GL11.glDisable((int)34383);
        GL11.glDisable((int)2848);
        if (bl) {
            GlStateManager.enableAlpha();
        }
        GlStateManager.enableCull();
        GlStateManager.enableLighting();
        GlStateManager.enableTexture2D();
        GlStateManager.enableDepth();
        GlStateManager.disableBlend();
        GlStateManager.depthMask((boolean)true);
        GlStateManager.glLineWidth((float)1.0f);
        GlStateManager.shadeModel((int)7424);
        GL11.glHint((int)3154, (int)4352);
        GL11.glPopAttrib();
    }

    public final void Method1189(@NotNull @NotNull Vec3d vec3d, @NotNull @NotNull EntityPlayer entityPlayer, float f) {
        Intrinsics.checkParameterIsNotNull((Object)vec3d, (String)"vec");
        Intrinsics.checkParameterIsNotNull((Object)entityPlayer, (String)"player");
        this.Method1190(vec3d);
        float f2 = (float)entityPlayer.getDistance(vec3d.x, vec3d.y, vec3d.z) / 2.0f / (2.0f + (2.0f - f));
        GL11.glScalef((float)f2, (float)f2, (float)f2);
    }

    public final void Method1190(@NotNull @NotNull Vec3d vec3d) {
        Intrinsics.checkParameterIsNotNull((Object)vec3d, (String)"vec");
        float f = Float.intBitsToFloat(1020949519);
        Minecraft minecraft = Minecraft.getMinecraft();
        GL11.glTranslated((double)(vec3d.x - minecraft.renderManager.renderViewEntity.posX), (double)(vec3d.y - minecraft.renderManager.renderViewEntity.posY), (double)(vec3d.z - minecraft.renderManager.renderViewEntity.posZ));
        GL11.glNormal3f((float)0.0f, (float)0.0f, (float)0.0f);
        GL11.glRotatef((float)(-minecraft.player.rotationYaw), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)minecraft.player.rotationPitch, (float)(minecraft.gameSettings.thirdPersonView == 2 ? Float.intBitsToFloat(-1082130432) : 1.0f), (float)0.0f, (float)0.0f);
        GL11.glScalef((float)(-f), (float)(-f), (float)(-f));
    }

    private static String Method1191(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 223;
            cArray2[n] = (char)(cArray[n] ^ (0x7927 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

