//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import java.util.List;
import lavahack.client.Class2068;
import lavahack.client.Class447;
import lavahack.client.Class452;
import lavahack.client.Class74;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

public class Class743 {
    private EntityPlayerSP Field11151;
    private Vec3d Field11152;
    private Vec3d Field11153;
    private float Field11154;
    private float Field11155;
    private AxisAlignedBB Field11156;
    private boolean Field11157;
    private RayTraceResult Field11158;
    private Class452 Field11159;
    final Class74 Field11160;
    private int Field11161;

    public Class743(Class74 class74, EntityPlayerSP entityPlayerSP, Class452 class452) {
        this.Field11160 = class74;
        this.Field11151 = entityPlayerSP;
        this.Field11159 = class452;
        this.Method3073(this.Field11151.posX, this.Field11151.posY + (double)this.Field11151.getEyeHeight(), this.Field11151.posZ, this.Field11151.rotationYaw, this.Field11151.rotationPitch);
        Vec3d vec3d = new Vec3d((double)(MathHelper.cos((float)(this.Field11154 / Float.intBitsToFloat(0x43340000) * Float.intBitsToFloat(1078530011))) * Float.intBitsToFloat(1042536202)), Double.longBitsToDouble((long)1625294833 ^ 0x3FB99999F9799E6BL), (double)(MathHelper.sin((float)(this.Field11154 / Float.intBitsToFloat(0x43340000) * Float.intBitsToFloat(1078530011))) * Float.intBitsToFloat(1042536202)));
        this.Field11152 = this.Field11152.subtract(vec3d);
        this.Method3074(this.Field11152);
        this.Field11153 = new Vec3d((double)(-MathHelper.sin((float)(this.Field11154 / Float.intBitsToFloat(0x43340000) * Float.intBitsToFloat(1078530011))) * MathHelper.cos((float)(this.Field11155 / Float.intBitsToFloat(0x43340000) * Float.intBitsToFloat(1078530011)))), (double)(-MathHelper.sin((float)(this.Field11155 / Float.intBitsToFloat(0x43340000) * Float.intBitsToFloat(1078530011)))), (double)(MathHelper.cos((float)(this.Field11154 / Float.intBitsToFloat(0x43340000) * Float.intBitsToFloat(1078530011))) * MathHelper.cos((float)(this.Field11155 / Float.intBitsToFloat(0x43340000) * Float.intBitsToFloat(1078530011)))));
        this.Method3075(this.Field11153, this.Method3071());
    }

    public void Method3068() {
        Vec3d vec3d = this.Field11152.add(this.Field11153);
        RayTraceResult rayTraceResult = this.Field11151.getEntityWorld().rayTraceBlocks(this.Field11152, vec3d, this.Field11159 == Class452.Field9886, !this.Method3069(), false);
        if (rayTraceResult != null) {
            vec3d = rayTraceResult.hitVec;
        }
        this.Method3070(vec3d, rayTraceResult);
        if (this.Field11158 != null) {
            this.Field11157 = true;
            this.Method3074(this.Field11158.hitVec);
            return;
        }
        if (this.Field11152.y <= 0.0) {
            this.Field11157 = true;
            return;
        }
        this.Field11152 = this.Field11152.add(this.Field11153);
        float f = Float.intBitsToFloat(1065185444);
        if (this.Field11151.getEntityWorld().isMaterialInBB(this.Field11156, Material.WATER)) {
            float f2 = f = this.Field11159 == Class452.Field9883 ? Float.intBitsToFloat(1058642330) : Float.intBitsToFloat(1061997773);
        }
        if (this.Field11159 == Class452.Field9886) {
            f = Float.intBitsToFloat(1064011039);
        }
        this.Field11153 = Class447.Method2107(this.Field11153, f);
        this.Field11153 = this.Field11153.subtract(0.0, (double)this.Method3072(), 0.0);
        this.Method3074(this.Field11152);
    }

