//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import com.kisman.cc.util.*;
import org.lwjgl.opengl.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.*;
import net.minecraft.entity.player.*;
import net.minecraft.client.renderer.*;
import net.minecraft.util.math.*;
import net.minecraft.client.entity.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007?\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004?\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012?\u0006\u0017" }, d2 = { "Lcom/kisman/cc/util/render/objects/world/TextOnBoundingBox;", "Lcom/kisman/cc/util/render/objects/world/Abstract3dObject;", "text", "", "aabb", "Lnet/minecraft/util/math/AxisAlignedBB;", "color", "Lcom/kisman/cc/util/Colour;", "(Ljava/lang/String;Lnet/minecraft/util/math/AxisAlignedBB;Lcom/kisman/cc/util/Colour;)V", "getAabb", "()Lnet/minecraft/util/math/AxisAlignedBB;", "getColor", "()Lcom/kisman/cc/util/Colour;", "getText", "()Ljava/lang/String;", "type", "Lcom/kisman/cc/util/enums/Object3dTypes;", "getType", "()Lcom/kisman/cc/util/enums/Object3dTypes;", "draw", "", "ticks", "", "kisman.cc" })
public final class Class868 extends Class199
{
    @NotNull
    private final Class760 Field11653;
    @NotNull
    private final String Field11654;
    @NotNull
    private final AxisAlignedBB Field11655;
    @NotNull
    private final Class2027 Field11656;
    private String Field11657 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public Class760 Method1184() {
        return this.Field11653;
    }
    
    public void Method1186(final float n) {
        GL11.glPushMatrix();
        final Vec3d getCenter = this.Field11655.getCenter();
        Intrinsics.checkExpressionValueIsNotNull((Object)getCenter, "aabb.center");
        final EntityPlayerSP player = Minecraft.getMinecraft().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)player, "Minecraft.getMinecraft().player");
        this.Method1189(getCenter, (EntityPlayer)player, Float.intBitsToFloat(1050253722));
        GlStateManager.disableDepth();
        if (Class1831.Field16464) {
            GlStateManager.disableTexture2D();
        }
        GlStateManager.disableLighting();
        GL11.glTranslated((double)(-(Class1178.Method4741(this.Field11654) / 2)), 0.0, 0.0);
        Class1178.Method4745(this.Field11654, 0.0, 0.0, this.Method1185().Method3626());
        GlStateManager.enableLighting();
        if (Class1831.Field16464) {
            GlStateManager.enableTexture2D();
        }
        GlStateManager.enableDepth();
        GL11.glPopMatrix();
    }
    
    @NotNull
    @NotNull
    public final String Method3661() {
        return this.Field11654;
    }
    
    @NotNull
    @NotNull
    public final AxisAlignedBB Method3662() {
        return this.Field11655;
    }
    
    @NotNull
    @NotNull
    public Class2027 Method1185() {
        return this.Field11656;
    }
    
    public Class868(@NotNull @NotNull final String field11654, @NotNull @NotNull final AxisAlignedBB field11655, @NotNull @NotNull final Class2027 field11656) {
        Intrinsics.checkParameterIsNotNull((Object)field11654, "text");
        Intrinsics.checkParameterIsNotNull((Object)field11655, "aabb");
        Intrinsics.checkParameterIsNotNull((Object)field11656, "color");
        this.Field11654 = field11654;
        this.Field11655 = field11655;
        this.Field11656 = field11656;
        this.Field11653 = Class760.Field11218;
    }
    
    private static String Method1191(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2072 ^ 0xB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
