//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.Vec3d
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1178;
import lavahack.client.Class1831;
import lavahack.client.Class199;
import lavahack.client.Class760;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2={"Lcom/kisman/cc/util/render/objects/world/TextOnBoundingBox;", "Lcom/kisman/cc/util/render/objects/world/Abstract3dObject;", "text", "", "aabb", "Lnet/minecraft/util/math/AxisAlignedBB;", "color", "Lcom/kisman/cc/util/Colour;", "(Ljava/lang/String;Lnet/minecraft/util/math/AxisAlignedBB;Lcom/kisman/cc/util/Colour;)V", "getAabb", "()Lnet/minecraft/util/math/AxisAlignedBB;", "getColor", "()Lcom/kisman/cc/util/Colour;", "getText", "()Ljava/lang/String;", "type", "Lcom/kisman/cc/util/enums/Object3dTypes;", "getType", "()Lcom/kisman/cc/util/enums/Object3dTypes;", "draw", "", "ticks", "", "kisman.cc"})
public final class Class868
extends Class199 {
    @NotNull
    private final Class760 Field11653;
    @NotNull
    private final String Field11654;
    @NotNull
    private final AxisAlignedBB Field11655;
    @NotNull
    private final Class2027 Field11656;
    private String Field11657 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    @NotNull
    @NotNull
    public Class760 Method1184() {
        return this.Field11653;
    }

    @Override
    public void Method1186(float f) {
        GL11.glPushMatrix();
        Vec3d vec3d = this.Field11655.getCenter();
        Intrinsics.checkExpressionValueIsNotNull((Object)vec3d, (String)"aabb.center");
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"Minecraft.getMinecraft().player");
        this.Method1189(vec3d, (EntityPlayer)entityPlayerSP, Float.intBitsToFloat(1050253722));
        GlStateManager.disableDepth();
        if (Class1831.Field16464) {
            GlStateManager.disableTexture2D();
        }
        GlStateManager.disableLighting();
        GL11.glTranslated((double)(-(Class1178.Method4741(this.Field11654) / 2)), (double)0.0, (double)0.0);
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

    @Override
    @NotNull
    @NotNull
    public Class2027 Method1185() {
        return this.Field11656;
    }

    public Class868(@NotNull @NotNull String string, @NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull Class2027 class2027) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"color");
        this.Field11654 = string;
        this.Field11655 = axisAlignedBB;
        this.Field11656 = class2027;
        this.Field11653 = Class760.Field11218;
    }

    private static String Method1191(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 11;
            cArray2[n] = (char)(cArray[n] ^ (0x2072 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