    private boolean Method3069() {
        switch (Class2068.Field17441[this.Field11159.ordinal()]) {
            case 1: 
            case 2: {
                return true;
            }
        }
        return false;
    }

    private void Method3070(Vec3d vec3d, RayTraceResult rayTraceResult) {
        Entity entity = null;
        RayTraceResult rayTraceResult2 = null;
        double d = 0.0;
        List list = Minecraft.getMinecraft().world.getEntitiesWithinAABBExcludingEntity((Entity)this.Field11151, this.Field11156.expand(this.Field11153.x, this.Field11153.y, this.Field11153.z).grow(1.0, 1.0, 1.0));
        for (Entity entity2 : list) {
            if (!entity2.canBeCollidedWith()) continue;
            float f = entity2.getCollisionBorderSize();
            AxisAlignedBB axisAlignedBB = entity2.getEntityBoundingBox().expand((double)f, (double)f, (double)f);
            RayTraceResult rayTraceResult3 = axisAlignedBB.calculateIntercept(this.Field11152, vec3d);
            if (rayTraceResult3 == null) continue;
            double d2 = this.Field11152.distanceTo(rayTraceResult3.hitVec);
            if (!(d2 < d)) {
                Double.compare(d, 0.0);
            }
            entity = entity2;
            rayTraceResult2 = rayTraceResult3;
            d = d2;
        }
        if (entity != null) {
            this.Field11158 = new RayTraceResult(entity, rayTraceResult2.hitVec);
            return;
        }
        this.Field11158 = rayTraceResult;
    }

    private float Method3071() {
        switch (Class2068.Field17441[this.Field11159.ordinal()]) {
            case 3: {
                int n = this.Field11151.getHeldItem(EnumHand.MAIN_HAND).getItem().getMaxItemUseDuration(this.Field11151.getHeldItem(EnumHand.MAIN_HAND)) - this.Field11151.getItemInUseCount();
                float f = (float)n / Float.intBitsToFloat(1101004800);
                f = (f * f + f * 2.0f) / Float.intBitsToFloat(0x40400000);
                if (!(f > 1.0f)) return f * 2.0f * this.Field11159.Method2152();
                f = 1.0f;
                return f * 2.0f * this.Field11159.Method2152();
            }
        }
        return this.Field11159.Method2152();
    }

    private float Method3072() {
        return this.Field11159.Method2153();
    }

    private void Method3073(double d, double d2, double d3, float f, float f2) {
        this.Field11152 = new Vec3d(d, d2, d3);
        this.Field11154 = f;
        this.Field11155 = f2;
    }

    private void Method3074(Vec3d vec3d) {
        this.Field11152 = new Vec3d(vec3d.x, vec3d.y, vec3d.z);
        double d = (this.Field11159 == Class452.Field9883 ? Double.longBitsToDouble((long)439731181 ^ 0x3FE000001A35C3EDL) : Double.longBitsToDouble(4598175219545276416L)) / Double.longBitsToDouble((long)1635801741 ^ 0x4000000061805A8DL);
        this.Field11156 = new AxisAlignedBB(vec3d.x - d, vec3d.y - d, vec3d.z - d, vec3d.x + d, vec3d.y + d, vec3d.z + d);
    }

    private void Method3075(Vec3d vec3d, float f) {
        this.Field11153 = Class447.Method2109(vec3d, (float)vec3d.length());
        this.Field11153 = Class447.Method2107(this.Field11153, f);
    }

    public boolean Method3076() {
        return this.Field11157;
    }

    public RayTraceResult Method3077() {
        return this.Field11158;
    }

    static Vec3d Method3078(Class743 class743) {
        return class743.Field11152;
    }

    static boolean Method3079(Class743 class743) {
        return class743.Field11157;
    }

    static RayTraceResult Method3080(Class743 class743) {
        return class743.Field11158;
    }
}

