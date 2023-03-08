//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import com.kisman.cc.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.player.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u001bB\u0005?\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011J\u001e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eJ\u0016\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004?\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004?\u0006\u0006\u001a\u0004\b\t\u0010\n?\u0006\u001c" }, d2 = { "Lcom/kisman/cc/util/render/objects/world/Abstract3dObject;", "", "()V", "color", "Lcom/kisman/cc/util/Colour;", "getColor", "()Lcom/kisman/cc/util/Colour;", "type", "Lcom/kisman/cc/util/enums/Object3dTypes;", "getType", "()Lcom/kisman/cc/util/enums/Object3dTypes;", "draw", "", "ticks", "", "glBillboard", "vec", "Lnet/minecraft/util/math/Vec3d;", "glBillboardDistanceScaled", "player", "Lnet/minecraft/entity/player/EntityPlayer;", "scale", "prepare", "depth", "", "alpha", "release", "CubicRendering", "kisman.cc" })
public abstract class Class199
{
    private String Field8878 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public abstract Class760 Method1184();
    
    @NotNull
    @NotNull
    public abstract Class2027 Method1185();
    
    public abstract void Method1186(final float p0);
    
    public final void Method1187(final boolean b, final boolean b2) {
        GL11.glPushAttrib(1048575);
        GL11.glHint(3154, 4354);
        GlStateManager.tryBlendFuncSeparate(770, 771, 0, 1);
        GlStateManager.shadeModel(7425);
        GlStateManager.depthMask(false);
        GlStateManager.enableBlend();
        if (!b) {
            GlStateManager.disableDepth();
        }
        GlStateManager.disableTexture2D();
        GlStateManager.disableLighting();
        GlStateManager.disableCull();
        if (b2) {
            GlStateManager.enableAlpha();
        }
        GL11.glEnable(2848);
        GL11.glEnable(34383);
    }
    
    public final void Method1188(final boolean b) {
        GL11.glDisable(34383);
        GL11.glDisable(2848);
        if (b) {
            GlStateManager.enableAlpha();
        }
        GlStateManager.enableCull();
        GlStateManager.enableLighting();
        GlStateManager.enableTexture2D();
        GlStateManager.enableDepth();
        GlStateManager.disableBlend();
        GlStateManager.depthMask(true);
        GlStateManager.glLineWidth(1.0f);
        GlStateManager.shadeModel(7424);
        GL11.glHint(3154, 4352);
        GL11.glPopAttrib();
    }
    
    public final void Method1189(@NotNull @NotNull final Vec3d vec3d, @NotNull @NotNull final EntityPlayer entityPlayer, final float n) {
        Intrinsics.checkParameterIsNotNull((Object)vec3d, "vec");
        Intrinsics.checkParameterIsNotNull((Object)entityPlayer, "player");
        this.Method1190(vec3d);
        final float n2 = (float)entityPlayer.getDistance(vec3d.x, vec3d.y, vec3d.z) / 2.0f / (2.0f + (2.0f - n));
        GL11.glScalef(n2, n2, n2);
    }
    
    public final void Method1190(@NotNull @NotNull final Vec3d vec3d) {
        Intrinsics.checkParameterIsNotNull((Object)vec3d, "vec");
        final float intBitsToFloat = Float.intBitsToFloat(1020949519);
        final Minecraft getMinecraft = Minecraft.getMinecraft();
        GL11.glTranslated(vec3d.x - getMinecraft.renderManager.renderViewEntity.posX, vec3d.y - getMinecraft.renderManager.renderViewEntity.posY, vec3d.z - getMinecraft.renderManager.renderViewEntity.posZ);
        GL11.glNormal3f(0.0f, 0.0f, 0.0f);
        GL11.glRotatef(-getMinecraft.player.rotationYaw, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(getMinecraft.player.rotationPitch, (getMinecraft.gameSettings.thirdPersonView == 2) ? Float.intBitsToFloat(-1082130432) : 1.0f, 0.0f, 0.0f);
        GL11.glScalef(-intBitsToFloat, -intBitsToFloat, -intBitsToFloat);
    }
    
    private static String Method1191(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7927 ^ 0xDF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
