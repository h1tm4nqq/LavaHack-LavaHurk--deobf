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

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Lu1DqI7359mv7EiKXQUvZ4SbMA918o0L;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011J\u001e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eJ\u0016\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001c"}, d2={"Lcom/kisman/cc/util/render/objects/world/Abstract3dObject;", "", "()V", "color", "Lcom/kisman/cc/util/Colour;", "getColor", "()Lcom/kisman/cc/util/Colour;", "type", "Lcom/kisman/cc/util/enums/Object3dTypes;", "getType", "()Lcom/kisman/cc/util/enums/Object3dTypes;", "draw", "", "ticks", "", "glBillboard", "vec", "Lnet/minecraft/util/math/Vec3d;", "glBillboardDistanceScaled", "player", "Lnet/minecraft/entity/player/EntityPlayer;", "scale", "prepare", "depth", "", "alpha", "release", "CubicRendering", "kisman.cc"})
public abstract class hwbJeWGSYQEaA0HrWcfNQtu6aIugGkDT {
    private String Field8878 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public abstract Lu1DqI7359mv7EiKXQUvZ4SbMA918o0L Method1184();

    @NotNull
    @NotNull
    public abstract vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method1185();

    public abstract void Method1186(float var1);

    public final void Method1187(boolean bl, boolean bl2) {
        GL11.glPushAttrib((int)((int)((long)304919840 ^ (long)304302815)));
        GL11.glHint((int)(((int)2113132616L ^ 0x7DF3DE61) << 1), (int)((int)((long)-136520276 ^ (long)-136522451) << 1));
        GlStateManager.tryBlendFuncSeparate((int)((int)((long)-294413515 ^ (long)-294413644) << 1), (int)((int)((long)-1839171859 ^ (long)-1839172114)), (int)((int)((long)-763317541 ^ (long)-763317541)), (int)((int)((long)-600391110 ^ (long)-600391109)));
        GlStateManager.shadeModel((int)((int)-1311657307L ^ 0xB1D1AFA4));
        GlStateManager.depthMask(((int)1830296945L ^ 0x6D181D71) != 0);
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
        GL11.glEnable((int)((int)((long)1519250891 ^ (long)1519250834) << 5));
        GL11.glEnable((int)((int)((long)191296618 ^ (long)191263269)));
    }

    public final void Method1188(boolean bl) {
        GL11.glDisable((int)((int)1395498703L ^ 0x532D1880));
        GL11.glDisable((int)(((int)-524307872L ^ 0xE0BFB239) << 5));
        if (bl) {
            GlStateManager.enableAlpha();
        }
        GlStateManager.enableCull();
        GlStateManager.enableLighting();
        GlStateManager.enableTexture2D();
        GlStateManager.enableDepth();
        GlStateManager.disableBlend();
        GlStateManager.depthMask((boolean)((long)275523150 ^ (long)275523151));
        GlStateManager.glLineWidth((float)1.0f);
        GlStateManager.shadeModel((int)((int)((long)1975054888 ^ (long)1975054901) << 8));
        GL11.glHint((int)(((int)-1819779847L ^ 0x93885AD0) << 1), (int)((int)((long)-1809308735 ^ (long)-1809308720) << 8));
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
        float f = Float.intBitsToFloat((int)((long)1945391195 ^ (long)1328424020));
        Minecraft minecraft = Minecraft.getMinecraft();
        GL11.glTranslated((double)(vec3d.x - minecraft.renderManager.renderViewEntity.posX), (double)(vec3d.y - minecraft.renderManager.renderViewEntity.posY), (double)(vec3d.z - minecraft.renderManager.renderViewEntity.posZ));
        GL11.glNormal3f((float)0.0f, (float)0.0f, (float)0.0f);
        GL11.glRotatef((float)(-minecraft.player.rotationYaw), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)minecraft.player.rotationPitch, (float)(minecraft.gameSettings.thirdPersonView == (int)((long)647785610 ^ (long)647785611) << 1 ? Float.intBitsToFloat((int)1623723693L ^ 0xDF480EAD) : 1.0f), (float)0.0f, (float)0.0f);
        GL11.glScalef((float)(-f), (float)(-f), (float)(-f));
    }

    private static String Method1191(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)2065080201 ^ (long)2065080201);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1013820874L ^ 0xC39252C9);
            int n2 = (int)-126456768L ^ 0xF8766C9F;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1598574505L ^ 0xA0B7C970 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

