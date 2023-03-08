//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraft.util.math.*;
import net.minecraftforge.common.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.client.renderer.*;
import org.lwjgl.opengl.*;
import java.nio.*;
import net.minecraft.client.gui.*;
import org.lwjgl.util.vector.*;

public class Class192
{
    private final Minecraft Field8847;
    private final Matrix4f Field8848;
    private final Matrix4f Field8849;
    Vec3d Field8850;
    private int Field8851;
    
    public Class192() {
        this.Field8847 = Minecraft.getMinecraft();
        this.Field8848 = new Matrix4f();
        this.Field8849 = new Matrix4f();
        this.Field8850 = new Vec3d(0.0, 0.0, 0.0);
        MinecraftForge.EVENT_BUS.register((Object)this);
    }
    
    public static Vec3d Method1152(final Vec3d vec3d, final Vec3d vec3d2) {
        return vec3d.add(-vec3d2.x, -vec3d2.y, -vec3d2.z);
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method1153(final RenderWorldLastEvent renderWorldLastEvent) {
        if (this.Field8847.renderViewEntity == null) {
            return;
        }
        final Vec3d projectViewFromEntity = ActiveRenderInfo.projectViewFromEntity(this.Field8847.renderViewEntity, (double)this.Field8847.getRenderPartialTicks());
        final Vec3d cameraPosition = ActiveRenderInfo.getCameraPosition();
        this.Method1154(this.Field8848, 2982);
        this.Method1154(this.Field8849, 2983);
        this.Field8850 = projectViewFromEntity.add(cameraPosition);
    }
    
    public void Method1154(final Matrix4f matrix4f, final int n) {
        final FloatBuffer createDirectFloatBuffer = GLAllocation.createDirectFloatBuffer(16);
        GL11.glGetFloat(n, createDirectFloatBuffer);
        matrix4f.load(createDirectFloatBuffer);
    }
    
    public Vec3d Method1155(final Vec3d vec3d) {
        final Vector4f method1157 = this.Method1157(vec3d);
        final ScaledResolution scaledResolution = new ScaledResolution(this.Field8847);
        final int getScaledWidth = scaledResolution.getScaledWidth();
        final int getScaledHeight = scaledResolution.getScaledHeight();
        method1157.x = getScaledWidth / 2.0f + (Float.intBitsToFloat(1056964608) * method1157.x * getScaledWidth + Float.intBitsToFloat(1056964608));
        method1157.y = getScaledHeight / 2.0f - (Float.intBitsToFloat(1056964608) * method1157.y * getScaledHeight + Float.intBitsToFloat(1056964608));
        return new Vec3d((double)method1157.x, (double)method1157.y, this.Method1159(method1157, getScaledWidth, getScaledHeight) ? 0.0 : Double.longBitsToDouble(-4616189618054758400L));
    }
    
    public Vec3d Method1156(final Vec3d vec3d) {
        final Vector4f method1157 = this.Method1157(vec3d);
        final int displayWidth = this.Field8847.displayWidth;
        final int displayHeight = this.Field8847.displayHeight;
        method1157.x = displayWidth / 2.0f + (Float.intBitsToFloat(1056964608) * method1157.x * displayWidth + Float.intBitsToFloat(1056964608));
        method1157.y = displayHeight / 2.0f - (Float.intBitsToFloat(1056964608) * method1157.y * displayHeight + Float.intBitsToFloat(1056964608));
        return new Vec3d((double)method1157.x, (double)method1157.y, this.Method1159(method1157, displayWidth, displayHeight) ? 0.0 : Double.longBitsToDouble(-4616189618054758400L));
    }
    
    public Vector4f Method1157(final Vec3d vec3d) {
        final Vec3d subtract = this.Field8850.subtract(vec3d);
        final Vector4f vector4f = new Vector4f((float)subtract.x, (float)subtract.y, (float)subtract.z, 1.0f);
        this.Method1158(vector4f, this.Field8848);
        this.Method1158(vector4f, this.Field8849);
        if (vector4f.w > 0.0f) {
            final Vector4f vector4f2 = vector4f;
            vector4f2.x *= Float.intBitsToFloat(-943501312);
            final Vector4f vector4f3 = vector4f;
            vector4f3.y *= Float.intBitsToFloat(-943501312);
        }
        else {
            final float n = 1.0f / vector4f.w;
            final Vector4f vector4f4 = vector4f;
            vector4f4.x *= n;
            final Vector4f vector4f5 = vector4f;
            vector4f5.y *= n;
        }
        return vector4f;
    }
    
    public void Method1158(final Vector4f vector4f, final Matrix4f matrix4f) {
        final float x = vector4f.x;
        final float y = vector4f.y;
        final float z = vector4f.z;
        vector4f.x = x * matrix4f.m00 + y * matrix4f.m10 + z * matrix4f.m20 + matrix4f.m30;
        vector4f.y = x * matrix4f.m01 + y * matrix4f.m11 + z * matrix4f.m21 + matrix4f.m31;
        vector4f.z = x * matrix4f.m02 + y * matrix4f.m12 + z * matrix4f.m22 + matrix4f.m32;
        vector4f.w = x * matrix4f.m03 + y * matrix4f.m13 + z * matrix4f.m23 + matrix4f.m33;
    }
    
    public boolean Method1159(final Vector4f vector4f, final int n, final int n2) {
        return 0.0 <= vector4f.x && vector4f.x <= (double)n && 0.0 <= vector4f.y && vector4f.y <= (double)n2;
    }
}
