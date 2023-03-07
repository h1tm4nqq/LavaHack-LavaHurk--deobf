//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.ActiveRenderInfo
 *  net.minecraft.client.renderer.GLAllocation
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.vector.Matrix4f
 *  org.lwjgl.util.vector.Vector4f
 */
package lavahack.client;

import java.nio.FloatBuffer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector4f;

public class ZL1odW2XJDzzCmKJR66p1Ynf5DXx2MCL {
    private final Minecraft Field8847 = Minecraft.getMinecraft();
    private final Matrix4f Field8848 = new Matrix4f();
    private final Matrix4f Field8849 = new Matrix4f();
    Vec3d Field8850 = new Vec3d(0.0, 0.0, 0.0);
    private int Field8851;

    public ZL1odW2XJDzzCmKJR66p1Ynf5DXx2MCL() {
        MinecraftForge.EVENT_BUS.register((Object)this);
    }

    public static Vec3d Method1152(Vec3d vec3d, Vec3d vec3d2) {
        return vec3d.add(-vec3d2.x, -vec3d2.y, -vec3d2.z);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method1153(RenderWorldLastEvent renderWorldLastEvent) {
        if (this.Field8847.renderViewEntity == null) {
            return;
        }
        Vec3d vec3d = ActiveRenderInfo.projectViewFromEntity((Entity)this.Field8847.renderViewEntity, (double)this.Field8847.getRenderPartialTicks());
        Vec3d vec3d2 = ActiveRenderInfo.getCameraPosition();
        this.Method1154(this.Field8848, ((int)1082428256L ^ 0x40848EB3) << 1);
        this.Method1154(this.Field8849, (int)-593943122L ^ 0xDC992E09);
        this.Field8850 = vec3d.add(vec3d2);
    }

    public void Method1154(Matrix4f matrix4f, int n) {
        FloatBuffer floatBuffer = GLAllocation.createDirectFloatBuffer((int)((int)((long)1302452704 ^ (long)1302452705) << 4));
        GL11.glGetFloat((int)n, (FloatBuffer)floatBuffer);
        matrix4f.load(floatBuffer);
    }

    public Vec3d Method1155(Vec3d vec3d) {
        Vector4f vector4f = this.Method1157(vec3d);
        ScaledResolution scaledResolution = new ScaledResolution(this.Field8847);
        int n = scaledResolution.getScaledWidth();
        int n2 = scaledResolution.getScaledHeight();
        vector4f.x = (float)n / 2.0f + (Float.intBitsToFloat((int)((long)636103623 ^ (long)451554247)) * vector4f.x * (float)n + Float.intBitsToFloat((int)1591962634L ^ 0x61E36C0A));
        vector4f.y = (float)n2 / 2.0f - (Float.intBitsToFloat((int)1671915133L ^ 0x5CA7667D) * vector4f.y * (float)n2 + Float.intBitsToFloat((int)((long)1419817378 ^ (long)1805693346)));
        double d = this.Method1159(vector4f, n, n2) ? 0.0 : Double.longBitsToDouble(0x40BD1232F9658DCL ^ 0xBBFBD1232F9658DCL);
        return new Vec3d((double)vector4f.x, (double)vector4f.y, d);
    }

    public Vec3d Method1156(Vec3d vec3d) {
        Vector4f vector4f = this.Method1157(vec3d);
        int n = this.Field8847.displayWidth;
        int n2 = this.Field8847.displayHeight;
        vector4f.x = (float)n / 2.0f + (Float.intBitsToFloat(0x2550DE32 ^ 0x1A50DE32) * vector4f.x * (float)n + Float.intBitsToFloat(0x361B6334 ^ 0x91B6334));
        vector4f.y = (float)n2 / 2.0f - (Float.intBitsToFloat((int)((long)1366795671 ^ (long)1853334935)) * vector4f.y * (float)n2 + Float.intBitsToFloat((int)((long)82800752 ^ (long)1005547632)));
        double d = this.Method1159(vector4f, n, n2) ? 0.0 : Double.longBitsToDouble(0x6D7D3DFE3DFB7F2L ^ 0xB927D3DFE3DFB7F2L);
        return new Vec3d((double)vector4f.x, (double)vector4f.y, d);
    }

    public Vector4f Method1157(Vec3d vec3d) {
        Vec3d vec3d2 = this.Field8850.subtract(vec3d);
        Vector4f vector4f = new Vector4f((float)vec3d2.x, (float)vec3d2.y, (float)vec3d2.z, 1.0f);
        this.Method1158(vector4f, this.Field8848);
        this.Method1158(vector4f, this.Field8849);
        if (vector4f.w > 0.0f) {
            vector4f.x *= Float.intBitsToFloat((int)1083527678L ^ 0x875601FE);
            vector4f.y *= Float.intBitsToFloat((int)((long)1905638005 ^ (long)-1235817867));
            return vector4f;
        }
        float f = 1.0f / vector4f.w;
        vector4f.x *= f;
        vector4f.y *= f;
        return vector4f;
    }

    public void Method1158(Vector4f vector4f, Matrix4f matrix4f) {
        float f = vector4f.x;
        float f2 = vector4f.y;
        float f3 = vector4f.z;
        vector4f.x = f * matrix4f.m00 + f2 * matrix4f.m10 + f3 * matrix4f.m20 + matrix4f.m30;
        vector4f.y = f * matrix4f.m01 + f2 * matrix4f.m11 + f3 * matrix4f.m21 + matrix4f.m31;
        vector4f.z = f * matrix4f.m02 + f2 * matrix4f.m12 + f3 * matrix4f.m22 + matrix4f.m32;
        vector4f.w = f * matrix4f.m03 + f2 * matrix4f.m13 + f3 * matrix4f.m23 + matrix4f.m33;
    }

    public boolean Method1159(Vector4f vector4f, int n, int n2) {
        int n3;
        if (0.0 <= (double)vector4f.x && (double)vector4f.x <= (double)n && 0.0 <= (double)vector4f.y && (double)vector4f.y <= (double)n2) {
            n3 = (int)((long)1220760893 ^ (long)1220760892);
            return n3 != 0;
        }
        n3 = (int)1745887245L ^ 0x6810200D;
        return n3 != 0;
    }
}

